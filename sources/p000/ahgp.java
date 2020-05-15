package p000;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: ahgp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahgp {

    /* renamed from: a */
    public boolean f67174a;

    /* renamed from: b */
    private final Context f67175b;

    /* renamed from: c */
    private final sey f67176c;

    /* renamed from: d */
    private final bmzu f67177d;

    /* renamed from: e */
    private sex f67178e;

    /* renamed from: f */
    private final Handler f67179f = new adzt(Looper.getMainLooper());

    private ahgp(Context context) {
        bmzz a = bmzz.m108708a();
        a.mo66953a(100L);
        a.mo66959b(300, TimeUnit.MILLISECONDS);
        this.f67177d = a.mo66962d();
        this.f67175b = context;
        this.f67176c = sey.m35126a(context);
    }

    /* renamed from: a */
    public static ahgp m55715a(Context context) {
        return new ahgp(context);
    }

    /* renamed from: b */
    private final boolean m55719b(ahgo ahgo) {
        if (this.f67174a) {
            return m55717a(ahgo);
        }
        return false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: a */
    private final void m55716a(ahgo ahgo, Runnable runnable) {
        long j;
        Long l = (Long) this.f67177d.mo66947b(ahgo);
        if (l != null) {
            j = SystemClock.elapsedRealtime() - l.longValue();
        } else {
            j = Long.MAX_VALUE;
        }
        this.f67179f.postDelayed(runnable, Math.max(0L, 300 - j));
    }

    /* renamed from: a */
    private final boolean m55717a(ahgo ahgo) {
        return this.f67177d.mo66947b(ahgo) != null;
    }

    /* renamed from: a */
    private final boolean m55718a(ahgo ahgo, Notification notification) {
        if (this.f67174a && m55717a(ahgo)) {
            int i = Build.VERSION.SDK_INT;
            if (!notification.extras.containsKey("android.progress") || !notification.extras.containsKey("android.progressMax") || !notification.extras.containsKey("android.progressIndeterminate") || notification.extras.getInt("android.progressMax") == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final NotificationChannel mo36447a(String str) {
        return mo36448a().mo25437a(str);
    }

    /* renamed from: a */
    public final sex mo36448a() {
        if (this.f67178e == null) {
            this.f67178e = sex.m35104a(this.f67175b);
        }
        sex sex = this.f67178e;
        if (sex != null) {
            return sex;
        }
        throw new IllegalStateException("No notification manager");
    }

    /* renamed from: a */
    public final void mo36449a(int i) {
        this.f67176c.mo25456a(i);
        this.f67177d.mo66948c(new ahgo(i));
    }

    /* renamed from: a */
    public final void mo36450a(int i, Notification notification) {
        ahgo ahgo = new ahgo(i);
        if (m55718a(ahgo, notification)) {
            return;
        }
        if (m55719b(ahgo)) {
            m55716a(ahgo, new ahgm(this, i, notification));
            return;
        }
        this.f67177d.mo66946a(ahgo, Long.valueOf(SystemClock.elapsedRealtime()));
        this.f67176c.mo25457a(i, notification);
    }

    /* renamed from: a */
    public final void mo36451a(NotificationChannel notificationChannel) {
        mo36448a().mo25442a(notificationChannel);
    }

    /* renamed from: a */
    public final void mo36452a(NotificationChannelGroup notificationChannelGroup) {
        mo36448a().mo25443a(notificationChannelGroup);
    }

    /* renamed from: a */
    public final void mo36453a(String str, int i) {
        this.f67176c.mo25458a(str, i);
        this.f67177d.mo66948c(new ahgo(str, i));
    }

    /* renamed from: a */
    public final void mo36454a(String str, int i, Notification notification) {
        ahgo ahgo = new ahgo(str, i);
        if (m55718a(ahgo, notification)) {
            return;
        }
        if (m55719b(ahgo)) {
            m55716a(ahgo, new ahgn(this, str, i, notification));
            return;
        }
        this.f67177d.mo66946a(ahgo, Long.valueOf(SystemClock.elapsedRealtime()));
        this.f67176c.mo25459a(str, i, notification);
    }
}
