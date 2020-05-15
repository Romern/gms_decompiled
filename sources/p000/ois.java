package p000;

import android.os.SystemClock;
import java.io.PrintWriter;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: ois */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ois implements oil {

    /* renamed from: a */
    private final Queue f37723a = new ConcurrentLinkedQueue();

    /* renamed from: b */
    private final Semaphore f37724b;

    /* renamed from: c */
    private final oiu f37725c;

    /* renamed from: d */
    private final int f37726d;

    public ois(oiu oiu, int i) {
        this.f37725c = oiu;
        this.f37726d = i;
        this.f37724b = new Semaphore(i);
        oiu.mo20692b(i);
        oiu.mo20694c(this.f37724b.availablePermits());
    }

    /* renamed from: a */
    public static oit m28865a(oiu oiu) {
        return new oio(new oir(oiu));
    }

    /* renamed from: b */
    public final void mo22193b() {
        this.f37724b.drainPermits();
        this.f37724b.release(this.f37726d);
        this.f37725c.mo20694c(this.f37724b.availablePermits());
        this.f37723a.clear();
    }

    /* renamed from: c */
    public final void mo22194c() {
        this.f37724b.release(100000);
        this.f37725c.mo20694c(this.f37724b.availablePermits());
    }

    /* renamed from: d */
    public final boolean mo22195d() {
        boolean tryAcquire = this.f37724b.tryAcquire(300, TimeUnit.MILLISECONDS);
        if (!tryAcquire) {
            this.f37724b.drainPermits();
            this.f37724b.release(this.f37726d - 1);
            this.f37723a.clear();
            for (int i = 0; i < this.f37726d; i++) {
                this.f37725c.mo20691b();
            }
        }
        this.f37725c.mo20694c(this.f37724b.availablePermits());
        this.f37723a.add(Long.valueOf(SystemClock.elapsedRealtimeNanos()));
        return tryAcquire;
    }

    /* renamed from: a */
    public final int mo22190a() {
        return Math.max(this.f37726d - this.f37724b.availablePermits(), 0);
    }

    /* renamed from: a */
    public final void mo22191a(int i) {
        if (i > 0) {
            this.f37724b.release(i);
            this.f37725c.mo20694c(this.f37724b.availablePermits());
            while (i > 0 && !this.f37723a.isEmpty()) {
                i--;
                Long l = (Long) this.f37723a.poll();
                if (l != null) {
                    this.f37725c.mo20690a((SystemClock.elapsedRealtimeNanos() - l.longValue()) / 1000);
                }
            }
            return;
        }
        throw new IllegalArgumentException("ackCount must be a positive number.");
    }

    /* renamed from: a */
    public final void mo22192a(PrintWriter printWriter) {
        printWriter.print("max unacked=");
        printWriter.print(this.f37726d);
        printWriter.print(" unacked frames=");
        printWriter.println(mo22190a());
    }
}
