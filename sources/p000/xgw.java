package p000;

import android.os.Vibrator;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.view.ViewOptions;

/* renamed from: xgw */
final /* synthetic */ class xgw implements bmxj {

    /* renamed from: a */
    private final xgz f52243a;

    /* renamed from: b */
    private final xlc f52244b;

    public xgw(xgz xgz, xlc xlc) {
        this.f52243a = xgz;
        this.f52244b = xlc;
    }

    public final Object apply(Object obj) {
        xgz xgz = this.f52243a;
        xlc xlc = this.f52244b;
        Void voidR = (Void) obj;
        bmxv a = xgz.f52253g.mo29745a(3, xha.f52257a);
        if (a.mo66813a()) {
            xgz.f52250d.mo14261a(((ViewOptions) a.mo66814b()).toString());
        }
        try {
            PublicKeyCredential a2 = xfi.m42812a(xgz.f52247a, xgz.f52248b, xlc, new xlw(xlv.WEBAUTHN_CREATE, boan.f132471e.mo68783a().mo68794a(xgz.f52249c.mo18682a()), xgz.f52251e, xgz.f52252f, null), (PublicKeyCredentialRequestOptions) xgz.f52249c, xgz.f52251e, xgz.f52252f).mo29691a();
            ((Vibrator) xgz.f52247a.getSystemService("vibrator")).vibrate(cdwr.m135183c());
            return a2;
        } catch (adbe e) {
            throw e.mo33303c();
        }
    }
}
