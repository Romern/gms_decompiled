package p000;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: dpu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class dpu implements Future {

    /* renamed from: a */
    private Boolean f13794a;

    /* renamed from: a */
    public final synchronized Boolean get(long j, TimeUnit timeUnit) {
        while (j > 0) {
            if (isDone()) {
                break;
            }
            wait(TimeUnit.MILLISECONDS.convert(j, timeUnit));
        }
        if (isDone()) {
        } else {
            throw new TimeoutException();
        }
        return this.f13794a;
    }

    /* renamed from: aT */
    public final synchronized Boolean get() {
        while (!isDone()) {
            wait();
        }
        return this.f13794a;
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final synchronized boolean isDone() {
        return this.f13794a != null;
    }

    /* renamed from: a */
    public final synchronized void mo9420a(boolean z) {
        this.f13794a = Boolean.valueOf(z);
        notifyAll();
    }
}
