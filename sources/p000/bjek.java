package p000;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.conn.tsccm.AbstractConnPool;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.HttpParams;

/* renamed from: bjek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjek extends ThreadSafeClientConnManager {
    public bjek(HttpParams httpParams, SchemeRegistry schemeRegistry) {
        super(httpParams, schemeRegistry);
    }

    /* access modifiers changed from: protected */
    public final AbstractConnPool createConnectionPool(HttpParams httpParams) {
        bjej bjej = new bjej(this.connOperator, httpParams);
        bjej.enableConnectionGC();
        return bjej;
    }

    public final void releaseConnection(ManagedClientConnection managedClientConnection, long j, TimeUnit timeUnit) {
        long j2;
        if ((managedClientConnection instanceof bjeh) && managedClientConnection.getRoute() != null) {
            long currentTimeMillis = System.currentTimeMillis() - ((bjeh) managedClientConnection).f122578a;
            if (!managedClientConnection.getRoute().isSecure()) {
                j2 = 2500;
            } else {
                j2 = 5000;
            }
            if (currentTimeMillis > j2) {
                try {
                    managedClientConnection.close();
                } catch (IOException e) {
                }
            }
        }
        bjek.super.releaseConnection(managedClientConnection, j, timeUnit);
    }

    public final ClientConnectionRequest requestConnection(HttpRoute httpRoute, Object obj) {
        return new bjeg(this, this.connectionPool.requestPoolEntry(httpRoute, obj), httpRoute);
    }
}
