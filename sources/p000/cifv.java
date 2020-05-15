package p000;

import java.security.GeneralSecurityException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: cifv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cifv extends chwp {

    /* renamed from: p */
    static final cigx f190044p;

    /* renamed from: q */
    public static final ciew f190045q = new cifs();

    /* renamed from: r */
    public SocketFactory f190046r;

    /* renamed from: s */
    private Executor f190047s;

    /* renamed from: t */
    private ScheduledExecutorService f190048t;

    /* renamed from: u */
    private SSLSocketFactory f190049u;

    /* renamed from: v */
    private final cigx f190050v = f190044p;

    /* renamed from: w */
    private final long f190051w = ciag.f189652i;

    /* renamed from: x */
    private int f190052x = 1;

    static {
        cigw cigw = new cigw(cigx.f190271a);
        cigw.mo86089a(cigv.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, cigv.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, cigv.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, cigv.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, cigv.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, cigv.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, cigv.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384, cigv.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384);
        cigw.mo86090a(cihk.TLS_1_2);
        cigw.mo86092b();
        f190044p = cigw.mo86088a();
        TimeUnit.DAYS.toNanos(1000);
    }

    private cifv(String str) {
        super(str);
    }

    /* renamed from: b */
    public static cifv m150191b(String str, int i) {
        return new cifv(ciag.m149910a(str, i));
    }

    public static cifv forTarget(String str) {
        return new cifv(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final chxx mo85716a() {
        return new cifu(this.f190047s, this.f190048t, this.f190046r, mo86044d(), this.f190050v, false, this.f190051w, this.f189408o);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo85769c() {
        int i = this.f190052x;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            return 443;
        } else {
            StringBuilder sb = new StringBuilder(15);
            sb.append("TLS not handled");
            throw new AssertionError(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final SSLSocketFactory mo86044d() {
        int i = this.f190052x;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            try {
                if (this.f190049u == null) {
                    this.f190049u = SSLContext.getInstance("Default", cihi.f190306b.f190308c).getSocketFactory();
                }
                return this.f190049u;
            } catch (GeneralSecurityException e) {
                throw new RuntimeException("TLS Provider failure", e);
            }
        } else {
            StringBuilder sb = new StringBuilder(29);
            sb.append("Unknown negotiation type: TLS");
            throw new RuntimeException(sb.toString());
        }
    }

    public final cifv scheduledExecutorService(ScheduledExecutorService scheduledExecutorService) {
        bmxy.m108582a(scheduledExecutorService, "scheduledExecutorService");
        this.f190048t = scheduledExecutorService;
        return this;
    }

    public final cifv sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f190049u = sSLSocketFactory;
        this.f190052x = 1;
        return this;
    }

    public final cifv transportExecutor(Executor executor) {
        this.f190047s = executor;
        return this;
    }
}
