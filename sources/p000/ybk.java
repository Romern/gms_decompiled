package p000;

import com.google.android.gms.fido.u2f.api.StateUpdate;
import com.google.android.gms.fido.u2f.api.common.BrowserRegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.BrowserSignRequestParams;

/* renamed from: ybk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ybk extends ybe implements sjr {

    /* renamed from: a */
    private final sjn f53547a;

    /* renamed from: b */
    private final String f53548b;

    public ybk(sjn sjn, String str) {
        this.f53547a = sjn;
        this.f53548b = str;
    }

    /* renamed from: a */
    public final void mo30340a(rnt rnt, StateUpdate stateUpdate) {
        this.f53547a.mo25649a(new ybt(rnt, stateUpdate));
    }

    /* renamed from: a */
    public final void mo30341a(rnt rnt, BrowserRegisterRequestParams browserRegisterRequestParams, xxc xxc) {
        this.f53547a.mo25649a(new ybo(xwj.m43508a(xwi.U2F_ZERO_PARTY, browserRegisterRequestParams.mo18800a()), rnt, browserRegisterRequestParams, xxc, this.f53548b));
    }

    /* renamed from: a */
    public final void mo30342a(rnt rnt, BrowserSignRequestParams browserSignRequestParams, xxf xxf) {
        this.f53547a.mo25649a(new ybs(xwj.m43508a(xwi.U2F_ZERO_PARTY, browserSignRequestParams.mo18800a()), rnt, browserSignRequestParams, xxf, this.f53548b));
    }
}
