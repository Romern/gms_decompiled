package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: avfp */
final /* synthetic */ class avfp implements bmxj {

    /* renamed from: a */
    private final AtomicReference f93101a;

    /* renamed from: b */
    private final auzj f93102b;

    public avfp(AtomicReference atomicReference, auzj auzj) {
        this.f93101a = atomicReference;
        this.f93102b = auzj;
    }

    public final Object apply(Object obj) {
        AtomicReference atomicReference = this.f93101a;
        auzj auzj = this.f93102b;
        auzj auzj2 = (auzj) obj;
        if (auzj.f92827d.equals(auzj2)) {
            atomicReference.set(null);
        } else {
            atomicReference.set(auzj2);
        }
        return auzj;
    }
}
