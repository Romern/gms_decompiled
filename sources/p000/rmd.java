package p000;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: rmd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rmd extends rlj {

    /* renamed from: a */
    public final C1225nr f43273a = new C1225nr();

    /* renamed from: f */
    private rnm f43274f;

    private rmd(rnx rnx) {
        super(rnx);
        this.f30135e.mo24871a("ConnectionlessLifecycleHelper", this);
    }

    /* renamed from: a */
    public static void m33975a(rnx rnx, rnm rnm, rkz rkz) {
        rmd rmd = (rmd) rnx.mo24870a("ConnectionlessLifecycleHelper", rmd.class);
        if (rmd == null) {
            rmd = new rmd(rnx);
        }
        rmd.f43274f = rnm;
        sdo.checkIfNull(rkz, "ApiKey cannot be null");
        rmd.f43273a.add(rkz);
        rnm.mo24947a(rmd);
    }

    /* renamed from: g */
    private final void m33976g() {
        if (!this.f43273a.isEmpty()) {
            this.f43274f.mo24947a(this);
        }
    }

    /* renamed from: b */
    public final void mo17726b() {
        super.mo17726b();
        rnm rnm = this.f43274f;
        synchronized (rnm.f43393f) {
            if (rnm.f43403m == this) {
                rnm.f43403m = null;
                rnm.f43404n.clear();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo24844c() {
        this.f43274f.mo24949b();
    }

    /* renamed from: e */
    public final void mo17728e() {
        m33976g();
    }

    /* renamed from: a */
    public final void mo17722a() {
        super.mo17722a();
        m33976g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo24843a(ConnectionResult connectionResult, int i) {
        this.f43274f.mo24950b(connectionResult, i);
    }
}
