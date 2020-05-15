package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: rax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rax {
    /* renamed from: a */
    private static int m33207a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: a */
    private static long m33208a(long j) {
        return j ^ (j >>> 47);
    }

    /* renamed from: a */
    private static long m33209a(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    /* renamed from: b */
    private static long m33212b(byte[] bArr, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }

    /* renamed from: a */
    public static long m33210a(byte[] bArr) {
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        int i = 37;
        long j = -7286425919675154353L;
        if (length > 32) {
            if (length <= 64) {
                long j2 = ((long) (length + length)) - 7286425919675154353L;
                long b = m33212b(bArr2, 0) * -7286425919675154353L;
                long b2 = m33212b(bArr2, 8);
                long b3 = m33212b(bArr2, length - 8) * j2;
                long rotateRight = Long.rotateRight(b + b2, 43) + Long.rotateRight(b3, 30) + (m33212b(bArr2, length - 16) * -7286425919675154353L);
                long rotateRight2 = Long.rotateRight(b2 - 7286425919675154353L, 18);
                long b4 = m33212b(bArr2, 16) * j2;
                long b5 = m33212b(bArr2, 24);
                long b6 = (rotateRight + m33212b(bArr2, length - 32)) * j2;
                return m33209a(Long.rotateRight(b4 + b5, 43) + Long.rotateRight(b6, 30) + ((m33209a(rotateRight, b + rotateRight2 + b3, j2) + m33212b(bArr2, length - 24)) * j2), b4 + Long.rotateRight(b5 + b, 18) + b6, j2);
            }
            long a = m33208a(-7956866745689871395L) * -7286425919675154353L;
            long[] jArr = new long[2];
            long[] jArr2 = new long[2];
            long b7 = m33212b(bArr2, 0) + 95310865018149119L;
            int i2 = length - 1;
            int i3 = (i2 >> 6) * 64;
            int i4 = i2 & 63;
            int i5 = (i3 + i4) - 63;
            long j3 = 2480279821605975764L;
            int i6 = 0;
            while (true) {
                long rotateRight3 = Long.rotateRight(b7 + j3 + jArr[0] + m33212b(bArr2, i6 + 8), i);
                long rotateRight4 = Long.rotateRight(j3 + jArr[1] + m33212b(bArr2, i6 + 48), 42);
                long j4 = (rotateRight3 * -5435081209227447693L) ^ jArr2[1];
                long b8 = (rotateRight4 * -5435081209227447693L) + jArr[0] + m33212b(bArr2, i6 + 40);
                long rotateRight5 = Long.rotateRight(a + jArr2[0], 33) * -5435081209227447693L;
                int i7 = i4;
                m33211a(bArr, i6, jArr[1] * -5435081209227447693L, j4 + jArr2[0], jArr);
                m33211a(bArr, i6 + 32, rotateRight5 + jArr2[1], b8 + m33212b(bArr2, i6 + 16), jArr2);
                int i8 = i6 + 64;
                if (i8 == i3) {
                    long j5 = j4 & 255;
                    long j6 = -5435081209227447693L + j5 + j5;
                    long j7 = jArr2[0] + ((long) i7);
                    long j8 = jArr[0] + j7;
                    jArr[0] = j8;
                    jArr2[0] = j7 + j8;
                    long rotateRight6 = Long.rotateRight(rotateRight5 + b8 + j8 + m33212b(bArr2, i5 + 8), 37);
                    long rotateRight7 = Long.rotateRight(b8 + jArr[1] + m33212b(bArr2, i5 + 48), 42);
                    long j9 = (rotateRight6 * j6) ^ (jArr2[1] * 9);
                    long b9 = (rotateRight7 * j6) + (jArr[0] * 9) + m33212b(bArr2, i5 + 40);
                    long rotateRight8 = Long.rotateRight(j4 + jArr2[0], 33) * j6;
                    m33211a(bArr, i5, jArr[1] * j6, j9 + jArr2[0], jArr);
                    m33211a(bArr, i5 + 32, rotateRight8 + jArr2[1], b9 + m33212b(bArr2, i5 + 16), jArr2);
                    return m33209a(m33209a(jArr[0], jArr2[0], j6) + (m33208a(b9) * -4348849565147123417L) + j9, m33209a(jArr[1], jArr2[1], j6) + rotateRight8, j6);
                }
                i6 = i8;
                i4 = i7;
                a = j4;
                j3 = b8;
                b7 = rotateRight5;
                i = 37;
            }
        } else if (length > 16) {
            long j10 = ((long) (length + length)) - 7286425919675154353L;
            long b10 = m33212b(bArr2, 0) * -5435081209227447693L;
            long b11 = m33212b(bArr2, 8);
            long b12 = m33212b(bArr2, length - 8) * j10;
            return m33209a(Long.rotateRight(b10 + b11, 43) + Long.rotateRight(b12, 30) + (m33212b(bArr2, length - 16) * -7286425919675154353L), b10 + Long.rotateRight(b11 - 7286425919675154353L, 18) + b12, j10);
        } else {
            if (length >= 8) {
                long j11 = ((long) (length + length)) - 7286425919675154353L;
                long b13 = m33212b(bArr2, 0) - 7286425919675154353L;
                long b14 = m33212b(bArr2, length - 8);
                j = m33209a((Long.rotateRight(b14, 37) * j11) + b13, (Long.rotateRight(b13, 25) + b14) * j11, j11);
            } else if (length >= 4) {
                j = m33209a(((long) length) + ((((long) m33207a(bArr2, 0)) & 4294967295L) << 3), ((long) m33207a(bArr2, length - 4)) & 4294967295L, ((long) (length + length)) - 7286425919675154353L);
            } else if (length > 0) {
                j = -7286425919675154353L * m33208a((((long) (length + ((bArr2[length - 1] & 255) << 2))) * -4348849565147123417L) ^ (((long) ((bArr2[0] & 255) + ((bArr2[length >> 1] & 255) << 8))) * -7286425919675154353L));
            }
            return j;
        }
    }

    /* renamed from: a */
    private static void m33211a(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long b = m33212b(bArr, i);
        long b2 = m33212b(bArr, i + 8);
        long b3 = m33212b(bArr, i + 16);
        long b4 = m33212b(bArr, i + 24);
        long j3 = j + b;
        long rotateRight = Long.rotateRight(j2 + j3 + b4, 21);
        long j4 = b2 + j3 + b3;
        long rotateRight2 = Long.rotateRight(j4, 44);
        jArr[0] = j4 + b4;
        jArr[1] = rotateRight + rotateRight2 + j3;
    }
}
