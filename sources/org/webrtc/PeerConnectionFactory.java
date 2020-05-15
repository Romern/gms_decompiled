package org.webrtc;

import android.content.Context;
import org.webrtc.PeerConnection;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PeerConnectionFactory {

    /* renamed from: a */
    public long f191986a;

    /* renamed from: b */
    private volatile ciuo f191987b;

    /* renamed from: c */
    private volatile ciuo f191988c;

    /* renamed from: d */
    private volatile ciuo f191989d;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class Options {
        /* access modifiers changed from: package-private */
        public boolean getDisableEncryption() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean getDisableNetworkMonitor() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public int getNetworkIgnoreMask() {
            return 0;
        }
    }

    PeerConnectionFactory(long j) {
        m151193a();
        if (j != 0) {
            this.f191986a = j;
            return;
        }
        throw new RuntimeException("Failed to initialize PeerConnectionFactory!");
    }

    /* renamed from: a */
    public static void m151193a() {
        if (!citz.m151013a() || ContextUtils.getApplicationContext() == null) {
            throw new IllegalStateException("PeerConnectionFactory.initialize was not called before creating a PeerConnectionFactory.");
        }
    }

    public static native long nativeCreatePeerConnection(long j, PeerConnection.RTCConfiguration rTCConfiguration, MediaConstraints mediaConstraints, long j2, SSLCertificateVerifier sSLCertificateVerifier);

    public static native PeerConnectionFactory nativeCreatePeerConnectionFactory(Context context, Options options, long j, long j2, long j3, VideoEncoderFactory videoEncoderFactory, VideoDecoderFactory videoDecoderFactory, long j4, long j5, long j6, long j7, long j8, long j9);

    public static native void nativeDeleteLoggable();

    public static native String nativeFindFieldTrialsFullName(String str);

    public static native void nativeInitializeAndroidGlobals();

    public static native void nativeInitializeFieldTrials(String str);

    private void onNetworkThreadReady() {
        this.f191987b = ciuo.m151030a();
        Logging.m151178a("PeerConnectionFactory", "onNetworkThreadReady");
    }

    private void onSignalingThreadReady() {
        this.f191989d = ciuo.m151030a();
        Logging.m151178a("PeerConnectionFactory", "onSignalingThreadReady");
    }

    private void onWorkerThreadReady() {
        this.f191988c = ciuo.m151030a();
        Logging.m151178a("PeerConnectionFactory", "onWorkerThreadReady");
    }
}
