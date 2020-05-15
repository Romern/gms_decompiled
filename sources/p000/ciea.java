package p000;

/* renamed from: ciea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ciea extends chwq {

    /* renamed from: a */
    int f189940a;

    /* renamed from: b */
    final int f189941b;

    /* renamed from: c */
    final byte[] f189942c;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      bmxy.a(java.lang.Object, java.lang.Object):java.lang.Object
      bmxy.a(int, int):void
      bmxy.a(boolean, java.lang.Object):void */
    public ciea(byte[] bArr, int i, int i2) {
        boolean z;
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "offset must be >= 0");
        bmxy.m108589a(true, (Object) "length must be >= 0");
        int i3 = i2 + i;
        bmxy.m108589a(i3 <= bArr.length ? true : z2, "offset + length exceeds array boundary");
        this.f189942c = (byte[]) bmxy.m108582a(bArr, "bytes");
        this.f189940a = i;
        this.f189941b = i3;
    }

    /* renamed from: a */
    public final int mo85807a() {
        return this.f189941b - this.f189940a;
    }

    /* renamed from: b */
    public final int mo85810b() {
        mo85770a(1);
        byte[] bArr = this.f189942c;
        int i = this.f189940a;
        this.f189940a = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: a */
    public final void mo85809a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f189942c, this.f189940a, bArr, i, i2);
        this.f189940a += i2;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ cidy mo85812c(int i) {
        mo85770a(i);
        int i2 = this.f189940a;
        this.f189940a = i2 + i;
        return new ciea(this.f189942c, i2, i);
    }
}
