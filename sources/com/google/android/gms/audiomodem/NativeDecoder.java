package com.google.android.gms.audiomodem;

import java.nio.ByteBuffer;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NativeDecoder {
    public static native boolean nativeDetectBroadcaster(int i);

    public static native int nativeGetMaxSafeInputSize(int i);

    public static native void nativeGetTokens(int i, DecodedTokensProtoHelper decodedTokensProtoHelper, int i2, int i3);

    public static native boolean nativeInitializeDsss(int i, int i2, boolean z, boolean z2, int i3, int i4, float f, int i5, float f2, int i6, int i7, int i8, boolean z3, float f3, float f4, int i9, float f5, int i10, float f6, boolean z4);

    public static native boolean nativeInitializeDtmf(int i, int i2, boolean z, float f, int i3, float f2, int i4, float f3, int i5, float f4, int i6, float f5, float f6, float f7, float f8, float f9, float f10, float[] fArr);

    public static native void nativeProcessSamples(int i, ByteBuffer byteBuffer, int i2, int i3);

    public static native void nativeProcessSamplesWithHotsound(int i, ByteBuffer byteBuffer, int i2, int i3);

    public static native void nativeRelease(int i);

    public static native void nativeWipeInternalData(int i);
}
