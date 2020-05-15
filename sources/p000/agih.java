package p000;

import com.felicanetworks.mfc.Felica;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: agih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agih implements Runnable {

    /* renamed from: a */
    final /* synthetic */ agii f65584a;

    /* renamed from: b */
    private final URL f65585b;

    /* renamed from: c */
    private final byte[] f65586c;

    /* renamed from: d */
    private final agif f65587d;

    /* renamed from: e */
    private final String f65588e;

    /* renamed from: f */
    private final Map f65589f;

    public agih(agii agii, String str, URL url, byte[] bArr, Map map, agif agif) {
        this.f65584a = agii;
        sdo.m34977c(str);
        sdo.m34959a(url);
        sdo.m34959a(agif);
        this.f65585b = url;
        this.f65586c = bArr;
        this.f65587d = agif;
        this.f65588e = str;
        this.f65589f = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x012d A[SYNTHETIC, Splitter:B:70:0x012d] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x016c A[SYNTHETIC, Splitter:B:81:0x016c] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0185  */
    public final void run() {
        Map<String, List<String>> map;
        IOException iOException;
        int i;
        HttpURLConnection httpURLConnection;
        agjb F;
        agig agig;
        Map<String, List<String>> map2;
        int i2;
        Throwable th;
        int responseCode;
        InputStream inputStream;
        this.f65584a.mo35536C();
        OutputStream outputStream = null;
        try {
            this.f65584a.mo35428a(this.f65588e);
            agii agii = this.f65584a;
            URLConnection openConnection = this.f65585b.openConnection();
            if (openConnection instanceof HttpURLConnection) {
                SSLSocketFactory sSLSocketFactory = agii.f65590a;
                httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setDefaultUseCaches(false);
                agii.mo35538v();
                httpURLConnection.setConnectTimeout(Felica.MAX_TIMEOUT);
                agii.mo35538v();
                httpURLConnection.setReadTimeout(61000);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoInput(true);
                try {
                    Map map3 = this.f65589f;
                    if (map3 != null) {
                        for (Map.Entry entry : map3.entrySet()) {
                            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    if (this.f65586c != null) {
                        byte[] b = this.f65584a.mo35657o().mo35717b(this.f65586c);
                        agib agib = this.f65584a.mo35497E().f65572k;
                        int length = b.length;
                        agib.mo35436a("Uploading data. size", Integer.valueOf(length));
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                        httpURLConnection.setFixedLengthStreamingMode(length);
                        httpURLConnection.connect();
                        OutputStream outputStream2 = httpURLConnection.getOutputStream();
                        try {
                            outputStream2.write(b);
                            outputStream2.close();
                        } catch (IOException e) {
                            map = null;
                            outputStream = outputStream2;
                            iOException = e;
                        } catch (Throwable th2) {
                            th = th2;
                            map2 = null;
                            outputStream = outputStream2;
                            i2 = 0;
                            if (outputStream != null) {
                            }
                            if (httpURLConnection != null) {
                            }
                            this.f65584a.mo35429b();
                            this.f65584a.mo35498F().mo35492a(new agig(this.f65588e, this.f65587d, i2, null, null, map2));
                            throw th;
                        }
                    }
                    responseCode = httpURLConnection.getResponseCode();
                } catch (IOException e2) {
                    map = null;
                    iOException = e2;
                    i = 0;
                    if (outputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    this.f65584a.mo35429b();
                    F = this.f65584a.mo35498F();
                    agig = new agig(this.f65588e, this.f65587d, i, iOException, null, map);
                    F.mo35492a(agig);
                } catch (Throwable th3) {
                    map2 = null;
                    th = th3;
                    i2 = 0;
                    if (outputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    this.f65584a.mo35429b();
                    this.f65584a.mo35498F().mo35492a(new agig(this.f65588e, this.f65587d, i2, null, null, map2));
                    throw th;
                }
                try {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        inputStream = httpURLConnection.getInputStream();
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read <= 0) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, read);
                            }
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e3) {
                                    iOException = e3;
                                    i = responseCode;
                                    map = headerFields;
                                    if (outputStream != null) {
                                    }
                                    if (httpURLConnection != null) {
                                    }
                                    this.f65584a.mo35429b();
                                    F = this.f65584a.mo35498F();
                                    agig = new agig(this.f65588e, this.f65587d, i, iOException, null, map);
                                    F.mo35492a(agig);
                                } catch (Throwable th4) {
                                    th = th4;
                                    i2 = responseCode;
                                    map2 = headerFields;
                                    if (outputStream != null) {
                                    }
                                    if (httpURLConnection != null) {
                                    }
                                    this.f65584a.mo35429b();
                                    this.f65584a.mo35498F().mo35492a(new agig(this.f65588e, this.f65587d, i2, null, null, map2));
                                    throw th;
                                }
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            this.f65584a.mo35429b();
                            F = this.f65584a.mo35498F();
                            agig = new agig(this.f65588e, this.f65587d, responseCode, null, byteArray, headerFields);
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        inputStream = null;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        throw th;
                    }
                } catch (IOException e4) {
                    map = null;
                    iOException = e4;
                    i = responseCode;
                    if (outputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    this.f65584a.mo35429b();
                    F = this.f65584a.mo35498F();
                    agig = new agig(this.f65588e, this.f65587d, i, iOException, null, map);
                    F.mo35492a(agig);
                } catch (Throwable th7) {
                    th = th7;
                    map2 = null;
                    i2 = responseCode;
                    if (outputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    this.f65584a.mo35429b();
                    this.f65584a.mo35498F().mo35492a(new agig(this.f65588e, this.f65587d, i2, null, null, map2));
                    throw th;
                }
                F.mo35492a(agig);
            }
            throw new IOException("Failed to obtain HTTP connection");
        } catch (IOException e5) {
            httpURLConnection = null;
            map = null;
            iOException = e5;
            i = 0;
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e6) {
                    this.f65584a.mo35497E().f65564c.mo35437a("Error closing HTTP compressed POST connection output stream. appId", agid.m54288a(this.f65588e), e6);
                }
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            this.f65584a.mo35429b();
            F = this.f65584a.mo35498F();
            agig = new agig(this.f65588e, this.f65587d, i, iOException, null, map);
            F.mo35492a(agig);
        } catch (Throwable th8) {
            th = th8;
            httpURLConnection = null;
            map2 = null;
            i2 = 0;
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e7) {
                    this.f65584a.mo35497E().f65564c.mo35437a("Error closing HTTP compressed POST connection output stream. appId", agid.m54288a(this.f65588e), e7);
                }
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            this.f65584a.mo35429b();
            this.f65584a.mo35498F().mo35492a(new agig(this.f65588e, this.f65587d, i2, null, null, map2));
            throw th;
        }
    }
}
