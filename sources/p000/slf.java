package p000;

import android.content.ComponentName;
import android.util.Log;
import com.google.android.gms.common.stats.AlarmEvent;
import com.google.android.gms.common.stats.WakeLockEvent;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: slf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class slf implements slg {

    /* renamed from: h */
    private static slf f44676h;

    /* renamed from: a */
    public final skq f44677a;

    /* renamed from: b */
    public final long f44678b;

    /* renamed from: c */
    public final File f44679c;

    /* renamed from: d */
    public final ScheduledExecutorService f44680d;

    /* renamed from: e */
    public final slb f44681e;

    /* renamed from: f */
    public final Map f44682f = new C1223np();

    /* renamed from: g */
    public final Map f44683g = new C1223np();

    /* renamed from: a */
    public static synchronized slf m35566a() {
        slf slf;
        synchronized (slf.class) {
            if (f44676h == null) {
                f44676h = new slf();
            }
            slf = f44676h;
        }
        return slf;
    }

    private slf() {
        if (rpr.m34216b() == null) {
            ComponentName componentName = skr.f44644a;
            this.f44677a = new skq(null);
            this.f44678b = 0;
            this.f44679c = null;
            this.f44680d = null;
            this.f44681e = null;
            return;
        }
        try {
            aymn.m84271b(rpr.m34216b().getContentResolver(), "gms:common:stats:writer", "gms:common:stats:wakeLocks", "gms:common:stats:alarms");
        } catch (SecurityException e) {
            Log.w("StatisticalEventTracker", "Failed to cache log levels", e);
        }
        skq skq = new skq();
        this.f44677a = skq;
        if (skq.f44643c) {
            this.f44679c = aytw.m84817d(rpr.m34216b()).getDir("stats", 0);
            this.f44681e = new slb();
            this.f44680d = snp.m35703a(1, 10);
            this.f44678b = ((Long) skl.f44627b.mo58455c()).longValue();
            return;
        }
        this.f44678b = 0;
        this.f44679c = null;
        this.f44680d = null;
        this.f44681e = null;
    }

    /* renamed from: a */
    public final int mo25703a(int i) {
        skq skq = this.f44677a;
        if (i == 1) {
            return skq.f44641a;
        }
        if (i == 3) {
            return skq.f44642b;
        }
        ComponentName componentName = skr.f44644a;
        return 0;
    }

    /* renamed from: a */
    public final void mo25704a(AlarmEvent alarmEvent) {
        if (this.f44677a.mo25698a("alarms")) {
            int i = this.f44677a.f44642b;
            ComponentName componentName = skr.f44644a;
            if (i != 0) {
                ((sny) this.f44680d).submit(new slc(this, "alarms", alarmEvent));
            }
        }
    }

    /* renamed from: a */
    public final void mo25705a(WakeLockEvent wakeLockEvent) {
        long j;
        sld sld;
        if (this.f44677a.mo25698a("wakelocks")) {
            int i = wakeLockEvent.f30358c;
            if (i != 7) {
                if (i != 8) {
                    if (i != 10) {
                        if (i != 11) {
                            if (i == 16 && this.f44677a.mo25697a(wakeLockEvent)) {
                                wakeLockEvent.f30371p = wakeLockEvent.f30365j;
                                this.f44680d.execute(new slc(this, "wakelocks", wakeLockEvent));
                                return;
                            }
                            return;
                        }
                    }
                }
                if (this.f44677a.mo25697a(wakeLockEvent)) {
                    synchronized (this.f44683g) {
                        sld = (sld) this.f44683g.remove(wakeLockEvent.f30364i);
                    }
                    if (sld != null) {
                        ScheduledFuture scheduledFuture = sld.f44672b;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(true);
                        }
                        this.f44680d.execute(new slc(this, "wakelocks", sld.f44671a, wakeLockEvent));
                        return;
                    }
                    Log.w("StatisticalEventTracker", "Close event missing open event.");
                    return;
                }
                return;
            }
            synchronized (this.f44683g) {
                sld sld2 = new sld(wakeLockEvent);
                this.f44683g.put(wakeLockEvent.f30364i, sld2);
                skq skq = this.f44677a;
                int i2 = wakeLockEvent.f30358c;
                if (i2 == 7 || i2 == 10) {
                    if ((skq.f44641a & skr.f44645b) != 0) {
                        sle sle = new sle(this, "wakelocks", sld2.f44671a);
                        ScheduledExecutorService scheduledExecutorService = this.f44680d;
                        long j2 = ((WakeLockEvent) sld2.f44671a).f30369n;
                        if (j2 != 0) {
                            j = Math.min(j2, this.f44678b);
                        } else {
                            j = this.f44678b;
                        }
                        sld2.f44672b = ((sny) scheduledExecutorService).schedule(sle, j, TimeUnit.MILLISECONDS);
                    }
                }
            }
        }
    }
}
