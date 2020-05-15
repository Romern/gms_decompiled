package p000;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: zkm */
final /* synthetic */ class zkm implements zgg {

    /* renamed from: a */
    private final zgg f55314a;

    /* renamed from: b */
    private final AtomicInteger f55315b;

    /* renamed from: c */
    private final zla f55316c;

    /* renamed from: d */
    private final bqgy f55317d;

    public zkm(zgg zgg, AtomicInteger atomicInteger, zla zla, bqgy bqgy) {
        this.f55314a = zgg;
        this.f55315b = atomicInteger;
        this.f55316c = zla;
        this.f55317d = bqgy;
    }

    /* renamed from: a */
    public final void mo30949a(List list) {
        zgg zgg = this.f55314a;
        AtomicInteger atomicInteger = this.f55315b;
        zla zla = this.f55316c;
        bqgy bqgy = this.f55317d;
        int i = zkq.f55322b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zgg.mo30949a(bngx.m109356a((cadn) it.next()));
            if (atomicInteger.incrementAndGet() >= zla.f55356d) {
                bqgy.mo69138b((Object) true);
            }
        }
    }
}
