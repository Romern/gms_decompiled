package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: bcir */
final /* synthetic */ class bcir implements Callable {

    /* renamed from: a */
    private final bqgg f104251a;

    public bcir(bqgg bqgg) {
        this.f104251a = bqgg;
    }

    public final Object call() {
        try {
            if (((bcoz) bqga.m112780a((Future) this.f104251a)) == null) {
                return false;
            }
            return true;
        } catch (Exception e) {
            bbos.m88294d("Backend", "Consume exception thrown during register refresh");
        }
    }
}
