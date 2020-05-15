package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bayb */
final /* synthetic */ class bayb implements bmxj {

    /* renamed from: a */
    private final bayg f102077a;

    /* renamed from: b */
    private final AtomicInteger f102078b;

    /* renamed from: c */
    private final bavt f102079c;

    public bayb(bayg bayg, AtomicInteger atomicInteger, bavt bavt) {
        this.f102077a = bayg;
        this.f102078b = atomicInteger;
        this.f102079c = bavt;
    }

    public final Object apply(Object obj) {
        bayg bayg = this.f102077a;
        AtomicInteger atomicInteger = this.f102078b;
        bavt bavt = this.f102079c;
        if (((Boolean) obj).booleanValue()) {
            atomicInteger.getAndIncrement();
            return null;
        }
        bayg.f102090e.mo34988b(1036);
        bbev.m87906a("%s: Unsubscribe from file %s failed!", "ExpirationHandler", bavt);
        return null;
    }
}
