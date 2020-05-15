package p000;

import org.json.JSONObject;

/* renamed from: bpu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpu {
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f5, code lost:
        if (r3 == 1) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f7, code lost:
        if (r3 == 2) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f9, code lost:
        if (r3 == 3) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fb, code lost:
        if (r3 == 4) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fe, code lost:
        r0 = r11 + 1;
        r6[r11] = (byte) (r10 >> 10);
        r11 = r0 + 1;
        r6[r0] = (byte) (r10 >> 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x010d, code lost:
        r6[r11] = (byte) (r10 >> 4);
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0115, code lost:
        r2.f6387b = r3;
        r0 = r2.f6385a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x011a, code lost:
        if (r11 == r0.length) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x011c, code lost:
        r1 = new byte[r11];
        java.lang.System.arraycopy(r0, 0, r1, 0, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0122, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0123, code lost:
        return r0;
     */
    /* renamed from: a */
    public static byte[] m3478a(JSONObject jSONObject, String str) {
        byte[] bytes = jSONObject.getString(str).getBytes();
        int length = bytes.length;
        cbh cbh = new cbh(new byte[((length * 3) / 4)]);
        int i = cbh.f6387b;
        int i2 = 6;
        if (i != 6) {
            byte[] bArr = cbh.f6385a;
            int[] iArr = cbh.f6388c;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (i == 0) {
                    while (true) {
                        int i6 = i3 + 4;
                        if (i6 > length) {
                            break;
                        }
                        i4 = iArr[bytes[i3 + 3] & 255] | (iArr[bytes[i3 + 1] & 255] << 12) | (iArr[bytes[i3] & 255] << 18) | (iArr[bytes[i3 + 2] & 255] << i2);
                        if (i4 < 0) {
                            break;
                        }
                        bArr[i5 + 2] = (byte) i4;
                        bArr[i5 + 1] = (byte) (i4 >> 8);
                        bArr[i5] = (byte) (i4 >> 16);
                        i5 += 3;
                        i3 = i6;
                    }
                    if (i3 >= length) {
                        break;
                    }
                }
                int i7 = i3 + 1;
                int i8 = iArr[bytes[i3] & 255];
                if (i == 0) {
                    if (i8 < 0) {
                        if (i8 != -1) {
                            break;
                        }
                    } else {
                        i++;
                        i4 = i8;
                    }
                } else if (i == 1) {
                    if (i8 < 0) {
                        if (i8 != -1) {
                            break;
                        }
                    } else {
                        i++;
                        i4 = (i4 << 6) | i8;
                    }
                } else if (i == 2) {
                    if (i8 < 0) {
                        if (i8 != -2) {
                            if (i8 != -1) {
                                break;
                            }
                        } else {
                            bArr[i5] = (byte) (i4 >> 4);
                            i5++;
                            i = 4;
                        }
                    } else {
                        i++;
                        i4 = (i4 << 6) | i8;
                    }
                } else if (i == 3) {
                    if (i8 < 0) {
                        if (i8 != -2) {
                            if (i8 != -1) {
                                break;
                            }
                        } else {
                            bArr[i5 + 1] = (byte) (i4 >> 2);
                            bArr[i5] = (byte) (i4 >> 10);
                            i5 += 2;
                            i = 5;
                        }
                    } else {
                        int i9 = (i4 << 6) | i8;
                        bArr[i5 + 2] = (byte) i9;
                        bArr[i5 + 1] = (byte) (i9 >> 8);
                        bArr[i5] = (byte) (i9 >> 16);
                        i5 += 3;
                        i4 = i9;
                        i = 0;
                    }
                } else if (i == 4) {
                    if (i8 != -2) {
                        if (i8 != -1) {
                            break;
                        }
                    } else {
                        i++;
                    }
                } else if (i == 5 && i8 != -1) {
                    break;
                }
                i3 = i7;
                i2 = 6;
            }
            cbh.f6387b = 6;
        }
        throw new IllegalArgumentException("bad base-64");
    }
}
