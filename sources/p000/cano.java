package p000;

/* renamed from: cano */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cano {

    /* renamed from: a */
    public final cann f175389a;

    /* renamed from: b */
    public final int[] f175390b;

    public cano(cann cann, int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            this.f175389a = cann;
            int i = 1;
            if (length <= 1 || iArr[0] != 0) {
                this.f175390b = iArr;
                return;
            }
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i != length) {
                int[] iArr2 = new int[(length - i)];
                this.f175390b = iArr2;
                System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
                return;
            }
            this.f175390b = cann.mo74695b().f175390b;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final int mo74697a() {
        return this.f175390b.length - 1;
    }

    /* renamed from: b */
    public final boolean mo74701b() {
        return this.f175390b[0] == 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(mo74697a() * 8);
        for (int a = mo74697a(); a >= 0; a--) {
            int a2 = mo74698a(a);
            if (a2 != 0) {
                if (a2 < 0) {
                    sb.append(" - ");
                    a2 = -a2;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (a == 0 || a2 != 1) {
                    cann cann = this.f175389a;
                    cann.mo74693a();
                    if (a2 != 0) {
                        int i = cann.f175383c[a2];
                        if (i == 0) {
                            sb.append('1');
                        } else if (i != 1) {
                            sb.append("a^");
                            sb.append(i);
                        } else {
                            sb.append('a');
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                if (a != 0) {
                    if (a != 1) {
                        sb.append("x^");
                        sb.append(a);
                    } else {
                        sb.append('x');
                    }
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final int mo74698a(int i) {
        int[] iArr = this.f175390b;
        return iArr[(iArr.length - 1) - i];
    }

    /* renamed from: a */
    public final cano mo74699a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f175389a.mo74695b();
        } else {
            int length = this.f175390b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f175389a.mo74694b(this.f175390b[i3], i2);
            }
            return new cano(this.f175389a, iArr);
        }
    }

    /* renamed from: a */
    public final cano mo74700a(cano cano) {
        int[] iArr;
        if (!this.f175389a.equals(cano.f175389a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo74701b()) {
            return cano;
        } else {
            if (cano.mo74701b()) {
                return this;
            }
            int[] iArr2 = this.f175390b;
            int[] iArr3 = cano.f175390b;
            int length = iArr2.length;
            int length2 = iArr3.length;
            if (length > length2) {
                iArr = iArr2;
            } else {
                iArr = iArr3;
            }
            if (length > length2) {
                iArr2 = iArr3;
            }
            int length3 = iArr.length;
            int[] iArr4 = new int[length3];
            int length4 = length3 - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length4);
            for (int i = length4; i < iArr.length; i++) {
                iArr4[i] = cann.m126830a(iArr2[i - length4], iArr[i]);
            }
            return new cano(this.f175389a, iArr4);
        }
    }
}
