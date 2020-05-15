package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: bdzq */
final /* synthetic */ class bdzq implements Runnable {

    /* renamed from: a */
    private final bqgg f106703a;

    public bdzq(bqgg bqgg) {
        this.f106703a = bqgg;
    }

    public final void run() {
        try {
            bqga.m112780a((Future) this.f106703a);
        } catch (ExecutionException e) {
            beel.m91852a(new bdzt(e));
        }
    }
}
