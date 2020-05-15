package p000;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: vpn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vpn {

    /* renamed from: i */
    private static final sbw f49719i = new sbw("RateLimitedExecutor", "");

    /* renamed from: a */
    public final Runnable f49720a = new vpk(this);

    /* renamed from: b */
    public final Runnable f49721b = new vpl(this);

    /* renamed from: c */
    public final Runnable f49722c;

    /* renamed from: d */
    public final long f49723d;

    /* renamed from: e */
    public final Executor f49724e;

    /* renamed from: f */
    public long f49725f = 0;

    /* renamed from: g */
    public boolean f49726g;

    /* renamed from: h */
    public int f49727h;

    /* renamed from: j */
    private final ExecutorService f49728j = snp.m35704b(10);

    /* renamed from: k */
    private final String f49729k;

    public vpn(Runnable runnable, long j, Executor executor, String str) {
        boolean z = false;
        this.f49726g = false;
        this.f49727h = 1;
        sdo.m34974b(j > 0 ? true : z);
        sdo.m34959a(runnable);
        this.f49722c = runnable;
        this.f49723d = j;
        sdo.m34959a((Object) str);
        this.f49729k = str;
        sdo.m34959a(executor);
        this.f49724e = executor;
    }

    /* renamed from: a */
    public final synchronized void mo28726a() {
        if (!this.f49726g) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.f49725f;
            if (j < this.f49723d) {
                this.f49726g = true;
                this.f49728j.execute(new vpm(this, j));
                return;
            }
            this.f49721b.run();
            this.f49725f = currentTimeMillis;
            return;
        }
        f49719i.mo25369a("Rate limited: %s", this);
    }

    public final String toString() {
        return String.format(Locale.US, "RateLimitedExecutor[owner=%s, scheduled=%s, lastUpdated=%s, lapseSinceLastUpdate=%s, interval=%d]", this.f49729k, Boolean.valueOf(this.f49726g), Long.valueOf(this.f49725f), Long.valueOf(System.currentTimeMillis() - this.f49725f), Long.valueOf(this.f49723d));
    }
}
