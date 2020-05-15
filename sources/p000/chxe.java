package p000;

import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: chxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chxe implements chxx {

    /* renamed from: a */
    public final Executor f189440a;

    /* renamed from: b */
    private final chxx f189441b;

    public chxe(chxx chxx, Executor executor) {
        bmxy.m108582a(chxx, "delegate");
        this.f189441b = chxx;
        bmxy.m108582a(executor, "appExecutor");
        this.f189440a = executor;
    }

    /* renamed from: a */
    public final chyc mo85713a(SocketAddress socketAddress, chxw chxw, chqq chqq) {
        return new chxd(this, this.f189441b.mo85713a(socketAddress, chxw, chqq), chxw.f189498a);
    }

    public final void close() {
        this.f189441b.close();
    }

    /* renamed from: a */
    public final ScheduledExecutorService mo85714a() {
        return this.f189441b.mo85714a();
    }
}
