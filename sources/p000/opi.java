package p000;

/* renamed from: opi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class opi implements opb {

    /* renamed from: a */
    protected final float f38168a = (1.0f / m29490a(1.0f));

    /* renamed from: a */
    static float m29490a(float f) {
        return ((float) (-Math.pow(100.0d, (double) (-f)))) + 1.0f + (f * 0.0f);
    }

    /* renamed from: a */
    public float mo22477a(float f, float f2, float f3) {
        if (f <= f2) {
            return 0.0f;
        }
        if (f < f3) {
            return m29490a((f - f2) / (f3 - f2)) * this.f38168a;
        }
        return 1.0f;
    }
}
