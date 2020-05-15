package com.google.android.gms.car.audio.resampling;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NativeResampler {
    public static native void native16000MonoTo48000StereoFirst(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3);

    public static native void native16000MonoTo48000StereoSecond(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3);

    public static native void native48000StereoTo16000MonoFirst(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3);

    public static native void native48000StereoTo16000MonoSecond(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3);
}
