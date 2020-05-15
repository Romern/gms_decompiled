package p000;

import java.util.List;

/* renamed from: bai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bai extends bad {

    /* renamed from: e */
    private final ber f2763e = new ber();

    public bai(List list) {
        super(list);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2936a(beo beo, float f) {
        Object obj;
        Object obj2 = beo.f3103b;
        if (obj2 == null || (obj = beo.f3104c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        ber ber = (ber) obj2;
        ber ber2 = (ber) obj;
        beq beq = this.f2743d;
        if (beq != null) {
            float f2 = beo.f3106e;
            beo.f3107f.floatValue();
            mo2941c();
            return (ber) beq.f3116a;
        }
        ber ber3 = this.f2763e;
        float a = bem.m2819a(ber.f3117a, ber2.f3117a, f);
        float f3 = ber.f3118b;
        float f4 = ber2.f3118b;
        ber3.f3117a = a;
        ber3.f3118b = bem.m2819a(f3, f4, f);
        return this.f2763e;
    }
}
