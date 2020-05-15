package p000;

import java.util.List;
import org.webrtc.MediaStream;
import org.webrtc.PeerConnection;
import org.webrtc.RtpReceiver;
import org.webrtc.RtpSender;
import org.webrtc.RtpTransceiver;

/* renamed from: aisc */
final /* synthetic */ class aisc implements Runnable {

    /* renamed from: a */
    private final aisn f69620a;

    public aisc(aisn aisn) {
        this.f69620a = aisn;
    }

    public final void run() {
        aisn aisn = this.f69620a;
        aisn.f69646a.nativeClose();
        PeerConnection peerConnection = aisn.f69646a;
        peerConnection.nativeClose();
        List list = peerConnection.f191885a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            MediaStream mediaStream = (MediaStream) list.get(i);
            mediaStream.mo86805a();
            peerConnection.nativeRemoveLocalStream(mediaStream.f191851d);
            mediaStream.dispose();
        }
        peerConnection.f191885a.clear();
        List list2 = peerConnection.f191887c;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((RtpSender) list2.get(i2)).mo86920a();
        }
        peerConnection.f191887c.clear();
        List list3 = peerConnection.f191888d;
        int size3 = list3.size();
        for (int i3 = 0; i3 < size3; i3++) {
            ((RtpReceiver) list3.get(i3)).dispose();
        }
        List list4 = peerConnection.f191889e;
        int size4 = list4.size();
        for (int i4 = 0; i4 < size4; i4++) {
            ((RtpTransceiver) list4.get(i4)).dispose();
        }
        peerConnection.f191889e.clear();
        peerConnection.f191888d.clear();
        PeerConnection.nativeFreeOwnedPeerConnection(peerConnection.f191886b);
    }
}
