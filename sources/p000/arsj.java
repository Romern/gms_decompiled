package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.postsetup.ConnectionHint;

/* renamed from: arsj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arsj extends aaab {

    /* renamed from: a */
    private final arsi f88232a;

    /* renamed from: b */
    private final artk f88233b;

    public arsj(artk artk, arsi arsi) {
        super(75, "GetConnectionHintOperation");
        this.f88233b = artk;
        this.f88232a = arsi;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f88232a.mo48797a(this.f88233b);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f88233b.mo48812a(status, new ConnectionHint());
    }
}
