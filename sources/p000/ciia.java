package p000;

/* renamed from: ciia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciia {

    /* renamed from: a */
    public int f190393a;

    /* renamed from: b */
    public final int[] f190394b = new int[10];

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo86130a() {
        if ((this.f190393a & 2) != 0) {
            return this.f190394b[1];
        }
        return -1;
    }

    /* renamed from: a */
    public final boolean mo86132a(int i) {
        return ((1 << i) & this.f190393a) != 0;
    }

    /* renamed from: b */
    public final int mo86133b(int i) {
        return this.f190394b[i];
    }

    /* renamed from: a */
    public final void mo86131a(int i, int i2) {
        int[] iArr = this.f190394b;
        if (i < iArr.length) {
            this.f190393a |= 1 << i;
            iArr[i] = i2;
        }
    }
}
