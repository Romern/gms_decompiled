package org.webrtc;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RtpSender {

    /* renamed from: a */
    private long f192032a;

    /* renamed from: b */
    private MediaStreamTrack f192033b;

    /* renamed from: c */
    private boolean f192034c = true;

    /* renamed from: d */
    private final DtmfSender f192035d;

    public RtpSender(long j) {
        this.f192032a = j;
        this.f192033b = MediaStreamTrack.m151186a(nativeGetTrack(j));
        long nativeGetDtmfSender = nativeGetDtmfSender(j);
        this.f192035d = nativeGetDtmfSender != 0 ? new DtmfSender(nativeGetDtmfSender) : null;
    }

    private static native long nativeGetDtmfSender(long j);

    private static native long nativeGetTrack(long j);

    /* renamed from: a */
    public final void mo86920a() {
        if (this.f192032a != 0) {
            DtmfSender dtmfSender = this.f192035d;
            if (dtmfSender != null) {
                long j = dtmfSender.f191810a;
                if (j != 0) {
                    JniCommon.nativeReleaseRef(j);
                    dtmfSender.f191810a = 0;
                } else {
                    throw new IllegalStateException("DtmfSender has been disposed.");
                }
            }
            MediaStreamTrack mediaStreamTrack = this.f192033b;
            if (mediaStreamTrack != null && this.f192034c) {
                mediaStreamTrack.mo86813a();
            }
            JniCommon.nativeReleaseRef(this.f192032a);
            this.f192032a = 0;
            return;
        }
        throw new IllegalStateException("RtpSender has been disposed.");
    }
}
