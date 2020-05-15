package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;
import com.google.android.gms.smartdevice.postsetup.PostSetupAuthData;

/* renamed from: arsk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arsk extends aaab {

    /* renamed from: a */
    private final arsi f88234a;

    /* renamed from: b */
    private final artk f88235b;

    /* renamed from: c */
    private final HandshakeData f88236c;

    public arsk(artk artk, arsi arsi, HandshakeData handshakeData) {
        super(190, "AuthenticateOperation");
        this.f88235b = artk;
        this.f88234a = arsi;
        this.f88236c = handshakeData;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f88234a.mo48804c(this.f88235b, this.f88236c);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f88235b.mo48814a(status, new PostSetupAuthData());
    }
}
