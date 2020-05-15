package p000;

/* renamed from: vfl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vfl implements vec {

    /* renamed from: a */
    final /* synthetic */ vfp f49174a;

    /* renamed from: b */
    private vef f49175b;

    public vfl(vfp vfp) {
        this.f49174a = vfp;
    }

    /* renamed from: a */
    public final synchronized vee mo28390a() {
        vee vee;
        vef vef = this.f49175b;
        if (vef == null) {
            vfp.f49188a.mo25377c("PinnedContentDownloader", "Connection state is not initialized.");
            vee = vee.DISCONNECTED;
        } else {
            vee = vef.f49112a;
        }
        return vee;
    }

    /* renamed from: b */
    public final synchronized boolean mo28391b() {
        boolean z;
        vef vef = this.f49175b;
        if (vef == null) {
            vfp.f49188a.mo25377c("PinnedContentDownloader", "Connection state is not initialized.");
            z = false;
        } else {
            z = vef.f49113b;
        }
        return z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo27005a(ved ved) {
        vef vef = (vef) ved;
        synchronized (this) {
            if (this.f49175b != null && vef.f49113b) {
                vfp vfp = this.f49174a;
                vfp.f49192e.submit(vfp.f49191d);
            }
            this.f49175b = vef;
        }
        synchronized (this.f49174a.f49194g) {
            for (vfn vfn : this.f49174a.f49194g.values()) {
                vfn.mo28394a();
            }
        }
    }
}
