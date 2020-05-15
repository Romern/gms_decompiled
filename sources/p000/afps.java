package p000;

import android.content.Context;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.api.Status;

/* renamed from: afps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afps extends aaab {

    /* renamed from: a */
    public final rnt f64524a;

    /* renamed from: b */
    private final bbch f64525b;

    public afps(bbch bbch, rnt rnt) {
        super(MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED, "MaintenanceOperation");
        this.f64525b = bbch;
        this.f64524a = rnt;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        bqga.m112781a(this.f64525b.mo56067c(), new afpr(this), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f64524a.mo11797a(status);
    }
}
