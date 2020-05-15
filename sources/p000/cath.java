package p000;

/* renamed from: cath */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cath {
    /* renamed from: a */
    public static byte[] m127170a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int length = bArr2.length;
        if (length <= 127) {
            bArr3 = new byte[]{(byte) length};
        } else if (length <= 255) {
            bArr3 = new byte[]{-127, (byte) length};
        } else if (length <= 65535) {
            bArr3 = new byte[]{-126, (byte) (255 & (length >> 8)), (byte) (length & 255)};
        } else if (length > 16777215) {
            bArr3 = new byte[]{-124, (byte) (length >> 24), (byte) ((length >> 16) & 255), (byte) ((length >> 8) & 255), (byte) (length & 255)};
        } else {
            bArr3 = new byte[]{-125, (byte) ((length >> 16) & 255), (byte) ((length >> 8) & 255), (byte) (length & 255)};
        }
        int length2 = bArr.length;
        int length3 = bArr3.length;
        int i = length2 + length3;
        byte[] bArr4 = new byte[(i + length)];
        System.arraycopy(bArr, 0, bArr4, 0, length2);
        System.arraycopy(bArr3, 0, bArr4, length2, length3);
        System.arraycopy(bArr2, 0, bArr4, i, length);
        return bArr4;
    }
}
