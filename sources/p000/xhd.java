package p000;

import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.view.UsbViewOptions;
import com.google.android.gms.fido.fido2.api.view.ViewOptions;

/* renamed from: xhd */
final /* synthetic */ class xhd implements bmxj {

    /* renamed from: a */
    private final xhg f52278a;

    /* renamed from: b */
    private final xlm f52279b;

    public xhd(xhg xhg, xlm xlm) {
        this.f52278a = xhg;
        this.f52279b = xlm;
    }

    public final Object apply(Object obj) {
        xhg xhg = this.f52278a;
        xlm xlm = this.f52279b;
        Void voidR = (Void) obj;
        bmxv a = xhg.f52288g.mo29745a(3, new UsbViewOptions());
        if (a.mo66813a()) {
            xhg.f52285d.mo14261a(((ViewOptions) a.mo66814b()).toString());
        }
        try {
            return xfi.m42812a(xhg.f52282a, xhg.f52283b, xlm, new xlw(xlv.WEBAUTHN_CREATE, boan.f132471e.mo68783a().mo68794a(xhg.f52284c.mo18682a()), xhg.f52286e, xhg.f52287f, null), (PublicKeyCredentialRequestOptions) xhg.f52284c, xhg.f52286e, xhg.f52287f).mo29691a();
        } catch (adbe e) {
            throw e.mo33303c();
        }
    }
}
