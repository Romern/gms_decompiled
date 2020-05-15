package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.SystemClock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: mgj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mgj implements mhv {

    /* renamed from: a */
    public static final lvn f33623a = new lvn("SourceManager");

    /* renamed from: b */
    public final Context f33624b;

    /* renamed from: c */
    public final bqgj f33625c;

    /* renamed from: d */
    public final mgw f33626d;

    /* renamed from: e */
    public final mgq f33627e;

    /* renamed from: f */
    public final mgc f33628f;

    /* renamed from: g */
    public final lyz f33629g;

    /* renamed from: h */
    public final met f33630h;

    /* renamed from: i */
    public mib f33631i;

    /* renamed from: j */
    public int f33632j;

    /* renamed from: k */
    public String f33633k;

    /* renamed from: l */
    public boolean f33634l = false;

    /* renamed from: m */
    public boolean f33635m;

    /* renamed from: n */
    public mjv f33636n;

    /* renamed from: o */
    public final ScheduledExecutorService f33637o;

    /* renamed from: p */
    public final mez f33638p;

    /* renamed from: q */
    private final mfr f33639q;

    /* renamed from: r */
    private final mgx f33640r;

    /* renamed from: s */
    private boolean f33641s = false;

    /* renamed from: t */
    private final lsp f33642t;

    /* renamed from: u */
    private final ExecutorService f33643u;

    public mgj(Context context, bqgj bqgj, ScheduledExecutorService scheduledExecutorService, mez mez, met met, mgw mgw, mgx mgx, mgq mgq, mfr mfr, lyz lyz, lsp lsp, mgc mgc, ExecutorService executorService) {
        this.f33642t = lsp;
        sdo.m34959a(context);
        this.f33624b = context;
        sdo.m34959a(scheduledExecutorService);
        this.f33637o = scheduledExecutorService;
        sdo.m34959a(bqgj);
        this.f33625c = bqgj;
        sdo.m34959a(mez);
        this.f33638p = mez;
        sdo.m34959a(mgw);
        this.f33626d = mgw;
        sdo.m34959a(mgx);
        this.f33640r = mgx;
        sdo.m34959a(met);
        this.f33630h = met;
        sdo.m34959a(mgq);
        this.f33627e = mgq;
        sdo.m34959a(mfr);
        this.f33639q = mfr;
        sdo.m34959a(mgc);
        this.f33628f = mgc;
        sdo.m34959a(executorService);
        this.f33643u = executorService;
        sdo.m34959a(lyz);
        this.f33629g = lyz;
        if (cckx.m130276b()) {
            this.f33636n = new mjv(scheduledExecutorService, cckw.m130271i(), new mgd(this));
        }
        mo19981a(0);
    }

    /* renamed from: h */
    private final void m25055h() {
        this.f33634l = false;
        if (this.f33632j != 1) {
            f33623a.mo25409a("Starting the protocol.", new Object[0]);
            this.f33631i.f33745d.mo20105e();
        } else {
            this.f33631i.mo20044c();
        }
        if (!ccnu.m130916d()) {
            this.f33626d.mo20003b();
        } else {
            this.f33643u.execute(new mgg(this));
        }
    }

    /* renamed from: a */
    public final void mo19980a() {
        if (this.f33631i != null && this.f33635m) {
            f33623a.mo25416d("Protocol already initialized for WiFi D2D.", new Object[0]);
            return;
        }
        f33623a.mo25409a("Creating protocol for WiFi D2D.", new Object[0]);
        this.f33635m = true;
        if (ccop.m131033c()) {
            this.f33630h.f33542k = 7;
        }
        mle mle = new mle(new arsy(this.f33624b));
        this.f33631i = new mib(this.f33624b, new mge(this, mle), this.f33639q, this.f33629g, this, this.f33625c, this.f33630h, this.f33642t, mle, new mhp(new mhn()));
        m25055h();
    }

    /* renamed from: b */
    public final void mo19985b() {
        f33623a.mo25409a("Report state to UI requested: %s", Integer.valueOf(this.f33632j));
        if (this.f33633k != null) {
            mo19986c();
        }
        switch (this.f33632j) {
            case 0:
                this.f33638p.mo19910a(mfg.f33574a);
                return;
            case 1:
                mib mib = this.f33631i;
                if (mib != null) {
                    mib.mo20044c();
                    return;
                }
                return;
            case 2:
                this.f33638p.mo19911a(this.f33641s);
                return;
            case 3:
                this.f33638p.mo19907a();
                return;
            case 4:
                this.f33638p.mo19912b();
                return;
            case 5:
                this.f33638p.mo19913c();
                return;
            case 6:
                this.f33638p.mo19916f();
                return;
            case 7:
                this.f33638p.mo19915e();
                return;
            default:
                this.f33638p.mo19914d();
                return;
        }
    }

    /* renamed from: c */
    public final void mo19986c() {
        this.f33638p.mo19910a(new mff(this.f33633k));
    }

    /* renamed from: d */
    public final void mo19987d() {
        f33623a.mo25412b("The user authorized transfer.", new Object[0]);
        this.f33634l = true;
        mib mib = this.f33631i;
        if (mib != null) {
            mib.f33754e.mo25412b("Authorization granted.", new Object[0]);
            bxvd da = mow.f34080c.mo74144da();
            Account a = mib.f33757h.mo19591a();
            if (a != null) {
                String str = a.name;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                mow mow = (mow) da.f164949b;
                str.getClass();
                mow.f34082a |= 1;
                mow.f34083b = str;
                mib.f33754e.mo25414c("Sending source backup account (%s) to target.", ((mow) da.f164949b).f34083b);
            } else {
                mib.f33754e.mo25416d("No backup account found on source - could not tell target desired backup account.", new Object[0]);
            }
            mow mow2 = (mow) da.mo74062i();
            mpm b = mhu.m25130b(mpl.AUTHORIZATION_GRANTED);
            bxvd bxvd = (bxvd) b.mo74142c(5);
            bxvd.mo73625a((bxvk) b);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            mpm mpm = (mpm) bxvd.f164949b;
            mpm mpm2 = mpm.f34178i;
            mow2.getClass();
            mpm.f34185f = mow2;
            mpm.f34180a |= 32;
            mib.mo20035a((mpm) bxvd.mo74062i());
        }
    }

    /* renamed from: e */
    public final void mo19988e() {
        mib mib = this.f33631i;
        if (mib != null) {
            mib.mo20047f();
            this.f33631i = null;
        }
    }

    /* renamed from: f */
    public final void mo19989f() {
        adzt adzt = new adzt(this.f33624b.getMainLooper());
        mgx mgx = this.f33640r;
        mgx.getClass();
        adzt.post(new mgh(mgx));
        this.f33626d.mo20006e();
    }

    /* renamed from: g */
    public final void mo19990g() {
        this.f33638p.mo19910a(mfd.f33571a);
        this.f33626d.mo20001a(13, null, 1, 1);
        mo19989f();
    }

    /* renamed from: a */
    public final void mo19981a(int i) {
        int i2;
        this.f33632j = i;
        if (i == 0) {
            i2 = 11;
        } else if (i == 1) {
            i2 = 21;
        } else if (i == 5) {
            i2 = 101;
        } else if (i == 6) {
            i2 = 31;
        } else if (i == 7) {
            i2 = 61;
        } else if (i != 8) {
            f33623a.mo25409a("Did not find a log state for %d", Integer.valueOf(i));
            i2 = 1;
        } else {
            i2 = 91;
        }
        if (i2 != 1) {
            int a = mtm.m25610a(((mtn) this.f33630h.f33215f.mo74062i()).f34680b);
            if (a == 0) {
                a = 1;
            }
            if (i2 != a) {
                met met = this.f33630h;
                int a2 = mtm.m25610a(((mtn) met.f33215f.f164949b).f34680b);
                if (a2 == 0) {
                    a2 = 1;
                }
                if (i2 != a2) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    bxvd bxvd = met.f33215f;
                    long j = elapsedRealtime - met.f33212c;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    mtn mtn = (mtn) bxvd.f164949b;
                    mtn mtn2 = mtn.f34677i;
                    mtn.f34679a |= 2;
                    mtn.f34681c = j;
                    int b = met.mo19757b();
                    bxvd bxvd2 = met.f33215f;
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    mtn mtn3 = (mtn) bxvd2.f164949b;
                    mtn3.f34679a = 8 | mtn3.f34679a;
                    mtn3.f34684f = b;
                    bxvd bxvd3 = met.f33215f;
                    long j2 = met.f33212c;
                    if (bxvd3.f164950c) {
                        bxvd3.mo74035c();
                        bxvd3.f164950c = false;
                    }
                    mtn mtn4 = (mtn) bxvd3.f164949b;
                    mtn4.f34679a |= 32;
                    mtn4.f34686h = j2;
                    met.mo19756a((mtn) met.f33215f.mo74062i());
                    met.f33212c = elapsedRealtime;
                    met.f33215f = mtn.f34677i.mo74144da();
                    bxvd bxvd4 = met.f33215f;
                    mti mti = mti.f34670a;
                    if (bxvd4.f164950c) {
                        bxvd4.mo74035c();
                        bxvd4.f164950c = false;
                    }
                    mtn mtn5 = (mtn) bxvd4.f164949b;
                    mti.getClass();
                    mtn5.f34685g = mti;
                    mtn5.f34679a |= 16;
                    bxvd bxvd5 = met.f33215f;
                    if (bxvd5.f164950c) {
                        bxvd5.mo74035c();
                        bxvd5.f164950c = false;
                    }
                    mtn mtn6 = (mtn) bxvd5.f164949b;
                    mtn6.f34680b = i2 - 1;
                    mtn6.f34679a |= 1;
                    bxvd bxvd6 = met.f33215f;
                    if (bxvd6.f164950c) {
                        bxvd6.mo74035c();
                        bxvd6.f164950c = false;
                    }
                    mtn mtn7 = (mtn) bxvd6.f164949b;
                    mtn7.f34679a |= 4;
                    mtn7.f34683e = b;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo19982a(int i, int i2) {
        if (i2 == 2 && i == 1) {
            this.f33626d.mo20001a(5, null, 1, 3);
        }
        if (i2 == 1 && i == 2) {
            this.f33626d.mo20001a(4, null, 1, 2);
        }
        if (i == 3) {
            mo19989f();
        }
    }

    /* renamed from: a */
    public final void mo19983a(mkl mkl) {
        if (this.f33631i != null && !this.f33635m) {
            if (ccop.f179637a.mo6606a().mo76543a()) {
                f33623a.mo25418e("Protocol already exists for USB D2D. Something went wrong! Recreating anyway.", new Object[0]);
            } else {
                f33623a.mo25416d("Protocol already initialized for USB D2D. Reusing.", new Object[0]);
                return;
            }
        }
        f33623a.mo25409a("Creating protocol for USB D2D.", new Object[0]);
        try {
            mkn a = mkl.mo19869a();
            this.f33635m = false;
            if (ccop.m131033c()) {
                this.f33630h.f33542k = 3;
            }
            mib mib = new mib(this.f33624b, new mgf(this, a), this.f33639q, this.f33629g, this, this.f33625c, this.f33630h, this.f33642t, null, null);
            mib.f33759j = true;
            this.f33631i = mib;
            m25055h();
        } catch (mjs e) {
            f33623a.mo25417e("Compatible USB Accessory(Host) not found: ", e, new Object[0]);
            mo19981a(5);
        }
    }

    /* renamed from: a */
    public final void mo19984a(boolean z) {
        if (z) {
            this.f33634l = true;
        }
        mo19981a(2);
        this.f33641s = z;
        this.f33638p.mo19911a(z);
    }
}
