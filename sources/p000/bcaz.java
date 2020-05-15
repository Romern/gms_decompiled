package p000;

import java.util.concurrent.Callable;

/* renamed from: bcaz */
public final /* synthetic */ class bcaz implements Callable {

    /* renamed from: a */
    private final Runnable f103925a;

    public bcaz(Runnable runnable) {
        this.f103925a = runnable;
    }

    public final Object call() {
        this.f103925a.run();
        return null;
    }
}
