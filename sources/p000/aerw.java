package p000;

import android.location.Location;
import java.util.concurrent.Executor;

/* renamed from: aerw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aerw implements aehz {

    /* renamed from: a */
    public final Executor f63699a;

    /* renamed from: b */
    public volatile aehz f63700b;

    public aerw(Executor executor, aehz aehz) {
        this.f63699a = executor;
        this.f63700b = aehz;
    }

    /* renamed from: a */
    public final void mo34499a() {
        this.f63700b = null;
    }

    /* renamed from: a */
    public final void mo7032a(Location location) {
        this.f63699a.execute(new aerv(this, location));
    }
}
