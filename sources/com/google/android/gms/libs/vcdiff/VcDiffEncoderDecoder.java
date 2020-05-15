package com.google.android.gms.libs.vcdiff;

import android.util.Log;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class VcDiffEncoderDecoder {

    /* renamed from: a */
    private static final boolean f79291a = m66816a();

    /* renamed from: a */
    static boolean m66816a() {
        try {
            System.loadLibrary("vcdiffjni");
            return true;
        } catch (SecurityException | UnsatisfiedLinkError e) {
            Log.e("VcDiffEncoderDecoder", "Unable to load vcdiffjni.so", e);
            return false;
        }
    }

    /* renamed from: b */
    public static byte[] m66818b(byte[] bArr, byte[] bArr2) {
        if (!f79291a) {
            throw new IllegalStateException("Native vcdiff library failed to initialize");
        } else if (bArr == null) {
            throw new NullPointerException("dictionary should not be null");
        } else if (bArr2 != null) {
            try {
                byte[] nativeEncoder = nativeEncoder(bArr, bArr2);
                if (nativeEncoder != null) {
                    return nativeEncoder;
                }
                throw new aefa("Encoding failed");
            } catch (UnsatisfiedLinkError e) {
                throw new IllegalStateException(e);
            }
        } else {
            throw new NullPointerException("target should not be null");
        }
    }

    private static native byte[] nativeDecoder(byte[] bArr, byte[] bArr2);

    private static native byte[] nativeEncoder(byte[] bArr, byte[] bArr2);

    /* renamed from: a */
    public static byte[] m66817a(byte[] bArr, byte[] bArr2) {
        if (!f79291a) {
            throw new IllegalStateException("Native vcdiff library failed to initialize");
        } else if (bArr == null) {
            throw new NullPointerException("dictionary should not be null");
        } else if (bArr2 != null) {
            try {
                byte[] nativeDecoder = nativeDecoder(bArr, bArr2);
                if (nativeDecoder != null) {
                    return nativeDecoder;
                }
                throw new aefa("Decoding failed");
            } catch (UnsatisfiedLinkError e) {
                throw new IllegalStateException(e);
            }
        } else {
            throw new NullPointerException("encoded should not be null");
        }
    }
}
