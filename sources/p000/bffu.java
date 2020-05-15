package p000;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: bffu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bffu extends ThreadPoolExecutor {

    /* renamed from: a */
    final /* synthetic */ bffw f113712a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bffu(bffw bffw, TimeUnit timeUnit, BlockingQueue blockingQueue, RejectedExecutionHandler rejectedExecutionHandler) {
        super(1, 1, 60, timeUnit, blockingQueue, rejectedExecutionHandler);
        this.f113712a = bffw;
    }

    /* access modifiers changed from: protected */
    public final void terminated() {
        bffw bffw = this.f113712a;
        bhdb bhdb = bffw.f113797i;
        bfhd bfhd = bffw.f113799k;
        try {
            if (bffw.f113719d) {
                if (bfhd != null) {
                    this.f113712a.mo61632a(bfhd);
                    bhdb bhdb2 = this.f113712a.f113797i;
                }
            }
            String str = this.f113712a.f113717b;
            if (str != null) {
                bfgo.f113789a.mo61666b(str);
            }
            bffw bffw2 = this.f113712a;
            bfew bfew = bffw2.f113796h;
            if (bfew != null) {
                bfew.mo61491a(bffw2.f113799k);
            }
        } catch (Throwable th) {
            bffw bffw3 = this.f113712a;
            bfew bfew2 = bffw3.f113796h;
            if (bfew2 != null) {
                bfew2.mo61491a(bffw3.f113799k);
            }
            throw th;
        }
    }
}
