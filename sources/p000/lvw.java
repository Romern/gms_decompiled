package p000;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: lvw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lvw {

    /* renamed from: a */
    public static final lvn f33082a = new lvn("LastBackupTimePoller");

    /* renamed from: b */
    public final rtj f33083b;

    /* renamed from: c */
    public final long f33084c = ccli.f179330a.mo6606a().mo76283p();

    /* renamed from: d */
    public bqgy f33085d;

    /* renamed from: e */
    private final ScheduledExecutorService f33086e;

    /* renamed from: f */
    private final long f33087f;

    /* renamed from: g */
    private Future f33088g;

    public lvw(ScheduledExecutorService scheduledExecutorService, rtj rtj, sqv sqv, long j) {
        bmxy.m108581a(scheduledExecutorService);
        this.f33086e = scheduledExecutorService;
        bmxy.m108581a(rtj);
        this.f33083b = rtj;
        bmxy.m108581a(sqv);
        this.f33087f = j;
    }

    /* renamed from: a */
    public final synchronized Future mo19685a() {
        if (this.f33088g == null) {
            f33082a.mo25412b("Starting to poll last backup time at %d", Long.valueOf(System.currentTimeMillis()));
            this.f33085d = bqgy.m112818c();
            this.f33088g = ((sny) this.f33086e).scheduleWithFixedDelay(new lvv(this), this.f33087f, ccli.f179330a.mo6606a().mo76281n(), TimeUnit.MILLISECONDS);
        }
        return this.f33085d;
    }

    /* renamed from: b */
    public final synchronized void mo19686b() {
        Future future = this.f33088g;
        if (future != null) {
            future.cancel(true);
            this.f33088g = null;
        }
    }
}
