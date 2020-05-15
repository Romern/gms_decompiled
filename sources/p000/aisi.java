package p000;

import org.webrtc.DataChannel;
import org.webrtc.IceCandidate;
import org.webrtc.PeerConnection;

/* renamed from: aisi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aisi extends aisp {

    /* renamed from: a */
    final /* synthetic */ aisn f69631a;

    public aisi(aisn aisn) {
        this.f69631a = aisn;
    }

    public final void onConnectionChange(PeerConnection.PeerConnectionState peerConnectionState) {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aisp", "onConnectionChange", 30, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("PeerConnection.Observer.onConnectionChange %s.", peerConnectionState);
        this.f69631a.mo37950a(new aish(this, peerConnectionState));
    }

    public final void onDataChannel(DataChannel dataChannel) {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aisp", "onDataChannel", 55, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("PeerConnection.Observer.onDataChannel %s.", dataChannel.mo86768a());
        dataChannel.mo86769a(new aisl(this.f69631a, dataChannel));
    }

    public final void onIceCandidate(IceCandidate iceCandidate) {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aisp", "onIceCandidate", 45, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("PeerConnection.Observer.onIceCandidate %s.", iceCandidate);
        aimk aimk = this.f69631a.f69648c.f69152a;
        aimk.mo37672a(new aima(aimk, iceCandidate));
    }
}
