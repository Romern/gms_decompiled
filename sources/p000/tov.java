package p000;

import java.util.concurrent.Callable;

/* renamed from: tov */
final /* synthetic */ class tov implements aubg {

    /* renamed from: a */
    private final tox f46422a;

    /* renamed from: b */
    private final Callable f46423b;

    public tov(tox tox, Callable callable) {
        this.f46422a = tox;
        this.f46423b = callable;
    }

    /* renamed from: a */
    public final Object mo7031a(aucb aucb) {
        tox tox = this.f46422a;
        Callable callable = this.f46423b;
        if (aucb.mo50384b()) {
            return aucu.m76778a(aucb.mo50386d());
        }
        Exception e = aucb.mo50387e();
        if (!(e instanceof rjp) || ((rjp) e).mo24655a() != 11002) {
            return aucu.m76777a(aucb.mo50387e());
        }
        return tox.f46425a.mo24199a(tox.f46426b).mo50382b(new tow(callable));
    }
}
