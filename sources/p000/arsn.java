package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

/* renamed from: arsn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arsn extends aaab {

    /* renamed from: a */
    private final arsi f88243a;

    /* renamed from: b */
    private final artk f88244b;

    /* renamed from: c */
    private final HandshakeData f88245c;

    public arsn(artk artk, arsi arsi, HandshakeData handshakeData) {
        super(190, "HandshakeFinishOperation");
        this.f88244b = artk;
        this.f88243a = arsi;
        this.f88245c = handshakeData;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f88243a.mo48803b(this.f88244b, this.f88245c);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f88244b.mo48816c(status, new HandshakeData());
    }
}
