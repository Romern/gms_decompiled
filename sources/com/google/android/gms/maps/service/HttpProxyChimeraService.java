package com.google.android.gms.maps.service;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.felicanetworks.cmnctrl.net.DataParser;
import com.google.android.chimera.Service;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.http.ProtocolVersion;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class HttpProxyChimeraService extends Service {

    /* renamed from: a */
    private static final String f79954a = HttpProxyChimeraService.class.getSimpleName();

    /* renamed from: b */
    private static final String[] f79955b = {"https://clients4.google.com/glm/mmap", "https://www.google.com/maps", "https://csi.gstatic.com/csi"};

    /* renamed from: c */
    private final afis f79956c;

    public HttpProxyChimeraService() {
        this(afir.f64248a);
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v54, resolved type: java.io.Serializable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v65, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v70, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v77, resolved type: java.io.Serializable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v78, resolved type: java.io.Serializable} */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02dd, code lost:
        if (r14 != null) goto L_0x02df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02df, code lost:
        r14.disconnect();
        p000.bwam.m121655a(com.google.android.gms.maps.service.HttpProxyChimeraService.f79954a, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02e8, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x016f, code lost:
        if (r14 == null) goto L_0x02e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0233, code lost:
        if (r14 != null) goto L_0x02df;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02b2 A[SYNTHETIC, Splitter:B:104:0x02b2] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02f1 A[SYNTHETIC, Splitter:B:116:0x02f1] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x031e A[SYNTHETIC, Splitter:B:123:0x031e] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00dc A[SYNTHETIC, Splitter:B:29:0x00dc] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0103 A[Catch:{ ClassCastException -> 0x017b, IOException -> 0x0179, all -> 0x0173 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0117 A[SYNTHETIC, Splitter:B:38:0x0117] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0144 A[SYNTHETIC, Splitter:B:45:0x0144] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01a0 A[Catch:{ all -> 0x02e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a1 A[Catch:{ all -> 0x02e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01db A[SYNTHETIC, Splitter:B:75:0x01db] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0208 A[SYNTHETIC, Splitter:B:82:0x0208] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0243 A[Catch:{ all -> 0x02e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0285 A[SYNTHETIC, Splitter:B:97:0x0285] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:68:0x0197=Splitter:B:68:0x0197, B:91:0x023a=Splitter:B:91:0x023a} */
    /* renamed from: a */
    public final Bundle mo43903a(Bundle bundle) {
        DataOutputStream dataOutputStream;
        Throwable th;
        InputStream inputStream;
        Serializable serializable;
        Bundle bundle2 = bundle;
        Bundle bundle3 = new Bundle();
        bundle3.putSerializable("RESPONSE_PROTOCOL_VERSION", new ProtocolVersion("HTTP", 1, 1));
        bundle3.putSerializable("RESPONSE_LOCALE", new Locale("en"));
        String string = bundle2.getString("REQUEST_URL");
        if (string != null) {
            String[] strArr = f79955b;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                if (!string.startsWith(strArr[i])) {
                    i++;
                } else {
                    try {
                        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
                        DataOutputStream dataOutputStream2 = null;
                        r16 = null;
                        InputStream inputStream2 = null;
                        DataOutputStream dataOutputStream3 = null;
                        try {
                            HashMap hashMap = (HashMap) bundle2.getSerializable("REQUEST_HEADERS");
                            if (hashMap != null) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                }
                            }
                            String string2 = bundle2.getString("REQUEST_METHOD");
                            if (string2 != null && string2.equals(DataParser.CONNECT_TYPE_POST)) {
                                httpURLConnection.setRequestMethod(DataParser.CONNECT_TYPE_POST);
                                byte[] bArr = (byte[]) bundle2.getSerializable("REQUEST_DATA");
                                if (bArr != null) {
                                    httpURLConnection.setDoOutput(true);
                                    dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                                    try {
                                        dataOutputStream.write(bArr);
                                        bundle3.putInt("RESPONSE_STATUS_CODE", httpURLConnection.getResponseCode());
                                        bundle3.putString("RESPONSE_STATUS_REASON", httpURLConnection.getResponseMessage());
                                        bundle3.putString("RESPONSE_CONTENT_TYPE", httpURLConnection.getContentType());
                                        bundle3.putString("RESPONSE_CONTENT_ENCODING", httpURLConnection.getContentEncoding());
                                        inputStream = httpURLConnection.getInputStream();
                                        if (inputStream == null) {
                                            try {
                                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(32, inputStream.available()));
                                                byte[] bArr2 = new byte[8192];
                                                while (true) {
                                                    int read = inputStream.read(bArr2);
                                                    if (read == -1) {
                                                        break;
                                                    }
                                                    byteArrayOutputStream.write(bArr2, 0, read);
                                                }
                                                serializable = byteArrayOutputStream.toByteArray();
                                            } catch (ClassCastException e) {
                                                e = e;
                                                dataOutputStream2 = dataOutputStream;
                                                if (bwam.m121655a(f79954a, 6)) {
                                                }
                                                bundle3.putInt("RESPONSE_STATUS_CODE", 400);
                                                bundle3.putString("RESPONSE_STATUS_REASON", "Bad request");
                                                if (inputStream != null) {
                                                }
                                                if (dataOutputStream3 != null) {
                                                }
                                            } catch (IOException e2) {
                                                e = e2;
                                                dataOutputStream3 = dataOutputStream;
                                                try {
                                                    if (bwam.m121655a(f79954a, 6)) {
                                                    }
                                                    bundle3.putInt("RESPONSE_STATUS_CODE", 500);
                                                    bundle3.putString("RESPONSE_STATUS_REASON", "Internal Server Error");
                                                    if (inputStream != null) {
                                                    }
                                                    if (dataOutputStream3 != null) {
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    dataOutputStream = dataOutputStream3;
                                                    inputStream2 = inputStream;
                                                    if (inputStream2 != null) {
                                                    }
                                                    if (dataOutputStream != null) {
                                                    }
                                                    if (httpURLConnection != null) {
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                inputStream2 = inputStream;
                                                if (inputStream2 != null) {
                                                }
                                                if (dataOutputStream != null) {
                                                }
                                                if (httpURLConnection != null) {
                                                }
                                                throw th;
                                            }
                                        } else {
                                            serializable = new byte[0];
                                        }
                                        bundle3.putSerializable("RESPONSE_DATA", serializable);
                                        bundle3.putInt("RESPONSE_DATA_LENGTH", httpURLConnection.getContentLength());
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (IOException e3) {
                                                IOException iOException = e3;
                                                if (bwam.m121655a(f79954a, 3)) {
                                                    String valueOf = String.valueOf(iOException);
                                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
                                                    sb.append("Exception while closing input stream: ");
                                                    sb.append(valueOf);
                                                    sb.toString();
                                                }
                                            }
                                        }
                                        if (dataOutputStream != null) {
                                            try {
                                                dataOutputStream.close();
                                            } catch (IOException e4) {
                                                IOException iOException2 = e4;
                                                if (bwam.m121655a(f79954a, 3)) {
                                                    String valueOf2 = String.valueOf(iOException2);
                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 39);
                                                    sb2.append("Exception while closing output stream: ");
                                                    sb2.append(valueOf2);
                                                    sb2.toString();
                                                }
                                            }
                                        }
                                    } catch (ClassCastException e5) {
                                        e = e5;
                                        inputStream = null;
                                        dataOutputStream2 = dataOutputStream;
                                        if (bwam.m121655a(f79954a, 6)) {
                                        }
                                        bundle3.putInt("RESPONSE_STATUS_CODE", 400);
                                        bundle3.putString("RESPONSE_STATUS_REASON", "Bad request");
                                        if (inputStream != null) {
                                        }
                                        if (dataOutputStream3 != null) {
                                        }
                                    } catch (IOException e6) {
                                        e = e6;
                                        inputStream = null;
                                        dataOutputStream3 = dataOutputStream;
                                        if (bwam.m121655a(f79954a, 6)) {
                                        }
                                        bundle3.putInt("RESPONSE_STATUS_CODE", 500);
                                        bundle3.putString("RESPONSE_STATUS_REASON", "Internal Server Error");
                                        if (inputStream != null) {
                                        }
                                        if (dataOutputStream3 != null) {
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        if (inputStream2 != null) {
                                        }
                                        if (dataOutputStream != null) {
                                        }
                                        if (httpURLConnection != null) {
                                        }
                                        throw th;
                                    }
                                }
                            }
                            dataOutputStream = null;
                            bundle3.putInt("RESPONSE_STATUS_CODE", httpURLConnection.getResponseCode());
                            bundle3.putString("RESPONSE_STATUS_REASON", httpURLConnection.getResponseMessage());
                            bundle3.putString("RESPONSE_CONTENT_TYPE", httpURLConnection.getContentType());
                            bundle3.putString("RESPONSE_CONTENT_ENCODING", httpURLConnection.getContentEncoding());
                            inputStream = httpURLConnection.getInputStream();
                            if (inputStream == null) {
                            }
                            bundle3.putSerializable("RESPONSE_DATA", serializable);
                            bundle3.putInt("RESPONSE_DATA_LENGTH", httpURLConnection.getContentLength());
                            if (inputStream != null) {
                            }
                            if (dataOutputStream != null) {
                            }
                        } catch (ClassCastException e7) {
                            e = e7;
                            inputStream = null;
                            if (bwam.m121655a(f79954a, 6)) {
                                String str = f79954a;
                                String valueOf3 = String.valueOf(bundle);
                                String valueOf4 = String.valueOf(e);
                                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 31 + String.valueOf(valueOf4).length());
                                sb3.append("Malformed bundle field value ");
                                sb3.append(valueOf3);
                                sb3.append(": ");
                                sb3.append(valueOf4);
                                Log.e(str, sb3.toString());
                            }
                            bundle3.putInt("RESPONSE_STATUS_CODE", 400);
                            bundle3.putString("RESPONSE_STATUS_REASON", "Bad request");
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e8) {
                                    IOException iOException3 = e8;
                                    if (bwam.m121655a(f79954a, 3)) {
                                        String valueOf5 = String.valueOf(iOException3);
                                        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf5).length() + 38);
                                        sb4.append("Exception while closing input stream: ");
                                        sb4.append(valueOf5);
                                        sb4.toString();
                                    }
                                }
                            }
                            if (dataOutputStream3 != null) {
                                try {
                                    dataOutputStream3.close();
                                } catch (IOException e9) {
                                    IOException iOException4 = e9;
                                    if (bwam.m121655a(f79954a, 3)) {
                                        String valueOf6 = String.valueOf(iOException4);
                                        StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf6).length() + 39);
                                        sb5.append("Exception while closing output stream: ");
                                        sb5.append(valueOf6);
                                        sb5.toString();
                                    }
                                }
                            }
                        } catch (IOException e10) {
                            e = e10;
                            inputStream = null;
                            if (bwam.m121655a(f79954a, 6)) {
                                String str2 = f79954a;
                                String valueOf7 = String.valueOf(e);
                                StringBuilder sb6 = new StringBuilder(string.length() + 20 + String.valueOf(valueOf7).length());
                                sb6.append("handleHttpRequest ");
                                sb6.append(string);
                                sb6.append(": ");
                                sb6.append(valueOf7);
                                Log.e(str2, sb6.toString());
                            }
                            bundle3.putInt("RESPONSE_STATUS_CODE", 500);
                            bundle3.putString("RESPONSE_STATUS_REASON", "Internal Server Error");
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e11) {
                                    IOException iOException5 = e11;
                                    if (bwam.m121655a(f79954a, 3)) {
                                        String valueOf8 = String.valueOf(iOException5);
                                        StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf8).length() + 38);
                                        sb7.append("Exception while closing input stream: ");
                                        sb7.append(valueOf8);
                                        sb7.toString();
                                    }
                                }
                            }
                            if (dataOutputStream3 != null) {
                                try {
                                    dataOutputStream3.close();
                                } catch (IOException e12) {
                                    IOException iOException6 = e12;
                                    if (bwam.m121655a(f79954a, 3)) {
                                        String valueOf9 = String.valueOf(iOException6);
                                        StringBuilder sb8 = new StringBuilder(String.valueOf(valueOf9).length() + 39);
                                        sb8.append("Exception while closing output stream: ");
                                        sb8.append(valueOf9);
                                        sb8.toString();
                                    }
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            dataOutputStream = null;
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (IOException e13) {
                                    IOException iOException7 = e13;
                                    if (bwam.m121655a(f79954a, 3)) {
                                        String valueOf10 = String.valueOf(iOException7);
                                        StringBuilder sb9 = new StringBuilder(String.valueOf(valueOf10).length() + 38);
                                        sb9.append("Exception while closing input stream: ");
                                        sb9.append(valueOf10);
                                        sb9.toString();
                                    }
                                }
                            }
                            if (dataOutputStream != null) {
                                try {
                                    dataOutputStream.close();
                                } catch (IOException e14) {
                                    IOException iOException8 = e14;
                                    if (bwam.m121655a(f79954a, 3)) {
                                        String valueOf11 = String.valueOf(iOException8);
                                        StringBuilder sb10 = new StringBuilder(String.valueOf(valueOf11).length() + 39);
                                        sb10.append("Exception while closing output stream: ");
                                        sb10.append(valueOf11);
                                        sb10.toString();
                                    }
                                }
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                                bwam.m121655a(f79954a, 3);
                            }
                            throw th;
                        }
                    } catch (MalformedURLException e15) {
                        if (bwam.m121655a(f79954a, 6)) {
                            String str3 = f79954a;
                            String valueOf12 = String.valueOf(e15);
                            StringBuilder sb11 = new StringBuilder(string.length() + 16 + String.valueOf(valueOf12).length());
                            sb11.append("Malformed URL ");
                            sb11.append(string);
                            sb11.append(": ");
                            sb11.append(valueOf12);
                            Log.e(str3, sb11.toString());
                        }
                        bundle3.putInt("RESPONSE_STATUS_CODE", 400);
                        bundle3.putString("RESPONSE_STATUS_REASON", "Bad request");
                        return bundle3;
                    } catch (IOException e16) {
                        if (bwam.m121655a(f79954a, 6)) {
                            String str4 = f79954a;
                            String valueOf13 = String.valueOf(e16);
                            StringBuilder sb12 = new StringBuilder(string.length() + 21 + String.valueOf(valueOf13).length());
                            sb12.append("URL openConnection ");
                            sb12.append(string);
                            sb12.append(": ");
                            sb12.append(valueOf13);
                            Log.e(str4, sb12.toString());
                        }
                        bundle3.putInt("RESPONSE_STATUS_CODE", 500);
                        bundle3.putString("RESPONSE_STATUS_REASON", "Internal Server Error");
                        return bundle3;
                    }
                }
            }
        }
        if (bwam.m121655a(f79954a, 6)) {
            String str5 = f79954a;
            String valueOf14 = String.valueOf(string);
            Log.e(str5, valueOf14.length() == 0 ? new String("URL not whitelisted: ") : "URL not whitelisted: ".concat(valueOf14));
        }
        bundle3.putInt("RESPONSE_STATUS_CODE", 403);
        bundle3.putString("RESPONSE_STATUS_REASON", "Forbidden");
        return bundle3;
    }

    public final IBinder onBind(Intent intent) {
        return this.f79956c;
    }

    public HttpProxyChimeraService(afir afir) {
        this.f79956c = new afis(this);
    }
}
