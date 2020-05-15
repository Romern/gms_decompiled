package com.google.android.gms.ads.cache.p011io;

import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.util.client.C0632g;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.ads.internal.util.net.C0657a;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: com.google.android.gms.ads.cache.io.a */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0204a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0205b f7861a;

    /* renamed from: b */
    private final OutputStream f7862b;

    /* renamed from: c */
    private final String f7863c;

    public C0204a(C0205b bVar, String str, OutputStream outputStream) {
        this.f7861a = bVar;
        this.f7863c = str;
        this.f7862b = outputStream;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0 = r6.getResponseCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004e, code lost:
        if ((r0 / 100) == 2) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
        r2 = r9.f7863c;
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r2).length() + 57);
        r4.append("Received bad status code, ");
        r4.append(r0);
        r4.append(", when downloading ");
        r4.append(r2);
        r4.append(".");
        com.google.android.gms.ads.internal.util.client.C0633h.m5672d(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x007d, code lost:
        if (r6 != null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0080, code lost:
        r6.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0083, code lost:
        r0 = r9.f7861a;
        r2 = r9.f7863c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        p000.srz.m36168a(r6.getInputStream(), r9.f7862b, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0099, code lost:
        if (r6 != null) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009c, code lost:
        r6.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009f, code lost:
        r9.f7861a.mo6400a(r9.f7863c, true);
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0142  */
    public final void run() {
        Throwable th;
        HttpURLConnection httpURLConnection;
        IOException e;
        HttpURLConnection httpURLConnection2 = null;
        try {
            C0657a aVar = C0387d.f8300a.f8304e;
            String str = this.f7863c;
            int intValue = ((Integer) C0371o.f8251d.mo6604a()).intValue();
            URL url = new URL(str);
            int i = 0;
            while (true) {
                i++;
                if (i <= 20) {
                    URLConnection openConnection = url.openConnection();
                    openConnection.setConnectTimeout(intValue);
                    openConnection.setReadTimeout(intValue);
                    if (openConnection instanceof HttpURLConnection) {
                        httpURLConnection = (HttpURLConnection) openConnection;
                        C0632g gVar = new C0632g();
                        gVar.mo6813a(httpURLConnection, (byte[]) null);
                        httpURLConnection.setInstanceFollowRedirects(false);
                        int responseCode = httpURLConnection.getResponseCode();
                        gVar.mo6812a(httpURLConnection, responseCode);
                        if (responseCode / 100 != 3) {
                            try {
                                break;
                            } catch (IOException e2) {
                                e = e2;
                                try {
                                    C0633h.m5673d("Unable to download asset.", e);
                                    if (httpURLConnection != null) {
                                    }
                                    C0205b bVar = this.f7861a;
                                    String str2 = this.f7863c;
                                    bVar.mo6400a(str2, false);
                                    srz.m36171a(this.f7862b);
                                } catch (Throwable th2) {
                                    th = th2;
                                    httpURLConnection2 = httpURLConnection;
                                    if (httpURLConnection2 != null) {
                                    }
                                    this.f7861a.mo6400a(this.f7863c, false);
                                    srz.m36171a(this.f7862b);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                httpURLConnection2 = httpURLConnection;
                                if (httpURLConnection2 != null) {
                                }
                                this.f7861a.mo6400a(this.f7863c, false);
                                srz.m36171a(this.f7862b);
                                throw th;
                            }
                        } else {
                            String headerField = httpURLConnection.getHeaderField("Location");
                            if (headerField != null) {
                                URL url2 = new URL(url, headerField);
                                String protocol = url2.getProtocol();
                                if (protocol == null) {
                                    throw new IOException("Protocol is null");
                                } else if (!protocol.equals("http") && !protocol.equals("https")) {
                                    throw new IOException(protocol.length() == 0 ? new String("Unsupported scheme: ") : "Unsupported scheme: ".concat(protocol));
                                } else {
                                    C0633h.m5664a(headerField.length() == 0 ? new String("Redirecting to ") : "Redirecting to ".concat(headerField));
                                    httpURLConnection.disconnect();
                                    url = url2;
                                }
                            } else {
                                throw new IOException("Missing Location header in redirect");
                            }
                        }
                    } else {
                        throw new IOException("Invalid protocol.");
                    }
                } else {
                    throw new IOException("Too many redirects (20)");
                }
            }
        } catch (IOException e3) {
            httpURLConnection = null;
            e = e3;
            C0633h.m5673d("Unable to download asset.", e);
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            C0205b bVar2 = this.f7861a;
            String str22 = this.f7863c;
            bVar2.mo6400a(str22, false);
            srz.m36171a(this.f7862b);
        } catch (Throwable th4) {
            th = th4;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            this.f7861a.mo6400a(this.f7863c, false);
            srz.m36171a(this.f7862b);
            throw th;
        }
        srz.m36171a(this.f7862b);
    }
}
