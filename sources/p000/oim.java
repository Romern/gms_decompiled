package p000;

import android.os.SystemClock;
import java.io.PrintWriter;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: oim */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class oim implements oit {

    /* renamed from: a */
    private final Semaphore f37712a = new Semaphore(0);

    /* renamed from: b */
    private final Queue f37713b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    private final oiu f37714c;

    /* renamed from: d */
    private volatile int f37715d = 1;

    public oim(oiu oiu) {
        this.f37714c = oiu;
    }

    /* renamed from: a */
    public final int mo22190a() {
        return Math.max(this.f37715d - this.f37712a.availablePermits(), 0);
    }

    /* renamed from: b */
    public final void mo22193b() {
        this.f37712a.drainPermits();
        this.f37712a.release(this.f37715d);
        this.f37714c.mo20694c(this.f37712a.availablePermits());
        this.f37713b.clear();
    }

    /* renamed from: c */
    public final void mo22194c() {
        this.f37712a.release(100000);
        this.f37714c.mo20694c(this.f37712a.availablePermits());
    }

    /* renamed from: d */
    public final boolean mo22195d() {
        boolean tryAcquire = this.f37712a.tryAcquire(300, TimeUnit.MILLISECONDS);
        if (!tryAcquire) {
            this.f37714c.mo20691b();
            if (!this.f37713b.isEmpty()) {
                this.f37713b.poll();
            }
        }
        this.f37714c.mo20694c(this.f37712a.availablePermits());
        this.f37713b.add(Long.valueOf(SystemClock.elapsedRealtimeNanos()));
        return tryAcquire;
    }

    /* renamed from: a */
    public final void mo22191a(int i) {
        this.f37712a.release(i);
        this.f37714c.mo20694c(this.f37712a.availablePermits());
        while (i > 0 && !this.f37713b.isEmpty()) {
            i--;
            Long l = (Long) this.f37713b.poll();
            if (l != null) {
                this.f37714c.mo20690a((SystemClock.elapsedRealtimeNanos() - l.longValue()) / 1000);
            }
        }
    }

    /* renamed from: b */
    public final void mo22196b(int i) {
        this.f37715d = i;
        this.f37714c.mo20692b(i);
        mo22193b();
    }

    /* renamed from: a */
    public final void mo22192a(PrintWriter printWriter) {
        printWriter.print("max unacked=");
        printWriter.print(this.f37715d);
        printWriter.print(" unacked frames=");
        printWriter.println(mo22190a());
    }
}
