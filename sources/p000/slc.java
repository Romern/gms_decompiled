package p000;

import android.util.Log;
import com.google.android.gms.common.stats.StatsEvent;
import com.google.android.gms.common.stats.WakeLockEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: slc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class slc implements Runnable {

    /* renamed from: a */
    final String f44668a;

    /* renamed from: b */
    final Object f44669b;

    /* renamed from: c */
    final /* synthetic */ slf f44670c;

    public slc(slf slf, String str, StatsEvent statsEvent, StatsEvent statsEvent2) {
        this.f44670c = slf;
        this.f44668a = str;
        WakeLockEvent wakeLockEvent = (WakeLockEvent) statsEvent;
        WakeLockEvent wakeLockEvent2 = new WakeLockEvent(wakeLockEvent.f30356a, wakeLockEvent.f30357b, wakeLockEvent.f30358c, wakeLockEvent.f30359d, wakeLockEvent.f30362g, wakeLockEvent.f30363h, wakeLockEvent.f30364i, wakeLockEvent.f30365j, wakeLockEvent.f30366k, wakeLockEvent.f30360e, wakeLockEvent.f30367l, wakeLockEvent.f30368m, wakeLockEvent.f30369n, wakeLockEvent.f30361f, wakeLockEvent.f30370o);
        WakeLockEvent wakeLockEvent3 = (WakeLockEvent) statsEvent2;
        wakeLockEvent2.f30358c = wakeLockEvent3.f30358c;
        wakeLockEvent2.f30371p = wakeLockEvent3.f30365j - wakeLockEvent.f30365j;
        this.f44669b = wakeLockEvent2;
    }

    public final void run() {
        sqm sqm;
        slf slf = this.f44670c;
        String str = this.f44668a;
        Object obj = this.f44669b;
        synchronized (slf.f44682f) {
            sqm = (sqm) slf.f44682f.get(str);
            sso sso = new sso(slf.f44679c, str);
            if (sqm == null || !sso.exists()) {
                sqm sqm2 = new sqm(sso, slf.f44681e.f44667a, ((Long) skm.f44637f.mo58455c()).longValue(), TimeUnit.MILLISECONDS, ((Integer) skm.f44638g.mo58455c()).intValue());
                sqm sqm3 = (sqm) slf.f44682f.put(str, sqm2);
                if (sqm3 != null) {
                    try {
                        sqm3.mo25980b();
                        sqm3.close();
                    } catch (IOException e) {
                    }
                }
                sqm = sqm2;
            }
        }
        try {
            sqm.append(obj.toString());
            sqm.append("\n");
        } catch (IOException e2) {
            Log.e("StatisticalEventTracker", "Failed to write event.", e2);
        }
    }

    public slc(slf slf, String str, Object obj) {
        this.f44670c = slf;
        this.f44668a = str;
        this.f44669b = obj;
    }
}
