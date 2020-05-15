package p000;

import android.content.Context;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdd.OverrideFileGroupRequest;

/* renamed from: afoy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class afoy extends aaab {

    /* renamed from: a */
    public final afoj f64484a;

    /* renamed from: b */
    public final OverrideFileGroupRequest f64485b;

    /* renamed from: c */
    public final rnt f64486c;

    /* renamed from: d */
    private final bbch f64487d;

    public afoy(bbch bbch, afoj afoj, OverrideFileGroupRequest overrideFileGroupRequest, rnt rnt) {
        super(MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED, "DiagnosticsOverrideOperation");
        this.f64487d = bbch;
        this.f64484a = afoj;
        this.f64485b = overrideFileGroupRequest;
        this.f64486c = rnt;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        bqga.m112781a(this.f64487d.mo56063a(), new afox(this), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f64486c.mo11797a(status);
    }
}
