package org.webrtc;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.webrtc.DataChannel;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PeerConnection {

    /* renamed from: a */
    public final List f191885a = new ArrayList();

    /* renamed from: b */
    public final long f191886b;

    /* renamed from: c */
    public List f191887c = new ArrayList();

    /* renamed from: d */
    public List f191888d = new ArrayList();

    /* renamed from: e */
    public List f191889e = new ArrayList();

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum AdapterType {
        UNKNOWN(0),
        ETHERNET(1),
        WIFI(2),
        CELLULAR(4),
        VPN(8),
        LOOPBACK(16),
        ADAPTER_TYPE_ANY(32),
        CELLULAR_2G(64),
        CELLULAR_3G(128),
        CELLULAR_4G(Integer.valueOf((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES)),
        CELLULAR_5G(512);
        

        /* renamed from: m */
        private static final Map f191901m = new HashMap();

        /* renamed from: l */
        public final Integer f191903l;

        static {
            AdapterType[] values = values();
            for (AdapterType adapterType : values) {
                f191901m.put(adapterType.f191903l, adapterType);
            }
        }

        private AdapterType(Integer num) {
            this.f191903l = num;
        }

        static AdapterType fromNativeIndex(int i) {
            return (AdapterType) f191901m.get(Integer.valueOf(i));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum BundlePolicy {
        BALANCED,
        MAXBUNDLE,
        MAXCOMPAT
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum CandidateNetworkPolicy {
        ALL,
        LOW_COST
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum ContinualGatheringPolicy {
        GATHER_ONCE,
        GATHER_CONTINUALLY
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum IceConnectionState {
        NEW,
        CHECKING,
        CONNECTED,
        COMPLETED,
        FAILED,
        DISCONNECTED,
        CLOSED;

        static IceConnectionState fromNativeIndex(int i) {
            return values()[i];
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum IceGatheringState {
        NEW,
        GATHERING,
        COMPLETE;

        static IceGatheringState fromNativeIndex(int i) {
            return values()[i];
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class IceServer {
        @Deprecated

        /* renamed from: a */
        public final String f191926a;

        /* renamed from: b */
        public final List f191927b;

        /* renamed from: c */
        public final String f191928c;

        /* renamed from: d */
        public final String f191929d;

        /* renamed from: e */
        public final TlsCertPolicy f191930e;

        /* renamed from: f */
        public final String f191931f;

        public IceServer(String str, List list, String str2, String str3, TlsCertPolicy tlsCertPolicy, String str4) {
            if (str == null || list.isEmpty()) {
                throw new IllegalArgumentException("uri == null || urls == null || urls.isEmpty()");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((String) it.next()) == null) {
                    String valueOf = String.valueOf(list);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                    sb.append("urls element is null: ");
                    sb.append(valueOf);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            if (str2 == null) {
                throw new IllegalArgumentException("username == null");
            } else if (str3 != null) {
                this.f191926a = str;
                this.f191927b = list;
                this.f191928c = str2;
                this.f191929d = str3;
                this.f191930e = tlsCertPolicy;
                this.f191931f = str4;
            } else {
                throw new IllegalArgumentException("password == null");
            }
        }

        /* renamed from: a */
        public static ciuk m151192a(String str) {
            return new ciuk(Collections.singletonList(str));
        }

        public final boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            if (obj instanceof IceServer) {
                IceServer iceServer = (IceServer) obj;
                if (this.f191926a.equals(iceServer.f191926a) && this.f191927b.equals(iceServer.f191927b) && this.f191928c.equals(iceServer.f191928c) && this.f191929d.equals(iceServer.f191929d) && this.f191930e.equals(iceServer.f191930e) && this.f191931f.equals(iceServer.f191931f)) {
                    throw null;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public String getHostname() {
            return this.f191931f;
        }

        /* access modifiers changed from: package-private */
        public String getPassword() {
            return this.f191929d;
        }

        /* access modifiers changed from: package-private */
        public List getTlsAlpnProtocols() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public TlsCertPolicy getTlsCertPolicy() {
            return this.f191930e;
        }

        /* access modifiers changed from: package-private */
        public List getTlsEllipticCurves() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public List getUrls() {
            return this.f191927b;
        }

        /* access modifiers changed from: package-private */
        public String getUsername() {
            return this.f191928c;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f191926a, this.f191927b, this.f191928c, this.f191929d, this.f191930e, this.f191931f, null, null});
        }

        public final String toString() {
            String valueOf = String.valueOf(this.f191927b);
            String str = this.f191928c;
            String str2 = this.f191929d;
            String valueOf2 = String.valueOf(this.f191930e);
            String str3 = this.f191931f;
            String valueOf3 = String.valueOf((Object) null);
            String valueOf4 = String.valueOf((Object) null);
            int length = String.valueOf(valueOf).length();
            int length2 = str.length();
            int length3 = str2.length();
            int length4 = String.valueOf(valueOf2).length();
            int length5 = str3.length();
            StringBuilder sb = new StringBuilder(length + 16 + length2 + length3 + length4 + length5 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
            sb.append(valueOf);
            sb.append(" [");
            sb.append(str);
            sb.append(":");
            sb.append(str2);
            sb.append("] [");
            sb.append(valueOf2);
            sb.append("] [");
            sb.append(str3);
            sb.append("] [");
            sb.append(valueOf3);
            sb.append("] [");
            sb.append(valueOf4);
            sb.append("]");
            return sb.toString();
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum IceTransportsType {
        NONE,
        RELAY,
        NOHOST,
        ALL
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum KeyType {
        RSA,
        ECDSA
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface Observer {
        void onAddStream(MediaStream mediaStream);

        void onAddTrack(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr);

        void onConnectionChange(PeerConnectionState peerConnectionState);

        void onDataChannel(DataChannel dataChannel);

        void onIceCandidate(IceCandidate iceCandidate);

        void onIceCandidatesRemoved(IceCandidate[] iceCandidateArr);

        void onIceConnectionChange(IceConnectionState iceConnectionState);

        void onIceConnectionReceivingChange(boolean z);

        void onIceGatheringChange(IceGatheringState iceGatheringState);

        void onRemoveStream(MediaStream mediaStream);

        void onRenegotiationNeeded();

        void onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent);

        void onSignalingChange(SignalingState signalingState);

        void onStandardizedIceConnectionChange(IceConnectionState iceConnectionState);

        void onTrack(RtpTransceiver rtpTransceiver);
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum PeerConnectionState {
        NEW,
        CONNECTING,
        CONNECTED,
        DISCONNECTED,
        FAILED,
        CLOSED;

        static PeerConnectionState fromNativeIndex(int i) {
            return values()[i];
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum PortPrunePolicy {
        NO_PRUNE,
        PRUNE_BASED_ON_PRIORITY,
        KEEP_FIRST_READY
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class RTCConfiguration {

        /* renamed from: a */
        public IceTransportsType f191951a = IceTransportsType.ALL;

        /* renamed from: b */
        public List f191952b;

        /* renamed from: c */
        public BundlePolicy f191953c = BundlePolicy.BALANCED;

        /* renamed from: d */
        public RtcpMuxPolicy f191954d = RtcpMuxPolicy.REQUIRE;

        /* renamed from: e */
        public TcpCandidatePolicy f191955e = TcpCandidatePolicy.ENABLED;

        /* renamed from: f */
        public CandidateNetworkPolicy f191956f = CandidateNetworkPolicy.ALL;

        /* renamed from: g */
        public int f191957g;

        /* renamed from: h */
        public int f191958h;

        /* renamed from: i */
        public int f191959i;

        /* renamed from: j */
        public KeyType f191960j;

        /* renamed from: k */
        public ContinualGatheringPolicy f191961k;

        /* renamed from: l */
        public PortPrunePolicy f191962l;

        /* renamed from: m */
        public int f191963m;

        /* renamed from: n */
        public boolean f191964n;

        /* renamed from: o */
        public AdapterType f191965o;

        /* renamed from: p */
        public SdpSemantics f191966p;

        public RTCConfiguration(List list) {
            this.f191952b = list;
            this.f191957g = 50;
            this.f191958h = -1;
            this.f191959i = -1;
            this.f191960j = KeyType.ECDSA;
            this.f191961k = ContinualGatheringPolicy.GATHER_ONCE;
            this.f191962l = PortPrunePolicy.NO_PRUNE;
            this.f191963m = 5;
            this.f191964n = true;
            this.f191965o = AdapterType.UNKNOWN;
            this.f191966p = SdpSemantics.PLAN_B;
        }

        /* access modifiers changed from: package-private */
        public boolean getActiveResetSrtpParams() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public Boolean getAllowCodecSwitching() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public boolean getAudioJitterBufferFastAccelerate() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public int getAudioJitterBufferMaxPackets() {
            return this.f191957g;
        }

        /* access modifiers changed from: package-private */
        public BundlePolicy getBundlePolicy() {
            return this.f191953c;
        }

        /* access modifiers changed from: package-private */
        public CandidateNetworkPolicy getCandidateNetworkPolicy() {
            return this.f191956f;
        }

        /* access modifiers changed from: package-private */
        public RtcCertificatePem getCertificate() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public Boolean getCombinedAudioVideoBwe() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public ContinualGatheringPolicy getContinualGatheringPolicy() {
            return this.f191961k;
        }

        /* access modifiers changed from: package-private */
        public CryptoOptions getCryptoOptions() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public boolean getDisableIPv6OnWifi() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean getDisableIpv6() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean getEnableCpuOveruseDetection() {
            return this.f191964n;
        }

        /* access modifiers changed from: package-private */
        public boolean getEnableDscp() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public Boolean getEnableDtlsSrtp() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public boolean getEnableRtpDataChannel() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public int getIceBackupCandidatePairPingInterval() {
            return this.f191959i;
        }

        /* access modifiers changed from: package-private */
        public int getIceCandidatePoolSize() {
            return 0;
        }

        /* access modifiers changed from: package-private */
        public Integer getIceCheckIntervalStrongConnectivity() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public Integer getIceCheckIntervalWeakConnectivity() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public Integer getIceCheckMinInterval() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public int getIceConnectionReceivingTimeout() {
            return this.f191958h;
        }

        /* access modifiers changed from: package-private */
        public List getIceServers() {
            return this.f191952b;
        }

        /* access modifiers changed from: package-private */
        public IceTransportsType getIceTransportsType() {
            return this.f191951a;
        }

        /* access modifiers changed from: package-private */
        public Integer getIceUnwritableMinChecks() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public Integer getIceUnwritableTimeout() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public KeyType getKeyType() {
            return this.f191960j;
        }

        /* access modifiers changed from: package-private */
        public int getMaxIPv6Networks() {
            return this.f191963m;
        }

        /* access modifiers changed from: package-private */
        public AdapterType getNetworkPreference() {
            return this.f191965o;
        }

        /* access modifiers changed from: package-private */
        public boolean getPresumeWritableWhenFullyRelayed() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean getPruneTurnPorts() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public RtcpMuxPolicy getRtcpMuxPolicy() {
            return this.f191954d;
        }

        /* access modifiers changed from: package-private */
        public Integer getScreencastMinBitrate() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public SdpSemantics getSdpSemantics() {
            return this.f191966p;
        }

        /* access modifiers changed from: package-private */
        public Integer getStunCandidateKeepaliveInterval() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public boolean getSurfaceIceCandidatesOnIceTransportTypeChanged() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean getSuspendBelowMinBitrate() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public TcpCandidatePolicy getTcpCandidatePolicy() {
            return this.f191955e;
        }

        /* access modifiers changed from: package-private */
        public TurnCustomizer getTurnCustomizer() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public String getTurnLoggingId() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public PortPrunePolicy getTurnPortPrunePolicy() {
            return this.f191962l;
        }

        /* access modifiers changed from: package-private */
        public boolean getUseMediaTransport() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean getUseMediaTransportForDataChannels() {
            return false;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum RtcpMuxPolicy {
        NEGOTIATE,
        REQUIRE
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum SdpSemantics {
        PLAN_B,
        UNIFIED_PLAN
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum SignalingState {
        STABLE,
        HAVE_LOCAL_OFFER,
        HAVE_LOCAL_PRANSWER,
        HAVE_REMOTE_OFFER,
        HAVE_REMOTE_PRANSWER,
        CLOSED;

        static SignalingState fromNativeIndex(int i) {
            return values()[i];
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum TcpCandidatePolicy {
        ENABLED,
        DISABLED
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum TlsCertPolicy {
        TLS_CERT_POLICY_SECURE,
        TLS_CERT_POLICY_INSECURE_NO_CHECK
    }

    public PeerConnection(long j) {
        this.f191886b = j;
    }

    public static native long nativeCreatePeerConnectionObserver(Observer observer);

    public static native void nativeFreeOwnedPeerConnection(long j);

    /* access modifiers changed from: package-private */
    public long getNativeOwnedPeerConnection() {
        return this.f191886b;
    }

    public native boolean nativeAddIceCandidate(String str, int i, String str2);

    public native void nativeClose();

    public native void nativeCreateAnswer(SdpObserver sdpObserver, MediaConstraints mediaConstraints);

    public native DataChannel nativeCreateDataChannel(String str, DataChannel.Init init);

    public native void nativeCreateOffer(SdpObserver sdpObserver, MediaConstraints mediaConstraints);

    public native void nativeRemoveLocalStream(long j);

    public native void nativeSetLocalDescription(SdpObserver sdpObserver, SessionDescription sessionDescription);

    public native void nativeSetRemoteDescription(SdpObserver sdpObserver, SessionDescription sessionDescription);
}
