package p000;

import android.content.Context;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.api.Status;

/* renamed from: afpa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class afpa extends aaab {

    /* renamed from: a */
    public final rnt f64489a;

    /* renamed from: b */
    private final bbch f64490b;

    /* renamed from: c */
    private final boolean f64491c;

    public afpa(bbch bbch, boolean z, rnt rnt) {
        super(MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED, "DownloadPendingGroupsOperation");
        this.f64490b = bbch;
        this.f64491c = z;
        this.f64489a = rnt;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        bbch bbch = this.f64490b;
        bqga.m112781a(bqdx.m112674a(bbch.mo56063a(), new bbbe(bbch, this.f64491c), bbch.f102327n), new afoz(this), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f64489a.mo11797a(status);
    }
}
