package p000;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.JoinOptions;
import com.google.android.gms.cast.LaunchOptions;
import java.util.concurrent.Executor;

/* renamed from: pwb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pwb {

    /* renamed from: a */
    private final ptx f40424a = new qav("MediaRouteSession");

    /* renamed from: b */
    private final pjc f40425b;

    /* renamed from: c */
    private final pvw f40426c;

    /* renamed from: d */
    private final Executor f40427d;

    /* renamed from: e */
    private final JoinOptions f40428e;

    /* renamed from: f */
    private int f40429f;

    /* renamed from: g */
    private int f40430g;

    /* renamed from: h */
    private ApplicationMetadata f40431h;

    /* renamed from: i */
    private String f40432i;

    /* renamed from: j */
    private pwa f40433j;

    /* renamed from: k */
    private boolean f40434k;

    public pwb(pjc pjc, pvw pvw, Executor executor, boolean z, String str) {
        this.f40425b = pjc;
        this.f40426c = pvw;
        this.f40427d = executor;
        this.f40428e = new JoinOptions();
        this.f40429f = 4;
        this.f40430g = 0;
        this.f40424a.mo23669a(str);
        this.f40424a.f40220c = z;
    }

    /* renamed from: b */
    private final void m31485b() {
        this.f40429f = 3;
        if (this.f40434k) {
            this.f40434k = false;
            this.f40431h = null;
            this.f40425b.mo23212c("");
            return;
        }
        this.f40425b.mo23215e();
    }

    /* renamed from: a */
    public final synchronized String mo23754a() {
        return this.f40432i;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo23755a(int i) {
        this.f40424a.mo23670a("onApplicationConnectionFailed; mPendingState=%d", Integer.valueOf(this.f40430g));
        if (this.f40429f == 1) {
            int i2 = this.f40430g;
            if (i2 == 0) {
                this.f40429f = 4;
                this.f40427d.execute(new pvy(this.f40432i, i, this.f40426c));
                this.f40432i = null;
            } else if (i2 == 2) {
                this.f40430g = 0;
                this.f40427d.execute(new pvy(this.f40432i, i, this.f40426c));
                pwa pwa = this.f40433j;
                m31486b(pwa.f40422a, pwa.f40423b);
            }
        }
    }

    /* renamed from: b */
    private final void m31486b(String str, LaunchOptions launchOptions) {
        this.f40429f = 1;
        this.f40433j = null;
        this.f40425b.mo23201a(str, launchOptions);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo23760b(int i) {
        this.f40424a.mo23670a("onApplicationDisconnected; mPendingState=%d", Integer.valueOf(this.f40430g));
        int i2 = this.f40429f;
        if (i2 == 2 || i2 == 3) {
            int i3 = this.f40430g;
            if (i3 == 0) {
                this.f40429f = 4;
                this.f40430g = 0;
                this.f40427d.execute(new pvx(this.f40432i, i, this.f40426c));
                this.f40432i = null;
            } else if (i3 != 2) {
                this.f40429f = 4;
                this.f40430g = 0;
            } else {
                this.f40427d.execute(new pvx(this.f40432i, i, this.f40426c));
                this.f40430g = 0;
                pwa pwa = this.f40433j;
                m31486b(pwa.f40422a, pwa.f40423b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo23756a(ApplicationMetadata applicationMetadata, String str) {
        this.f40424a.mo23670a("onApplicationConnected; mPendingState=%d", Integer.valueOf(this.f40430g));
        if (this.f40429f == 1) {
            int i = this.f40430g;
            if (i == 0) {
                this.f40429f = 2;
                this.f40431h = applicationMetadata;
                this.f40432i = str;
                this.f40427d.execute(new pvz(this.f40432i, this.f40431h, this.f40426c));
            } else if (i != 2) {
                this.f40429f = 2;
                this.f40430g = 0;
            } else {
                m31485b();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo23757a(String str, LaunchOptions launchOptions) {
        this.f40424a.mo23670a("starting session for app %s; mState=%d", str, Integer.valueOf(this.f40429f));
        int i = this.f40429f;
        if (i != 1) {
            if (i == 2) {
                this.f40430g = 2;
                this.f40433j = new pwa(str, launchOptions);
                m31485b();
                return;
            } else if (i != 3) {
                if (i == 4) {
                    this.f40430g = 0;
                    m31486b(str, launchOptions);
                    return;
                }
                return;
            }
        }
        this.f40430g = 2;
        this.f40433j = new pwa(str, launchOptions);
    }

    /* renamed from: a */
    public final synchronized void mo23758a(String str, String str2) {
        int i = this.f40429f;
        if (i == 4) {
            this.f40429f = 1;
            this.f40425b.mo23205a(str, str2, this.f40428e);
        } else {
            StringBuilder sb = new StringBuilder(51);
            sb.append("session is not currently stopped! state=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo23759a(boolean z) {
        this.f40424a.mo23670a("stopping session: stopApplication=%b", Boolean.valueOf(z));
        this.f40434k = z;
        this.f40433j = null;
        int i = this.f40429f;
        if (i == 1 || i == 2) {
            this.f40430g = 0;
            m31485b();
        } else if (i == 3 || i == 4) {
            this.f40430g = 0;
        }
    }
}
