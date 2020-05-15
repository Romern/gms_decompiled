package org.webrtc;

import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class JavaI420Buffer implements VideoFrame.I420Buffer {

    /* renamed from: a */
    private final int f191830a;

    /* renamed from: b */
    private final int f191831b;

    /* renamed from: c */
    private final ByteBuffer f191832c;

    /* renamed from: d */
    private final ByteBuffer f191833d;

    /* renamed from: e */
    private final ByteBuffer f191834e;

    /* renamed from: f */
    private final int f191835f;

    /* renamed from: g */
    private final int f191836g;

    /* renamed from: h */
    private final int f191837h;

    /* renamed from: i */
    private final ciup f191838i;

    private JavaI420Buffer(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, Runnable runnable) {
        this.f191830a = i;
        this.f191831b = i2;
        this.f191832c = byteBuffer;
        this.f191833d = byteBuffer2;
        this.f191834e = byteBuffer3;
        this.f191835f = i3;
        this.f191836g = i4;
        this.f191837h = i5;
        this.f191838i = new ciup(runnable);
    }

    /* renamed from: a */
    public static VideoFrame.Buffer m151175a(VideoFrame.I420Buffer i420Buffer, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i5;
        int i8 = i6;
        if (i3 == i7) {
            if (i4 == i8) {
                ByteBuffer dataY = i420Buffer.getDataY();
                ByteBuffer dataU = i420Buffer.getDataU();
                ByteBuffer dataV = i420Buffer.getDataV();
                dataY.position(i + (i420Buffer.getStrideY() * i2));
                int i9 = i / 2;
                int i10 = i2 / 2;
                dataU.position((i420Buffer.getStrideU() * i10) + i9);
                dataV.position(i9 + (i10 * i420Buffer.getStrideV()));
                i420Buffer.retain();
                ByteBuffer slice = dataY.slice();
                int strideY = i420Buffer.getStrideY();
                ByteBuffer slice2 = dataU.slice();
                int strideU = i420Buffer.getStrideU();
                ByteBuffer slice3 = dataV.slice();
                int strideV = i420Buffer.getStrideV();
                i420Buffer.getClass();
                citx citx = new citx(i420Buffer);
                if (slice == null || slice2 == null || slice3 == null) {
                    throw new IllegalArgumentException("Data buffers cannot be null.");
                } else if (!slice.isDirect() || !slice2.isDirect() || !slice3.isDirect()) {
                    throw new IllegalArgumentException("Data buffers must be direct byte buffers.");
                } else {
                    ByteBuffer slice4 = slice.slice();
                    ByteBuffer slice5 = slice2.slice();
                    ByteBuffer slice6 = slice3.slice();
                    int i11 = (i7 + 1) / 2;
                    int i12 = (i8 + 1) / 2;
                    m151176a(slice4, i7, i8, strideY);
                    m151176a(slice5, i11, i12, strideU);
                    m151176a(slice6, i11, i12, strideV);
                    return new JavaI420Buffer(i5, i6, slice4, strideY, slice5, strideU, slice6, strideV, citx);
                }
            }
        }
        int i13 = (i8 + 1) / 2;
        int i14 = (i7 + 1) / 2;
        int i15 = i7 * i8;
        int i16 = i14 * i13;
        int i17 = i15 + i16;
        ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(((i14 + i14) * i13) + i15);
        nativeAllocateByteBuffer.position(0);
        nativeAllocateByteBuffer.limit(i15);
        ByteBuffer slice7 = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i15);
        nativeAllocateByteBuffer.limit(i17);
        ByteBuffer slice8 = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i17);
        nativeAllocateByteBuffer.limit(i17 + i16);
        JavaI420Buffer javaI420Buffer = new JavaI420Buffer(i5, i6, slice7, i5, slice8, i14, nativeAllocateByteBuffer.slice(), i14, new citw(nativeAllocateByteBuffer));
        JavaI420Buffer javaI420Buffer2 = javaI420Buffer;
        nativeCropAndScaleI420(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), i, i2, i3, i4, javaI420Buffer.getDataY(), javaI420Buffer.f191835f, javaI420Buffer.getDataU(), javaI420Buffer.f191836g, javaI420Buffer.getDataV(), javaI420Buffer.f191837h, i5, i6);
        return javaI420Buffer2;
    }

    private static native void nativeCropAndScaleI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, ByteBuffer byteBuffer4, int i8, ByteBuffer byteBuffer5, int i9, ByteBuffer byteBuffer6, int i10, int i11, int i12);

    public final VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        return m151175a(this, i, i2, i3, i4, i5, i6);
    }

    public final ByteBuffer getDataU() {
        return this.f191833d.slice();
    }

    public final ByteBuffer getDataV() {
        return this.f191834e.slice();
    }

    public final ByteBuffer getDataY() {
        return this.f191832c.slice();
    }

    public final int getHeight() {
        return this.f191831b;
    }

    public final int getStrideU() {
        return this.f191836g;
    }

    public final int getStrideV() {
        return this.f191837h;
    }

    public final int getStrideY() {
        return this.f191835f;
    }

    public final int getWidth() {
        return this.f191830a;
    }

    public final void release() {
        this.f191838i.release();
    }

    public final void retain() {
        this.f191838i.retain();
    }

    public final VideoFrame.I420Buffer toI420() {
        retain();
        return this;
    }

    /* renamed from: a */
    private static void m151176a(ByteBuffer byteBuffer, int i, int i2, int i3) {
        int i4 = (i3 * (i2 - 1)) + i;
        if (byteBuffer.capacity() < i4) {
            int capacity = byteBuffer.capacity();
            StringBuilder sb = new StringBuilder(62);
            sb.append("Buffer must be at least ");
            sb.append(i4);
            sb.append(" bytes, but was ");
            sb.append(capacity);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
