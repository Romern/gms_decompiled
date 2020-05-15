package p000;

/* renamed from: bunu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bunu {

    /* renamed from: a */
    public double f154410a;

    /* renamed from: b */
    public double f154411b;

    /* renamed from: c */
    public double f154412c;

    public bunu() {
    }

    /* renamed from: a */
    public static double m120095a(bunu bunu, bunu bunu2) {
        return (bunu.f154410a * bunu2.f154410a) + (bunu.f154411b * bunu2.f154411b) + (bunu.f154412c * bunu2.f154412c);
    }

    /* renamed from: a */
    public final void mo72916a() {
        this.f154412c = 0.0d;
        this.f154411b = 0.0d;
        this.f154410a = 0.0d;
    }

    /* renamed from: a */
    public final void mo72917a(double d) {
        this.f154410a *= d;
        this.f154411b *= d;
        this.f154412c *= d;
    }

    /* renamed from: a */
    public final void mo72918a(double d, double d2, double d3) {
        this.f154410a = d;
        this.f154411b = d2;
        this.f154412c = d3;
    }

    /* renamed from: a */
    public final void mo72919a(int i, double d) {
        if (i == 0) {
            this.f154410a = d;
        } else if (i != 1) {
            this.f154412c = d;
        } else {
            this.f154411b = d;
        }
    }

    /* renamed from: b */
    public final void mo72921b() {
        double c = mo72922c();
        if (c != 0.0d) {
            mo72917a(1.0d / c);
        }
    }

    /* renamed from: c */
    public final double mo72922c() {
        double d = this.f154410a;
        double d2 = this.f154411b;
        double d3 = this.f154412c;
        return Math.sqrt((d * d) + (d2 * d2) + (d3 * d3));
    }

    public final String toString() {
        double d = this.f154410a;
        double d2 = this.f154411b;
        double d3 = this.f154412c;
        StringBuilder sb = new StringBuilder(76);
        sb.append(d);
        sb.append(", ");
        sb.append(d2);
        sb.append(", ");
        sb.append(d3);
        return sb.toString();
    }

    public bunu(double d, double d2) {
        mo72918a(0.0d, d, d2);
    }

    /* renamed from: a */
    public static void m120096a(bunu bunu, bunu bunu2, bunu bunu3) {
        double d = bunu.f154411b;
        double d2 = bunu2.f154412c;
        double d3 = bunu.f154412c;
        double d4 = bunu2.f154411b;
        double d5 = bunu2.f154410a;
        double d6 = bunu.f154410a;
        bunu3.mo72918a((d * d2) - (d3 * d4), (d3 * d5) - (d2 * d6), (d6 * d4) - (d * d5));
    }

    /* renamed from: a */
    public final void mo72920a(bunu bunu) {
        this.f154410a = bunu.f154410a;
        this.f154411b = bunu.f154411b;
        this.f154412c = bunu.f154412c;
    }
}
