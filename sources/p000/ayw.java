package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* renamed from: ayw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayw extends FutureTask {

    /* renamed from: a */
    final /* synthetic */ ayx f2603a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayw(ayx ayx, Callable callable) {
        super(callable);
        this.f2603a = ayx;
    }

    /* access modifiers changed from: protected */
    public final void done() {
        if (!isCancelled()) {
            try {
                Executor executor = ayx.f2604a;
                this.f2603a.mo2913a((ayu) get());
            } catch (InterruptedException | ExecutionException e) {
                ayx ayx = this.f2603a;
                ayu ayu = new ayu(e);
                Executor executor2 = ayx.f2604a;
                ayx.mo2913a(ayu);
            }
        }
    }
}
