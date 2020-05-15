package p000;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.internal.InitializationParams;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: agje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agje implements agjw {

    /* renamed from: y */
    private static volatile agje f65677y;

    /* renamed from: A */
    private final aghu f65678A;

    /* renamed from: B */
    private final agkw f65679B;

    /* renamed from: C */
    private final agcs f65680C;

    /* renamed from: D */
    private final agkq f65681D;

    /* renamed from: E */
    private Boolean f65682E;

    /* renamed from: F */
    private long f65683F;

    /* renamed from: G */
    private volatile Boolean f65684G;

    /* renamed from: a */
    public final Context f65685a;

    /* renamed from: b */
    public final String f65686b;

    /* renamed from: c */
    public final String f65687c;

    /* renamed from: d */
    public final String f65688d;

    /* renamed from: e */
    public final boolean f65689e;

    /* renamed from: f */
    public final agde f65690f;

    /* renamed from: g */
    public final agdi f65691g;

    /* renamed from: h */
    public final agiq f65692h;

    /* renamed from: i */
    public final agid f65693i;

    /* renamed from: j */
    public final agjb f65694j;

    /* renamed from: k */
    public final agms f65695k;

    /* renamed from: l */
    public final sqv f65696l;

    /* renamed from: m */
    public final agkm f65697m;

    /* renamed from: n */
    public aght f65698n;

    /* renamed from: o */
    public agln f65699o;

    /* renamed from: p */
    public agdp f65700p;

    /* renamed from: q */
    public aghr f65701q;

    /* renamed from: r */
    public agit f65702r;

    /* renamed from: s */
    public boolean f65703s = false;

    /* renamed from: t */
    protected Boolean f65704t;

    /* renamed from: u */
    protected Boolean f65705u;

    /* renamed from: v */
    public int f65706v;

    /* renamed from: w */
    public final AtomicInteger f65707w = new AtomicInteger(0);

    /* renamed from: x */
    public final long f65708x;

    /* renamed from: z */
    private final agmb f65709z;

    public agje(agkc agkc) {
        Bundle bundle;
        boolean z = false;
        sdo.m34959a(agkc);
        agde agde = new agde(agkc.f65767a);
        this.f65690f = agde;
        aghl.f65436a = agde;
        this.f65685a = agkc.f65767a;
        this.f65686b = agkc.f65768b;
        this.f65687c = agkc.f65769c;
        this.f65688d = agkc.f65770d;
        this.f65689e = agkc.f65774h;
        this.f65684G = agkc.f65771e;
        InitializationParams initializationParams = agkc.f65773g;
        if (!(initializationParams == null || (bundle = initializationParams.f80097g) == null)) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f65704t = (Boolean) obj;
            }
            Object obj2 = initializationParams.f80097g.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f65705u = (Boolean) obj2;
            }
        }
        bdyx.m91614a(this.f65685a);
        this.f65696l = srb.f45012a;
        this.f65708x = System.currentTimeMillis();
        this.f65691g = new agdi(this);
        agiq agiq = new agiq(this);
        agiq.mo35545l();
        this.f65692h = agiq;
        agid agid = new agid(this);
        agid.mo35545l();
        this.f65693i = agid;
        agms agms = new agms(this);
        agms.mo35545l();
        this.f65695k = agms;
        aghu aghu = new aghu(this);
        aghu.mo35545l();
        this.f65678A = aghu;
        this.f65680C = new agcs(this);
        agkw agkw = new agkw(this);
        agkw.mo35246m();
        this.f65679B = agkw;
        agkm agkm = new agkm(this);
        agkm.mo35246m();
        this.f65697m = agkm;
        agmb agmb = new agmb(this);
        agmb.mo35246m();
        this.f65709z = agmb;
        agkq agkq = new agkq(this);
        agkq.mo35545l();
        this.f65681D = agkq;
        agjb agjb = new agjb(this);
        agjb.mo35545l();
        this.f65694j = agjb;
        InitializationParams initializationParams2 = agkc.f65773g;
        if (initializationParams2 == null) {
            z = true;
        } else if (initializationParams2.f80092b == 0) {
            z = true;
        }
        if (!this.f65690f.f65291a) {
            if (this.f65685a.getApplicationContext() instanceof Application) {
                int i = Build.VERSION.SDK_INT;
                agkm e = mo35501e();
                if (e.mo35542z().getApplicationContext() instanceof Application) {
                    Application application = (Application) e.mo35542z().getApplicationContext();
                    if (e.f65808b == null) {
                        e.f65808b = new agkl(e);
                    }
                    if (z) {
                        application.unregisterActivityLifecycleCallbacks(e.f65808b);
                        application.registerActivityLifecycleCallbacks(e.f65808b);
                        e.mo35497E().f65572k.mo35435a("Registered activity lifecycle callback");
                    }
                }
            } else {
                mo35497E().f65567f.mo35435a("Application context is not an Application");
            }
        }
        this.f65694j.mo35492a(new agjd(this, agkc));
    }

    /* renamed from: a */
    public static agje m54353a(Context context) {
        return m54354a(context, null);
    }

    /* renamed from: E */
    public final agid mo35497E() {
        m54357a((agjv) this.f65693i);
        return this.f65693i;
    }

    /* renamed from: F */
    public final agjb mo35498F() {
        m54357a((agjv) this.f65694j);
        return this.f65694j;
    }

    /* renamed from: d */
    public final agmb mo35500d() {
        m54355a((agcu) this.f65709z);
        return this.f65709z;
    }

    /* renamed from: e */
    public final agkm mo35501e() {
        m54355a((agcu) this.f65697m);
        return this.f65697m;
    }

    /* renamed from: f */
    public final agms mo35502f() {
        m54356a((agju) this.f65695k);
        return this.f65695k;
    }

    /* renamed from: g */
    public final aghu mo35503g() {
        m54356a((agju) this.f65678A);
        return this.f65678A;
    }

    /* renamed from: h */
    public final aght mo35504h() {
        m54355a((agcu) this.f65698n);
        return this.f65698n;
    }

    /* renamed from: i */
    public final agkq mo35505i() {
        m54357a((agjv) this.f65681D);
        return this.f65681D;
    }

    /* renamed from: j */
    public final boolean mo35506j() {
        return TextUtils.isEmpty(this.f65686b);
    }

    /* renamed from: k */
    public final agkw mo35507k() {
        m54355a((agcu) this.f65679B);
        return this.f65679B;
    }

    /* renamed from: l */
    public final agln mo35508l() {
        m54355a((agcu) this.f65699o);
        return this.f65699o;
    }

    /* renamed from: m */
    public final agdp mo35509m() {
        m54357a((agjv) this.f65700p);
        return this.f65700p;
    }

    /* renamed from: n */
    public final aghr mo35510n() {
        m54355a((agcu) this.f65701q);
        return this.f65701q;
    }

    /* renamed from: o */
    public final agcs mo35511o() {
        agcs agcs = this.f65680C;
        if (agcs != null) {
            return agcs;
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: p */
    public final void mo35512p() {
        mo35498F().mo35241h();
    }

    /* renamed from: q */
    public final boolean mo35513q() {
        return mo35514r() == 0;
    }

    /* renamed from: r */
    public final int mo35514r() {
        Boolean bool;
        mo35512p();
        if (this.f65691g.mo35323e()) {
            return 1;
        }
        Boolean bool2 = this.f65705u;
        if (bool2 != null && bool2.booleanValue()) {
            return 2;
        }
        Boolean d = mo35499a().mo35469d();
        if (d == null) {
            agdi agdi = this.f65691g;
            if (!agdi.mo35537u().f65291a) {
                bool = agdi.mo35319c("firebase_analytics_collection_enabled");
            } else {
                bool = null;
            }
            if (bool == null) {
                Boolean bool3 = this.f65704t;
                if (bool3 == null) {
                    if (rnq.m34143a("isMeasurementExplicitlyDisabled").f43416e) {
                        return 6;
                    }
                    if (!this.f65691g.mo35314a(aghn.f65458N) || this.f65684G == null || this.f65684G.booleanValue()) {
                        return 0;
                    }
                    return 7;
                } else if (!bool3.booleanValue()) {
                    return 5;
                } else {
                    return 0;
                }
            } else if (!bool.booleanValue()) {
                return 4;
            } else {
                return 0;
            }
        } else if (!d.booleanValue()) {
            return 3;
        } else {
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo35515s() {
        if (this.f65690f.f65291a) {
            throw new IllegalStateException("Unexpected call on package side");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final void mo35516t() {
        if (!this.f65690f.f65291a) {
            throw new IllegalStateException("Unexpected call on client side");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo35517u() {
        this.f65707w.incrementAndGet();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008d  */
    /* renamed from: v */
    public final boolean mo35518v() {
        boolean z;
        Boolean valueOf;
        if (this.f65703s) {
            mo35512p();
            Boolean bool = this.f65682E;
            if (bool == null || this.f65683F == 0 || (!bool.booleanValue() && Math.abs(SystemClock.elapsedRealtime() - this.f65683F) > 1000)) {
                this.f65683F = SystemClock.elapsedRealtime();
                boolean z2 = true;
                if (this.f65690f.f65291a) {
                    this.f65682E = true;
                    return true;
                }
                if (mo35502f().mo35752e("android.permission.INTERNET") && mo35502f().mo35752e("android.permission.ACCESS_NETWORK_STATE")) {
                    if (svr.m36484b(this.f65685a).mo26173a() || this.f65691g.mo35328l()) {
                        z = true;
                        valueOf = Boolean.valueOf(z);
                        this.f65682E = valueOf;
                        if (valueOf.booleanValue()) {
                            agms f = mo35502f();
                            String p = mo35510n().mo35405p();
                            String q = mo35510n().mo35406q();
                            mo35510n().mo35245l();
                            if (!f.mo35748c(p, q) && TextUtils.isEmpty(mo35510n().mo35406q())) {
                                z2 = false;
                            }
                            this.f65682E = Boolean.valueOf(z2);
                        }
                    } else if (agiv.m54326a(this.f65685a) && agms.m54590a(this.f65685a)) {
                        z = true;
                        valueOf = Boolean.valueOf(z);
                        this.f65682E = valueOf;
                        if (valueOf.booleanValue()) {
                        }
                    }
                }
                z = false;
                valueOf = Boolean.valueOf(z);
                this.f65682E = valueOf;
                if (valueOf.booleanValue()) {
                }
            }
            return this.f65682E.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    /* renamed from: a */
    public static agje m54354a(Context context, InitializationParams initializationParams) {
        Bundle bundle;
        if (initializationParams != null && (initializationParams.f80095e == null || initializationParams.f80096f == null)) {
            initializationParams = new InitializationParams(initializationParams.f80091a, initializationParams.f80092b, initializationParams.f80093c, initializationParams.f80094d, null, null, initializationParams.f80097g);
        }
        sdo.m34959a(context);
        sdo.m34959a(context.getApplicationContext());
        if (f65677y == null) {
            synchronized (agje.class) {
                if (f65677y == null) {
                    f65677y = new agje(new agkc(context, initializationParams));
                }
            }
        } else if (!(initializationParams == null || (bundle = initializationParams.f80097g) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
            f65677y.f65684G = Boolean.valueOf(initializationParams.f80097g.getBoolean("dataCollectionDefaultEnabled"));
        }
        return f65677y;
    }

    /* renamed from: a */
    private static final void m54355a(agcu agcu) {
        if (agcu == null) {
            throw new IllegalStateException("Component not created");
        } else if (!agcu.mo35244k()) {
            String valueOf = String.valueOf(agcu.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    private static final void m54356a(agju agju) {
        if (agju == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* renamed from: a */
    public static final void m54357a(agjv agjv) {
        if (agjv == null) {
            throw new IllegalStateException("Component not created");
        } else if (!agjv.mo35543g()) {
            String valueOf = String.valueOf(agjv.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public final agiq mo35499a() {
        m54356a((agju) this.f65692h);
        return this.f65692h;
    }
}
