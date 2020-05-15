package p000;

import org.webrtc.SessionDescription;

/* renamed from: aisg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aisg extends aisq {

    /* renamed from: a */
    final /* synthetic */ bqgy f69627a;

    /* renamed from: b */
    final /* synthetic */ SessionDescription f69628b;

    public aisg(bqgy bqgy, SessionDescription sessionDescription) {
        this.f69627a = bqgy;
        this.f69628b = sessionDescription;
    }

    public final void onSetFailure(String str) {
        super.onSetFailure(str);
        this.f69627a.mo69136a((Throwable) new aisr(str));
    }

    public final void onSetSuccess() {
        super.onSetSuccess();
        this.f69627a.mo69138b(this.f69628b);
    }
}
