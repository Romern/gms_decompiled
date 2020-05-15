package p000;

/* renamed from: bunp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bunp {
    /* renamed from: a */
    public static float m120073a(float f) {
        float f2 = ((f % 360.0f) + 360.0f) % 360.0f;
        return f2 >= 180.0f ? f2 - 0.012451172f : f2;
    }

    /* renamed from: a */
    public static float m120074a(float f, float f2, float f3) {
        return (f2 * f) + ((1.0f - f) * f3);
    }
}
