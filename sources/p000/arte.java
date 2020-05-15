package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.postsetup.ConnectionHint;

/* renamed from: arte */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arte extends aaab {

    /* renamed from: a */
    private final arsi f88272a;

    /* renamed from: b */
    private final artk f88273b;

    public arte(artk artk, arsi arsi) {
        super(76, "GetConnectionHintOperation");
        this.f88273b = artk;
        this.f88272a = arsi;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f88272a.mo48797a(this.f88273b);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f88273b.mo48812a(status, new ConnectionHint());
    }
}
