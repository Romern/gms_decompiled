package p000;

import java.util.Comparator;

/* renamed from: bnio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnio extends bnia {

    /* renamed from: e */
    private final Comparator f131673e;

    public bnio(Comparator comparator) {
        bmxy.m108581a(comparator);
        this.f131673e = comparator;
    }

    /* renamed from: b */
    public final bniq mo67751a() {
        bniq a = bniq.m109553a(this.f131673e, this.f131596b, this.f131595a);
        this.f131596b = a.size();
        this.f131597c = true;
        return a;
    }

    /* renamed from: c */
    public final void mo67798c(Iterable iterable) {
        super.mo67752b(iterable);
    }

    /* renamed from: d */
    public final void mo67800d(Object obj) {
        super.mo67629b(obj);
    }

    /* renamed from: c */
    public final void mo67799c(Object... objArr) {
        super.mo67753b(objArr);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo67629b(Object obj) {
        super.mo67629b(obj);
    }
}
