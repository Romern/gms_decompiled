package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: avfq */
final /* synthetic */ class avfq implements bmxj {

    /* renamed from: a */
    private final AtomicReference f93103a;

    public avfq(AtomicReference atomicReference) {
        this.f93103a = atomicReference;
    }

    public final Object apply(Object obj) {
        Void voidR = (Void) obj;
        return (auzj) this.f93103a.get();
    }
}
