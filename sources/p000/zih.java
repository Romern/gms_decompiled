package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: zih */
final /* synthetic */ class zih implements Callable {

    /* renamed from: a */
    private final zil f55133a;

    /* renamed from: b */
    private final bqgg f55134b;

    /* renamed from: c */
    private final zik f55135c;

    public zih(zil zil, bqgg bqgg, zik zik) {
        this.f55133a = zil;
        this.f55134b = bqgg;
        this.f55135c = zik;
    }

    public final Object call() {
        zil zil = this.f55133a;
        bqgg bqgg = this.f55134b;
        zik zik = this.f55135c;
        zij zij = (zij) bqga.m112780a((Future) bqgg);
        if (zij != zij.REGISTERED) {
            return zij;
        }
        zil.f55149a.mo19160a(zik.f55141a.f55012b);
        return zij.UNREGISTERED;
    }
}
