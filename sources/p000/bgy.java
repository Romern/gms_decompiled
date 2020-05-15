package p000;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: bgy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgy {
    /* renamed from: a */
    private static byte[] m3013a(int i) {
        if (i > 0) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int log10 = (int) (Math.log10((double) i) + 1.0d);
            char[] cArr = new char[log10];
            for (int i2 = log10 - 1; i2 >= 0; i2--) {
                cArr[i2] = Character.forDigit(i % 10, 10);
                i /= 10;
            }
            for (int i3 = 0; i3 < log10; i3++) {
                byteArrayOutputStream.write(cArr[i3]);
            }
            return byteArrayOutputStream.toByteArray();
        }
        return new byte[]{48};
    }

    /* renamed from: b */
    private static int m3016b(byte[] bArr) {
        int i = 0;
        for (byte b : bArr) {
            i = (i * 10) + Character.digit(b, 10);
        }
        return i;
    }

    /* renamed from: c */
    private static byte[] m3017c(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int length = bArr.length;
        byte[] a = m3013a(length);
        int length2 = a.length;
        byte[] a2 = m3013a(length2);
        byteArrayOutputStream.write(a2, 0, a2.length);
        byteArrayOutputStream.write(a, 0, length2);
        byteArrayOutputStream.write(bArr, 0, length);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    public static byte[] m3014a(byte[][] bArr) {
        char c;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int length = bArr.length;
        byte[] c2 = m3017c(m3013a(length));
        byteArrayOutputStream.write(c2, 0, c2.length);
        for (byte[] bArr2 : bArr) {
            if (bArr2 == null || bArr2.length == 0 || (c = (char) bArr2[0]) == '0') {
                byte[] a = m3013a(110);
                byteArrayOutputStream.write(a, 0, a.length);
            } else if (c == '1' || c == '2') {
                byte[] c3 = m3017c(bArr2);
                byteArrayOutputStream.write(c3, 0, c3.length);
            } else {
                throw new IllegalArgumentException("Not correct format");
            }
        }
        byte[] a2 = m3013a(10);
        byteArrayOutputStream.write(a2, 0, a2.length);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    public static byte[][] m3015a(byte[] bArr) {
        int i;
        byte[] bArr2;
        int length = bArr.length;
        char[] cArr = new char[length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            cArr[i3] = (char) bArr[i2];
            i2++;
            i3++;
        }
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (i4 < length) {
            if (Character.isDigit(cArr[i4])) {
                int numericValue = Character.getNumericValue(cArr[i4]);
                if (length >= numericValue) {
                    i = 0;
                    for (int i5 = 0; i5 < numericValue; i5++) {
                        i4++;
                        i = (i * 10) + Character.digit(cArr[i4], 10);
                    }
                } else {
                    i = 0;
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (length >= i) {
                    for (int i6 = 0; i6 < i; i6++) {
                        i4++;
                        byteArrayOutputStream.write(cArr[i4]);
                    }
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (arrayList.size() > 0) {
                    if (m3016b((byte[]) arrayList.get(0)) < arrayList.size()) {
                        continue;
                    } else {
                        if (byteArray[0] != 50) {
                            bArr2 = Arrays.copyOfRange(byteArray, 1, byteArray.length);
                        } else if (byteArray != null) {
                            bArr2 = new byte[(byteArray.length >> 1)];
                            for (int i7 = 1; i7 < byteArray.length; i7 += 2) {
                                StringBuilder sb = new StringBuilder(2);
                                sb.append((char) byteArray[i7]);
                                sb.append((char) byteArray[i7 + 1]);
                                bArr2[i7 / 2] = (byte) Integer.parseInt(sb.toString(), 16);
                            }
                        } else {
                            String valueOf = String.valueOf((Object) null);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 21);
                            sb2.append("Empty Or Null Input: ");
                            sb2.append(valueOf);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                        arrayList.add(bArr2);
                    }
                } else if (arrayList.size() == 0) {
                    arrayList.add(byteArray);
                }
            }
            i4++;
        }
        if (m3016b((byte[]) arrayList.remove(0)) == arrayList.size()) {
            return (byte[][]) arrayList.toArray(new byte[arrayList.size()][]);
        }
        return null;
    }
}
