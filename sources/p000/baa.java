package p000;

import java.util.List;

/* renamed from: baa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baa extends bad {
    public baa(List list) {
        super(list);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2936a(beo beo, float f) {
        return Float.valueOf(mo2950b(beo, f));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final float mo2950b(beo beo, float f) {
        Object obj = beo.f3103b;
        if (obj == null || beo.f3104c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        beq beq = this.f2743d;
        if (beq == null) {
            float f2 = beo.f3108g;
            if (f2 == -3987645.8f) {
                f2 = ((Float) obj).floatValue();
                beo.f3108g = f2;
            }
            float f3 = beo.f3109h;
            if (f3 == -3987645.8f) {
                f3 = ((Float) beo.f3104c).floatValue();
                beo.f3109h = f3;
            }
            return bem.m2819a(f2, f3, f);
        }
        float f4 = beo.f3106e;
        beo.f3107f.floatValue();
        Object obj2 = beo.f3103b;
        Object obj3 = beo.f3104c;
        mo2941c();
        return ((Float) beq.f3116a).floatValue();
    }

    /* renamed from: g */
    public final float mo2946g() {
        return mo2950b(mo2940b(), mo2942d());
    }
}
