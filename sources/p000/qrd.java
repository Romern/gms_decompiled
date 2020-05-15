package p000;

import javax.crypto.Mac;

/* renamed from: qrd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qrd {
    /* renamed from: a */
    private static int m32689a(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    /* renamed from: b */
    private static void m32694b(int[] iArr) {
        int[] iArr2 = iArr;
        int[] iArr3 = new int[16];
        System.arraycopy(iArr2, 0, iArr3, 0, 16);
        for (int i = 0; i < 8; i += 2) {
            int a = iArr3[4] ^ m32689a(iArr3[0] + iArr3[12], 7);
            iArr3[4] = a;
            int a2 = m32689a(a + iArr3[0], 9) ^ iArr3[8];
            iArr3[8] = a2;
            int a3 = m32689a(a2 + iArr3[4], 13) ^ iArr3[12];
            iArr3[12] = a3;
            iArr3[0] = m32689a(a3 + iArr3[8], 18) ^ iArr3[0];
            int a4 = iArr3[9] ^ m32689a(iArr3[5] + iArr3[1], 7);
            iArr3[9] = a4;
            int a5 = m32689a(a4 + iArr3[5], 9) ^ iArr3[13];
            iArr3[13] = a5;
            int a6 = m32689a(a5 + iArr3[9], 13) ^ iArr3[1];
            iArr3[1] = a6;
            iArr3[5] = m32689a(a6 + iArr3[13], 18) ^ iArr3[5];
            int a7 = m32689a(iArr3[10] + iArr3[6], 7) ^ iArr3[14];
            iArr3[14] = a7;
            int a8 = iArr3[2] ^ m32689a(a7 + iArr3[10], 9);
            iArr3[2] = a8;
            int a9 = iArr3[6] ^ m32689a(a8 + iArr3[14], 13);
            iArr3[6] = a9;
            iArr3[10] = iArr3[10] ^ m32689a(a9 + iArr3[2], 18);
            int a10 = iArr3[3] ^ m32689a(iArr3[15] + iArr3[11], 7);
            iArr3[3] = a10;
            int a11 = iArr3[7] ^ m32689a(a10 + iArr3[15], 9);
            iArr3[7] = a11;
            int a12 = iArr3[11] ^ m32689a(a11 + iArr3[3], 13);
            iArr3[11] = a12;
            iArr3[15] = iArr3[15] ^ m32689a(a12 + iArr3[7], 18);
            int a13 = iArr3[1] ^ m32689a(iArr3[0] + iArr3[3], 7);
            iArr3[1] = a13;
            int a14 = m32689a(a13 + iArr3[0], 9) ^ iArr3[2];
            iArr3[2] = a14;
            int a15 = m32689a(a14 + iArr3[1], 13) ^ iArr3[3];
            iArr3[3] = a15;
            iArr3[0] = iArr3[0] ^ m32689a(a15 + iArr3[2], 18);
            int a16 = iArr3[6] ^ m32689a(iArr3[5] + iArr3[4], 7);
            iArr3[6] = a16;
            int a17 = m32689a(a16 + iArr3[5], 9) ^ iArr3[7];
            iArr3[7] = a17;
            int a18 = m32689a(a17 + iArr3[6], 13) ^ iArr3[4];
            iArr3[4] = a18;
            iArr3[5] = m32689a(a18 + iArr3[7], 18) ^ iArr3[5];
            int a19 = iArr3[11] ^ m32689a(iArr3[10] + iArr3[9], 7);
            iArr3[11] = a19;
            int a20 = m32689a(a19 + iArr3[10], 9) ^ iArr3[8];
            iArr3[8] = a20;
            int a21 = m32689a(a20 + iArr3[11], 13) ^ iArr3[9];
            iArr3[9] = a21;
            iArr3[10] = m32689a(a21 + iArr3[8], 18) ^ iArr3[10];
            int a22 = iArr3[12] ^ m32689a(iArr3[15] + iArr3[14], 7);
            iArr3[12] = a22;
            int a23 = m32689a(a22 + iArr3[15], 9) ^ iArr3[13];
            iArr3[13] = a23;
            int a24 = m32689a(a23 + iArr3[12], 13) ^ iArr3[14];
            iArr3[14] = a24;
            iArr3[15] = m32689a(a24 + iArr3[13], 18) ^ iArr3[15];
        }
        for (int i2 = 0; i2 < 16; i2++) {
            iArr2[i2] = iArr2[i2] + iArr3[i2];
        }
    }

    /* renamed from: a */
    public static long m32690a(int[] iArr) {
        return (((long) iArr[241]) << 32) + ((long) iArr[240]);
    }

    /* renamed from: a */
    public static void m32691a(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        System.arraycopy(iArr, 240, iArr3, 0, 16);
        for (int i = 0; i < 16; i += 2) {
            int i2 = i * 16;
            m32692a(iArr3, iArr, i2, 16);
            m32694b(iArr3);
            int i3 = i * 8;
            System.arraycopy(iArr3, 0, iArr2, i3, 16);
            m32692a(iArr3, iArr, i2 + 16, 16);
            m32694b(iArr3);
            System.arraycopy(iArr3, 0, iArr2, i3 + 128, 16);
        }
    }

    /* renamed from: a */
    public static void m32692a(int[] iArr, int[] iArr2, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = iArr[i3] ^ iArr2[i + i3];
        }
    }

    /* renamed from: a */
    public static byte[] m32693a(Mac mac, byte[] bArr, int i) {
        int macLength = mac.getMacLength();
        int length = bArr.length;
        byte[] bArr2 = new byte[i];
        byte[] bArr3 = new byte[(length + 4)];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        int i2 = 1;
        int i3 = 0;
        while (i > 0) {
            bArr3[length] = (byte) (i2 >> 24);
            bArr3[length + 1] = (byte) (i2 >> 16);
            bArr3[length + 2] = (byte) (i2 >> 8);
            bArr3[length + 3] = (byte) i2;
            byte[] doFinal = mac.doFinal(bArr3);
            int min = Math.min(i, macLength);
            System.arraycopy(doFinal, 0, bArr2, i3, min);
            i3 += min;
            i -= min;
            i2++;
        }
        return bArr2;
    }
}
