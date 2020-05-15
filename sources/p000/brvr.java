package p000;

import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: brvr */
final /* synthetic */ class brvr implements Callable {

    /* renamed from: a */
    private final brvs f143472a;

    /* renamed from: b */
    private final chqo f143473b;

    /* renamed from: c */
    private final bruw f143474c;

    /* renamed from: d */
    private final Set f143475d;

    public brvr(brvs brvs, chqo chqo, bruw bruw, Set set) {
        this.f143472a = brvs;
        this.f143473b = chqo;
        this.f143474c = bruw;
        this.f143475d = set;
    }

    public final Object call() {
        brvs brvs = this.f143472a;
        chqo chqo = this.f143473b;
        bruw bruw = this.f143474c;
        Set set = this.f143475d;
        return ((Boolean) chqo.mo85548a(brvs.f143476a)).booleanValue() ? brvs.f143479b.mo69995b(bruw, set) : brvs.f143479b.mo69994a(bruw, set);
    }
}
