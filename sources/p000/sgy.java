package p000;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.felicanetworks.cmnctrl.net.DataParser;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

/* renamed from: sgy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sgy extends Request {

    /* renamed from: e */
    private static final Pattern f44455e = Pattern.compile("Content-ID: <response-item:(\\d+)>");

    /* renamed from: f */
    private static final Pattern f44456f = Pattern.compile("HTTP/1\\.1 (\\d+) (.*)");

    /* renamed from: g */
    private static final Pattern f44457g = Pattern.compile("(.+?): (.+)");

    /* renamed from: d */
    public final CountDownLatch f44458d = new CountDownLatch(1);

    /* renamed from: h */
    private final ArrayList f44459h;

    public sgy(String str, ArrayList arrayList) {
        super(1, String.valueOf(str).concat("/batch"), new sgx(arrayList));
        this.f44459h = arrayList;
    }

    public final void deliverError(VolleyError volleyError) {
        for (int i = 0; i < this.f44459h.size(); i++) {
            ((she) this.f44459h.get(i)).deliverError(volleyError);
        }
        this.f44458d.countDown();
    }

    public final /* bridge */ /* synthetic */ void deliverResponse(Object obj) {
        NetworkResponse[] networkResponseArr = (NetworkResponse[]) obj;
        int size = this.f44459h.size();
        for (int i = 0; i < size; i++) {
            she she = (she) this.f44459h.get(i);
            NetworkResponse networkResponse = networkResponseArr[i];
            if (networkResponse == null) {
                she.deliverError(new VolleyError("No response reported."));
            } else if (!networkResponse.notModified && networkResponse.statusCode < 400) {
                try {
                    she.deliverResponse(she.parseNetworkResponse(networkResponse).result);
                } catch (Exception e) {
                    she.deliverError(new VolleyError(e));
                }
            } else {
                she.deliverError(new VolleyError(networkResponse));
            }
        }
        this.f44458d.countDown();
    }

    public final byte[] getBody() {
        char c = 0;
        rzz.m34730a(this.f44458d.getCount() > 0, "ApiaryBatchRequest can not be reused.");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream);
        try {
            Map headers = getHeaders();
            int size = this.f44459h.size();
            int i = 0;
            while (i < size) {
                outputStreamWriter.write("--MultiPartRequest\n");
                she she = (she) this.f44459h.get(i);
                outputStreamWriter.write("Content-Type: application/http\n");
                StringBuilder sb = new StringBuilder(31);
                sb.append("Content-ID: <item:");
                sb.append(i);
                sb.append(">\n");
                outputStreamWriter.write(sb.toString());
                outputStreamWriter.write("\n");
                Object[] objArr = new Object[2];
                int method = she.getMethod();
                objArr[c] = method != 1 ? method != 2 ? method != 3 ? "GET" : "DELETE" : "PUT" : DataParser.CONNECT_TYPE_POST;
                objArr[1] = she.getUrl();
                outputStreamWriter.write(String.format("%s %s\n", objArr));
                HashMap hashMap = she.f44463e;
                if (hashMap != null) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        if (!((String) entry.getValue()).equals(headers.get(entry.getKey()))) {
                            String str = (String) entry.getKey();
                            String str2 = (String) entry.getValue();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
                            sb2.append(str);
                            sb2.append(": ");
                            sb2.append(str2);
                            sb2.append("\n");
                            outputStreamWriter.write(sb2.toString());
                        }
                    }
                }
                byte[] body = she.getBody();
                if (body != null) {
                    String bodyContentType = she.getBodyContentType();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(bodyContentType).length() + 15);
                    sb3.append("Content-Type: ");
                    sb3.append(bodyContentType);
                    sb3.append("\n");
                    outputStreamWriter.write(sb3.toString());
                    int length = body.length;
                    StringBuilder sb4 = new StringBuilder(28);
                    sb4.append("Content-Length: ");
                    sb4.append(length);
                    sb4.append("\n");
                    outputStreamWriter.write(sb4.toString());
                    String str3 = new String(body);
                    StringBuilder sb5 = new StringBuilder(str3.length() + 2);
                    sb5.append("\n");
                    sb5.append(str3);
                    sb5.append("\n");
                    outputStreamWriter.write(sb5.toString());
                }
                outputStreamWriter.write("\n");
                i++;
                c = 0;
            }
            outputStreamWriter.write("--MultiPartRequest--\n");
            outputStreamWriter.flush();
        } catch (IOException e) {
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ((Boolean) rsv.f43612a.mo25081c()).booleanValue();
        return byteArray;
    }

    public final String getBodyContentType() {
        return "multipart/mixed; boundary=MultiPartRequest";
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        String readLine;
        byte[] bArr;
        NetworkResponse[] networkResponseArr = new NetworkResponse[this.f44459h.size()];
        InputStream byteArrayInputStream = new ByteArrayInputStream(networkResponse.data);
        if (srz.m36173a(networkResponse.data)) {
            try {
                byteArrayInputStream = new GZIPInputStream(byteArrayInputStream);
            } catch (IOException e) {
            }
        }
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        int i = -1;
        while (true) {
            try {
                String readLine2 = dataInputStream.readLine();
                if (readLine2 != null) {
                    boolean z = true;
                    if (readLine2.startsWith("Content-ID: <response-item:")) {
                        Matcher matcher = f44455e.matcher(readLine2);
                        if (!matcher.matches()) {
                            throw new IOException(readLine2.length() == 0 ? new String("Response ID invalid: ") : "Response ID invalid: ".concat(readLine2));
                        }
                        i = Integer.parseInt(matcher.group(1));
                    }
                    if ("".equals(readLine2)) {
                        if (i >= 0) {
                            String readLine3 = dataInputStream.readLine();
                            Matcher matcher2 = f44456f.matcher(readLine3);
                            if (!matcher2.matches()) {
                                String valueOf = String.valueOf(readLine3);
                                throw new IOException(valueOf.length() == 0 ? new String("Response Code invalid: ") : "Response Code invalid: ".concat(valueOf));
                            }
                            int parseInt = Integer.parseInt(matcher2.group(1));
                            HashMap hashMap = new HashMap();
                            do {
                                readLine = dataInputStream.readLine();
                                Matcher matcher3 = f44457g.matcher(readLine);
                                if (matcher3.matches()) {
                                    hashMap.put(matcher3.group(1), matcher3.group(2));
                                }
                            } while (!"".equals(readLine));
                            if (hashMap.containsKey("Content-Length")) {
                                int parseInt2 = Integer.parseInt((String) hashMap.get("Content-Length"));
                                bArr = new byte[parseInt2];
                                for (int i2 = 0; i2 < parseInt2; i2 += dataInputStream.read(bArr, i2, parseInt2 - i2)) {
                                }
                            } else {
                                bArr = null;
                            }
                            dataInputStream.readLine();
                            if (parseInt != 304) {
                                z = false;
                            }
                            networkResponseArr[i] = new NetworkResponse(parseInt, bArr, hashMap, z);
                            i = -1;
                        } else {
                            throw new IOException("Section ID not provided");
                        }
                    }
                } else {
                    Response success = Response.success(networkResponseArr, getCacheEntry());
                    try {
                        dataInputStream.close();
                    } catch (IOException e2) {
                    }
                    return success;
                }
            } catch (NumberFormatException e3) {
                Response error = Response.error(new VolleyError(e3));
                try {
                    dataInputStream.close();
                } catch (IOException e4) {
                }
                return error;
            } catch (IOException e5) {
                Response error2 = Response.error(new VolleyError(e5));
                try {
                    dataInputStream.close();
                } catch (IOException e6) {
                }
                return error2;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (IOException e7) {
                }
                throw th;
            }
        }
    }
}
