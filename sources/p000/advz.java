package p000;

/* renamed from: advz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class advz extends advx {

    /* renamed from: a */
    private final float f62832a;

    public advz(bsjg bsjg) {
        this.f62832a = bsjg.f144791a;
    }

    /* renamed from: a */
    public final float mo33857a(int i) {
        if (i > 0) {
            return 1.0f - ((float) Math.pow((double) (1.0f / ((float) i)), (double) this.f62832a));
        }
        return 0.0f;
    }
}
