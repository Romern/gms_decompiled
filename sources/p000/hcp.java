package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: hcp */
final /* synthetic */ class hcp implements C0038ax {

    /* renamed from: a */
    private final hdf f19473a;

    public hcp(hdf hdf) {
        this.f19473a = hdf;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        hdf hdf = this.f19473a;
        hdh hdh = (hdh) obj;
        if (hdh.f19523b.f30115i == Status.f30111e.f30115i && !hdh.f19522a.mo66813a() && hdf.f19501g.f19563d == adcq.EXTERNAL_ACCOUNT_CHOOSER) {
            hdf.f19500f.f19525d.mo2444a(hdf);
            hdf.f19501g.mo12426d();
        }
    }
}
