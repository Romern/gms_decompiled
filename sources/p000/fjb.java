package p000;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: fjb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fjb extends ThreadPoolExecutor {

    /* renamed from: a */
    final /* synthetic */ fje f16704a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fjb(fje fje) {
        super(1, 1, 1, TimeUnit.MINUTES, new LinkedBlockingQueue());
        this.f16704a = fje;
        setThreadFactory(new fjc());
        allowCoreThreadTimeOut(true);
    }

    /* access modifiers changed from: protected */
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new fja(this, runnable, obj);
    }
}
