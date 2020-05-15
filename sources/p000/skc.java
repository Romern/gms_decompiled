package p000;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.WorkSource;
import android.util.Log;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: skc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class skc {

    /* renamed from: a */
    public static final long f44599a = m35504a("WINDOW_EXACT");

    /* renamed from: b */
    static final long f44600b = m35504a("WINDOW_HEURISTIC");

    /* renamed from: c */
    static final int f44601c = m35507b("FLAG_STANDALONE");

    /* renamed from: d */
    static final int f44602d = m35507b("FLAG_WAKE_FROM_IDLE");

    /* renamed from: e */
    public final AlarmManager f44603e;

    /* renamed from: f */
    public final Context f44604f;

    /* renamed from: g */
    final AtomicInteger f44605g = new AtomicInteger(0);

    /* renamed from: h */
    private final boolean f44606h;

    /* renamed from: i */
    private final boolean f44607i;

    /* renamed from: j */
    private final Random f44608j = new Random();

    public skc(Context context) {
        Context applicationContext = context.getApplicationContext();
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = context.getApplicationInfo().targetSdkVersion;
        boolean z = false;
        sdo.m34959a(applicationContext);
        this.f44604f = applicationContext;
        sdo.m34959a(alarmManager);
        this.f44603e = alarmManager;
        this.f44606h = i < 19 ? true : z;
        if (skf.f44610a == null) {
            skf.f44610a = new skf();
        }
        this.f44607i = stx.m36339a(this.f44604f);
    }

    /* renamed from: a */
    private static long m35504a(String str) {
        try {
            return ((Long) AlarmManager.class.getDeclaredField(str).get(null)).longValue();
        } catch (Exception e) {
            return -1;
        }
    }

    /* renamed from: a */
    public static final boolean m35506a(long j) {
        return j > 0;
    }

    /* renamed from: b */
    private static int m35507b(String str) {
        try {
            return ((Integer) AlarmManager.class.getDeclaredField(str).get(null)).intValue();
        } catch (Exception e) {
            return -1;
        }
    }

    /* renamed from: a */
    public final long mo25667a() {
        return !this.f44606h ? f44600b : f44599a;
    }

    /* renamed from: a */
    private final void m35505a(IllegalStateException illegalStateException) {
        Log.e("AlarmManager", "Too many alarms, choosing not to crash here.", illegalStateException);
        if (this.f44608j.nextInt(this.f44605g.incrementAndGet()) == 0) {
            sqx.m36054a(this.f44604f, illegalStateException, 134217728);
        }
    }

    /* renamed from: b */
    public final void mo25679b(String str, int i, long j, PendingIntent pendingIntent) {
        if (m35506a(j)) {
            try {
                this.f44603e.setExactAndAllowWhileIdle(i, j, pendingIntent);
                skf.m35529a(this.f44604f, i, str, j, f44599a, 0, null, f44602d | f44601c);
                blkh.m107294b("AlarmManager");
            } catch (SecurityException e) {
                Log.e("AlarmManager", "Failed to set alarm", e);
            } catch (IllegalStateException e2) {
                m35505a(e2);
            }
        }
    }

    /* renamed from: a */
    public final void mo25668a(PendingIntent pendingIntent) {
        this.f44603e.cancel(pendingIntent);
    }

    /* renamed from: a */
    public final void mo25669a(String str, int i, long j, long j2, long j3, PendingIntent pendingIntent, WorkSource workSource) {
        if (m35506a(j)) {
            WorkSource workSource2 = !this.f44607i ? null : workSource;
            try {
                this.f44603e.set(i, j, j2, j3, pendingIntent, workSource2);
                mo25670a(str, i, j, j2, j3, workSource2);
            } catch (SecurityException e) {
                Log.e("AlarmManager", "Failed to set alarm", e);
            } catch (IllegalStateException e2) {
                m35505a(e2);
            }
        }
    }

    /* renamed from: b */
    public final void mo25680b(String str, int i, long j, PendingIntent pendingIntent, WorkSource workSource) {
        mo25669a(str, i, j, f44599a, 0, pendingIntent, workSource);
    }

    /* renamed from: b */
    public final void mo25681b(String str, int i, long j, PendingIntent pendingIntent, String str2) {
        mo25680b(str, i, j, pendingIntent, stx.m36335a(this.f44604f, str2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo25670a(String str, int i, long j, long j2, long j3, WorkSource workSource) {
        long j4;
        int i2 = i;
        if (i2 == 2 || i2 == 0) {
            int i3 = j2 == f44599a ? f44601c : 0;
            if (i2 == 2) {
                j4 = j - SystemClock.elapsedRealtime();
            } else {
                j4 = j - System.currentTimeMillis();
            }
            skf.m35529a(this.f44604f, i, str, j4, j2, j3, stx.m36340b(workSource), i3);
            blkh.m107294b("AlarmManager");
        }
    }

    /* renamed from: a */
    public final void mo25671a(String str, int i, long j, long j2, PendingIntent pendingIntent, String str2) {
        WorkSource a = stx.m36335a(this.f44604f, str2);
        if (m35506a(j)) {
            int i2 = Build.VERSION.SDK_INT;
            mo25669a(str, i, j, f44600b, j2, pendingIntent, a);
        }
    }

    /* renamed from: a */
    public final void mo25672a(String str, int i, long j, long j2, skb skb, Handler handler, WorkSource workSource) {
        WorkSource workSource2;
        if (m35506a(j)) {
            if (this.f44607i) {
                workSource2 = workSource;
            } else {
                workSource2 = null;
            }
            try {
                this.f44603e.set(i, j, j2, 0, skb, handler, workSource2);
                mo25670a(str, i, j, j2, 0, workSource2);
            } catch (SecurityException e) {
                Log.e("AlarmManager", "Failed to set alarm", e);
            } catch (IllegalStateException e2) {
                m35505a(e2);
            }
        }
    }

    /* renamed from: a */
    public final void mo25673a(String str, int i, long j, PendingIntent pendingIntent) {
        if (m35506a(j)) {
            try {
                this.f44603e.setAndAllowWhileIdle(i, j, pendingIntent);
                skf.m35529a(this.f44604f, i, str, j, f44599a, 0, null, f44602d);
                blkh.m107294b("AlarmManager");
            } catch (SecurityException e) {
                Log.e("AlarmManager", "Failed to set alarm", e);
            } catch (IllegalStateException e2) {
                m35505a(e2);
            }
        }
    }

    /* renamed from: a */
    public final void mo25674a(String str, int i, long j, PendingIntent pendingIntent, WorkSource workSource) {
        if (m35506a(j)) {
            int i2 = Build.VERSION.SDK_INT;
            mo25669a(str, i, j, mo25667a(), 0, pendingIntent, workSource);
        }
    }

    /* renamed from: a */
    public final void mo25675a(String str, int i, long j, PendingIntent pendingIntent, String str2) {
        mo25674a(str, i, j, pendingIntent, stx.m36335a(this.f44604f, str2));
    }

    /* renamed from: a */
    public final void mo25676a(String str, int i, long j, skb skb, String str2) {
        mo25672a(str, i, j, mo25667a(), skb, (Handler) null, stx.m36335a(this.f44604f, str2));
    }

    /* renamed from: a */
    public final void mo25677a(String str, long j, PendingIntent pendingIntent) {
        int i = Build.VERSION.SDK_INT;
        mo25679b(str.length() == 0 ? new String("RemindersNS") : "RemindersNS".concat(str), 0, j, pendingIntent);
    }

    /* renamed from: a */
    public final void mo25678a(skb skb) {
        this.f44603e.cancel(skb);
    }
}
