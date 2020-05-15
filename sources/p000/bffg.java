package p000;

/* renamed from: bffg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bffg {

    /* renamed from: a */
    final double f113635a;

    /* renamed from: b */
    final double f113636b;

    public bffg(double d, double d2) {
        this.f113635a = d;
        this.f113636b = d2;
    }

    public final String toString() {
        double d = this.f113635a;
        double d2 = this.f113636b;
        StringBuilder sb = new StringBuilder(81);
        sb.append("ComplexNumber [real=");
        sb.append(d);
        sb.append(", imaginary=");
        sb.append(d2);
        sb.append("]");
        return sb.toString();
    }
}
