package p000;

import java.nio.ByteBuffer;

/* renamed from: bxzc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxzc extends bxyz {
    /* renamed from: a */
    private static int m124545a(byte[] bArr, int i, long j, int i2) {
        if (i2 == 0) {
            return bxzd.m124551a(i);
        }
        if (i2 == 1) {
            return bxzd.m124552a(i, bxyx.m124493a(bArr, j));
        }
        if (i2 == 2) {
            return bxzd.m124553a(i, bxyx.m124493a(bArr, j), bxyx.m124493a(bArr, j + 1));
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    public final String mo74332b(byte[] bArr, int i, int i2) {
        int i3;
        int length = bArr.length;
        if ((i | i2 | ((length - i) - i2)) >= 0) {
            int i4 = i + i2;
            char[] cArr = new char[i2];
            int i5 = 0;
            while (r12 < i4) {
                byte a = bxyx.m124493a(bArr, (long) r12);
                if (!bxyy.m124527a(a)) {
                    break;
                }
                i = r12 + 1;
                bxyy.m124526a(a, cArr, i3);
                i5 = i3 + 1;
            }
            while (r12 < i4) {
                int i6 = r12 + 1;
                byte a2 = bxyx.m124493a(bArr, (long) r12);
                if (bxyy.m124527a(a2)) {
                    bxyy.m124526a(a2, cArr, i3);
                    r12 = i6;
                    i3++;
                    while (r12 < i4) {
                        byte a3 = bxyx.m124493a(bArr, (long) r12);
                        if (!bxyy.m124527a(a3)) {
                            break;
                        }
                        r12++;
                        bxyy.m124526a(a3, cArr, i3);
                        i3++;
                    }
                } else if (!bxyy.m124528b(a2)) {
                    if (!bxyy.m124529c(a2)) {
                        if (i6 < i4 - 2) {
                            int i7 = i6 + 1;
                            int i8 = i7 + 1;
                            bxyy.m124523a(a2, bxyx.m124493a(bArr, (long) i6), bxyx.m124493a(bArr, (long) i7), bxyx.m124493a(bArr, (long) i8), cArr, i3);
                            i3 += 2;
                            r12 = i8 + 1;
                        } else {
                            throw bxwf.m124096i();
                        }
                    } else if (i6 < i4 - 1) {
                        int i9 = i6 + 1;
                        bxyy.m124524a(a2, bxyx.m124493a(bArr, (long) i6), bxyx.m124493a(bArr, (long) i9), cArr, i3);
                        r12 = i9 + 1;
                        i3++;
                    } else {
                        throw bxwf.m124096i();
                    }
                } else if (i6 < i4) {
                    bxyy.m124525a(a2, bxyx.m124493a(bArr, (long) i6), cArr, i3);
                    r12 = i6 + 1;
                    i3++;
                } else {
                    throw bxwf.m124096i();
                }
            }
            return new String(cArr, 0, i3);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x015d, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0134, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0148, code lost:
        return -1;
     */
    /* renamed from: a */
    public final int mo74327a(int i, byte[] bArr, int i2, int i3) {
        int i4;
        byte b;
        int i5 = i;
        byte[] bArr2 = bArr;
        int i6 = i2;
        int i7 = i3;
        int length = bArr2.length;
        if ((i6 | i7 | (length - i7)) >= 0) {
            long j = (long) i6;
            long j2 = (long) i7;
            if (i5 != 0) {
                if (j >= j2) {
                    return i5;
                }
                byte b2 = (byte) i5;
                if (b2 < -32) {
                    if (b2 >= -62) {
                        long j3 = j + 1;
                        if (bxyx.m124493a(bArr2, j) <= -65) {
                            j = j3;
                        }
                    }
                    return -1;
                } else if (b2 >= -16) {
                    byte b3 = (byte) ((i5 >> 8) ^ -1);
                    if (b3 != 0) {
                        b = (byte) (i5 >> 16);
                    } else {
                        long j4 = j + 1;
                        b3 = bxyx.m124493a(bArr2, j);
                        if (j4 >= j2) {
                            return bxzd.m124552a(b2, b3);
                        }
                        j = j4;
                        b = 0;
                    }
                    if (b == 0) {
                        long j5 = j + 1;
                        b = bxyx.m124493a(bArr2, j);
                        if (j5 >= j2) {
                            return bxzd.m124553a(b2, b3, b);
                        }
                        j = j5;
                    }
                    if (b3 <= -65 && (((b2 << 28) + (b3 + 112)) >> 30) == 0 && b <= -65) {
                        long j6 = j + 1;
                        if (bxyx.m124493a(bArr2, j) <= -65) {
                            j = j6;
                        }
                    }
                    return -1;
                } else {
                    byte b4 = (byte) ((i5 >> 8) ^ -1);
                    if (b4 == 0) {
                        long j7 = j + 1;
                        b4 = bxyx.m124493a(bArr2, j);
                        if (j7 >= j2) {
                            return bxzd.m124552a(b2, b4);
                        }
                        j = j7;
                    }
                    if (b4 <= -65 && ((b2 != -32 || b4 >= -96) && (b2 != -19 || b4 < -96))) {
                        long j8 = j + 1;
                        if (bxyx.m124493a(bArr2, j) <= -65) {
                            j = j8;
                        }
                    }
                    return -1;
                }
            }
            int i8 = (int) (j2 - j);
            if (i8 >= 16) {
                long j9 = j;
                i4 = 0;
                while (true) {
                    if (i4 >= i8) {
                        i4 = i8;
                        break;
                    }
                    long j10 = j9 + 1;
                    if (bxyx.m124493a(bArr2, j9) < 0) {
                        break;
                    }
                    i4++;
                    j9 = j10;
                }
            } else {
                i4 = 0;
            }
            int i9 = i8 - i4;
            long j11 = j + ((long) i4);
            while (true) {
                byte b5 = 0;
                while (true) {
                    if (i9 <= 0) {
                        break;
                    }
                    long j12 = j11 + 1;
                    byte a = bxyx.m124493a(bArr2, j11);
                    if (a < 0) {
                        b5 = a;
                        j11 = j12;
                        break;
                    }
                    i9--;
                    b5 = a;
                    j11 = j12;
                }
                if (i9 == 0) {
                    return 0;
                }
                int i10 = i9 - 1;
                if (b5 < -32) {
                    if (i10 != 0) {
                        i9 = i10 - 1;
                        if (b5 < -62) {
                            break;
                        }
                        long j13 = j11 + 1;
                        if (bxyx.m124493a(bArr2, j11) > -65) {
                            break;
                        }
                        j11 = j13;
                    } else {
                        return b5;
                    }
                } else if (b5 >= -16) {
                    if (i10 >= 3) {
                        i9 = i10 - 3;
                        long j14 = j11 + 1;
                        byte a2 = bxyx.m124493a(bArr2, j11);
                        if (a2 > -65 || (((b5 << 28) + (a2 + 112)) >> 30) != 0) {
                            break;
                        }
                        long j15 = j14 + 1;
                        if (bxyx.m124493a(bArr2, j14) > -65) {
                            break;
                        }
                        j11 = j15 + 1;
                        if (bxyx.m124493a(bArr2, j15) > -65) {
                            break;
                        }
                    } else {
                        return m124545a(bArr2, b5, j11, i10);
                    }
                } else if (i10 < 2) {
                    return m124545a(bArr2, b5, j11, i10);
                } else {
                    i9 = i10 - 2;
                    long j16 = j11 + 1;
                    byte a3 = bxyx.m124493a(bArr2, j11);
                    if (a3 <= -65 && (b5 != -32 || a3 >= -96)) {
                        if (b5 == -19 && a3 >= -96) {
                            break;
                        }
                        j11 = j16 + 1;
                        if (bxyx.m124493a(bArr2, j16) > -65) {
                            break;
                        }
                    }
                }
            }
            return -1;
        }
        throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(length), Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031 A[LOOP:1: B:11:0x0031->B:35:0x00fa, LOOP_START, PHI: r2 r3 r4 r11 10  PHI: (r2v3 int) = (r2v2 int), (r2v5 int) binds: [B:10:0x002f, B:35:0x00fa] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r3v2 char) = (r3v1 char), (r3v3 char) binds: [B:10:0x002f, B:35:0x00fa] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r4v4 long) = (r4v2 long), (r4v6 long) binds: [B:10:0x002f, B:35:0x00fa] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r11v3 long) = (r11v2 long), (r11v4 long) binds: [B:10:0x002f, B:35:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: a */
    public final int mo74328a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        long j;
        long j2;
        int i3;
        char charAt;
        CharSequence charSequence2 = charSequence;
        byte[] bArr2 = bArr;
        int i4 = i;
        int i5 = i2;
        long j3 = (long) i4;
        long j4 = ((long) i5) + j3;
        int length = charSequence.length();
        if (length > i5 || bArr2.length - i5 < i4) {
            char charAt2 = charSequence2.charAt(length - 1);
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(charAt2);
            sb.append(" at index ");
            sb.append(i4 + i5);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i6 = 0;
        while (true) {
            char c = 128;
            long j5 = 1;
            if (i6 < length && (charAt = charSequence2.charAt(i6)) < 128) {
                bxyx.m124508a(bArr2, j3, (byte) charAt);
                i6++;
                j3 = 1 + j3;
            } else if (i6 != length) {
                while (i6 < length) {
                    char charAt3 = charSequence2.charAt(i6);
                    if (charAt3 < c && j3 < j4) {
                        long j6 = j3 + j5;
                        bxyx.m124508a(bArr2, j3, (byte) charAt3);
                        j2 = j5;
                        j = j6;
                    } else if (charAt3 < 2048 && j3 <= -2 + j4) {
                        long j7 = j3 + j5;
                        bxyx.m124508a(bArr2, j3, (byte) ((charAt3 >>> 6) | 960));
                        bxyx.m124508a(bArr2, j7, (byte) ((charAt3 & '?') | 128));
                        j = j7 + j5;
                        j2 = j5;
                    } else if ((charAt3 < 55296 || charAt3 > 57343) && j3 <= -3 + j4) {
                        long j8 = j3 + j5;
                        bxyx.m124508a(bArr2, j3, (byte) ((charAt3 >>> 12) | 480));
                        long j9 = j8 + j5;
                        bxyx.m124508a(bArr2, j8, (byte) (((charAt3 >>> 6) & 63) | 128));
                        bxyx.m124508a(bArr2, j9, (byte) ((charAt3 & '?') | 128));
                        j = j9 + 1;
                        j2 = 1;
                    } else if (j3 <= -4 + j4) {
                        int i7 = i6 + 1;
                        if (i7 != length) {
                            char charAt4 = charSequence2.charAt(i7);
                            if (Character.isSurrogatePair(charAt3, charAt4)) {
                                int codePoint = Character.toCodePoint(charAt3, charAt4);
                                long j10 = j3 + 1;
                                bxyx.m124508a(bArr2, j3, (byte) ((codePoint >>> 18) | 240));
                                long j11 = j10 + 1;
                                bxyx.m124508a(bArr2, j10, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j12 = j11 + 1;
                                bxyx.m124508a(bArr2, j11, (byte) (((codePoint >>> 6) & 63) | 128));
                                j2 = 1;
                                j = j12 + 1;
                                bxyx.m124508a(bArr2, j12, (byte) ((codePoint & 63) | 128));
                                i6 = i7;
                            } else {
                                i6 = i7;
                            }
                        }
                        throw new bxzb(i6 - 1, length);
                    } else if (charAt3 < 55296 || charAt3 > 57343 || ((i3 = i6 + 1) != length && Character.isSurrogatePair(charAt3, charSequence2.charAt(i3)))) {
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append("Failed writing ");
                        sb2.append(charAt3);
                        sb2.append(" at index ");
                        sb2.append(j3);
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
                    } else {
                        throw new bxzb(i6, length);
                    }
                    i6++;
                    c = 128;
                    j3 = j;
                    j5 = j2;
                }
            }
        }
        if (i6 != length) {
        }
        return (int) j3;
    }

    /* renamed from: a */
    public final String mo74329a(ByteBuffer byteBuffer, int i, int i2) {
        long j;
        int i3;
        int i4 = i;
        int i5 = i2;
        if ((i4 | i5 | ((byteBuffer.limit() - i4) - i5)) >= 0) {
            long a = bxyx.m124495a(byteBuffer) + ((long) i4);
            long j2 = ((long) i5) + a;
            char[] cArr = new char[i5];
            int i6 = 0;
            while (j < j2) {
                byte a2 = bxyx.m124492a(j);
                if (!bxyy.m124527a(a2)) {
                    break;
                }
                a = j + 1;
                bxyy.m124526a(a2, cArr, i3);
                i6 = i3 + 1;
            }
            while (j < j2) {
                long j3 = j + 1;
                byte a3 = bxyx.m124492a(j);
                if (bxyy.m124527a(a3)) {
                    int i7 = i3 + 1;
                    bxyy.m124526a(a3, cArr, i3);
                    while (j3 < j2) {
                        byte a4 = bxyx.m124492a(j3);
                        if (!bxyy.m124527a(a4)) {
                            break;
                        }
                        j3++;
                        bxyy.m124526a(a4, cArr, i7);
                        i7++;
                    }
                    i3 = i7;
                    j = j3;
                } else if (!bxyy.m124528b(a3)) {
                    if (!bxyy.m124529c(a3)) {
                        if (j3 < -2 + j2) {
                            long j4 = j3 + 1;
                            long j5 = j4 + 1;
                            bxyy.m124523a(a3, bxyx.m124492a(j3), bxyx.m124492a(j4), bxyx.m124492a(j5), cArr, i3);
                            i3 += 2;
                            j = j5 + 1;
                        } else {
                            throw bxwf.m124096i();
                        }
                    } else if (j3 < -1 + j2) {
                        long j6 = j3 + 1;
                        bxyy.m124524a(a3, bxyx.m124492a(j3), bxyx.m124492a(j6), cArr, i3);
                        j = j6 + 1;
                        i3++;
                    } else {
                        throw bxwf.m124096i();
                    }
                } else if (j3 < j2) {
                    j = j3 + 1;
                    bxyy.m124525a(a3, bxyx.m124492a(j3), cArr, i3);
                    i3++;
                } else {
                    throw bxwf.m124096i();
                }
            }
            return new String(cArr, 0, i3);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003b A[LOOP:1: B:9:0x003b->B:33:0x00fe, LOOP_START, PHI: r2 r4 r9 r10 10  PHI: (r2v2 long) = (r2v0 long), (r2v3 long) binds: [B:8:0x0039, B:33:0x00fe] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r4v6 long) = (r4v4 long), (r4v8 long) binds: [B:8:0x0039, B:33:0x00fe] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r9v3 int) = (r9v2 int), (r9v5 int) binds: [B:8:0x0039, B:33:0x00fe] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r10v1 char) = (r10v0 char), (r10v2 char) binds: [B:8:0x0039, B:33:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: a */
    public final void mo74330a(CharSequence charSequence, ByteBuffer byteBuffer) {
        long j;
        long j2;
        int i;
        char charAt;
        CharSequence charSequence2 = charSequence;
        ByteBuffer byteBuffer2 = byteBuffer;
        long a = bxyx.m124495a(byteBuffer);
        long position = ((long) byteBuffer.position()) + a;
        long limit = ((long) byteBuffer.limit()) + a;
        int length = charSequence.length();
        if (((long) length) <= limit - position) {
            int i2 = 0;
            while (true) {
                char c = 128;
                if (i2 < length && (charAt = charSequence2.charAt(i2)) < 128) {
                    bxyx.m124499a(j, (byte) charAt);
                    i2++;
                    position = 1 + j;
                } else if (i2 == length) {
                    while (i2 < length) {
                        char charAt2 = charSequence2.charAt(i2);
                        if (charAt2 < c && j < limit) {
                            bxyx.m124499a(j, (byte) charAt2);
                            j++;
                            j2 = a;
                        } else if (charAt2 >= 2048 || j > limit - 2) {
                            j2 = a;
                            if ((charAt2 < 55296 || charAt2 > 57343) && j <= limit - 3) {
                                long j3 = j + 1;
                                bxyx.m124499a(j, (byte) ((charAt2 >>> 12) | 480));
                                long j4 = j3 + 1;
                                bxyx.m124499a(j3, (byte) (((charAt2 >>> 6) & 63) | 128));
                                bxyx.m124499a(j4, (byte) ((charAt2 & '?') | 128));
                                j = j4 + 1;
                            } else if (j <= limit - 4) {
                                int i3 = i2 + 1;
                                if (i3 != length) {
                                    char charAt3 = charSequence2.charAt(i3);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        long j5 = j + 1;
                                        bxyx.m124499a(j, (byte) ((codePoint >>> 18) | 240));
                                        long j6 = j5 + 1;
                                        bxyx.m124499a(j5, (byte) (((codePoint >>> 12) & 63) | 128));
                                        long j7 = j6 + 1;
                                        bxyx.m124499a(j6, (byte) (((codePoint >>> 6) & 63) | 128));
                                        long j8 = j7 + 1;
                                        bxyx.m124499a(j7, (byte) ((codePoint & 63) | 128));
                                        i2 = i3;
                                        j = j8;
                                    } else {
                                        i2 = i3;
                                    }
                                }
                                throw new bxzb(i2 - 1, length);
                            } else if (charAt2 < 55296 || charAt2 > 57343 || ((i = i2 + 1) != length && Character.isSurrogatePair(charAt2, charSequence2.charAt(i)))) {
                                StringBuilder sb = new StringBuilder(46);
                                sb.append("Failed writing ");
                                sb.append(charAt2);
                                sb.append(" at index ");
                                sb.append(j);
                                throw new ArrayIndexOutOfBoundsException(sb.toString());
                            } else {
                                throw new bxzb(i2, length);
                            }
                        } else {
                            j2 = a;
                            long j9 = j + 1;
                            bxyx.m124499a(j, (byte) ((charAt2 >>> 6) | 960));
                            bxyx.m124499a(j9, (byte) ((charAt2 & '?') | 128));
                            j = j9 + 1;
                        }
                        i2++;
                        a = j2;
                        c = 128;
                    }
                    byteBuffer.position((int) (j - a));
                    return;
                } else {
                    byteBuffer2.position((int) (j - a));
                    return;
                }
            }
            if (i2 == length) {
            }
        } else {
            char charAt4 = charSequence2.charAt(length - 1);
            int limit2 = byteBuffer.limit();
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("Failed writing ");
            sb2.append(charAt4);
            sb2.append(" at index ");
            sb2.append(limit2);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
    }
}
