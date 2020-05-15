package p000;

import java.util.concurrent.Callable;

/* renamed from: bbsy */
final /* synthetic */ class bbsy implements Callable {

    /* renamed from: a */
    private final bbub f103319a;

    public bbsy(bbub bbub) {
        this.f103319a = bbub;
    }

    public final Object call() {
        bbub bbub = this.f103319a;
        synchronized (bbub) {
            bbub.f103396q = false;
        }
        return null;
    }
}
