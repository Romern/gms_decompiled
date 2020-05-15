package com.google.android.gms.wearable.selector;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class NativeOsCompat extends ayfh {
    static {
        System.loadLibrary("wearable-selector");
    }

    public NativeOsCompat() {
        super(nativeGetErrnoAgainValue(), nativeGetErrnoBrokenPipeValue());
    }

    /* renamed from: a */
    public static void m94431a(int i, String str) {
        if (i < 0) {
            throw new ayff(str, nativeGetErrno());
        }
    }

    private static final native int nativeGetErrno();

    private static final native int nativeGetErrnoAgainValue();

    private static final native int nativeGetErrnoBrokenPipeValue();

    public static final native int nativePoll(int[] iArr, short[] sArr, short[] sArr2, int i);

    public static final native int nativeRead(int i, byte[] bArr, int i2, int i3);

    public static final native int nativeWrite(int i, byte[] bArr, int i2, int i3);
}
