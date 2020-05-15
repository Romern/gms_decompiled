package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: fim */
public final /* synthetic */ class fim implements Runnable {

    /* renamed from: a */
    private final fnt f16664a;

    /* renamed from: b */
    private final AtomicBoolean f16665b;

    public fim(fnt fnt, AtomicBoolean atomicBoolean) {
        this.f16664a = fnt;
        this.f16665b = atomicBoolean;
    }

    public final void run() {
        fnt fnt = this.f16664a;
        AtomicBoolean atomicBoolean = this.f16665b;
        fnt.mo10933d("ChimeraAnalyticsTaskService processed last upload request.");
        synchronized (atomicBoolean) {
            atomicBoolean.set(true);
            atomicBoolean.notify();
        }
    }
}
