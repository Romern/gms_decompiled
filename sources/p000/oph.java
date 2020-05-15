package p000;

/* renamed from: oph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oph extends opi {
    /* renamed from: a */
    public final float mo22477a(float f, float f2, float f3) {
        if (f <= f2) {
            return 0.0f;
        }
        if (f < f3) {
            return 1.0f - (m29490a(1.0f - ((f - f2) / (f3 - f2))) * this.f38168a);
        }
        return 1.0f;
    }
}
