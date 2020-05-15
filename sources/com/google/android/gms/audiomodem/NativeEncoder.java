package com.google.android.gms.audiomodem;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class NativeEncoder {
    public static native void nativeEncode(byte[] bArr, EncodeResultsProtoHelper encodeResultsProtoHelper, int i);

    public static native boolean nativeInitializeDsss(int i, boolean z, boolean z2, int i2, int i3, float f, int i4, float f2, int i5, int i6, int i7, boolean z3, int i8, float f3);

    public static native boolean nativeInitializeDtmf(int i, boolean z, float f, int i2, float f2, int i3, float f3, float f4, float f5, float f6, float f7, float[] fArr);

    public static native void nativeRelease();
}
