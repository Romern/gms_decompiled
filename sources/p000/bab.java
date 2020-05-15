package p000;

import java.util.List;

/* renamed from: bab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bab extends bad {

    /* renamed from: e */
    private final bbp f2752e;

    public bab(List list) {
        super(list);
        int i = 0;
        bbp bbp = (bbp) ((beo) list.get(0)).f3103b;
        i = bbp != null ? bbp.mo2980a() : i;
        this.f2752e = new bbp(new float[i], new int[i]);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2936a(beo beo, float f) {
        bbp bbp = this.f2752e;
        bbp bbp2 = (bbp) beo.f3103b;
        bbp bbp3 = (bbp) beo.f3104c;
        if (bbp2.f2851b.length == bbp3.f2851b.length) {
            for (int i = 0; i < bbp2.f2851b.length; i++) {
                bbp.f2850a[i] = bem.m2819a(bbp2.f2850a[i], bbp3.f2850a[i], f);
                bbp.f2851b[i] = bei.m2802a(f, bbp2.f2851b[i], bbp3.f2851b[i]);
            }
            return this.f2752e;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + bbp2.f2851b.length + " vs " + bbp3.f2851b.length + ")");
    }
}
