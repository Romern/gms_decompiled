package p000;

import java.util.List;

/* renamed from: azz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azz extends bad {
    public azz(List list) {
        super(list);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2936a(beo beo, float f) {
        return Integer.valueOf(mo2945b(beo, f));
    }

    /* renamed from: b */
    public final int mo2945b(beo beo, float f) {
        Object obj = beo.f3103b;
        if (obj == null || beo.f3104c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = ((Integer) obj).intValue();
        int intValue2 = ((Integer) beo.f3104c).intValue();
        beq beq = this.f2743d;
        if (beq == null) {
            return bei.m2802a(bem.m2826b(f, 0.0f, 1.0f), intValue, intValue2);
        }
        float f2 = beo.f3106e;
        beo.f3107f.floatValue();
        mo2941c();
        return ((Integer) beq.f3116a).intValue();
    }

    /* renamed from: g */
    public final int mo2946g() {
        return mo2945b(mo2940b(), mo2942d());
    }
}
