package org.webrtc;

import org.webrtc.MediaStreamTrack;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RtpReceiver {

    /* renamed from: a */
    private long f192030a;

    /* renamed from: b */
    private MediaStreamTrack f192031b;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface Observer {
        void onFirstPacketReceived(MediaStreamTrack.MediaType mediaType);
    }

    public RtpReceiver(long j) {
        this.f192030a = j;
        this.f192031b = MediaStreamTrack.m151186a(nativeGetTrack(j));
    }

    private static native long nativeGetTrack(long j);

    public void dispose() {
        if (this.f192030a != 0) {
            this.f192031b.mo86813a();
            JniCommon.nativeReleaseRef(this.f192030a);
            this.f192030a = 0;
            return;
        }
        throw new IllegalStateException("RtpReceiver has been disposed.");
    }
}
