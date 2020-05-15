package p000;

import java.util.concurrent.Callable;

/* renamed from: tow */
final /* synthetic */ class tow implements aubg {

    /* renamed from: a */
    private final Callable f46424a;

    public tow(Callable callable) {
        this.f46424a = callable;
    }

    /* renamed from: a */
    public final Object mo7031a(aucb aucb) {
        Callable callable = this.f46424a;
        if (aucb.mo50384b()) {
            return (aucb) callable.call();
        }
        return aucu.m76777a(aucb.mo50387e());
    }
}
