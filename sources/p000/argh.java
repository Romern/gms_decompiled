package p000;

import java.util.concurrent.Callable;

/* renamed from: argh */
final /* synthetic */ class argh implements Callable {

    /* renamed from: a */
    private final argj f87658a;

    public argh(argj argj) {
        this.f87658a = argj;
    }

    public final Object call() {
        argj argj = this.f87658a;
        return Boolean.valueOf(argj.f87660a.f87077f.post(new argi(argj)));
    }
}
