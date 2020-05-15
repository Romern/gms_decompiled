package p000;

import com.google.android.gms.fido.u2f.api.common.BrowserRegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.BrowserSignRequestParams;

/* renamed from: ybj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ybj extends yay implements sjr {

    /* renamed from: a */
    private final sjn f53546a;

    public ybj(sjn sjn) {
        this.f53546a = sjn;
    }

    /* renamed from: a */
    public final void mo30335a(yax yax, BrowserRegisterRequestParams browserRegisterRequestParams) {
        this.f53546a.mo25649a(new ybm(yax, browserRegisterRequestParams));
    }

    /* renamed from: a */
    public final void mo30336a(yax yax, BrowserSignRequestParams browserSignRequestParams) {
        this.f53546a.mo25649a(new ybq(yax, browserSignRequestParams));
    }
}
