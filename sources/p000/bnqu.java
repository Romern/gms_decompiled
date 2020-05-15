package p000;

import java.util.Map;

/* renamed from: bnqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnqu extends bnch {

    /* renamed from: a */
    bnfa f132004a = this.f132005b;

    /* renamed from: b */
    final /* synthetic */ bnfa f132005b;

    /* renamed from: c */
    final /* synthetic */ bnqv f132006c;

    /* renamed from: d */
    final /* synthetic */ bnjq f132007d;

    public bnqu(bnqv bnqv, bnfa bnfa, bnjq bnjq) {
        this.f132006c = bnqv;
        this.f132005b = bnfa;
        this.f132007d = bnjq;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnoa.a(bnfa, bnfa):bnoa
     arg types: [bney, bnfa]
     candidates:
      bnoa.a(java.lang.Comparable, bndx):bnoa
      bnoa.a(java.lang.Comparable, java.lang.Comparable):bnoa
      bnoa.a(bnfa, bnfa):bnoa */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8969a() {
        if (this.f132004a == bney.f131550a) {
            return (Map.Entry) mo67118d();
        }
        if (this.f132007d.hasNext()) {
            bnoa bnoa = (bnoa) this.f132007d.next();
            bnoa a = bnoa.m109925a(bnoa.f131892c, this.f132004a);
            this.f132004a = bnoa.f131891b;
            if (this.f132006c.f132008a.f131891b.mo67481a((Comparable) a.f131891b)) {
                return bnmt.m109797a(a.f131891b, a);
            }
        } else if (this.f132006c.f132008a.f131891b.mo67481a((Comparable) bney.f131550a)) {
            bnoa a2 = bnoa.m109925a((bnfa) bney.f131550a, this.f132004a);
            this.f132004a = bney.f131550a;
            return bnmt.m109797a(bney.f131550a, a2);
        }
        return (Map.Entry) mo67118d();
    }
}
