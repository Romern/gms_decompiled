package p000;

import java.util.concurrent.Callable;

/* renamed from: bbzi */
final /* synthetic */ class bbzi implements Callable {

    /* renamed from: a */
    private final bcas f103796a;

    /* renamed from: b */
    private final bcsj f103797b;

    public bbzi(bcas bcas, bcsj bcsj) {
        this.f103796a = bcas;
        this.f103797b = bcsj;
    }

    public final Object call() {
        bcas bcas = this.f103796a;
        bcsj bcsj = this.f103797b;
        if (bcas.mo56649c(bcsj.mo57302a()) == -1) {
            return Long.valueOf(bcas.mo56637b(bcsj));
        }
        return -1L;
    }
}
