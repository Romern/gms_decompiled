package p000;

import org.webrtc.SessionDescription;

/* renamed from: aisd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aisd extends aisq {

    /* renamed from: a */
    final /* synthetic */ bqgy f69621a;

    /* renamed from: b */
    final /* synthetic */ aisn f69622b;

    public aisd(aisn aisn, bqgy bqgy) {
        this.f69622b = aisn;
        this.f69621a = bqgy;
    }

    public final void onCreateFailure(String str) {
        super.onCreateFailure(str);
        this.f69621a.mo69136a((Throwable) new aisr(str));
    }

    public final void onCreateSuccess(SessionDescription sessionDescription) {
        super.onCreateSuccess(sessionDescription);
        if (this.f69622b.mo37952a(aism.CREATING_OFFER, aism.WAITING_FOR_ANSWER)) {
            this.f69621a.mo69138b(sessionDescription);
        } else {
            this.f69621a.mo69136a((Throwable) new aisr("Invalid state transition to WAITING_FOR_ANSWER."));
        }
    }
}
