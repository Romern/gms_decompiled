package p000;

import java.util.Map;

/* renamed from: bnqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnqt extends bnch {

    /* renamed from: a */
    bnfa f132000a = this.f132001b;

    /* renamed from: b */
    final /* synthetic */ bnfa f132001b;

    /* renamed from: c */
    final /* synthetic */ bnqv f132002c;

    /* renamed from: d */
    final /* synthetic */ bnjq f132003d;

    public bnqt(bnqv bnqv, bnfa bnfa, bnjq bnjq) {
        this.f132002c = bnqv;
        this.f132001b = bnfa;
        this.f132003d = bnjq;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnoa.a(bnfa, bnfa):bnoa
     arg types: [bnfa, bnew]
     candidates:
      bnoa.a(java.lang.Comparable, bndx):bnoa
      bnoa.a(java.lang.Comparable, java.lang.Comparable):bnoa
      bnoa.a(bnfa, bnfa):bnoa */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8969a() {
        bnoa bnoa;
        if (this.f132002c.f132008a.f131892c.mo67481a((Comparable) this.f132000a) || this.f132000a == bnew.f131549a) {
            return (Map.Entry) mo67118d();
        }
        if (this.f132003d.hasNext()) {
            bnoa bnoa2 = (bnoa) this.f132003d.next();
            bnoa = bnoa.m109925a(this.f132000a, bnoa2.f131891b);
            this.f132000a = bnoa2.f131892c;
        } else {
            bnoa = bnoa.m109925a(this.f132000a, (bnfa) bnew.f131549a);
            this.f132000a = bnew.f131549a;
        }
        return bnmt.m109797a(bnoa.f131891b, bnoa);
    }
}
