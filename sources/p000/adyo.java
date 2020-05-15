package p000;

/* renamed from: adyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adyo extends adys {

    /* renamed from: a */
    public final float[] f62916a;

    /* renamed from: b */
    public int f62917b = 0;

    /* renamed from: c */
    public int f62918c = 0;

    /* renamed from: d */
    private double f62919d = 0.0d;

    /* renamed from: e */
    private int f62920e = 0;

    public adyo(int i) {
        this.f62916a = new float[i];
    }

    /* renamed from: a */
    public final int mo33938a() {
        return this.f62918c;
    }

    /* renamed from: b */
    public final float mo33940b() {
        return (float) this.f62919d;
    }

    /* renamed from: a */
    public final void mo33939a(float f) {
        int i = this.f62920e + 1;
        this.f62920e = i;
        if (i == Integer.MAX_VALUE) {
            this.f62920e = 0;
            this.f62919d = 0.0d;
            float[] fArr = this.f62916a;
            for (float f2 : fArr) {
                double d = this.f62919d;
                double d2 = (double) f2;
                Double.isNaN(d2);
                this.f62919d = d + d2;
            }
        }
        int i2 = this.f62918c;
        float[] fArr2 = this.f62916a;
        int length = fArr2.length;
        if (i2 >= length) {
            double d3 = this.f62919d;
            double d4 = (double) fArr2[this.f62917b];
            Double.isNaN(d4);
            this.f62919d = d3 - d4;
        } else {
            this.f62918c = i2 + 1;
        }
        int i3 = this.f62917b;
        fArr2[i3] = f;
        double d5 = this.f62919d;
        double d6 = (double) f;
        Double.isNaN(d6);
        this.f62919d = d5 + d6;
        int i4 = i3 + 1;
        this.f62917b = i4;
        if (i4 >= length) {
            this.f62917b = 0;
        }
    }
}
