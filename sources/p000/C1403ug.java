package p000;

/* renamed from: ug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1403ug {

    /* renamed from: a */
    public final int[] f27246a;

    /* renamed from: b */
    private final int f27247b;

    public C1403ug(int i) {
        int[] iArr = new int[i];
        this.f27246a = iArr;
        this.f27247b = iArr.length >> 1;
    }

    /* renamed from: a */
    public final int mo16081a(int i) {
        return this.f27246a[i + this.f27247b];
    }

    /* renamed from: a */
    public final void mo16082a(int i, int i2) {
        this.f27246a[i + this.f27247b] = i2;
    }
}
