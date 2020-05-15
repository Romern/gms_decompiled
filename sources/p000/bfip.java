package p000;

/* renamed from: bfip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfip {

    /* renamed from: a */
    public final String[] f114024a = new String[20];

    /* renamed from: b */
    public final boolean[] f114025b = new boolean[20];

    /* renamed from: c */
    public final double[] f114026c = new double[20];

    /* renamed from: d */
    public final double[] f114027d = new double[20];

    /* renamed from: e */
    private int f114028e = 0;

    public bfip() {
        for (int i = 0; i < 20; i++) {
            this.f114025b[i] = false;
        }
    }

    /* renamed from: a */
    public final void mo61736a(bfmn bfmn, bgjm bgjm) {
        String a = bfmn.mo61934a();
        String[] strArr = this.f114024a;
        int i = this.f114028e;
        strArr[i] = a;
        this.f114026c[i] = bgjm.mo62896b();
        this.f114027d[this.f114028e] = bgjm.mo62897c();
        boolean[] zArr = this.f114025b;
        int i2 = this.f114028e;
        zArr[i2] = true;
        this.f114028e = (i2 + 1) % 20;
    }
}
