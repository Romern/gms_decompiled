package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: caom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caom {

    /* renamed from: a */
    public final List f175464a = new ArrayList();

    /* JADX WARN: Type inference failed for: r5v2, assign insn: 0x0059: CONST  (r5v2 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r5v3, types: [int], assign insn: PHI: (r5v3 ?) = (r5v2 ?), (r5v4 int) binds: [B:26:0x0059, B:28:0x005d] */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0089, code lost:
        throw new java.lang.IllegalArgumentException("Invalid offset or data");
     */
    /* JADX WARNING: Multi-variable type inference failed */
    private caom(byte[] bArr) {
        int i;
        int length;
        byte b;
        if (bArr != null) {
            int i2 = 0;
            while (true) {
                int length2 = bArr.length;
                if (i2 >= length2) {
                    return;
                }
                if (i2 >= 0 && i2 < length2) {
                    if (i2 < length2) {
                        if ((bArr[i2] & 31) == 31) {
                            i = 1;
                            for (int i3 = 1; i3 < bArr.length; i3++) {
                                i++;
                                if ((bArr[i2 + i3] & 128) != 128) {
                                    break;
                                }
                            }
                        } else {
                            i = 1;
                        }
                        byte[] bArr2 = new byte[i];
                        System.arraycopy(bArr, i2, bArr2, 0, i);
                        String b2 = catg.m127164b(bArr2);
                        int i4 = i2 + i;
                        int a = m126876a(bArr, i4);
                        if (i4 >= 0 && i4 < (length = bArr.length)) {
                            int a2 = m126876a(bArr, i4);
                            if (length >= i4 + a2) {
                                if (a2 == 1) {
                                    b = bArr[i4];
                                } else {
                                    int i5 = 0;
                                    for (int i6 = 1; i6 < a2; i6++) {
                                        i5 += (bArr[i6 + i4] & 255) << (((a2 - i6) - 1) * 8);
                                    }
                                    b = i5;
                                }
                                i2 += i + a;
                                this.f175464a.add(new caol(b2, b));
                            } else {
                                throw new IllegalArgumentException("Invalid length");
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("Invalid offset or data");
                    }
                }
            }
            String valueOf = String.valueOf(catg.m127164b(bArr));
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Invalid TLV: ") : "Invalid TLV: ".concat(valueOf));
        }
    }

    /* renamed from: a */
    private static int m126876a(byte[] bArr, int i) {
        if (i < 0 || i >= bArr.length) {
            throw new IllegalArgumentException("Invalid offset or data");
        }
        byte b = bArr[i];
        return ((b & 128) == 128 ? b & Byte.MAX_VALUE : 0) + 1;
    }

    /* renamed from: b */
    public final byte[] mo74728b() {
        List list = this.f175464a;
        int size = list.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= size) {
                break;
            }
            caol caol = (caol) list.get(i);
            int length = caol.f175462a.length() / 2;
            if (caol.f175463b >= 127) {
                i3 = 2;
            }
            i2 += length + i3;
            i++;
        }
        byte[] bArr = new byte[i2];
        List list2 = this.f175464a;
        int size2 = list2.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size2; i5++) {
            caol caol2 = (caol) list2.get(i5);
            byte[] a = catg.m127160a(caol2.f175462a);
            int length2 = a.length;
            System.arraycopy(a, 0, bArr, i4, length2);
            int i6 = i4 + length2;
            int i7 = caol2.f175463b;
            if (i7 < 127) {
                bArr[i6] = (byte) i7;
            } else {
                bArr[i6] = -127;
                i6++;
                bArr[i6] = (byte) i7;
            }
            i4 = i6 + 1;
        }
        return bArr;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        List list = this.f175464a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            caol caol = (caol) list.get(i);
            sb.append(caol.f175462a);
            sb.append(", ");
            sb.append(caol.f175463b);
            sb.append("\n");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static caom m126877a(byte[] bArr) {
        return new caom(bArr);
    }

    /* renamed from: a */
    public final int mo74726a() {
        List list = this.f175464a;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((caol) list.get(i2)).f175463b;
        }
        return i;
    }

    /* renamed from: a */
    public final void mo74727a(String str, int i) {
        List list = this.f175464a;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            if (!((caol) list.get(i2)).f175462a.equalsIgnoreCase(str)) {
                i2 = i3;
            } else {
                return;
            }
        }
        this.f175464a.add(new caol(str, i));
    }
}
