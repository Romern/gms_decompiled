package p000;

import android.content.Context;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.api.Status;

/* renamed from: afov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class afov extends aaab {

    /* renamed from: a */
    public final rnt f64471a;

    /* renamed from: b */
    private final afon f64472b;

    public afov(afon afon, rnt rnt) {
        super(MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED, "AddConfigsForDownloadOperation");
        this.f64472b = afon;
        this.f64471a = rnt;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        bqga.m112781a(ceni.m137518b() ? this.f64472b.mo34977a() : bqga.m112775a((Object) null), new afou(this), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f64471a.mo11797a(status);
    }
}
