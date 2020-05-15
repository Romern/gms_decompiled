package p000;

import java.io.Closeable;
import java.net.SocketAddress;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: chxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface chxx extends Closeable {
    /* renamed from: a */
    chyc mo85713a(SocketAddress socketAddress, chxw chxw, chqq chqq);

    /* renamed from: a */
    ScheduledExecutorService mo85714a();

    void close();
}
