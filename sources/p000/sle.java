package p000;

import com.google.android.gms.common.stats.StatsEvent;
import com.google.android.gms.common.stats.WakeLockEvent;

/* renamed from: sle */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class sle implements Runnable {

    /* renamed from: a */
    final String f44673a;

    /* renamed from: b */
    final StatsEvent f44674b;

    /* renamed from: c */
    final /* synthetic */ slf f44675c;

    public sle(slf slf, String str, StatsEvent statsEvent) {
        this.f44675c = slf;
        this.f44673a = str;
        this.f44674b = statsEvent;
    }

    public final void run() {
        StatsEvent statsEvent;
        StatsEvent statsEvent2 = this.f44674b;
        WakeLockEvent wakeLockEvent = (WakeLockEvent) statsEvent2;
        long j = wakeLockEvent.f30369n;
        if (j != 0) {
            wakeLockEvent.f30371p = j;
        }
        int i = wakeLockEvent.f30358c;
        if (i == 7) {
            wakeLockEvent.f30358c = 9;
        } else if (i == 10) {
            wakeLockEvent.f30358c = 12;
        }
        slf slf = this.f44675c;
        ((sny) slf.f44680d).submit(new slc(slf, this.f44673a, statsEvent2));
        synchronized (this.f44675c.f44683g) {
            sld sld = (sld) this.f44675c.f44683g.get(((WakeLockEvent) this.f44674b).f30364i);
            if (sld != null && sld.f44671a == (statsEvent = this.f44674b)) {
                this.f44675c.f44683g.remove(((WakeLockEvent) statsEvent).f30364i);
            }
        }
    }
}
