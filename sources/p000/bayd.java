package p000;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bayd */
final /* synthetic */ class bayd implements Callable {

    /* renamed from: a */
    private final bayg f102081a;

    /* renamed from: b */
    private final AtomicInteger f102082b;

    /* renamed from: c */
    private final List f102083c;

    public bayd(bayg bayg, AtomicInteger atomicInteger, List list) {
        this.f102081a = bayg;
        this.f102082b = atomicInteger;
        this.f102083c = list;
    }

    public final Object call() {
        bayg bayg = this.f102081a;
        AtomicInteger atomicInteger = this.f102082b;
        List list = this.f102083c;
        if (atomicInteger.get() > 0) {
            bayg.f102090e.mo34978a(4, atomicInteger.get());
        }
        int a = bayg.mo56033a(bbfd.m87918a(bayg.f102086a, bayg.f102092g), list);
        if (a <= 0) {
            return null;
        }
        bayg.f102090e.mo34978a(5, a);
        return null;
    }
}
