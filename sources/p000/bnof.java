package p000;

import java.util.AbstractMap;

/* renamed from: bnof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnof extends bngx {

    /* renamed from: a */
    final /* synthetic */ bnog f131902a;

    public bnof(bnog bnog) {
        this.f131902a = bnog;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        bmxy.m108584a(i, this.f131902a.f131905c);
        bnog bnog = this.f131902a;
        Object[] objArr = bnog.f131903a;
        int i2 = bnog.f131904b;
        int i3 = i + i;
        return new AbstractMap.SimpleImmutableEntry(objArr[i3 + i2], objArr[i3 + (i2 ^ 1)]);
    }

    /* renamed from: h */
    public final boolean mo67640h() {
        return true;
    }

    public final int size() {
        return this.f131902a.f131905c;
    }
}
