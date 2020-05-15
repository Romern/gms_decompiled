package p000;

import android.hardware.location.ContextHubTransaction;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: buhp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buhp implements bugu {

    /* renamed from: a */
    private final ContextHubTransaction f153878a;

    /* renamed from: b */
    private final AtomicInteger f153879b = new AtomicInteger(Integer.MAX_VALUE);

    public buhp(ContextHubTransaction contextHubTransaction) {
        this.f153878a = contextHubTransaction;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo72638a(Object obj) {
        bugt bugt = (bugt) obj;
        throw new UnsupportedOperationException("Use get(long, TimeUnit) instead");
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        throw new UnsupportedOperationException("Use get(long, TimeUnit) instead");
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return this.f153879b.get() != Integer.MAX_VALUE;
    }

    public final /* bridge */ /* synthetic */ Object get(long j, TimeUnit timeUnit) {
        int i;
        if (!isDone()) {
            ContextHubTransaction.Response waitForResponse = this.f153878a.waitForResponse(j, timeUnit);
            AtomicInteger atomicInteger = this.f153879b;
            if (waitForResponse.getResult() != 0) {
                i = -1;
            } else {
                i = 0;
            }
            atomicInteger.set(i);
        }
        return Integer.valueOf(this.f153879b.get());
    }
}
