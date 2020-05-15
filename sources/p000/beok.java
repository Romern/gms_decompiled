package p000;

import java.util.Arrays;

/* renamed from: beok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class beok implements beod {

    /* renamed from: a */
    double[] f111933a = new double[5];

    /* renamed from: b */
    int f111934b = 0;

    /* renamed from: a */
    public final brzl mo60845a() {
        bxvd da = brzj.f143745b.mo74144da();
        for (int i = 0; i < this.f111934b; i++) {
            bxvd da2 = brzi.f143740d.mo74144da();
            double d = this.f111933a[i];
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            brzi brzi = (brzi) da2.f164949b;
            int i2 = brzi.f143742a | 1;
            brzi.f143742a = i2;
            brzi.f143743b = d;
            brzi.f143742a = i2 | 2;
            brzi.f143744c = 1;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            brzj brzj = (brzj) da.f164949b;
            brzi brzi2 = (brzi) da2.mo74062i();
            brzi2.getClass();
            if (!brzj.f143747a.mo73666a()) {
                brzj.f143747a = bxvk.m124021a(brzj.f143747a);
            }
            brzj.f143747a.add(brzi2);
        }
        bxvd da3 = brzl.f143752c.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        brzl brzl = (brzl) da3.f164949b;
        brzj brzj2 = (brzj) da.mo74062i();
        brzj2.getClass();
        brzl.f143755b = brzj2;
        brzl.f143754a = 3;
        return (brzl) da3.mo74062i();
    }

    public final String toString() {
        return ", count = " + this.f111934b + ", value =" + Arrays.toString(this.f111933a);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo60846a(Object obj) {
        Double d = (Double) obj;
        int i = this.f111934b + 1;
        double[] dArr = this.f111933a;
        int length = dArr.length;
        if (i - length > 0) {
            int i2 = length + (length >> 1);
            if (i2 - i < 0) {
                i2 = i;
            }
            if (-2147483639 + i2 > 0) {
                if (i >= 0) {
                    i2 = i <= 2147483639 ? 2147483639 : Integer.MAX_VALUE;
                } else {
                    throw new OutOfMemoryError();
                }
            }
            this.f111933a = Arrays.copyOf(dArr, i2);
        }
        this.f111933a[this.f111934b] = d.doubleValue();
        this.f111934b++;
    }
}
