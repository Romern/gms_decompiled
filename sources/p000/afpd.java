package p000;

import android.content.Context;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.api.Status;

/* renamed from: afpd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class afpd extends aaab {

    /* renamed from: a */
    public final afjm f64494a;

    /* renamed from: b */
    private final bbch f64495b;

    public afpd(bbch bbch, afjm afjm) {
        super(MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED, "FileGroupListForDebugUIOperation");
        this.f64495b = bbch;
        this.f64494a = afjm;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        bqga.m112781a(bqdx.m112673a(bqfl.m112747c(this.f64495b.mo56066b()), afpb.f64492a, bqfb.INSTANCE), new afpc(this), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f64494a.mo34904a(status, null);
    }
}
