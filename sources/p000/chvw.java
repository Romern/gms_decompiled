package p000;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: chvw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chvw implements chxx {

    /* renamed from: a */
    private final ScheduledExecutorService f189295a = ((ScheduledExecutorService) ciex.m150140a(ciag.f189656m));

    /* renamed from: b */
    private final Executor f189296b;

    /* renamed from: c */
    private final chvx f189297c;

    /* renamed from: d */
    private final cifh f189298d;

    public chvw(chvx chvx, Executor executor, cifh cifh) {
        this.f189297c = chvx;
        bmxy.m108582a(executor, "executor");
        this.f189296b = executor;
        bmxy.m108582a(cifh, "transportTracer");
        this.f189298d = cifh;
    }

    /* renamed from: a */
    public final chyc mo85713a(SocketAddress socketAddress, chxw chxw, chqq chqq) {
        return new chwh(this.f189297c, (InetSocketAddress) socketAddress, chxw.f189498a, chxw.f189500c, chxw.f189499b, this.f189296b, this.f189298d);
    }

    /* renamed from: a */
    public final ScheduledExecutorService mo85714a() {
        return this.f189295a;
    }

    public final void close() {
        ciex.m150142b(ciag.f189656m, this.f189295a);
    }
}
