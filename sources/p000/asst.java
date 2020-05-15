package p000;

/* renamed from: asst */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asst {

    /* renamed from: a */
    public final byte[] f89617a;

    /* renamed from: b */
    public int f89618b;

    public asst(byte[] bArr, int i) {
        this.f89617a = bArr;
        this.f89618b = i;
    }

    /* renamed from: a */
    public static asst m74710a(byte[] bArr, int i) {
        return new asst(bArr, i);
    }

    /* renamed from: b */
    public final int mo49445b() {
        byte[] bArr = this.f89617a;
        int i = this.f89618b;
        this.f89618b = i + 1;
        int a = bqcw.m112606a(bArr[i]);
        if ((a & 128) == 0) {
            return a;
        }
        int i2 = a & -129;
        if (i2 == 0) {
            throw new assw(a);
        } else if (i2 == 1) {
            byte[] bArr2 = this.f89617a;
            int i3 = this.f89618b;
            this.f89618b = i3 + 1;
            return bqcw.m112606a(bArr2[i3]);
        } else if (i2 == 2) {
            byte[] bArr3 = this.f89617a;
            int i4 = this.f89618b;
            int i5 = i4 + 1;
            this.f89618b = i5;
            byte b = bArr3[i4];
            this.f89618b = i5 + 1;
            return bqcw.m112606a(bArr3[i5]) | (bqcw.m112606a(b) << 8);
        } else if (i2 == 3) {
            byte[] bArr4 = this.f89617a;
            int i6 = this.f89618b;
            int i7 = i6 + 1;
            this.f89618b = i7;
            byte b2 = bArr4[i6];
            int i8 = i7 + 1;
            this.f89618b = i8;
            byte b3 = bArr4[i7];
            this.f89618b = i8 + 1;
            return bqcw.m112606a(bArr4[i8]) | (bqcw.m112606a(b2) << 16) | (bqcw.m112606a(b3) << 8);
        } else {
            throw new assw(a);
        }
    }

    /* renamed from: a */
    public final int mo49444a() {
        byte[] bArr = this.f89617a;
        int i = this.f89618b;
        this.f89618b = i + 1;
        int a = bqcw.m112606a(bArr[i]);
        if ((a & 31) != 31) {
            return a;
        }
        byte[] bArr2 = this.f89617a;
        int i2 = this.f89618b;
        this.f89618b = i2 + 1;
        int a2 = bqcw.m112606a(bArr2[i2]);
        if ((a2 & 128) == 0) {
            return (a << 8) | a2;
        }
        throw new assx((a << 8) | a2);
    }
}
