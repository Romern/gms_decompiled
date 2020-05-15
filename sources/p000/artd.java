package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;
import com.google.android.gms.smartdevice.postsetup.PostSetupAuthData;

/* renamed from: artd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class artd extends aaab {

    /* renamed from: a */
    private final arsi f88269a;

    /* renamed from: b */
    private final artk f88270b;

    /* renamed from: c */
    private final HandshakeData f88271c;

    public artd(artk artk, arsi arsi, HandshakeData handshakeData) {
        super(76, "AuthenticateOperation");
        this.f88270b = artk;
        this.f88269a = arsi;
        this.f88271c = handshakeData;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f88269a.mo48805d(this.f88270b, this.f88271c);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f88270b.mo48814a(status, new PostSetupAuthData());
    }
}
