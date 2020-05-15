package p000;

import android.os.SystemClock;
import java.io.PrintWriter;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: oiq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class oiq implements oil {

    /* renamed from: a */
    private final Queue f37719a = new ConcurrentLinkedQueue();

    /* renamed from: b */
    private final oiu f37720b;

    /* renamed from: c */
    private final int f37721c;

    public oiq(oiu oiu, int i) {
        this.f37720b = oiu;
        this.f37721c = i;
        oiu.mo20692b(i);
        oiu.mo20694c(i);
    }

    /* renamed from: a */
    public static oit m28857a(oiu oiu) {
        return new oio(new oip(oiu));
    }

    /* renamed from: b */
    public final void mo22193b() {
        this.f37719a.clear();
        this.f37720b.mo20694c(this.f37721c);
    }

    /* renamed from: c */
    public final void mo22194c() {
    }

    /* renamed from: d */
    public final boolean mo22195d() {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() - 300000000;
        while (true) {
            Long l = (Long) this.f37719a.peek();
            if (l == null || l.longValue() > elapsedRealtimeNanos) {
                this.f37720b.mo20694c(this.f37721c - this.f37719a.size());
                this.f37719a.add(Long.valueOf(SystemClock.elapsedRealtimeNanos()));
            } else {
                this.f37719a.poll();
                this.f37720b.mo20691b();
            }
        }
        this.f37720b.mo20694c(this.f37721c - this.f37719a.size());
        this.f37719a.add(Long.valueOf(SystemClock.elapsedRealtimeNanos()));
        return true;
    }

    /* renamed from: a */
    public final int mo22190a() {
        return this.f37719a.size();
    }

    /* renamed from: a */
    public final void mo22191a(int i) {
        if (i > 0) {
            this.f37720b.mo20694c(this.f37721c - this.f37719a.size());
            while (i > 0 && !this.f37719a.isEmpty()) {
                i--;
                Long l = (Long) this.f37719a.poll();
                if (l != null) {
                    this.f37720b.mo20690a((SystemClock.elapsedRealtimeNanos() - l.longValue()) / 1000);
                }
            }
            return;
        }
        throw new IllegalArgumentException("ackCount must be a positive number.");
    }

    /* renamed from: a */
    public final void mo22192a(PrintWriter printWriter) {
        printWriter.print("max unacked=");
        printWriter.print(this.f37721c);
        printWriter.print(" unacked frames=");
        printWriter.println(mo22190a());
    }
}
