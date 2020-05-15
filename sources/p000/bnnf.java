package p000;

import java.util.Set;

/* renamed from: bnnf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnnf extends bnms {

    /* renamed from: a */
    public final bnmu f131859a;

    public bnnf(bnmu bnmu) {
        bmxy.m108581a(bnmu);
        this.f131859a = bnmu;
    }

    /* renamed from: a */
    public final Set mo67137a() {
        return new bnne(this);
    }

    public final void clear() {
        this.f131859a.mo67270d();
    }

    public final boolean containsKey(Object obj) {
        return this.f131859a.mo67271d(obj);
    }

    public final boolean isEmpty() {
        return ((bnkc) this.f131859a).f131752a == null;
    }

    public final Set keySet() {
        return this.f131859a.mo67316o();
    }

    public final int size() {
        return this.f131859a.mo67316o().size();
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (containsKey(obj)) {
            return ((bnkc) this.f131859a).mo67127c(obj);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (containsKey(obj)) {
            return ((bnkc) this.f131859a).mo67126b(obj);
        }
        return null;
    }
}
