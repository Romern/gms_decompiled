package p000;

import org.webrtc.SessionDescription;

/* renamed from: aisf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aisf extends aisq {

    /* renamed from: a */
    final /* synthetic */ bqgy f69625a;

    /* renamed from: b */
    final /* synthetic */ SessionDescription f69626b;

    public aisf(bqgy bqgy, SessionDescription sessionDescription) {
        this.f69625a = bqgy;
        this.f69626b = sessionDescription;
    }

    public final void onSetFailure(String str) {
        super.onSetFailure(str);
        this.f69625a.mo69136a((Throwable) new aisr(str));
    }

    public final void onSetSuccess() {
        super.onSetSuccess();
        this.f69625a.mo69138b(this.f69626b);
    }
}
