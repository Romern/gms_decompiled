package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

/* renamed from: arsl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arsl extends aaab {

    /* renamed from: a */
    private final arsi f88237a;

    /* renamed from: b */
    private final artk f88238b;

    /* renamed from: c */
    private final HandshakeData f88239c;

    public arsl(artk artk, HandshakeData handshakeData, arsi arsi) {
        super(190, "HandshakeInitOperation");
        this.f88238b = artk;
        this.f88237a = arsi;
        this.f88239c = handshakeData;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f88237a.mo48798a(this.f88238b, this.f88239c);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f88238b.mo48813a(status, new HandshakeData());
    }
}
