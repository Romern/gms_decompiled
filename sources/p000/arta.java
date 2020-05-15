package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.postsetup.ConnectionHint;

/* renamed from: arta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arta extends aaab {

    /* renamed from: a */
    private final arsi f88262a;

    /* renamed from: b */
    private final artk f88263b;

    public arta(artk artk, arsi arsi) {
        super(75, "GetConnectionHintOperation");
        this.f88263b = artk;
        this.f88262a = arsi;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f88262a.mo48797a(this.f88263b);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f88263b.mo48812a(status, new ConnectionHint());
    }
}
