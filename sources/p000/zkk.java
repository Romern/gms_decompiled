package p000;

import java.util.concurrent.Callable;

/* renamed from: zkk */
final /* synthetic */ class zkk implements Callable {

    /* renamed from: a */
    private final bqgg f55309a;

    public zkk(bqgg bqgg) {
        this.f55309a = bqgg;
    }

    public final Object call() {
        bqgg bqgg = this.f55309a;
        int i = zkq.f55322b;
        return Boolean.valueOf(bqgg.cancel(false));
    }
}
