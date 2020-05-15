package p000;

import java.util.List;

/* renamed from: bbh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbh implements bbl {

    /* renamed from: a */
    private final bba f2829a;

    /* renamed from: b */
    private final bba f2830b;

    public bbh(bba bba, bba bba2) {
        this.f2829a = bba;
        this.f2830b = bba2;
    }

    /* renamed from: a */
    public final azy mo2972a() {
        return new bak(this.f2829a.mo2972a(), this.f2830b.mo2972a());
    }

    /* renamed from: b */
    public final List mo2974b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    /* renamed from: c */
    public final boolean mo2975c() {
        return this.f2829a.mo2975c() && this.f2830b.mo2975c();
    }
}
