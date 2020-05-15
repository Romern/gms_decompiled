package org.webrtc;

import java.nio.ByteBuffer;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class VideoFrame implements RefCounted {

    /* renamed from: a */
    private final Buffer f192080a;

    /* renamed from: b */
    private final int f192081b;

    /* renamed from: c */
    private final long f192082c;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface Buffer extends RefCounted {
        Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6);

        int getHeight();

        int getWidth();

        void release();

        void retain();

        I420Buffer toI420();
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface I420Buffer extends Buffer {
        ByteBuffer getDataU();

        ByteBuffer getDataV();

        ByteBuffer getDataY();

        int getStrideU();

        int getStrideV();

        int getStrideY();
    }

    public VideoFrame(Buffer buffer, int i, long j) {
        if (buffer == null) {
            throw new IllegalArgumentException("buffer not allowed to be null");
        } else if (i % 90 == 0) {
            this.f192080a = buffer;
            this.f192081b = i;
            this.f192082c = j;
        } else {
            throw new IllegalArgumentException("rotation must be a multiple of 90");
        }
    }

    public Buffer getBuffer() {
        return this.f192080a;
    }

    public int getRotation() {
        return this.f192081b;
    }

    public long getTimestampNs() {
        return this.f192082c;
    }

    public void release() {
        this.f192080a.release();
    }

    public final void retain() {
        this.f192080a.retain();
    }
}
