package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: hcj */
final /* synthetic */ class hcj implements C0038ax {

    /* renamed from: a */
    private final hdf f19467a;

    public hcj(hdf hdf) {
        this.f19467a = hdf;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        hdf hdf = this.f19467a;
        Status status = (Status) obj;
        if (status.f30115i != 0) {
            hdf.f19501g.mo12426d();
            hdf.f19500f.mo12408a(new hdh(status, bmvz.f131120a));
            return;
        }
        hdf.f19501g.mo12425c();
    }
}
