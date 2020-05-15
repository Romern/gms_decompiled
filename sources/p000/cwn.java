package p000;

/* renamed from: cwn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cwn {

    /* renamed from: a */
    private final byte[] f12265a;

    public cwn(int i) {
        this.f12265a = new byte[i];
    }

    /* renamed from: a */
    public final void mo8363a(int i, byte b) {
        int i2 = i - 1;
        byte[] bArr = this.f12265a;
        if (bArr.length > i2) {
            bArr[i2] = (byte) (b | bArr[i2]);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cwn.a(int, int, boolean):void
     arg types: [int, int, int]
     candidates:
      cwn.a(byte[], int, boolean):void
      cwn.a(int, int, boolean):void */
    /* renamed from: a */
    public final void mo8364a(int i, int i2) {
        mo8365a(i, i2, true);
    }

    public cwn(byte[] bArr) {
        this.f12265a = cvz.m7734i(bArr);
    }

    /* renamed from: a */
    public final void mo8365a(int i, int i2, boolean z) {
        int i3 = i - 1;
        byte[] bArr = this.f12265a;
        bArr[i3] = cvz.m7699a(bArr[i3], i2, z);
    }

    /* renamed from: a */
    public final void mo8366a(cwl cwl, boolean z) {
        byte[] bArr = this.f12265a;
        if (bArr.length > 0) {
            bArr[0] = cvz.m7699a(bArr[0], cwl.mo8360b(), z);
        }
    }

    /* renamed from: a */
    public final void mo8367a(byte[] bArr, int i, boolean z) {
        boolean z2;
        if (z) {
            if (this.f12265a.length >= bArr.length + i) {
                z2 = true;
            } else {
                z2 = false;
            }
            cvx.m7697a(z2, "flag must be big enough to contain the mask from the starting byte to the end of the mask");
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            mo8363a(i2 + i + 1, bArr[i2]);
        }
    }

    /* renamed from: a */
    public final byte[] mo8368a() {
        return cvz.m7734i(this.f12265a);
    }
}
