package p000;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: cifu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cifu implements chxx {

    /* renamed from: a */
    private final Executor f190032a;

    /* renamed from: b */
    private final boolean f190033b;

    /* renamed from: c */
    private final boolean f190034c;

    /* renamed from: d */
    private final cifg f190035d;

    /* renamed from: e */
    private final SocketFactory f190036e;

    /* renamed from: f */
    private final SSLSocketFactory f190037f;

    /* renamed from: g */
    private final cigx f190038g;

    /* renamed from: h */
    private final boolean f190039h;

    /* renamed from: i */
    private final chwv f190040i;

    /* renamed from: j */
    private final long f190041j;

    /* renamed from: k */
    private final ScheduledExecutorService f190042k;

    /* renamed from: l */
    private boolean f190043l;

    public cifu(Executor executor, ScheduledExecutorService scheduledExecutorService, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, cigx cigx, boolean z, long j, cifg cifg) {
        boolean z2;
        boolean z3 = true;
        if (scheduledExecutorService == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f190034c = z2;
        this.f190042k = z2 ? (ScheduledExecutorService) ciex.m150140a(ciag.f189656m) : scheduledExecutorService;
        this.f190036e = socketFactory;
        this.f190037f = sSLSocketFactory;
        this.f190038g = cigx;
        this.f190039h = false;
        this.f190040i = new chwv("keepalive time nanos");
        this.f190041j = j;
        this.f190033b = executor != null ? false : z3;
        bmxy.m108582a(cifg, "transportTracerFactory");
        this.f190035d = cifg;
        this.f190032a = this.f190033b ? (Executor) ciex.m150140a(cifv.f190045q) : executor;
    }

    /* renamed from: a */
    public final chyc mo85713a(SocketAddress socketAddress, chxw chxw, chqq chqq) {
        chxw chxw2 = chxw;
        if (!this.f190043l) {
            chwv chwv = this.f190040i;
            return new cigh((InetSocketAddress) socketAddress, chxw2.f189498a, chxw2.f189500c, chxw2.f189499b, this.f190032a, this.f190036e, this.f190037f, this.f190038g, chxw2.f189501d, new cift(new chwu(chwv, chwv.f189428c.get())), this.f190035d.mo86027a());
        }
        throw new IllegalStateException("The transport factory is closed.");
    }

    /* renamed from: a */
    public final ScheduledExecutorService mo85714a() {
        return this.f190042k;
    }

    public final void close() {
        if (!this.f190043l) {
            this.f190043l = true;
            if (this.f190034c) {
                ciex.m150142b(ciag.f189656m, this.f190042k);
            }
            if (this.f190033b) {
                ciex.m150142b(cifv.f190045q, this.f190032a);
            }
        }
    }
}
