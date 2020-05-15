package p000;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: bluv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bluv implements Future {

    /* renamed from: a */
    public final CountDownLatch f127833a = new CountDownLatch(1);

    /* renamed from: b */
    public volatile bluu f127834b;

    /* renamed from: c */
    private volatile bluo f127835c;

    /* renamed from: a */
    public final void mo66726a() {
        if (this.f127835c != null) {
            this.f127835c.mo13812a(this.f127834b);
        }
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        this.f127833a.await();
        return this.f127834b;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return this.f127834b != null;
    }

    /* renamed from: a */
    public final void mo66727a(bluo bluo) {
        this.f127835c = bluo;
        if (isDone()) {
            mo66726a();
        }
    }

    public final /* bridge */ /* synthetic */ Object get(long j, TimeUnit timeUnit) {
        if (this.f127833a.await(j, timeUnit)) {
            return this.f127834b;
        }
        throw new TimeoutException();
    }
}
