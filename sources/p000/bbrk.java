package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: bbrk */
final /* synthetic */ class bbrk implements Callable {

    /* renamed from: a */
    private final bqgg f103216a;

    public bbrk(bqgg bqgg) {
        this.f103216a = bqgg;
    }

    public final Object call() {
        bqgg bqgg = this.f103216a;
        try {
            Void voidR = (Void) bqga.m112780a((Future) bqgg);
        } catch (ExecutionException e) {
            bbos.m88292b("LitBlockController", "Failed to update block status", e);
        }
        return (Void) bqgg.get();
    }
}
