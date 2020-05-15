package p000;

/* renamed from: bsfv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsfv {

    /* renamed from: a */
    public final double[] f144503a;

    /* renamed from: b */
    public bsfu[] f144504b;

    /* renamed from: c */
    public bsfu[] f144505c;

    /* renamed from: d */
    public final int[] f144506d;

    /* renamed from: e */
    public final bsfx f144507e;

    public bsfv(bsfx bsfx, int i) {
        bxbm.m122539a(bsfx);
        this.f144507e = bsfx;
        int i2 = 0;
        i = i < 0 ? 0 : i;
        double[] dArr = new double[i];
        this.f144503a = dArr;
        this.f144504b = new bsfu[i];
        this.f144505c = new bsfu[i];
        this.f144506d = new int[i];
        bsfw.m115714c(dArr);
        while (true) {
            bsfu[] bsfuArr = this.f144504b;
            if (i2 < bsfuArr.length) {
                bsfuArr[i2] = new bsfu();
                this.f144505c[i2] = new bsfu();
                this.f144506d[i2] = i2;
                i2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final double mo70522a(int i) {
        double[] dArr = this.f144503a;
        if (i < dArr.length && i >= 0) {
            return dArr[i];
        }
        return 0.0d;
    }
}
