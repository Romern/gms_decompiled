package p000;

/* renamed from: bnhm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnhm extends bngm {

    /* renamed from: a */
    public final bnhe f131629a;

    public bnhm(bnhe bnhe) {
        this.f131629a = bnhe;
    }

    /* renamed from: a */
    public final bnrd iterator() {
        return new bnhj(this);
    }

    public final boolean contains(Object obj) {
        return obj != null && bnjr.m109614a(iterator(), obj);
    }

    /* renamed from: g */
    public final bngx mo67639g() {
        return new bnhk(this.f131629a.entrySet().mo67639g());
    }

    /* renamed from: h */
    public final boolean mo67640h() {
        throw null;
    }

    public final int size() {
        return this.f131629a.size();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new bnhl(this.f131629a);
    }
}
