package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: bbrn */
final /* synthetic */ class bbrn implements Callable {

    /* renamed from: a */
    private final bqgg f103224a;

    public bbrn(bqgg bqgg) {
        this.f103224a = bqgg;
    }

    public final Object call() {
        bqgg bqgg = this.f103224a;
        try {
            Void voidR = (Void) bqga.m112780a((Future) bqgg);
        } catch (ExecutionException e) {
            bbos.m88292b("LitBlockController", "Failed to update block status", e);
        }
        return (Void) bqgg.get();
    }
}
