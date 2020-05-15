package p000;

import java.util.concurrent.TimeUnit;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.conn.tsccm.PoolEntryRequest;

/* renamed from: bjeg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjeg implements ClientConnectionRequest {

    /* renamed from: a */
    final /* synthetic */ PoolEntryRequest f122575a;

    /* renamed from: b */
    final /* synthetic */ HttpRoute f122576b;

    /* renamed from: c */
    final /* synthetic */ bjek f122577c;

    public bjeg(bjek bjek, PoolEntryRequest poolEntryRequest, HttpRoute httpRoute) {
        this.f122577c = bjek;
        this.f122575a = poolEntryRequest;
        this.f122576b = httpRoute;
    }

    public final void abortRequest() {
        this.f122575a.abortRequest();
    }

    public final ManagedClientConnection getConnection(long j, TimeUnit timeUnit) {
        if (this.f122576b != null) {
            return new bjeh(this.f122577c, this.f122575a.getPoolEntry(j, timeUnit));
        }
        throw new IllegalArgumentException("Route may not be null.");
    }
}
