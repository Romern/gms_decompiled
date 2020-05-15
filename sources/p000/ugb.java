package p000;

import android.content.Context;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.common.internal.ClientContext;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ugb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ugb {

    /* renamed from: h */
    private static final sbw f47494h = new sbw("DownloadTask", "");

    /* renamed from: a */
    public final AtomicInteger f47495a = new AtomicInteger();

    /* renamed from: b */
    protected final String f47496b;

    /* renamed from: c */
    protected final uey f47497c;

    /* renamed from: d */
    protected final ufv f47498d;

    /* renamed from: e */
    protected final vfb f47499e;

    /* renamed from: f */
    public volatile ufm f47500f = null;

    /* renamed from: g */
    public volatile String f47501g = null;

    /* renamed from: i */
    private final Context f47502i;

    /* renamed from: j */
    private final ufe f47503j;

    public ugb(ufv ufv, uey uey, String str, Context context, ufe ufe, vfb vfb) {
        this.f47498d = ufv;
        this.f47497c = uey;
        this.f47496b = str;
        this.f47502i = context;
        this.f47503j = ufe;
        this.f47499e = vfb;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ufw.<init>(java.lang.Exception, boolean):void
     arg types: [java.io.IOException, int]
     candidates:
      ufw.<init>(java.lang.String, boolean):void
      ufw.<init>(java.lang.Exception, boolean):void */
    /* renamed from: a */
    private static final int m38308a(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            throw new ufw((Exception) e, true);
        }
    }

    /* renamed from: a */
    protected static int m38309a(ufw ufw) {
        if (ufw.f47486b) {
            switch (ufw.f47485a) {
                case 400:
                case ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE:
                case 403:
                case 404:
                    break;
                case ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED:
                default:
                    return 8;
            }
        }
        return 5;
    }

    /* renamed from: a */
    public abstract boolean mo27309a();

    /* renamed from: b */
    public final void mo27310b() {
        this.f47499e.mo28376d();
    }

    /* renamed from: c */
    public abstract ufm mo27311c();

    /* renamed from: d */
    public abstract long mo27312d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo27313e() {
        return null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ufw.<init>(java.lang.Exception, boolean):void
     arg types: [java.io.IOException, int]
     candidates:
      ufw.<init>(java.lang.String, boolean):void
      ufw.<init>(java.lang.Exception, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ufw.<init>(java.lang.Exception, boolean):void
     arg types: [java.net.MalformedURLException, int]
     candidates:
      ufw.<init>(java.lang.String, boolean):void
      ufw.<init>(java.lang.Exception, boolean):void */
    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final vfj mo27314f() {
        try {
            return this.f47499e.mo28357a().mo28349a(new URL(this.f47496b));
        } catch (vex e) {
            throw e;
        } catch (MalformedURLException e2) {
            throw new ufw((Exception) e2, false);
        } catch (IOException e3) {
            throw new ufw((Exception) e3, true);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ufw.<init>(java.lang.Exception, boolean):void
     arg types: [java.io.IOException, int]
     candidates:
      ufw.<init>(java.lang.String, boolean):void
      ufw.<init>(java.lang.Exception, boolean):void */
    /* renamed from: a */
    private final sie m38310a(HttpURLConnection httpURLConnection, ClientContext clientContext, ufm ufm) {
        httpURLConnection.setConnectTimeout(5000);
        httpURLConnection.setReadTimeout(0);
        if (ufm != null) {
            httpURLConnection.setRequestProperty("Range", new ugk(ufm.mo27296b().f47440b, -1).mo27330a());
        }
        try {
            return ufb.m38262a(httpURLConnection, clientContext, this.f47502i);
        } catch (IOException e) {
            throw new ufw((Exception) e, false);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ufw.<init>(java.lang.Exception, boolean):void
     arg types: [java.text.ParseException, int]
     candidates:
      ufw.<init>(java.lang.String, boolean):void
      ufw.<init>(java.lang.Exception, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ufw.<init>(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      ufw.<init>(java.lang.Exception, boolean):void
      ufw.<init>(java.lang.String, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ufw.<init>(java.lang.Exception, boolean):void
     arg types: [java.io.IOException, int]
     candidates:
      ufw.<init>(java.lang.String, boolean):void
      ufw.<init>(java.lang.Exception, boolean):void */
    /* renamed from: a */
    private final ufm m38311a(vfj vfj, ufm ufm) {
        long j;
        long j2;
        long j3;
        ufm ufm2 = ufm;
        HttpURLConnection a = vfj.mo28346a();
        int a2 = m38308a(a);
        f47494h.mo25369a("Processing response. Status code: %s", Integer.valueOf(a2));
        if (a2 == 200) {
            try {
                this.f47500f = mo27311c();
                this.f47501g = mo27313e();
                j = (long) a.getContentLength();
                j2 = 0;
            } catch (IOException e) {
                throw new ufw((Exception) e, false);
            }
        } else if (a2 != 206) {
            throw new ufw(a2);
        } else if (ufm2 != null) {
            this.f47500f = ufm2;
            this.f47501g = mo27313e();
            String headerField = a.getHeaderField("Content-Range");
            if (headerField != null) {
                try {
                    ugk a3 = ugk.m38337a(headerField);
                    j2 = a3.f47544c;
                    j = a3.f47545d + 1;
                } catch (ParseException e2) {
                    throw new ufw((Exception) e2, false);
                }
            } else {
                throw new ufw("Partial response is missing range header.", true);
            }
        } else {
            throw new ufw("Server returned partial content but full content was requested.", true);
        }
        if (j < 0) {
            long d = mo27312d();
            f47494h.mo25369a("Falling back to expected size from metadata: %s", Long.valueOf(d));
            j3 = d;
        } else {
            j3 = j;
        }
        sbw sbw = f47494h;
        Long valueOf = Long.valueOf(j3);
        sbw.mo25369a("Initial bytes completed: %s. Expected size: %s", Long.valueOf(j2), valueOf);
        try {
            InputStream inputStream = a.getInputStream();
            ufk b = this.f47500f.mo27296b();
            long j4 = b.f47440b;
            if (j2 <= j4) {
                if (j3 > 0) {
                    if (j3 <= j4) {
                        f47494h.mo25369a("Bytes written (%d) exceeds or is same as expected size (%d)", Long.valueOf(j4), valueOf);
                    } else {
                        this.f47503j.mo27276a(j3 - j4);
                    }
                }
                ugg ugg = new ugg(b, this.f47498d, j3, j2, vfj.mo28347b());
                while (j2 < j4) {
                    try {
                        j2 += inputStream.skip(j4 - j2);
                    } catch (vex e3) {
                        throw e3;
                    } catch (IOException e4) {
                        throw new ufw((Exception) e4, true);
                    }
                }
                srz.m36168a(inputStream, ugg, false);
                return this.f47500f;
            }
            throw new ufw("Range response starts after requested start.", false);
        } catch (IOException e5) {
            throw new ufw((Exception) e5, true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ufm mo27308a(ufm ufm) {
        if (!this.f47499e.mo28377e()) {
            ClientContext a = this.f47497c.mo27262a(this.f47502i);
            vfj f = mo27314f();
            try {
                sie a2 = m38310a(f.mo28346a(), a, ufm);
                f47494h.mo25369a("Executing download request. URI: %s", this.f47496b);
                if (m38308a(f.mo28346a()) == 401) {
                    f47494h.mo25371b("Received UNAUTHORIZED response code. Invalidating token and trying to connect again.");
                    a2.mo25587c(this.f47502i);
                    f.close();
                    f = mo27314f();
                    try {
                        m38310a(f.mo28346a(), a, ufm);
                    } catch (Throwable th) {
                        th = th;
                        f.close();
                        throw th;
                    }
                }
                ufm a3 = m38311a(f, ufm);
                f.close();
                return a3;
            } catch (Throwable th2) {
                th = th2;
                f.close();
                throw th;
            }
        } else {
            throw new vex("Transfer is canceled");
        }
    }
}
