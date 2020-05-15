package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: beqc */
final /* synthetic */ class beqc implements Runnable {

    /* renamed from: a */
    private final beqf f112028a;

    /* renamed from: b */
    private final bqgg f112029b;

    public beqc(beqf beqf, bqgg bqgg) {
        this.f112028a = beqf;
        this.f112029b = bqgg;
    }

    public final void run() {
        try {
            this.f112028a.f112036d.set((C1245ok) bqga.m112780a((Future) this.f112029b));
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
