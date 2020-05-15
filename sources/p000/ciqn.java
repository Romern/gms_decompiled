package p000;

/* renamed from: ciqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciqn {

    /* renamed from: a */
    public final byte[] f191250a;

    /* renamed from: b */
    public int f191251b;

    /* renamed from: c */
    public int f191252c;

    /* renamed from: d */
    boolean f191253d;

    /* renamed from: e */
    final boolean f191254e;

    /* renamed from: f */
    public ciqn f191255f;

    /* renamed from: g */
    public ciqn f191256g;

    public ciqn() {
        this.f191250a = new byte[8192];
        this.f191254e = true;
        this.f191253d = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ciqn mo86383a() {
        this.f191253d = true;
        return new ciqn(this.f191250a, this.f191251b, this.f191252c);
    }

    /* renamed from: a */
    public final void mo86384a(ciqn ciqn) {
        ciqn.f191256g = this;
        ciqn.f191255f = this.f191255f;
        this.f191255f.f191256g = ciqn;
        this.f191255f = ciqn;
    }

    /* renamed from: b */
    public final ciqn mo86386b() {
        ciqn ciqn = this.f191255f;
        ciqn ciqn2 = ciqn != this ? ciqn : null;
        ciqn ciqn3 = this.f191256g;
        ciqn3.f191255f = ciqn;
        this.f191255f.f191256g = ciqn3;
        this.f191255f = null;
        this.f191256g = null;
        return ciqn2;
    }

    public ciqn(byte[] bArr, int i, int i2) {
        this.f191250a = bArr;
        this.f191251b = i;
        this.f191252c = i2;
        this.f191253d = true;
        this.f191254e = false;
    }

    /* renamed from: a */
    public final void mo86385a(ciqn ciqn, int i) {
        if (ciqn.f191254e) {
            int i2 = ciqn.f191252c;
            int i3 = i2 + i;
            if (i3 > 8192) {
                if (!ciqn.f191253d) {
                    int i4 = ciqn.f191251b;
                    if (i3 - i4 <= 8192) {
                        byte[] bArr = ciqn.f191250a;
                        System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
                        i2 = ciqn.f191252c - ciqn.f191251b;
                        ciqn.f191252c = i2;
                        ciqn.f191251b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f191250a, this.f191251b, ciqn.f191250a, i2, i);
            ciqn.f191252c += i;
            this.f191251b += i;
            return;
        }
        throw new IllegalArgumentException();
    }
}
