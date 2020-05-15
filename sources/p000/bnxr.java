package p000;

/* renamed from: bnxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnxr {

    /* renamed from: a */
    public boolean f132351a = false;

    /* renamed from: b */
    public bnwk f132352b;

    /* renamed from: c */
    public bnvt f132353c;

    /* renamed from: d */
    public final int[] f132354d;

    /* renamed from: e */
    public int f132355e;

    /* renamed from: f */
    public final bnyj[] f132356f;

    /* renamed from: g */
    private bnwk f132357g;

    /* renamed from: h */
    private bnwk f132358h;

    /* renamed from: i */
    private bnvv f132359i;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnxi.a(int, double, double):bnwk
     arg types: [int, int, int]
     candidates:
      bnxi.a(int, bnwk, bnvl):void
      bnxi.a(int, long, long):bnwk
      bnxi.a(int, double, double):bnwk */
    public bnxr(int i) {
        this.f132356f = new bnyj[i];
        this.f132354d = new int[i];
        long d = bnvt.m110572d(0);
        this.f132353c = new bnvt((d - Long.lowestOneBit(d)) + bnvt.m110571c(30));
        this.f132352b = bnvr.f132241d;
        mo68695a(bnwk.m110665b(bnxi.m110725a(0, -1.0d, -1.0d)));
    }

    /* renamed from: a */
    public final void mo68693a(int i) {
        int[] iArr;
        int i2;
        int i3 = this.f132355e;
        int i4 = 0;
        if (i3 != 0) {
            int[] iArr2 = this.f132354d;
            if (iArr2[0] == i) {
                int i5 = i3 - 1;
                this.f132355e = i5;
                if (i3 > 1) {
                    System.arraycopy(iArr2, 1, iArr2, 0, i5);
                    return;
                }
                return;
            }
            do {
                iArr = this.f132354d;
                int i6 = iArr[i4];
                if (i6 < i) {
                    i4++;
                    i2 = this.f132355e;
                } else if (i6 != i) {
                    System.arraycopy(iArr, i4, iArr, i4 + 1, this.f132355e - i4);
                    this.f132354d[i4] = i;
                    this.f132355e++;
                    return;
                } else {
                    int i7 = this.f132355e - 1;
                    this.f132355e = i7;
                    System.arraycopy(iArr, i4 + 1, iArr, i4, i7 - i4);
                    return;
                }
            } while (i4 != i2);
            this.f132355e = i2 + 1;
            iArr[i2] = i;
            return;
        }
        this.f132354d[0] = i;
        this.f132355e = 1;
    }

    /* renamed from: a */
    public final void mo68694a(int i, bnwk bnwk, bnwk bnwk2) {
        if (bnwk != this.f132358h) {
            this.f132359i.mo68602a(bnwk);
        }
        if (this.f132359i.mo68604c(bnwk2)) {
            mo68693a(i);
        }
        this.f132358h = bnwk2;
    }

    /* renamed from: a */
    public final void mo68695a(bnwk bnwk) {
        this.f132357g = this.f132352b;
        this.f132352b = bnwk;
        this.f132359i = new bnvv(this.f132357g, this.f132352b);
        this.f132358h = null;
    }
}
