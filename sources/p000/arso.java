package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

/* renamed from: arso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arso extends aaab {

    /* renamed from: a */
    private final arsi f88246a;

    /* renamed from: b */
    private final artk f88247b;

    public arso(artk artk, arsi arsi) {
        super(190, "HandshakeInitOperation");
        this.f88247b = artk;
        this.f88246a = arsi;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f88246a.mo48802b(this.f88247b);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f88247b.mo48815b(status, new HandshakeData());
    }
}
