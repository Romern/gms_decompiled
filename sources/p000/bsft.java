package p000;

/* renamed from: bsft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsft implements Cloneable {

    /* renamed from: a */
    public double f144500a;

    /* renamed from: b */
    public double[] f144501b = new double[3];

    /* renamed from: a */
    public final bsft clone() {
        try {
            bsft bsft = (bsft) super.clone();
            bsft.f144501b = new double[this.f144501b.length];
            bsft.mo70519a(this);
            return bsft;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final void mo70519a(bsft bsft) {
        double[] dArr;
        int length;
        this.f144500a = bsft.f144500a;
        double[] dArr2 = bsft.f144501b;
        if (dArr2 != null && (dArr = this.f144501b) != null && (length = dArr2.length) == dArr.length) {
            System.arraycopy(dArr2, 0, dArr, 0, length);
        }
    }
}
