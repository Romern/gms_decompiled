package p000;

import java.util.function.Consumer;

/* renamed from: auxa */
final /* synthetic */ class auxa implements Consumer {

    /* renamed from: a */
    private final auxb f92678a;

    public auxa(auxb auxb) {
        this.f92678a = auxb;
    }

    public final void accept(Object obj) {
        auyw auyw = (auyw) obj;
        auxe auxe = this.f92678a.f92679a;
        if (auyw != null) {
            auxe.f92681a.mo50711a("fetch home address got result.", new Object[0]).mo50708c();
            auxe.f92687g = auyw.f92803b;
            auxe.mo51008d();
        }
        auxe.mo51004a();
        auxe.f92685e.mo24803g();
    }
}
