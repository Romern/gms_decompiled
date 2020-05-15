package org.webrtc;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EncodedImage implements RefCounted {

    /* renamed from: a */
    public final ByteBuffer f191811a;

    /* renamed from: b */
    public final int f191812b;

    /* renamed from: c */
    public final int f191813c;

    /* renamed from: d */
    public final long f191814d;

    /* renamed from: e */
    public final FrameType f191815e;

    /* renamed from: f */
    public final int f191816f;

    /* renamed from: g */
    public final boolean f191817g;

    /* renamed from: h */
    public final Integer f191818h;

    /* renamed from: i */
    private final ciup f191819i;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum FrameType {
        EmptyFrame(0),
        VideoFrameKey(3),
        VideoFrameDelta(4);
        

        /* renamed from: d */
        public final int f191824d;

        private FrameType(int i) {
            this.f191824d = i;
        }

        static FrameType fromNativeIndex(int i) {
            FrameType[] values = values();
            for (FrameType frameType : values) {
                if (frameType.f191824d == i) {
                    return frameType;
                }
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown native frame type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private EncodedImage(ByteBuffer byteBuffer, Runnable runnable, int i, int i2, long j, FrameType frameType, int i3, boolean z, Integer num) {
        this.f191811a = byteBuffer;
        this.f191812b = i;
        this.f191813c = i2;
        TimeUnit.NANOSECONDS.toMillis(j);
        this.f191814d = j;
        this.f191815e = frameType;
        this.f191816f = i3;
        this.f191817g = z;
        this.f191818h = num;
        this.f191819i = new ciup(runnable);
    }

    private ByteBuffer getBuffer() {
        return this.f191811a;
    }

    private long getCaptureTimeNs() {
        return this.f191814d;
    }

    private boolean getCompleteFrame() {
        return this.f191817g;
    }

    private int getEncodedHeight() {
        return this.f191813c;
    }

    private int getEncodedWidth() {
        return this.f191812b;
    }

    private int getFrameType() {
        return this.f191815e.f191824d;
    }

    private Integer getQp() {
        return this.f191818h;
    }

    private int getRotation() {
        return this.f191816f;
    }

    public final void release() {
        this.f191819i.release();
    }

    public final void retain() {
        this.f191819i.retain();
    }
}
