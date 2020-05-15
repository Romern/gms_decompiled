package p000;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import org.webrtc.BuiltinAudioDecoderFactoryFactory;
import org.webrtc.BuiltinAudioEncoderFactoryFactory;
import org.webrtc.ContextUtils;
import org.webrtc.DataChannel;
import org.webrtc.IceCandidate;
import org.webrtc.Logging;
import org.webrtc.MediaConstraints;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.SessionDescription;
import org.webrtc.audio.JavaAudioDeviceModule;
import org.webrtc.audio.WebRtcAudioRecord;
import org.webrtc.audio.WebRtcAudioTrack;

/* renamed from: aisn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aisn {

    /* renamed from: e */
    private static PeerConnectionFactory f69645e;

    /* renamed from: a */
    public final PeerConnection f69646a;

    /* renamed from: b */
    public final bqgy f69647b = bqgy.m112818c();

    /* renamed from: c */
    public final ailu f69648c;

    /* renamed from: d */
    aimf f69649d;

    /* renamed from: f */
    private final Context f69650f;

    /* renamed from: g */
    private aism f69651g;

    /* renamed from: h */
    private final Executor f69652h;

    public aisn(Context context, ailu ailu, aimf aimf, List list, Executor executor) {
        long j;
        this.f69650f = context;
        this.f69649d = aimf;
        PeerConnection.RTCConfiguration rTCConfiguration = new PeerConnection.RTCConfiguration(list);
        aisi aisi = new aisi(this);
        Context context2 = this.f69650f;
        PeerConnection peerConnection = null;
        if (f69645e == null) {
            cium cium = new cium(context2);
            ciun ciun = new ciun(cium.f191493a, cium.f191494b, cium.f191495c);
            ContextUtils.initialize(ciun.f191496a);
            String str = ciun.f191498c;
            synchronized (citz.f191460b) {
                if (citz.f191461c) {
                    Logging.m151178a(citz.f191459a, "Native library has already been loaded.");
                } else {
                    Logging.m151178a(citz.f191459a, str.length() == 0 ? new String("Loading native library: ") : "Loading native library: ".concat(str));
                    citz.f191461c = city.m151012a(str);
                }
            }
            PeerConnectionFactory.nativeInitializeAndroidGlobals();
            PeerConnectionFactory.nativeInitializeFieldTrials(ciun.f191497b);
            Logging.m151178a("PeerConnectionFactory", "PeerConnectionFactory was initialized without an injected Loggable. Any existing Loggable will be deleted.");
            PeerConnectionFactory.nativeDeleteLoggable();
            ciul ciul = new ciul();
            PeerConnectionFactory.m151193a();
            if (ciul.f191492a == null) {
                ciuu ciuu = new ciuu(ContextUtils.getApplicationContext());
                Logging.m151178a("JavaAudioDeviceModule", "createAudioDeviceModule");
                if (ciuu.f191507f) {
                    Logging.m151178a("JavaAudioDeviceModule", "HW NS will be used.");
                } else {
                    if (ciuy.m151036b()) {
                        Logging.m151178a("JavaAudioDeviceModule", "Overriding default behavior; now using WebRTC NS!");
                    }
                    Logging.m151178a("JavaAudioDeviceModule", "HW NS will not be used.");
                }
                if (ciuu.f191506e) {
                    Logging.m151178a("JavaAudioDeviceModule", "HW AEC will be used.");
                } else {
                    if (ciuy.m151034a()) {
                        Logging.m151178a("JavaAudioDeviceModule", "Overriding default behavior; now using WebRTC AEC!");
                    }
                    Logging.m151178a("JavaAudioDeviceModule", "HW AEC will not be used.");
                }
                ciul.f191492a = new JavaAudioDeviceModule(ciuu.f191502a, ciuu.f191503b, new WebRtcAudioRecord(ciuu.f191502a, ciuu.f191503b, ciuu.f191506e, ciuu.f191507f), new WebRtcAudioTrack(ciuu.f191502a, ciuu.f191503b, null), ciuu.f191504c, ciuu.f191505d);
            }
            Context applicationContext = ContextUtils.getApplicationContext();
            JavaAudioDeviceModule javaAudioDeviceModule = ciul.f191492a;
            synchronized (javaAudioDeviceModule.f192099g) {
                long j2 = javaAudioDeviceModule.f192100h;
                if (j2 == 0) {
                    long nativeCreateAudioDeviceModule = JavaAudioDeviceModule.nativeCreateAudioDeviceModule(javaAudioDeviceModule.f192093a, javaAudioDeviceModule.f192094b, javaAudioDeviceModule.f192095c, javaAudioDeviceModule.f192096d, javaAudioDeviceModule.f192097e, javaAudioDeviceModule.f192098f, false, false);
                    javaAudioDeviceModule.f192100h = nativeCreateAudioDeviceModule;
                    j = nativeCreateAudioDeviceModule;
                } else {
                    j = j2;
                }
            }
            f69645e = PeerConnectionFactory.nativeCreatePeerConnectionFactory(applicationContext, null, j, BuiltinAudioEncoderFactoryFactory.nativeCreateBuiltinAudioEncoderFactory(), BuiltinAudioDecoderFactoryFactory.nativeCreateBuiltinAudioDecoderFactory(), null, null, 0, 0, 0, 0, 0, 0);
        }
        PeerConnectionFactory peerConnectionFactory = f69645e;
        if (peerConnectionFactory.f191986a != 0) {
            long nativeCreatePeerConnectionObserver = PeerConnection.nativeCreatePeerConnectionObserver(aisi);
            if (nativeCreatePeerConnectionObserver != 0) {
                long nativeCreatePeerConnection = PeerConnectionFactory.nativeCreatePeerConnection(peerConnectionFactory.f191986a, rTCConfiguration, null, nativeCreatePeerConnectionObserver, null);
                if (nativeCreatePeerConnection != 0) {
                    peerConnection = new PeerConnection(nativeCreatePeerConnection);
                }
            }
            this.f69646a = peerConnection;
            this.f69651g = aism.INITIALIZED;
            this.f69648c = ailu;
            this.f69652h = executor;
            return;
        }
        throw new IllegalStateException("PeerConnectionFactory has been disposed.");
    }

    /* renamed from: d */
    private final void m57856d(SessionDescription sessionDescription) {
        bqgy c = bqgy.m112818c();
        this.f69646a.nativeSetRemoteDescription(new aisg(c, sessionDescription), sessionDescription);
        SessionDescription sessionDescription2 = (SessionDescription) ahhf.m55778c("setRemoteSessionDescription", c, cfnv.m140755Q());
    }

    /* renamed from: a */
    public final synchronized SessionDescription mo37948a() {
        SessionDescription sessionDescription;
        if (mo37952a(aism.INITIALIZED, aism.CREATING_OFFER)) {
            bqgy c = bqgy.m112818c();
            DataChannel nativeCreateDataChannel = this.f69646a.nativeCreateDataChannel("dataChannel", new DataChannel.Init());
            nativeCreateDataChannel.mo86769a(new aisl(this, nativeCreateDataChannel));
            this.f69646a.nativeCreateOffer(new aisd(this, c), new MediaConstraints());
            sessionDescription = (SessionDescription) ahhf.m55778c("createOffer", c, cfnv.m140755Q());
        } else {
            sessionDescription = null;
        }
        return sessionDescription;
    }

    /* renamed from: b */
    public final synchronized SessionDescription mo37954b() {
        SessionDescription sessionDescription;
        if (mo37952a(aism.RECEIVED_OFFER, aism.CREATING_ANSWER)) {
            bqgy c = bqgy.m112818c();
            this.f69646a.nativeCreateAnswer(new aise(this, c), new MediaConstraints());
            sessionDescription = (SessionDescription) ahhf.m55778c("createAnswer", c, cfnv.m140755Q());
        } else {
            sessionDescription = null;
        }
        return sessionDescription;
    }

    /* renamed from: c */
    public final synchronized void mo37956c(SessionDescription sessionDescription) {
        if (mo37952a(aism.INITIALIZED, aism.RECEIVED_OFFER)) {
            m57856d(sessionDescription);
        }
    }

    /* renamed from: e */
    public final synchronized void mo37959e() {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aisn", "e", 360, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Data channel state changed to connected.");
        if (!mo37952a(aism.WAITING_TO_CONNECT, aism.CONNECTED)) {
            mo37958d();
        }
    }

    /* renamed from: c */
    public final synchronized boolean mo37957c() {
        if (this.f69651g == aism.ENDED) {
            return false;
        }
        this.f69651g = aism.ENDED;
        this.f69647b.cancel(true);
        mo37950a(new aisc(this));
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aisn", "c", 314, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Closed WebRTC connection.");
        return true;
    }

    /* renamed from: d */
    public final synchronized void mo37958d() {
        if (mo37957c()) {
            aimf aimf = this.f69649d;
            aimf.f69166a.mo37672a(new aimc(aimf));
        }
    }

    /* renamed from: b */
    public final synchronized void mo37955b(SessionDescription sessionDescription) {
        if (mo37952a(aism.WAITING_FOR_ANSWER, aism.WAITING_TO_CONNECT)) {
            m57856d(sessionDescription);
        }
    }

    /* renamed from: a */
    public final synchronized SessionDescription mo37949a(SessionDescription sessionDescription) {
        bqgy c;
        c = bqgy.m112818c();
        this.f69646a.nativeSetLocalDescription(new aisf(c, sessionDescription), sessionDescription);
        return (SessionDescription) ahhf.m55778c("setLocalSessionDescription", c, cfnv.m140755Q());
    }

    /* renamed from: a */
    public final void mo37950a(Runnable runnable) {
        this.f69652h.execute(runnable);
    }

    /* renamed from: a */
    public final synchronized void mo37951a(PeerConnection.PeerConnectionState peerConnectionState) {
        if (peerConnectionState == PeerConnection.PeerConnectionState.CLOSED || peerConnectionState == PeerConnection.PeerConnectionState.FAILED || peerConnectionState == PeerConnection.PeerConnectionState.DISCONNECTED) {
            mo37958d();
        }
    }

    /* renamed from: a */
    public final boolean mo37952a(aism aism, aism aism2) {
        if (aism != this.f69651g) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("aisn", "a", 368, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68425a("Invalid state transition to %s: current state is %s but expected %s.", aism2, this.f69651g, aism);
            return false;
        }
        this.f69651g = aism2;
        return true;
    }

    /* renamed from: a */
    public final synchronized boolean mo37953a(List list) {
        if (this.f69651g == aism.ENDED) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("aisn", "a", 259, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("You cannot add ice candidates to a disconnected session.");
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            IceCandidate iceCandidate = (IceCandidate) it.next();
            if (!this.f69646a.nativeAddIceCandidate(iceCandidate.f191825a, iceCandidate.f191826b, iceCandidate.f191827c)) {
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68388c();
                bnsl2.mo68432a("aisn", "a", 265, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Unable to add remote ice candidate.");
                return false;
            }
        }
        return true;
    }
}
