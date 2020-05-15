package p000;

import com.felicanetworks.mfc.Felica;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: agkp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agkp implements Runnable {

    /* renamed from: a */
    final /* synthetic */ agkq f65817a;

    /* renamed from: b */
    public final agjc f65818b;

    /* renamed from: c */
    private final URL f65819c;

    public agkp(agkq agkq, String str, URL url, agjc agjc) {
        this.f65817a = agkq;
        sdo.m34977c(str);
        sdo.m34959a(url);
        sdo.m34959a(agjc);
        this.f65819c = url;
        this.f65818b = agjc;
    }

    /* renamed from: a */
    private final void m54433a(int i, Exception exc, byte[] bArr) {
        this.f65817a.mo35498F().mo35492a(new agko(this, i, exc, bArr));
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0097  */
    public final void run() {
        HttpURLConnection httpURLConnection;
        int i;
        IOException e;
        Throwable th;
        InputStream inputStream;
        this.f65817a.mo35536C();
        try {
            agkq agkq = this.f65817a;
            URLConnection openConnection = this.f65819c.openConnection();
            if (openConnection instanceof HttpURLConnection) {
                SSLSocketFactory sSLSocketFactory = agkq.f65820a;
                httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setDefaultUseCaches(false);
                agkq.mo35538v();
                httpURLConnection.setConnectTimeout(Felica.MAX_TIMEOUT);
                agkq.mo35538v();
                httpURLConnection.setReadTimeout(61000);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoInput(true);
                try {
                    i = httpURLConnection.getResponseCode();
                    try {
                        httpURLConnection.getHeaderFields();
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
                                    inputStream.close();
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                m54433a(i, null, byteArray);
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            inputStream = null;
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            throw th;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        if (httpURLConnection != null) {
                        }
                        m54433a(i, e, null);
                    } catch (Throwable th4) {
                        th = th4;
                        if (httpURLConnection != null) {
                        }
                        m54433a(i, null, null);
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                    i = 0;
                    if (httpURLConnection != null) {
                    }
                    m54433a(i, e, null);
                } catch (Throwable th5) {
                    th = th5;
                    i = 0;
                    if (httpURLConnection != null) {
                    }
                    m54433a(i, null, null);
                    throw th;
                }
            } else {
                throw new IOException("Failed to obtain HTTP connection");
            }
        } catch (IOException e4) {
            httpURLConnection = null;
            e = e4;
            i = 0;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            m54433a(i, e, null);
        } catch (Throwable th6) {
            httpURLConnection = null;
            th = th6;
            i = 0;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            m54433a(i, null, null);
            throw th;
        }
    }
}
