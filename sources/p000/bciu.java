package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: bciu */
final /* synthetic */ class bciu implements Callable {

    /* renamed from: a */
    private final bqgg f104259a;

    public bciu(bqgg bqgg) {
        this.f104259a = bqgg;
    }

    public final Object call() {
        try {
            if (((bcoz) bqga.m112780a((Future) this.f104259a)) == null) {
                return false;
            }
            return true;
        } catch (Exception e) {
            bbos.m88294d("Backend", "Consume exception thrown during register refresh");
        }
    }
}
