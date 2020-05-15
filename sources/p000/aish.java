package p000;

import org.webrtc.PeerConnection;

/* renamed from: aish */
final /* synthetic */ class aish implements Runnable {

    /* renamed from: a */
    private final aisi f69629a;

    /* renamed from: b */
    private final PeerConnection.PeerConnectionState f69630b;

    public aish(aisi aisi, PeerConnection.PeerConnectionState peerConnectionState) {
        this.f69629a = aisi;
        this.f69630b = peerConnectionState;
    }

    public final void run() {
        aisi aisi = this.f69629a;
        aisi.f69631a.mo37951a(this.f69630b);
    }
}
