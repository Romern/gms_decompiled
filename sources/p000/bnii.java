package p000;

import java.util.AbstractMap;

/* renamed from: bnii */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnii extends bngx {

    /* renamed from: a */
    final /* synthetic */ bnij f131662a;

    public bnii(bnij bnij) {
        this.f131662a = bnij;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        bnim bnim = this.f131662a.f131663a;
        bnim bnim2 = bnim.f131668b;
        return new AbstractMap.SimpleImmutableEntry(bnim.f131670c.f131930d.get(i), this.f131662a.f131663a.f131671d.get(i));
    }

    /* renamed from: h */
    public final boolean mo67640h() {
        return true;
    }

    public final int size() {
        return this.f131662a.f131663a.size();
    }
}
