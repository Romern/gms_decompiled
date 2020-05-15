package p000;

import android.content.Context;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.api.Status;

/* renamed from: afph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class afph extends aaab {

    /* renamed from: a */
    public final bbch f64499a;

    /* renamed from: b */
    public final afon f64500b;

    /* renamed from: c */
    public final rnt f64501c;

    public afph(bbch bbch, afon afon, rnt rnt) {
        super(MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED, "HandleFlagChangeOperation");
        this.f64500b = afon;
        this.f64499a = bbch;
        this.f64501c = rnt;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        bqgg a = bqga.m112775a((Object) null);
        if (ceni.m137518b()) {
            a = bqdx.m112674a(a, new afpe(this), bqfb.INSTANCE);
        }
        bqga.m112781a(bqdx.m112674a(a, new afpf(this), bqfb.INSTANCE), new afpg(this), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f64501c.mo11797a(status);
    }
}
