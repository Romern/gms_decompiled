package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

/* renamed from: artb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class artb extends aaab {

    /* renamed from: a */
    private final arsi f88264a;

    /* renamed from: b */
    private final artk f88265b;

    /* renamed from: c */
    private final HandshakeData f88266c;

    public artb(artk artk, HandshakeData handshakeData, arsi arsi) {
        super(75, "HandshakeInitOperation");
        this.f88265b = artk;
        this.f88264a = arsi;
        this.f88266c = handshakeData;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f88264a.mo48798a(this.f88265b, this.f88266c);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f88265b.mo48813a(status, new HandshakeData());
    }
}
