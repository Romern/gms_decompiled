package p000;

import android.content.Context;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.api.Status;

/* renamed from: afpj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class afpj extends aaab {

    /* renamed from: a */
    public final rnt f64503a;

    /* renamed from: b */
    private final bbch f64504b;

    /* renamed from: c */
    private final afoj f64505c;

    public afpj(bbch bbch, afoj afoj, rnt rnt) {
        super(MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED, "ResetOperation");
        this.f64504b = bbch;
        this.f64505c = afoj;
        this.f64503a = rnt;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        bbch bbch = this.f64504b;
        bqga.m112781a(bqdx.m112673a(bbch.mo56070f(), new bbbj(bbch), bbch.f102327n), new afpi(this), bqfb.INSTANCE);
        afoj afoj = this.f64505c;
        if (afoj != null) {
            afoj.f64439b.getSharedPreferences("gms_icing_mdd_overrider_groups", 0).edit().clear().commit();
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f64503a.mo11797a(status);
    }
}
