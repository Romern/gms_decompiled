package org.webrtc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RtpTransceiver {

    /* renamed from: a */
    public long f192036a;

    /* renamed from: b */
    private RtpSender f192037b;

    /* renamed from: c */
    private RtpReceiver f192038c;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum RtpTransceiverDirection {
        SEND_RECV(0),
        SEND_ONLY(1),
        RECV_ONLY(2),
        INACTIVE(3);
        

        /* renamed from: e */
        private final int f192044e;

        private RtpTransceiverDirection(int i) {
            this.f192044e = i;
        }

        static RtpTransceiverDirection fromNativeIndex(int i) {
            RtpTransceiverDirection[] values = values();
            for (RtpTransceiverDirection rtpTransceiverDirection : values) {
                if (rtpTransceiverDirection.getNativeIndex() == i) {
                    return rtpTransceiverDirection;
                }
            }
            StringBuilder sb = new StringBuilder(53);
            sb.append("Uknown native RtpTransceiverDirection type");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }

        public int getNativeIndex() {
            return this.f192044e;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class RtpTransceiverInit {

        /* renamed from: a */
        private final RtpTransceiverDirection f192045a;

        /* renamed from: b */
        private final List f192046b;

        /* renamed from: c */
        private final List f192047c;

        public RtpTransceiverInit() {
            RtpTransceiverDirection rtpTransceiverDirection = RtpTransceiverDirection.SEND_RECV;
            List emptyList = Collections.emptyList();
            List emptyList2 = Collections.emptyList();
            this.f192045a = rtpTransceiverDirection;
            this.f192046b = new ArrayList(emptyList);
            this.f192047c = new ArrayList(emptyList2);
        }

        /* access modifiers changed from: package-private */
        public int getDirectionNativeIndex() {
            return this.f192045a.getNativeIndex();
        }

        /* access modifiers changed from: package-private */
        public List getSendEncodings() {
            return new ArrayList(this.f192047c);
        }

        /* access modifiers changed from: package-private */
        public List getStreamIds() {
            return new ArrayList(this.f192046b);
        }
    }

    protected RtpTransceiver(long j) {
        this.f192036a = j;
        this.f192037b = nativeGetSender(j);
        this.f192038c = nativeGetReceiver(j);
    }

    private static native RtpReceiver nativeGetReceiver(long j);

    private static native RtpSender nativeGetSender(long j);

    public static native void nativeStop(long j);

    /* renamed from: a */
    public final void mo86921a() {
        if (this.f192036a == 0) {
            throw new IllegalStateException("RtpTransceiver has been disposed.");
        }
    }

    public void dispose() {
        mo86921a();
        this.f192037b.mo86920a();
        this.f192038c.dispose();
        JniCommon.nativeReleaseRef(this.f192036a);
        this.f192036a = 0;
    }
}
