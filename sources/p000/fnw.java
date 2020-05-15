package p000;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Map;

/* renamed from: fnw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class fnw extends fkj {

    /* renamed from: b */
    public static final byte[] f16983b = "\n".getBytes();

    /* renamed from: a */
    public final fof f16984a;

    /* renamed from: c */
    private final String f16985c = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", "GoogleAnalytics", fkk.f16781a, Build.VERSION.RELEASE, fog.m12073a(Locale.getDefault()), Build.MODEL, Build.ID);

    public fnw(fkm fkm) {
        super(fkm);
        this.f16984a = new fof(fkm.f16787c);
    }

    /* renamed from: a */
    private static final void m12039a(StringBuilder sb, String str, String str2) {
        if (sb.length() != 0) {
            sb.append('&');
        }
        sb.append(URLEncoder.encode(str, "UTF-8"));
        sb.append('=');
        sb.append(URLEncoder.encode(str2, "UTF-8"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11025a(String str) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo11026b() {
    }

    /* renamed from: d */
    public final URL mo11045d() {
        mo10943h();
        String valueOf = String.valueOf(flh.m11937g());
        mo10943h();
        String valueOf2 = String.valueOf((String) fni.f16937o.mo11021a());
        try {
            return new URL(valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2));
        } catch (MalformedURLException e) {
            mo10938e("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    /* renamed from: c */
    public final boolean mo11044c() {
        NetworkInfo networkInfo;
        fje.m11804a();
        mo10954t();
        try {
            networkInfo = ((ConnectivityManager) mo10939f().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException e) {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        mo10933d("No network connectivity");
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0087 A[SYNTHETIC, Splitter:B:33:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009f A[SYNTHETIC, Splitter:B:44:0x009f] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a9  */
    /* renamed from: a */
    public final int mo11038a(URL url, byte[] bArr) {
        HttpURLConnection httpURLConnection;
        IOException e;
        OutputStream outputStream;
        sdo.m34959a(url);
        sdo.m34959a(bArr);
        int length = bArr.length;
        mo10930b("POST bytes, url", Integer.valueOf(length), url);
        if (fki.m11850r()) {
            mo10926a("Post payload\n", new String(bArr));
        }
        HttpURLConnection httpURLConnection2 = null;
        r2 = null;
        OutputStream outputStream2 = null;
        try {
            mo11025a(mo10939f().getPackageName());
            httpURLConnection = mo11040a(url);
            try {
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setFixedLengthStreamingMode(length);
                httpURLConnection.connect();
                OutputStream outputStream3 = httpURLConnection.getOutputStream();
                outputStream3.write(bArr);
                mo11043a(httpURLConnection);
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    mo10946k().mo10923c();
                }
                mo10929b("POST status", Integer.valueOf(responseCode));
                if (outputStream3 != null) {
                    try {
                        outputStream3.close();
                    } catch (IOException e2) {
                        mo10938e("Error closing http post connection output stream", e2);
                    }
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                mo11026b();
                return responseCode;
            } catch (IOException e3) {
                e = e3;
                httpURLConnection2 = httpURLConnection;
                outputStream = null;
                try {
                    mo10934d("Network POST connection error", e);
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e4) {
                            mo10938e("Error closing http post connection output stream", e4);
                        }
                    }
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    mo11026b();
                    return 0;
                } catch (Throwable th) {
                    th = th;
                    outputStream2 = outputStream;
                    httpURLConnection = httpURLConnection2;
                    if (outputStream2 != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    mo11026b();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (IOException e5) {
                        mo10938e("Error closing http post connection output stream", e5);
                    }
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                mo11026b();
                throw th;
            }
        } catch (IOException e6) {
            e = e6;
            outputStream = null;
            mo10934d("Network POST connection error", e);
            if (outputStream != null) {
            }
            if (httpURLConnection2 != null) {
            }
            mo11026b();
            return 0;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
            if (outputStream2 != null) {
            }
            if (httpURLConnection != null) {
            }
            mo11026b();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo11039a(fnl fnl, boolean z) {
        String str;
        sdo.m34959a(fnl);
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry entry : fnl.f16956a.entrySet()) {
                String str2 = (String) entry.getKey();
                if (!"ht".equals(str2) && !"qt".equals(str2) && !"AppUID".equals(str2) && !"z".equals(str2) && !"_gmsv".equals(str2)) {
                    m12039a(sb, str2, (String) entry.getValue());
                }
            }
            m12039a(sb, "ht", String.valueOf(fnl.f16959d));
            m12039a(sb, "qt", String.valueOf(mo10936e().mo20505a() - fnl.f16959d));
            mo10943h();
            m12039a(sb, "_gmsv", fkk.f16781a);
            if (z) {
                long b = fog.m12078b(fnl.mo11022a("_s", "0"));
                if (b == 0) {
                    str = String.valueOf(fnl.f16958c);
                } else {
                    str = String.valueOf(b);
                }
                m12039a(sb, "z", str);
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            mo10938e("Failed to encode name or value", e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final HttpURLConnection mo11040a(URL url) {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            mo10943h();
            httpURLConnection.setConnectTimeout(((Integer) fni.f16947y.mo11021a()).intValue());
            mo10943h();
            httpURLConnection.setReadTimeout(((Integer) fni.f16948z.mo11021a()).intValue());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty("User-Agent", this.f16985c);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain http connection");
    }

    /* renamed from: a */
    public final URL mo11041a(fnl fnl) {
        String str;
        if (fnl.f16961f) {
            mo10943h();
            String valueOf = String.valueOf(flh.m11937g());
            mo10943h();
            String valueOf2 = String.valueOf(flh.m11938h());
            str = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
        } else {
            mo10943h();
            String valueOf3 = String.valueOf(flh.m11939i());
            mo10943h();
            String valueOf4 = String.valueOf(flh.m11938h());
            str = valueOf4.length() == 0 ? new String(valueOf3) : valueOf3.concat(valueOf4);
        }
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            mo10938e("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    /* renamed from: a */
    public final URL mo11042a(fnl fnl, String str) {
        String str2;
        if (fnl.f16961f) {
            mo10943h();
            String g = flh.m11937g();
            mo10943h();
            String h = flh.m11938h();
            int length = String.valueOf(g).length();
            StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(h).length() + str.length());
            sb.append(g);
            sb.append(h);
            sb.append("?");
            sb.append(str);
            str2 = sb.toString();
        } else {
            mo10943h();
            String i = flh.m11939i();
            mo10943h();
            String h2 = flh.m11938h();
            int length2 = String.valueOf(i).length();
            StringBuilder sb2 = new StringBuilder(length2 + 1 + String.valueOf(h2).length() + str.length());
            sb2.append(i);
            sb2.append(h2);
            sb2.append("?");
            sb2.append(str);
            str2 = sb2.toString();
        }
        try {
            return new URL(str2);
        } catch (MalformedURLException e) {
            mo10938e("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10890a() {
        mo10926a("Network initialized. User agent", this.f16985c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0022 A[SYNTHETIC, Splitter:B:20:0x0022] */
    /* renamed from: a */
    public final void mo11043a(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        try {
            inputStream = httpURLConnection.getInputStream();
            try {
                do {
                } while (inputStream.read(new byte[1024]) > 0);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        mo10938e("Error closing http connection input stream", e);
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        mo10938e("Error closing http connection input stream", e2);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            if (inputStream != null) {
            }
            throw th;
        }
    }
}
