package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: agcn */
public final /* synthetic */ class agcn implements Runnable {

    /* renamed from: a */
    private final agje f65219a;

    /* renamed from: b */
    private final agid f65220b;

    /* renamed from: c */
    private final AtomicBoolean f65221c;

    public agcn(agje agje, agid agid, AtomicBoolean atomicBoolean) {
        this.f65219a = agje;
        this.f65220b = agid;
        this.f65221c = atomicBoolean;
    }

    public final void run() {
        agje agje = this.f65219a;
        agid agid = this.f65220b;
        AtomicBoolean atomicBoolean = this.f65221c;
        if (agje.f65690f.f65291a) {
            agid.f65572k.mo35435a("ChimeraPackageMeasurementTaskService processed last upload request.");
            synchronized (atomicBoolean) {
                atomicBoolean.set(true);
                atomicBoolean.notify();
            }
        }
    }
}
