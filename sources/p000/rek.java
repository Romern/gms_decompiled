package p000;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;

/* renamed from: rek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rek implements rec {

    /* renamed from: a */
    private static final Pattern f42802a = Pattern.compile("[^,;\\s\"]+");

    /* renamed from: b */
    private final Context f42803b;

    /* renamed from: c */
    private final rbp f42804c;

    /* renamed from: d */
    private final String f42805d;

    /* renamed from: e */
    private final reh f42806e;

    public rek(Context context, String str, rbp rbp) {
        reh reh;
        if (!cdej.f180585a.mo6606a().mo77343j()) {
            reh = new rej();
        } else {
            reh = new rei(context);
        }
        srb srb = srb.f45012a;
        sdo.m34959a(context);
        this.f42803b = context;
        sdo.m34959a((Object) str);
        this.f42805d = str;
        sdo.m34959a(rbp);
        this.f42804c = rbp;
        sdo.m34959a(reh);
        this.f42806e = reh;
        sdo.m34959a(srb);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0191 A[SYNTHETIC, Splitter:B:48:0x0191] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x020e A[SYNTHETIC, Splitter:B:74:0x020e] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0224 A[SYNTHETIC, Splitter:B:87:0x0224] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0232 A[SYNTHETIC, Splitter:B:95:0x0232] */
    /* renamed from: a */
    public final reb mo24537a(caik caik, rea rea, String str, String str2) {
        HttpURLConnection a;
        String str3;
        String str4;
        String headerField;
        InputStream inputStream;
        sdo.m34959a(rea);
        URL url = new URL(this.f42805d);
        if (cdej.m132799e() || "https".equals(url.getProtocol())) {
            a = this.f42806e.mo24556a(this.f42805d);
            a.setDoOutput(true);
            int i = 0;
            a.setInstanceFollowRedirects(false);
            a.setChunkedStreamingMode(0);
            a.setConnectTimeout(Math.max((int) cdej.m132797c(), 30000));
            a.setReadTimeout(Math.max((int) cdej.m132804j(), 30000));
            a.setRequestProperty("Content-Encoding", "gzip");
            a.setRequestProperty("Content-Type", "application/x-gzip");
            if (str != null && !str.isEmpty()) {
                a.setRequestProperty("Authorization", str);
            }
            if (str2 != null && !str2.isEmpty()) {
                a.setRequestProperty("X-SERVER-TOKEN", str2);
            }
            if (!caik.f174722j) {
                str4 = aooo.m66219b(this.f42803b).f83468a;
                if (cdej.m132806l()) {
                    str3 = str4;
                    str4 = bmxx.m108578b(str4);
                } else if (str4 == null) {
                    str3 = str4;
                    str4 = "\"\"";
                } else if (!f42802a.matcher(str4).matches()) {
                    StringBuilder sb = new StringBuilder(str4.length() + 2);
                    sb.append("\"");
                    sb.append(str4);
                    sb.append("\"");
                    str3 = str4;
                    str4 = sb.toString();
                }
                String valueOf = String.valueOf(str4);
                a.setRequestProperty("Cookie", valueOf.length() != 0 ? new String("NID=") : "NID=".concat(valueOf));
                rbp rbp = this.f42804c;
                for (Map.Entry<String, List<String>> entry : a.getRequestProperties().entrySet()) {
                    int length = i + entry.getKey().length();
                    for (String str5 : entry.getValue()) {
                        length += str5.length();
                    }
                    i = length + entry.getValue().size() + 2;
                }
                rbp.mo24450b(caik, (long) i);
                this.f42804c.mo24443a(caik);
                rbp rbp2 = this.f42804c;
                OutputStream outputStream = a.getOutputStream();
                rea.mo24539a(SystemClock.elapsedRealtime(), System.currentTimeMillis());
                rea.mo24545f();
                bobd bobd = new bobd(outputStream);
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(bobd);
                gZIPOutputStream.write(rea.mo24544e());
                gZIPOutputStream.close();
                rbp2.mo24445a(caik, bobd.f132491a);
                int responseCode = a.getResponseCode();
                headerField = a.getHeaderField("Set-Cookie");
                if (headerField != null) {
                    if (!headerField.isEmpty()) {
                        for (HttpCookie httpCookie : HttpCookie.parse(headerField)) {
                            if (httpCookie.getName().equals("NID") && httpCookie.getValue() != null) {
                                if (cdej.m132800f()) {
                                    aood c = aooe.m66192c();
                                    c.f78604b = str3;
                                    c.f78603a = httpCookie.getValue();
                                    if (!aoop.m66223a(c.mo43121a(), this.f42803b)) {
                                        Log.e("HttpUrlConnTransport", "Error in PseudonymousId compareAndSet() operation");
                                        this.f42804c.mo24439a();
                                    }
                                } else {
                                    aoop.m66225a(new PseudonymousIdToken(httpCookie.getValue()), this.f42803b);
                                }
                            }
                        }
                    }
                }
                this.f42804c.mo24440a(responseCode);
                byte[] bArr = null;
                InputStream inputStream2 = null;
                bArr = null;
                bArr = null;
                bArr = null;
                bArr = null;
                if (responseCode >= 200 && responseCode < 300) {
                    try {
                        inputStream = a.getInputStream();
                        try {
                            bArr = boav.m111020a(inputStream);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e) {
                                    e = e;
                                }
                            }
                        } catch (IOException e2) {
                            e = e2;
                            try {
                                Log.e("HttpUrlConnTransport", "Error reading the content of the response body.", e);
                                if (inputStream != null) {
                                }
                                reb reb = new reb(bArr, responseCode, a.getResponseMessage());
                                stp.m36307a(a);
                                return reb;
                            } catch (Throwable th) {
                                th = th;
                                inputStream2 = inputStream;
                                if (inputStream2 != null) {
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            inputStream2 = inputStream;
                            if (inputStream2 != null) {
                            }
                            throw th;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        inputStream = null;
                        Log.e("HttpUrlConnTransport", "Error reading the content of the response body.", e);
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e4) {
                                e = e4;
                            }
                        }
                        reb reb2 = new reb(bArr, responseCode, a.getResponseMessage());
                        stp.m36307a(a);
                        return reb2;
                    } catch (Throwable th3) {
                        th = th3;
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        throw th;
                    }
                }
                reb reb22 = new reb(bArr, responseCode, a.getResponseMessage());
                stp.m36307a(a);
                return reb22;
            }
            str4 = "ANONYMOUS";
            str3 = str4;
            String valueOf2 = String.valueOf(str4);
            a.setRequestProperty("Cookie", valueOf2.length() != 0 ? new String("NID=") : "NID=".concat(valueOf2));
            rbp rbp3 = this.f42804c;
            while (r3.hasNext()) {
            }
            rbp3.mo24450b(caik, (long) i);
            try {
                this.f42804c.mo24443a(caik);
                rbp rbp22 = this.f42804c;
                OutputStream outputStream2 = a.getOutputStream();
                rea.mo24539a(SystemClock.elapsedRealtime(), System.currentTimeMillis());
                rea.mo24545f();
                bobd bobd2 = new bobd(outputStream2);
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(bobd2);
                gZIPOutputStream2.write(rea.mo24544e());
                gZIPOutputStream2.close();
                rbp22.mo24445a(caik, bobd2.f132491a);
                int responseCode2 = a.getResponseCode();
                headerField = a.getHeaderField("Set-Cookie");
                if (headerField != null) {
                }
                this.f42804c.mo24440a(responseCode2);
                byte[] bArr2 = null;
                InputStream inputStream22 = null;
                bArr2 = null;
                bArr2 = null;
                bArr2 = null;
                bArr2 = null;
                inputStream = a.getInputStream();
                bArr2 = boav.m111020a(inputStream);
                if (inputStream != null) {
                }
                reb reb222 = new reb(bArr2, responseCode2, a.getResponseMessage());
                stp.m36307a(a);
                return reb222;
            } catch (IOException e5) {
                Log.e("HttpUrlConnTransport", "Error closing response stream. ", e5);
            } catch (Throwable th4) {
                stp.m36307a(a);
                throw th4;
            }
        } else {
            String valueOf3 = String.valueOf(this.f42805d);
            throw new IllegalStateException(valueOf3.length() == 0 ? new String("Abort attempt to upload logs in plaintext: requestUrl=") : "Abort attempt to upload logs in plaintext: requestUrl=".concat(valueOf3));
        }
        Log.e("HttpUrlConnTransport", "Error closing response stream. ", e);
        reb reb2222 = new reb(bArr2, responseCode2, a.getResponseMessage());
        stp.m36307a(a);
        return reb2222;
    }
}
