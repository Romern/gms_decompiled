package p000;

import java.util.concurrent.Callable;

/* renamed from: bcar */
final /* synthetic */ class bcar implements Callable {

    /* renamed from: a */
    private final bcas f103902a;

    /* renamed from: b */
    private final bcdo f103903b;

    public bcar(bcas bcas, bcdo bcdo) {
        this.f103902a = bcas;
        this.f103903b = bcdo;
    }

    public final Object call() {
        bcas bcas = this.f103902a;
        return new bcdi(bcas.f103906a, new bcao(bcas), bcas.f103908c, bcdm.m88832b(bcas.f103909d), this.f103903b);
    }
}
