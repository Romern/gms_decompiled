package com.google.android.gms.libs.vcdiff;

import android.util.Log;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class VcDiffDecoder {

    /* renamed from: a */
    public static boolean f79290a;

    static {
        f79290a = false;
        try {
            System.loadLibrary("vcdiffjni");
            f79290a = true;
        } catch (Throwable th) {
            Log.e("VcDiffDecoder: ", "Unable to load vcdiffjni.so", th);
        }
    }

    public static native byte[] nativeDecoder(byte[] bArr, byte[] bArr2);
}
