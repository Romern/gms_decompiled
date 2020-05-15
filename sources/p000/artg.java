package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

/* renamed from: artg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class artg extends aaab {

    /* renamed from: a */
    private final arsi f88277a;

    /* renamed from: b */
    private final artk f88278b;

    public artg(artk artk, arsi arsi) {
        super(76, "HandshakeInitOperation");
        this.f88278b = artk;
        this.f88277a = arsi;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f88277a.mo48802b(this.f88278b);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f88278b.mo48815b(status, new HandshakeData());
    }
}
