package org.webrtc;

import java.nio.ByteBuffer;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class JniCommon {
    public static native void nativeAddRef(long j);

    public static native ByteBuffer nativeAllocateByteBuffer(int i);

    public static native void nativeFreeByteBuffer(ByteBuffer byteBuffer);

    public static native void nativeReleaseRef(long j);
}
