package p000;

import java.util.List;

/* renamed from: bac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bac extends bad {
    public bac(List list) {
        super(list);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2936a(beo beo, float f) {
        return Integer.valueOf(mo2951b(beo, f));
    }

    /* renamed from: b */
    public final int mo2951b(beo beo, float f) {
        Object obj = beo.f3103b;
        if (obj == null || beo.f3104c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        beq beq = this.f2743d;
        if (beq == null) {
            int i = beo.f3110i;
            if (i == 784923401) {
                i = ((Integer) obj).intValue();
                beo.f3110i = i;
            }
            int i2 = beo.f3111j;
            if (i2 == 784923401) {
                i2 = ((Integer) beo.f3104c).intValue();
                beo.f3111j = i2;
            }
            return bem.m2822a(i, i2, f);
        }
        float f2 = beo.f3106e;
        beo.f3107f.floatValue();
        Object obj2 = beo.f3103b;
        Object obj3 = beo.f3104c;
        mo2941c();
        return ((Integer) beq.f3116a).intValue();
    }
}
