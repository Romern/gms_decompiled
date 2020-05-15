package p000;

/* renamed from: bquq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bquq extends bqur {
    public bquq(byte[] bArr, int i) {
        super(bArr, i);
    }

    /* renamed from: a */
    public final int mo69334a() {
        return 12;
    }

    /* renamed from: a */
    public final int[] mo69335a(int[] iArr, int i) {
        int length = iArr.length;
        if (length == 3) {
            int[] iArr2 = new int[16];
            bqur.m113441a(iArr2, this.f141645a);
            iArr2[12] = i;
            System.arraycopy(iArr, 0, iArr2, 13, 3);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
    }
}
