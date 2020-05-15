package p000;

import org.webrtc.IceCandidate;

/* renamed from: aima */
public final /* synthetic */ class aima implements Runnable {

    /* renamed from: a */
    private final aimk f69158a;

    /* renamed from: b */
    private final IceCandidate f69159b;

    public aima(aimk aimk, IceCandidate iceCandidate) {
        this.f69158a = aimk;
        this.f69159b = iceCandidate;
    }

    public final void run() {
        this.f69158a.mo37673a(this.f69159b);
    }
}
