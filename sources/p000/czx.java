package p000;

/* renamed from: czx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class czx {

    /* renamed from: a */
    private final byte[] f12470a;

    public czx() {
        this.f12470a = new byte[8];
    }

    /* renamed from: a */
    public final void mo8464a(int i, byte b) {
        int i2 = i - 1;
        byte[] bArr = this.f12470a;
        if (bArr.length > i2) {
            bArr[i2] = (byte) (b | bArr[i2]);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: czx.a(int, int, boolean):void
     arg types: [int, int, int]
     candidates:
      czx.a(byte[], int, boolean):void
      czx.a(int, int, boolean):void */
    /* renamed from: a */
    public final void mo8465a(int i, int i2) {
        mo8466a(i, i2, true);
    }

    public czx(byte[] bArr) {
        this.f12470a = czm.m8027d(bArr);
    }

    /* renamed from: a */
    public final void mo8466a(int i, int i2, boolean z) {
        int i3 = i - 1;
        byte[] bArr = this.f12470a;
        bArr[i3] = czm.m8005a(bArr[i3], i2, z);
    }

    /* renamed from: a */
    public final void mo8467a(byte[] bArr, int i, boolean z) {
        boolean z2;
        if (z) {
            if (this.f12470a.length >= bArr.length + i) {
                z2 = true;
            } else {
                z2 = false;
            }
            czl.m8003a(z2, "flag must be big enough to contain the mask from the starting byte to the end of the mask");
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            mo8464a(i2 + i + 1, bArr[i2]);
        }
    }

    /* renamed from: a */
    public final byte[] mo8468a() {
        return czm.m8027d(this.f12470a);
    }
}
