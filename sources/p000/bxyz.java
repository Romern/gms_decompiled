package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.nio.ByteBuffer;

/* renamed from: bxyz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bxyz {
    /* renamed from: b */
    static final String m124532b(ByteBuffer byteBuffer, int i, int i2) {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (r11 < i3) {
                byte b = byteBuffer.get(r11);
                if (!bxyy.m124527a(b)) {
                    break;
                }
                i = r11 + 1;
                bxyy.m124526a(b, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (r11 < i3) {
                int i6 = r11 + 1;
                byte b2 = byteBuffer.get(r11);
                if (bxyy.m124527a(b2)) {
                    bxyy.m124526a(b2, cArr, i5);
                    r11 = i6;
                    i5++;
                    while (r11 < i3) {
                        byte b3 = byteBuffer.get(r11);
                        if (!bxyy.m124527a(b3)) {
                            break;
                        }
                        r11++;
                        bxyy.m124526a(b3, cArr, i5);
                        i5++;
                    }
                } else if (!bxyy.m124528b(b2)) {
                    if (!bxyy.m124529c(b2)) {
                        if (i6 < i3 - 2) {
                            int i7 = i6 + 1;
                            int i8 = i7 + 1;
                            bxyy.m124523a(b2, byteBuffer.get(i6), byteBuffer.get(i7), byteBuffer.get(i8), cArr, i5);
                            i5 += 2;
                            r11 = i8 + 1;
                        } else {
                            throw bxwf.m124096i();
                        }
                    } else if (i6 < i3 - 1) {
                        int i9 = i6 + 1;
                        bxyy.m124524a(b2, byteBuffer.get(i6), byteBuffer.get(i9), cArr, i5);
                        r11 = i9 + 1;
                        i5++;
                    } else {
                        throw bxwf.m124096i();
                    }
                } else if (i6 < i3) {
                    bxyy.m124525a(b2, byteBuffer.get(i6), cArr, i5);
                    r11 = i6 + 1;
                    i5++;
                } else {
                    throw bxwf.m124096i();
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    /* renamed from: a */
    public abstract int mo74327a(int i, byte[] bArr, int i2, int i3);

    /* renamed from: a */
    public abstract int mo74328a(CharSequence charSequence, byte[] bArr, int i, int i2);

    /* renamed from: a */
    public abstract String mo74329a(ByteBuffer byteBuffer, int i, int i2);

    /* renamed from: a */
    public abstract void mo74330a(CharSequence charSequence, ByteBuffer byteBuffer);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo74331a(byte[] bArr, int i, int i2) {
        return mo74327a(0, bArr, i, i2) == 0;
    }

    /* renamed from: b */
    public abstract String mo74332b(byte[] bArr, int i, int i2);

    /* renamed from: b */
    static final void m124533b(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int length = charSequence.length();
        int position = byteBuffer.position();
        int i2 = 0;
        while (i2 < length) {
            try {
                char charAt = charSequence.charAt(i2);
                if (charAt >= 128) {
                    break;
                }
                byteBuffer.put(position + i2, (byte) charAt);
                i2++;
            } catch (IndexOutOfBoundsException e) {
                int position2 = byteBuffer.position();
                int max = Math.max(i2, (position - byteBuffer.position()) + 1);
                char charAt2 = charSequence.charAt(i2);
                StringBuilder sb = new StringBuilder(37);
                sb.append("Failed writing ");
                sb.append(charAt2);
                sb.append(" at index ");
                sb.append(position2 + max);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
        }
        if (i2 != length) {
            position += i2;
            while (i2 < length) {
                try {
                    char charAt3 = charSequence.charAt(i2);
                    if (charAt3 < 128) {
                        byteBuffer.put(position, (byte) charAt3);
                    } else if (charAt3 < 2048) {
                        i = position + 1;
                        try {
                            byteBuffer.put(position, (byte) ((charAt3 >>> 6) | AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC));
                            byteBuffer.put(i, (byte) ((charAt3 & '?') | 128));
                            position = i;
                        } catch (IndexOutOfBoundsException e2) {
                            position = i;
                            int position22 = byteBuffer.position();
                            int max2 = Math.max(i2, (position - byteBuffer.position()) + 1);
                            char charAt22 = charSequence.charAt(i2);
                            StringBuilder sb2 = new StringBuilder(37);
                            sb2.append("Failed writing ");
                            sb2.append(charAt22);
                            sb2.append(" at index ");
                            sb2.append(position22 + max2);
                            throw new ArrayIndexOutOfBoundsException(sb2.toString());
                        }
                    } else if (charAt3 >= 55296 && charAt3 <= 57343) {
                        int i3 = i2 + 1;
                        if (i3 != length) {
                            try {
                                char charAt4 = charSequence.charAt(i3);
                                if (Character.isSurrogatePair(charAt3, charAt4)) {
                                    int codePoint = Character.toCodePoint(charAt3, charAt4);
                                    int i4 = position + 1;
                                    try {
                                        byteBuffer.put(position, (byte) ((codePoint >>> 18) | 240));
                                        position = i4 + 1;
                                        byteBuffer.put(i4, (byte) (((codePoint >>> 12) & 63) | 128));
                                        i4 = position + 1;
                                        byteBuffer.put(position, (byte) (((codePoint >>> 6) & 63) | 128));
                                        byteBuffer.put(i4, (byte) ((codePoint & 63) | 128));
                                        position = i4;
                                        i2 = i3;
                                    } catch (IndexOutOfBoundsException e3) {
                                        position = i4;
                                        i2 = i3;
                                        int position222 = byteBuffer.position();
                                        int max22 = Math.max(i2, (position - byteBuffer.position()) + 1);
                                        char charAt222 = charSequence.charAt(i2);
                                        StringBuilder sb22 = new StringBuilder(37);
                                        sb22.append("Failed writing ");
                                        sb22.append(charAt222);
                                        sb22.append(" at index ");
                                        sb22.append(position222 + max22);
                                        throw new ArrayIndexOutOfBoundsException(sb22.toString());
                                    }
                                } else {
                                    i2 = i3;
                                }
                            } catch (IndexOutOfBoundsException e4) {
                                i2 = i3;
                                int position2222 = byteBuffer.position();
                                int max222 = Math.max(i2, (position - byteBuffer.position()) + 1);
                                char charAt2222 = charSequence.charAt(i2);
                                StringBuilder sb222 = new StringBuilder(37);
                                sb222.append("Failed writing ");
                                sb222.append(charAt2222);
                                sb222.append(" at index ");
                                sb222.append(position2222 + max222);
                                throw new ArrayIndexOutOfBoundsException(sb222.toString());
                            }
                        }
                        throw new bxzb(i2, length);
                    } else {
                        i = position + 1;
                        byteBuffer.put(position, (byte) ((charAt3 >>> 12) | AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD));
                        position = i + 1;
                        byteBuffer.put(i, (byte) (((charAt3 >>> 6) & 63) | 128));
                        byteBuffer.put(position, (byte) ((charAt3 & '?') | 128));
                    }
                    i2++;
                    position++;
                } catch (IndexOutOfBoundsException e5) {
                    int position22222 = byteBuffer.position();
                    int max2222 = Math.max(i2, (position - byteBuffer.position()) + 1);
                    char charAt22222 = charSequence.charAt(i2);
                    StringBuilder sb2222 = new StringBuilder(37);
                    sb2222.append("Failed writing ");
                    sb2222.append(charAt22222);
                    sb2222.append(" at index ");
                    sb2222.append(position22222 + max2222);
                    throw new ArrayIndexOutOfBoundsException(sb2222.toString());
                }
            }
            byteBuffer.position(position);
            return;
        }
        byteBuffer.position(position + i2);
    }
}
