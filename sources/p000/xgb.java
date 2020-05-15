package p000;

import com.google.android.gms.fido.fido2.api.view.BleProcessRequestViewOptions;
import com.google.android.gms.fido.fido2.api.view.ViewOptions;

/* renamed from: xgb */
final /* synthetic */ class xgb implements xjf {

    /* renamed from: a */
    private final xgf f52158a;

    public xgb(xgf xgf) {
        this.f52158a = xgf;
    }

    /* renamed from: a */
    public final void mo29720a() {
        xgf xgf = this.f52158a;
        bmxv a = xgf.f52169g.mo29745a(2, new BleProcessRequestViewOptions(xgf.m42852a(xgf.f52170h), true));
        if (a.mo66813a()) {
            xgf.f52168f.mo14261a(((ViewOptions) a.mo66814b()).toString());
        }
    }
}
