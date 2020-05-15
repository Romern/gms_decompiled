package p000;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: bqgp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqgp extends bqfo implements bqgi {

    /* renamed from: a */
    private final ScheduledFuture f140630a;

    public bqgp(bqgg bqgg, ScheduledFuture scheduledFuture) {
        super(bqgg);
        this.f140630a = scheduledFuture;
    }

    public final boolean cancel(boolean z) {
        boolean cancel = super.cancel(z);
        if (cancel) {
            this.f140630a.cancel(z);
        }
        return cancel;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f140630a.compareTo((Delayed) obj);
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.f140630a.getDelay(timeUnit);
    }
}
