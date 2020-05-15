package p000;

import android.content.Context;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.api.Status;

/* renamed from: afpl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class afpl extends aaab {

    /* renamed from: a */
    public final rnt f64507a;

    /* renamed from: b */
    private final bbch f64508b;

    public afpl(bbch bbch, rnt rnt) {
        super(MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED, "VerifyPendingGroupsOperation");
        this.f64508b = bbch;
        this.f64507a = rnt;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        bbch bbch = this.f64508b;
        bqga.m112781a(bqdx.m112674a(bbch.mo56063a(), new bbbf(bbch), bbch.f102327n), new afpk(this), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f64507a.mo11797a(status);
    }
}
