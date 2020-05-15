package p000;

import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;

/* renamed from: ybi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ybi extends ybb implements sjr {

    /* renamed from: a */
    private final sjn f53545a;

    public ybi(sjn sjn) {
        this.f53545a = sjn;
    }

    /* renamed from: a */
    public final void mo30338a(yba yba, RegisterRequestParams registerRequestParams) {
        this.f53545a.mo25649a(new ybl(yba, registerRequestParams));
    }

    /* renamed from: a */
    public final void mo30339a(yba yba, SignRequestParams signRequestParams) {
        this.f53545a.mo25649a(new ybp(yba, signRequestParams));
    }
}
