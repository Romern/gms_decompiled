package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

/* renamed from: artf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class artf extends aaab {

    /* renamed from: a */
    private final arsi f88274a;

    /* renamed from: b */
    private final artk f88275b;

    /* renamed from: c */
    private final HandshakeData f88276c;

    public artf(artk artk, arsi arsi, HandshakeData handshakeData) {
        super(76, "HandshakeFinishOperation");
        this.f88275b = artk;
        this.f88274a = arsi;
        this.f88276c = handshakeData;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f88274a.mo48803b(this.f88275b, this.f88276c);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f88275b.mo48816c(status, new HandshakeData());
    }
}
