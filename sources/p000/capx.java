package p000;

/* renamed from: capx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class capx {

    /* renamed from: a */
    public final byte[] f175521a;

    private capx(byte[] bArr) {
        byte[] bArr2 = new byte[6];
        this.f175521a = bArr2;
        System.arraycopy(bArr, 3, bArr2, 1, 1);
        byte[] bArr3 = this.f175521a;
        bArr3[1] = (byte) (bArr3[1] & 3);
    }

    /* renamed from: a */
    public static capx m126928a(byte[] bArr) {
        if (bArr != null) {
            return new capx(bArr);
        }
        throw new capl("Invalid Issuer Application Data");
    }

    /* renamed from: b */
    public final void mo74738b() {
        byte[] bArr = this.f175521a;
        bArr[3] = (byte) (bArr[3] | 32);
    }

    /* renamed from: c */
    public final void mo74740c() {
        byte[] bArr = this.f175521a;
        bArr[3] = (byte) (bArr[3] | 2);
    }

    /* renamed from: d */
    public final void mo74742d() {
        byte[] bArr = this.f175521a;
        bArr[3] = (byte) (bArr[3] | 4);
    }

    /* renamed from: e */
    public final void mo74743e() {
        byte[] bArr = this.f175521a;
        bArr[0] = (byte) (bArr[0] | Byte.MIN_VALUE);
    }

    /* renamed from: f */
    public final void mo74744f() {
        byte[] bArr = this.f175521a;
        bArr[1] = (byte) (bArr[1] | 64);
    }

    /* renamed from: g */
    public final void mo74745g() {
        byte[] bArr = this.f175521a;
        bArr[5] = (byte) (bArr[5] | 2);
    }

    /* renamed from: h */
    public final void mo74746h() {
        byte[] bArr = this.f175521a;
        bArr[5] = (byte) (bArr[5] | 1);
    }

    /* renamed from: i */
    public final void mo74747i() {
        byte[] bArr = this.f175521a;
        bArr[5] = (byte) (bArr[5] | 8);
    }

    /* renamed from: j */
    public final void mo74748j() {
        byte[] bArr = this.f175521a;
        bArr[0] = (byte) (bArr[0] | -96);
    }

    /* renamed from: k */
    public final void mo74749k() {
        byte[] bArr = this.f175521a;
        bArr[3] = (byte) (bArr[3] & 254);
        bArr[5] = (byte) (bArr[5] & 247);
    }

    /* renamed from: b */
    public final boolean mo74739b(byte[] bArr) {
        if (bArr == null || bArr.length != 3) {
            throw new capl("CIAC decline");
        }
        for (int i = 0; i < bArr.length; i++) {
            if ((this.f175521a[i + 3] & bArr[i]) != 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final void mo74741c(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = this.f175521a;
            if (i < bArr2.length) {
                bArr2[i] = (byte) (bArr2[i] & bArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo74737a() {
        byte[] bArr = this.f175521a;
        bArr[0] = (byte) (bArr[0] | 5);
    }
}
