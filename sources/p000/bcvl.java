package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: bcvl */
public final /* synthetic */ class bcvl implements Callable {

    /* renamed from: a */
    private final bqgg f104997a;

    /* renamed from: b */
    private final bqgg f104998b;

    public bcvl(bqgg bqgg, bqgg bqgg2) {
        this.f104997a = bqgg;
        this.f104998b = bqgg2;
    }

    public final Object call() {
        bqgg bqgg = this.f104997a;
        bqgg bqgg2 = this.f104998b;
        boolean z = false;
        if (((Boolean) bqga.m112780a((Future) bqgg)).booleanValue() && ((Boolean) bqga.m112780a((Future) bqgg2)).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
