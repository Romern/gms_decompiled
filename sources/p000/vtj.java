package p000;

/* renamed from: vtj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vtj extends vsh {

    /* renamed from: a */
    final /* synthetic */ vtl f49951a;

    public vtj(vtl vtl) {
        this.f49951a = vtl;
    }

    /* renamed from: a */
    public final void mo28762a() {
        if (!ccrg.m131344d() && !ccrg.m131342b()) {
            vtl vtl = this.f49951a;
            vuk.m41322a();
            if (!vuk.m41325d(vtl.getContext()).mo28756a()) {
                vtl.mo28822m().mo28866c(new vtc());
            } else {
                vtl.f49953a.mo28778a(new vtk(vtl));
            }
        } else {
            vtl vtl2 = this.f49951a;
            if (vtl2.f49954b) {
                vtl2.f49930g.mo28759a(bpeb.DRIVING_MODE_FRX_INTRO, bpea.DRIVING_MODE_FRX_READY);
                this.f49951a.f49953a.mo28782b("com.google.android.projection.gearhead");
                vuk.m41322a();
                if (vuk.m41329h(this.f49951a.getContext()).mo28839b()) {
                    this.f49951a.mo28816a("com.google.android.projection.gearhead");
                } else {
                    this.f49951a.mo28822m().mo28866c(new vth());
                }
            } else {
                vtl2.mo28822m().mo28866c(new vsz());
            }
        }
    }
}
