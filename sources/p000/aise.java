package p000;

import org.webrtc.SessionDescription;

/* renamed from: aise */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aise extends aisq {

    /* renamed from: a */
    final /* synthetic */ bqgy f69623a;

    /* renamed from: b */
    final /* synthetic */ aisn f69624b;

    public aise(aisn aisn, bqgy bqgy) {
        this.f69624b = aisn;
        this.f69623a = bqgy;
    }

    public final void onCreateFailure(String str) {
        super.onCreateFailure(str);
        this.f69623a.mo69136a((Throwable) new aisr(str));
    }

    public final void onCreateSuccess(SessionDescription sessionDescription) {
        super.onCreateSuccess(sessionDescription);
        if (this.f69624b.mo37952a(aism.CREATING_ANSWER, aism.WAITING_TO_CONNECT)) {
            this.f69623a.mo69138b(sessionDescription);
        } else {
            this.f69623a.mo69136a((Throwable) new aisr("Invalid state transition to WAITING_TO_CONNECT."));
        }
    }
}
