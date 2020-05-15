package p000;

import java.nio.ByteBuffer;

/* renamed from: bxza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxza extends bxyz {
    /* renamed from: a */
    public final int mo74327a(int i, byte[] bArr, int i2, int i3) {
        byte b;
        if (i != 0) {
            if (i2 >= i3) {
                return i;
            }
            byte b2 = (byte) i;
            if (b2 < -32) {
                if (b2 >= -62) {
                    int i4 = i2 + 1;
                    if (bArr[i2] <= -65) {
                        i2 = i4;
                    }
                }
                return -1;
            } else if (b2 >= -16) {
                byte b3 = (byte) ((i >> 8) ^ -1);
                if (b3 != 0) {
                    b = (byte) (i >> 16);
                } else {
                    int i5 = i2 + 1;
                    b3 = bArr[i2];
                    if (i5 >= i3) {
                        return bxzd.m124552a(b2, b3);
                    }
                    i2 = i5;
                    b = 0;
                }
                if (b == 0) {
                    int i6 = i2 + 1;
                    byte b4 = bArr[i2];
                    if (i6 >= i3) {
                        return bxzd.m124553a(b2, b3, b4);
                    }
                    i2 = i6;
                    b = b4;
                }
                if (b3 <= -65 && (((b2 << 28) + (b3 + 112)) >> 30) == 0 && b <= -65) {
                    int i7 = i2 + 1;
                    if (bArr[i2] <= -65) {
                        i2 = i7;
                    }
                }
                return -1;
            } else {
                byte b5 = (byte) ((i >> 8) ^ -1);
                if (b5 == 0) {
                    int i8 = i2 + 1;
                    byte b6 = bArr[i2];
                    if (i8 >= i3) {
                        return bxzd.m124552a(b2, b6);
                    }
                    i2 = i8;
                    b5 = b6;
                }
                if (b5 <= -65 && ((b2 != -32 || b5 >= -96) && (b2 != -19 || b5 < -96))) {
                    int i9 = i2 + 1;
                    if (bArr[i2] <= -65) {
                        i2 = i9;
                    }
                }
                return -1;
            }
        }
        while (r14 < i3 && bArr[r14] >= 0) {
            i2 = r14 + 1;
        }
        if (r14 >= i3) {
            return 0;
        }
        while (r14 < i3) {
            int i10 = r14 + 1;
            byte b7 = bArr[r14];
            if (b7 >= 0) {
                r14 = i10;
            } else if (b7 < -32) {
                if (i10 >= i3) {
                    return b7;
                }
                if (b7 >= -62) {
                    r14 = i10 + 1;
                    if (bArr[i10] > -65) {
                    }
                }
                return -1;
            } else if (b7 >= -16) {
                if (i10 >= i3 - 2) {
                    return bxzd.m124558b(bArr, i10, i3);
                }
                int i11 = i10 + 1;
                byte b8 = bArr[i10];
                if (b8 <= -65 && (((b7 << 28) + (b8 + 112)) >> 30) == 0) {
                    int i12 = i11 + 1;
                    if (bArr[i11] <= -65) {
                        r14 = i12 + 1;
                        if (bArr[i12] <= -65) {
                        }
                    }
                }
                return -1;
            } else if (i10 >= i3 - 1) {
                return bxzd.m124558b(bArr, i10, i3);
            } else {
                int i13 = i10 + 1;
                byte b9 = bArr[i10];
                if (b9 <= -65 && ((b7 != -32 || b9 >= -96) && (b7 != -19 || b9 < -96))) {
                    r14 = i13 + 1;
                    if (bArr[i13] > -65) {
                    }
                }
                return -1;
            }
        }
        return 0;
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
                byte b = bArr[r12];
                if (!bxyy.m124527a(b)) {
                    break;
                }
                i = r12 + 1;
                bxyy.m124526a(b, cArr, i3);
                i5 = i3 + 1;
            }
            while (r12 < i4) {
                int i6 = r12 + 1;
                byte b2 = bArr[r12];
                if (bxyy.m124527a(b2)) {
                    bxyy.m124526a(b2, cArr, i3);
                    r12 = i6;
                    i3++;
                    while (r12 < i4) {
                        byte b3 = bArr[r12];
                        if (!bxyy.m124527a(b3)) {
                            break;
                        }
                        r12++;
                        bxyy.m124526a(b3, cArr, i3);
                        i3++;
                    }
                } else if (!bxyy.m124528b(b2)) {
                    if (!bxyy.m124529c(b2)) {
                        if (i6 < i4 - 2) {
                            int i7 = i6 + 1;
                            int i8 = i7 + 1;
                            bxyy.m124523a(b2, bArr[i6], bArr[i7], bArr[i8], cArr, i3);
                            i3 += 2;
                            r12 = i8 + 1;
                        } else {
                            throw bxwf.m124096i();
                        }
                    } else if (i6 < i4 - 1) {
                        int i9 = i6 + 1;
                        bxyy.m124524a(b2, bArr[i6], bArr[i9], cArr, i3);
                        r12 = i9 + 1;
                        i3++;
                    } else {
                        throw bxwf.m124096i();
                    }
                } else if (i6 < i4) {
                    bxyy.m124525a(b2, bArr[i6], cArr, i3);
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

    /* renamed from: a */
    public final int mo74328a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        char charAt;
        int length = charSequence.length();
        int i5 = i2 + i;
        int i6 = 0;
        while (i6 < length && (i4 = i6 + i) < i5 && (charAt = charSequence.charAt(i6)) < 128) {
            bArr[i4] = (byte) charAt;
            i6++;
        }
        if (i6 == length) {
            return i + length;
        }
        int i7 = i + i6;
        while (i6 < length) {
            char charAt2 = charSequence.charAt(i6);
            if (charAt2 < 128 && i7 < i5) {
                bArr[i7] = (byte) charAt2;
                i7++;
            } else if (charAt2 < 2048 && i7 <= i5 - 2) {
                int i8 = i7 + 1;
                bArr[i7] = (byte) ((charAt2 >>> 6) | 960);
                i7 = i8 + 1;
                bArr[i8] = (byte) ((charAt2 & '?') | 128);
            } else if ((charAt2 < 55296 || charAt2 > 57343) && i7 <= i5 - 3) {
                int i9 = i7 + 1;
                bArr[i7] = (byte) ((charAt2 >>> 12) | 480);
                int i10 = i9 + 1;
                bArr[i9] = (byte) (((charAt2 >>> 6) & 63) | 128);
                bArr[i10] = (byte) ((charAt2 & '?') | 128);
                i7 = i10 + 1;
            } else if (i7 <= i5 - 4) {
                int i11 = i6 + 1;
                if (i11 != charSequence.length()) {
                    char charAt3 = charSequence.charAt(i11);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                        int i12 = i7 + 1;
                        bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                        int i13 = i12 + 1;
                        bArr[i12] = (byte) (((codePoint >>> 12) & 63) | 128);
                        int i14 = i13 + 1;
                        bArr[i13] = (byte) (((codePoint >>> 6) & 63) | 128);
                        i7 = i14 + 1;
                        bArr[i14] = (byte) ((codePoint & 63) | 128);
                        i6 = i11;
                    } else {
                        i6 = i11;
                    }
                }
                throw new bxzb(i6 - 1, length);
            } else if (charAt2 < 55296 || charAt2 > 57343 || ((i3 = i6 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                StringBuilder sb = new StringBuilder(37);
                sb.append("Failed writing ");
                sb.append(charAt2);
                sb.append(" at index ");
                sb.append(i7);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            } else {
                throw new bxzb(i6, length);
            }
            i6++;
        }
        return i7;
    }

    /* renamed from: a */
    public final String mo74329a(ByteBuffer byteBuffer, int i, int i2) {
        return m124532b(byteBuffer, i, i2);
    }

    /* renamed from: a */
    public final void mo74330a(CharSequence charSequence, ByteBuffer byteBuffer) {
        m124533b(charSequence, byteBuffer);
    }
}
