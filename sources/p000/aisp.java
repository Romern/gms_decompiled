package p000;

import org.webrtc.CandidatePairChangeEvent;
import org.webrtc.DataChannel;
import org.webrtc.IceCandidate;
import org.webrtc.MediaStream;
import org.webrtc.PeerConnection;
import org.webrtc.RtpReceiver;
import org.webrtc.RtpTransceiver;

/* renamed from: aisp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aisp implements PeerConnection.Observer {
    public final void onAddStream(MediaStream mediaStream) {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
        bnsl.mo68432a("aisp", "onAddStream", 65, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("PeerConnection.Observer.onAddStream should not be called.");
    }

    public final void onAddTrack(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr) {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
        bnsl.mo68432a("aisp", "onAddTrack", 75, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("PeerConnection.Observer.onAddTrack should not be called.");
    }

    public void onConnectionChange(PeerConnection.PeerConnectionState peerConnectionState) {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aisp", "onConnectionChange", 30, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("PeerConnection.Observer.onConnectionChange %s.", peerConnectionState);
    }

    public void onDataChannel(DataChannel dataChannel) {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aisp", "onDataChannel", 55, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("PeerConnection.Observer.onDataChannel %s.", dataChannel.mo86768a());
    }

    public void onIceCandidate(IceCandidate iceCandidate) {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aisp", "onIceCandidate", 45, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("PeerConnection.Observer.onIceCandidate %s.", iceCandidate);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, org.webrtc.IceCandidate[]]
     candidates:
      bnsi.a(java.lang.String, byte):void
      bnsi.a(java.lang.String, int):void
      bnsi.a(java.lang.String, long):void
      bnsi.a(java.lang.String, short):void
      bnsi.a(java.lang.String, java.lang.Object[]):void
      bnsi.a(java.lang.String, java.lang.Object):void */
    public final void onIceCandidatesRemoved(IceCandidate[] iceCandidateArr) {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aisp", "onIceCandidatesRemoved", 50, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("PeerConnection.Observer.onIceCandidatesRemoved %s.", (Object) iceCandidateArr);
    }

    public final void onIceConnectionChange(PeerConnection.IceConnectionState iceConnectionState) {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aisp", "onIceConnectionChange", 25, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("PeerConnection.Observer.onIceConnectionChange %s.", iceConnectionState);
    }

    public final void onIceConnectionReceivingChange(boolean z) {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aisp", "onIceConnectionReceivingChange", 35, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("PeerConnection.Observer.onIceConnectionReceiveChange %s.", Boolean.valueOf(z));
    }

    public final void onIceGatheringChange(PeerConnection.IceGatheringState iceGatheringState) {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aisp", "onIceGatheringChange", 40, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("PeerConnection.Observer.onIceGatheringChange %s.", iceGatheringState);
    }

    public final void onRemoveStream(MediaStream mediaStream) {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
        bnsl.mo68432a("aisp", "onRemoveStream", 70, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("PeerConnection.Observer.onRemoveStream should not be called.");
    }

    public final void onRenegotiationNeeded() {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aisp", "onRenegotiationNeeded", 60, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("PeerConnection.Observer.onRenegotationNeeded.");
    }

    public final void onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent) {
    }

    public final void onSignalingChange(PeerConnection.SignalingState signalingState) {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aisp", "onSignalingChange", 20, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("PeerConnection.Observer.onSignalingChange %s.", signalingState);
    }

    public final void onStandardizedIceConnectionChange(PeerConnection.IceConnectionState iceConnectionState) {
    }

    public final void onTrack(RtpTransceiver rtpTransceiver) {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
        bnsl.mo68432a("aisp", "onTrack", 80, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("PeerConnection.Observer.onTrack should not be called.");
        rtpTransceiver.mo86921a();
        RtpTransceiver.nativeStop(rtpTransceiver.f192036a);
    }
}
