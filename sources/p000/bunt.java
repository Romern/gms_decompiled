package p000;

/* renamed from: bunt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bunt {

    /* renamed from: a */
    public final float[] f154407a = new float[10];

    /* renamed from: b */
    public int f154408b = 0;

    /* renamed from: c */
    private int f154409c = 0;

    /* renamed from: a */
    public final float mo72913a(int i) {
        int i2 = this.f154408b;
        if (i2 > i) {
            return this.f154407a[(this.f154409c + i) % i2];
        }
        return Float.NaN;
    }

    /* renamed from: a */
    public final void mo72914a() {
        this.f154408b = 0;
        this.f154409c = 0;
    }

    /* renamed from: a */
    public final void mo72915a(float f) {
        if (!Float.isNaN(f)) {
            float[] fArr = this.f154407a;
            int i = this.f154409c;
            this.f154409c = i + 1;
            fArr[i] = f;
            this.f154408b = Math.min(10, this.f154408b + 1);
            this.f154409c %= 10;
        }
    }
}
