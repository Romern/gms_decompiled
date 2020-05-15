package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;
import com.google.android.gms.smartdevice.postsetup.PostSetupAuthData;

/* renamed from: arsz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arsz extends aaab {

    /* renamed from: a */
    private final arsi f88259a;

    /* renamed from: b */
    private final artk f88260b;

    /* renamed from: c */
    private final HandshakeData f88261c;

    public arsz(artk artk, arsi arsi, HandshakeData handshakeData) {
        super(76, "AuthenticateOperation");
        this.f88260b = artk;
        this.f88259a = arsi;
        this.f88261c = handshakeData;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f88259a.mo48804c(this.f88260b, this.f88261c);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f88260b.mo48814a(status, new PostSetupAuthData());
    }
}
