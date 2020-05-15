package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;
import com.google.android.gms.smartdevice.postsetup.PostSetupAuthData;

/* renamed from: arsm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arsm extends aaab {

    /* renamed from: a */
    private final arsi f88240a;

    /* renamed from: b */
    private final artk f88241b;

    /* renamed from: c */
    private final HandshakeData f88242c;

    public arsm(artk artk, arsi arsi, HandshakeData handshakeData) {
        super(190, "AuthenticateOperation");
        this.f88241b = artk;
        this.f88240a = arsi;
        this.f88242c = handshakeData;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f88240a.mo48805d(this.f88241b, this.f88242c);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f88241b.mo48814a(status, new PostSetupAuthData());
    }
}
