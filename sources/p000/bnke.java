package p000;

import java.math.RoundingMode;
import java.util.AbstractList;
import java.util.List;

/* renamed from: bnke */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bnke extends AbstractList {

    /* renamed from: a */
    final List f131757a;

    /* renamed from: b */
    final int f131758b;

    public bnke(List list, int i) {
        this.f131757a = list;
        this.f131758b = i;
    }

    public final boolean isEmpty() {
        return this.f131757a.isEmpty();
    }

    public final int size() {
        return bqbr.m112522a(this.f131757a.size(), this.f131758b, RoundingMode.CEILING);
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        bmxy.m108584a(i, size());
        int i2 = this.f131758b;
        int i3 = i * i2;
        return this.f131757a.subList(i3, Math.min(i2 + i3, this.f131757a.size()));
    }
}
