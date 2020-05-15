package org.webrtc;

import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class WrappedNativeI420Buffer implements VideoFrame.I420Buffer {

    /* renamed from: a */
    private final int f192084a;

    /* renamed from: b */
    private final int f192085b;

    /* renamed from: c */
    private final ByteBuffer f192086c;

    /* renamed from: d */
    private final int f192087d;

    /* renamed from: e */
    private final ByteBuffer f192088e;

    /* renamed from: f */
    private final int f192089f;

    /* renamed from: g */
    private final ByteBuffer f192090g;

    /* renamed from: h */
    private final int f192091h;

    /* renamed from: i */
    private final long f192092i;

    WrappedNativeI420Buffer(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, long j) {
        this.f192084a = i;
        this.f192085b = i2;
        this.f192086c = byteBuffer;
        this.f192087d = i3;
        this.f192088e = byteBuffer2;
        this.f192089f = i4;
        this.f192090g = byteBuffer3;
        this.f192091h = i5;
        this.f192092i = j;
        retain();
    }

    public final VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        return JavaI420Buffer.m151175a(this, i, i2, i3, i4, i5, i6);
    }

    public final ByteBuffer getDataU() {
        return this.f192088e.slice();
    }

    public final ByteBuffer getDataV() {
        return this.f192090g.slice();
    }

    public final ByteBuffer getDataY() {
        return this.f192086c.slice();
    }

    public final int getHeight() {
        return this.f192085b;
    }

    public final int getStrideU() {
        return this.f192089f;
    }

    public final int getStrideV() {
        return this.f192091h;
    }

    public final int getStrideY() {
        return this.f192087d;
    }

    public final int getWidth() {
        return this.f192084a;
    }

    public final void release() {
        JniCommon.nativeReleaseRef(this.f192092i);
    }

    public final void retain() {
        JniCommon.nativeAddRef(this.f192092i);
    }

    public final VideoFrame.I420Buffer toI420() {
        retain();
        return this;
    }
}
