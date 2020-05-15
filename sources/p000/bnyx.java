package p000;

/* renamed from: bnyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnyx extends bnyt {

    /* renamed from: a */
    static final bnzc f132388a = new bnyx();

    /* renamed from: a */
    private static long m110847a(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    /* renamed from: b */
    private static long m110849b(long j) {
        return j ^ (j >>> 47);
    }

    public final String toString() {
        return "Hashing.farmHashFingerprint64()";
    }

    /* renamed from: a */
    private static void m110848a(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long a = bnzp.m110915a(bArr, i);
        long a2 = bnzp.m110915a(bArr, i + 8);
        long a3 = bnzp.m110915a(bArr, i + 16);
        long a4 = bnzp.m110915a(bArr, i + 24);
        long j3 = j + a;
        long rotateRight = Long.rotateRight(j2 + j3 + a4, 21);
        long j4 = a2 + j3 + a3;
        long rotateRight2 = Long.rotateRight(j4, 44);
        jArr[0] = j4 + a4;
        jArr[1] = rotateRight + rotateRight2 + j3;
    }

    /* renamed from: a */
    public final bnzb mo68723a(byte[] bArr, int i) {
        long j;
        long j2;
        long j3;
        long a;
        long rotateRight;
        int i2;
        byte[] bArr2 = bArr;
        int i3 = i;
        bmxy.m108585a(0, i3, bArr2.length);
        int i4 = 37;
        if (i3 > 32) {
            if (i3 <= 64) {
                long j4 = ((long) (i3 + i3)) - 7286425919675154353L;
                long a2 = bnzp.m110915a(bArr2, 0) * -7286425919675154353L;
                long a3 = bnzp.m110915a(bArr2, 8);
                long a4 = bnzp.m110915a(bArr2, i3 - 8) * j4;
                long a5 = (bnzp.m110915a(bArr2, i3 - 16) * -7286425919675154353L) + Long.rotateRight(a2 + a3, 43) + Long.rotateRight(a4, 30);
                long rotateRight2 = Long.rotateRight(a3 - 7286425919675154353L, 18);
                long a6 = bnzp.m110915a(bArr2, 16) * j4;
                long a7 = bnzp.m110915a(bArr2, 24);
                long a8 = (a5 + bnzp.m110915a(bArr2, i3 - 32)) * j4;
                j = m110847a(Long.rotateRight(a6 + a7, 43) + Long.rotateRight(a8, 30) + ((m110847a(a5, rotateRight2 + a2 + a4, j4) + bnzp.m110915a(bArr2, i3 - 24)) * j4), a6 + Long.rotateRight(a7 + a2, 18) + a8, j4);
            } else {
                long b = m110849b(-7956866745689871395L) * -7286425919675154353L;
                long[] jArr = new long[2];
                long[] jArr2 = new long[2];
                long a9 = bnzp.m110915a(bArr2, 0) + 95310865018149119L;
                int i5 = i3 - 1;
                int i6 = (i5 >> 6) * 64;
                int i7 = i5 & 63;
                int i8 = (i6 + i7) - 63;
                long j5 = 2480279821605975764L;
                int i9 = 0;
                while (true) {
                    long rotateRight3 = Long.rotateRight(a9 + j5 + jArr[0] + bnzp.m110915a(bArr2, i9 + 8), i4);
                    long rotateRight4 = Long.rotateRight(j5 + jArr[1] + bnzp.m110915a(bArr2, i9 + 48), 42);
                    j3 = (rotateRight3 * -5435081209227447693L) ^ jArr2[1];
                    a = (rotateRight4 * -5435081209227447693L) + jArr[0] + bnzp.m110915a(bArr2, i9 + 40);
                    rotateRight = Long.rotateRight(b + jArr2[0], 33) * -5435081209227447693L;
                    i2 = i7;
                    m110848a(bArr, i9, jArr[1] * -5435081209227447693L, j3 + jArr2[0], jArr);
                    m110848a(bArr, i9 + 32, rotateRight + jArr2[1], a + bnzp.m110915a(bArr2, i9 + 16), jArr2);
                    int i10 = i9 + 64;
                    if (i10 == i6) {
                        break;
                    }
                    i9 = i10;
                    i7 = i2;
                    b = j3;
                    j5 = a;
                    a9 = rotateRight;
                    i4 = 37;
                }
                long j6 = j3 & 255;
                long j7 = -5435081209227447693L + j6 + j6;
                long j8 = jArr2[0] + ((long) i2);
                long j9 = jArr[0] + j8;
                jArr[0] = j9;
                jArr2[0] = j8 + j9;
                long rotateRight5 = Long.rotateRight(rotateRight + a + j9 + bnzp.m110915a(bArr2, i8 + 8), 37);
                long rotateRight6 = Long.rotateRight(a + jArr[1] + bnzp.m110915a(bArr2, i8 + 48), 42);
                long j10 = (rotateRight5 * j7) ^ (jArr2[1] * 9);
                long a10 = (rotateRight6 * j7) + (jArr[0] * 9) + bnzp.m110915a(bArr2, i8 + 40);
                long rotateRight7 = Long.rotateRight(j3 + jArr2[0], 33) * j7;
                m110848a(bArr, i8, jArr[1] * j7, j10 + jArr2[0], jArr);
                m110848a(bArr, i8 + 32, rotateRight7 + jArr2[1], a10 + bnzp.m110915a(bArr2, i8 + 16), jArr2);
                j = m110847a(m110847a(jArr[0], jArr2[0], j7) + (m110849b(a10) * -4348849565147123417L) + j10, m110847a(jArr[1], jArr2[1], j7) + rotateRight7, j7);
            }
        } else if (i3 > 16) {
            long j11 = ((long) (i3 + i3)) - 7286425919675154353L;
            long a11 = bnzp.m110915a(bArr2, 0) * -5435081209227447693L;
            long a12 = bnzp.m110915a(bArr2, 8);
            long a13 = bnzp.m110915a(bArr2, i3 - 8) * j11;
            j = m110847a(Long.rotateRight(a11 + a12, 43) + Long.rotateRight(a13, 30) + (bnzp.m110915a(bArr2, i3 - 16) * -7286425919675154353L), a11 + Long.rotateRight(a12 - 7286425919675154353L, 18) + a13, j11);
        } else {
            if (i3 >= 8) {
                long j12 = ((long) (i3 + i3)) - 7286425919675154353L;
                long a14 = bnzp.m110915a(bArr2, 0) - 7286425919675154353L;
                long a15 = bnzp.m110915a(bArr2, i3 - 8);
                j2 = m110847a((Long.rotateRight(a15, 37) * j12) + a14, (Long.rotateRight(a14, 25) + a15) * j12, j12);
            } else if (i3 >= 4) {
                j2 = m110847a(((long) i3) + ((((long) bnzp.m110916b(bArr2, 0)) & 4294967295L) << 3), ((long) bnzp.m110916b(bArr2, i3 - 4)) & 4294967295L, ((long) (i3 + i3)) - 7286425919675154353L);
            } else if (i3 > 0) {
                j2 = m110849b((((long) (i3 + ((bArr2[i3 - 1] & 255) << 2))) * -4348849565147123417L) ^ (((long) ((bArr2[0] & 255) + ((bArr2[i3 >> 1] & 255) << 8))) * -7286425919675154353L)) * -7286425919675154353L;
            } else {
                j2 = -7286425919675154353L;
            }
            j = j2;
        }
        return bnzb.m110869a(j);
    }
}
