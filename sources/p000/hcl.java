package p000;

import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.common.api.Status;

/* renamed from: hcl */
final /* synthetic */ class hcl implements C0038ax {

    /* renamed from: a */
    private final hdf f19469a;

    public hcl(hdf hdf) {
        this.f19469a = hdf;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        hdf hdf = this.f19469a;
        bmxv bmxv = (bmxv) obj;
        if (bmxv.mo66813a()) {
            hdf.f19513s = new ConsentResult(izj.SUCCESS, iyb.GRANTED, (String) bmxv.mo66814b());
            hdf.f19501g.mo12425c();
            return;
        }
        hdf.f19501g.mo12426d();
        hdf.mo12405a(new hdh(Status.f30111e, bmvz.f131120a));
    }
}
