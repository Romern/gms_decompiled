package p000;

import com.android.volley.VolleyLog;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.conn.tsccm.BasicPoolEntry;
import org.apache.http.impl.conn.tsccm.ConnPoolByRoute;
import org.apache.http.impl.conn.tsccm.PoolEntryRequest;
import org.apache.http.impl.conn.tsccm.RouteSpecificPool;
import org.apache.http.impl.conn.tsccm.WaitingThread;
import org.apache.http.impl.conn.tsccm.WaitingThreadAborter;
import org.apache.http.params.HttpParams;

/* renamed from: bjej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjej extends ConnPoolByRoute {
    public bjej(ClientConnectionOperator clientConnectionOperator, HttpParams httpParams) {
        super(clientConnectionOperator, httpParams);
    }

    /* access modifiers changed from: protected */
    public final BasicPoolEntry getEntryBlocking(HttpRoute httpRoute, Object obj, long j, TimeUnit timeUnit, WaitingThreadAborter waitingThreadAborter) {
        RouteSpecificPool routePool;
        WaitingThread waitingThread;
        HttpRoute httpRoute2 = httpRoute;
        long j2 = j;
        BasicPoolEntry basicPoolEntry = null;
        Date date = j2 > 0 ? new Date(System.currentTimeMillis() + timeUnit.toMillis(j2)) : null;
        long currentTimeMillis = System.currentTimeMillis();
        this.poolLock.lock();
        char c = 0;
        try {
            routePool = getRoutePool(httpRoute2, true);
            waitingThread = null;
            while (true) {
                if (basicPoolEntry != null) {
                    break;
                } else if (!this.isShutDown) {
                    BasicPoolEntry freeEntry = getFreeEntry(routePool, obj);
                    if (freeEntry != null) {
                        basicPoolEntry = freeEntry;
                        break;
                    }
                    Object[] objArr = new Object[1];
                    objArr[c] = httpRoute2;
                    VolleyLog.m4767v("Constructed new connection to route=[%s]", objArr);
                    if (routePool.getCapacity() > 0) {
                        if (this.numConnections < this.maxTotalConnections) {
                            freeEntry = createEntry(routePool, this.operator);
                        } else if (!this.freeConnections.isEmpty()) {
                            deleteLeastUsedEntry();
                            freeEntry = createEntry(routePool, this.operator);
                        }
                        basicPoolEntry = freeEntry;
                        c = 0;
                    }
                    if (waitingThread == null) {
                        waitingThread = newWaitingThread(this.poolLock.newCondition(), routePool);
                        waitingThreadAborter.setWaitingThread(waitingThread);
                    }
                    routePool.queueThread(waitingThread);
                    this.waitingThreads.add(waitingThread);
                    boolean await = waitingThread.await(date);
                    routePool.removeThread(waitingThread);
                    this.waitingThreads.remove(waitingThread);
                    if (!await && date != null) {
                        if (date.getTime() <= System.currentTimeMillis()) {
                            throw new ConnectionPoolTimeoutException("Timeout waiting for connection");
                        }
                    }
                    basicPoolEntry = freeEntry;
                    c = 0;
                } else {
                    throw new IllegalStateException("Connection pool shut down.");
                }
            }
            this.poolLock.unlock();
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (currentTimeMillis2 > 10) {
                VolleyLog.m4767v("GetEntryBlocking() took %s ms", Long.valueOf(currentTimeMillis2));
            }
            return basicPoolEntry;
        } catch (Throwable th) {
            this.poolLock.unlock();
            long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
            if (currentTimeMillis3 > 10) {
                VolleyLog.m4767v("GetEntryBlocking() took %s ms", Long.valueOf(currentTimeMillis3));
            }
            throw th;
        }
    }

    public final PoolEntryRequest requestPoolEntry(HttpRoute httpRoute, Object obj) {
        return new bjei(this, new WaitingThreadAborter(), httpRoute, obj);
    }
}
