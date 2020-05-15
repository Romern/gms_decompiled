package p000;

/* renamed from: alaz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alaz {

    /* renamed from: a */
    public float f73239a;

    /* renamed from: b */
    public float f73240b;

    /* renamed from: c */
    public float f73241c;

    static {
        new alaz(0.0f, 0.0f, 0.0f);
    }

    public alaz() {
    }

    /* renamed from: a */
    public final void mo40067a() {
        float f = this.f73239a;
        float f2 = this.f73240b;
        float f3 = this.f73241c;
        float sqrt = (float) Math.sqrt((double) ((f * f) + (f2 * f2) + (f3 * f3)));
        if (sqrt != 0.0f) {
            this.f73239a /= sqrt;
            this.f73240b /= sqrt;
            this.f73241c /= sqrt;
        }
    }

    /* renamed from: a */
    public final void mo40068a(float f, float f2, float f3) {
        this.f73239a = f;
        this.f73240b = f2;
        this.f73241c = f3;
    }

    public final String toString() {
        float f = this.f73239a;
        float f2 = this.f73240b;
        float f3 = this.f73241c;
        StringBuilder sb = new StringBuilder(49);
        sb.append(f);
        sb.append(", ");
        sb.append(f2);
        sb.append(", ");
        sb.append(f3);
        return sb.toString();
    }

    public alaz(float f, float f2, float f3) {
        mo40068a(f, f2, f3);
    }
}
