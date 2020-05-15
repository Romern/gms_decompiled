package p000;

import java.util.concurrent.TimeUnit;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.conn.tsccm.BasicPoolEntry;
import org.apache.http.impl.conn.tsccm.PoolEntryRequest;
import org.apache.http.impl.conn.tsccm.WaitingThreadAborter;

/* renamed from: bjei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjei implements PoolEntryRequest {

    /* renamed from: a */
    final /* synthetic */ WaitingThreadAborter f122579a;

    /* renamed from: b */
    final /* synthetic */ HttpRoute f122580b;

    /* renamed from: c */
    final /* synthetic */ Object f122581c;

    /* renamed from: d */
    final /* synthetic */ bjej f122582d;

    public bjei(bjej bjej, WaitingThreadAborter waitingThreadAborter, HttpRoute httpRoute, Object obj) {
        this.f122582d = bjej;
        this.f122579a = waitingThreadAborter;
        this.f122580b = httpRoute;
        this.f122581c = obj;
    }

    public final void abortRequest() {
        this.f122582d.poolLock.lock();
        try {
            this.f122579a.abort();
        } finally {
            this.f122582d.poolLock.unlock();
        }
    }

    public final BasicPoolEntry getPoolEntry(long j, TimeUnit timeUnit) {
        return this.f122582d.getEntryBlocking(this.f122580b, this.f122581c, j, timeUnit, this.f122579a);
    }
}
