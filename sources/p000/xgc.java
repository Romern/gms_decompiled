package p000;

import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.view.BleDeviceIdentifier;
import com.google.android.gms.fido.fido2.api.view.BleProcessRequestViewOptions;
import com.google.android.gms.fido.fido2.api.view.ViewOptions;

/* renamed from: xgc */
final /* synthetic */ class xgc implements bmxj {

    /* renamed from: a */
    private final xgf f52159a;

    /* renamed from: b */
    private final xjg f52160b;

    public xgc(xgf xgf, xjg xjg) {
        this.f52159a = xgf;
        this.f52160b = xjg;
    }

    public final Object apply(Object obj) {
        xgf xgf = this.f52159a;
        xjg xjg = this.f52160b;
        Void voidR = (Void) obj;
        xhi xhi = xgf.f52169g;
        BleDeviceIdentifier a = xgf.m42852a(xgf.f52170h);
        sdo.m34959a(a);
        bmxv a2 = xhi.mo29745a(3, new BleProcessRequestViewOptions(a, false));
        if (a2.mo66813a()) {
            xgf.f52168f.mo14261a(((ViewOptions) a2.mo66814b()).toString());
        }
        try {
            PublicKeyCredential a3 = xfi.m42812a(xgf.f52163a, xgf.f52164b, xjg, new xlw(xlv.WEBAUTHN_CREATE, boan.f132471e.mo68783a().mo68794a(xgf.f52165c.mo18682a()), xgf.f52167e, xgf.f52166d, null), (PublicKeyCredentialRequestOptions) xgf.f52165c, xgf.f52167e, xgf.f52166d).mo29691a();
            xgf.f52171i.mo29736a(xgf.f52170h);
            return a3;
        } catch (adbe e) {
            throw e.mo33303c();
        }
    }
}
