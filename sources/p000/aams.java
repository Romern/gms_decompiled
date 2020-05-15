package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.format.DateUtils;
import android.util.Log;

/* renamed from: aams */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aams {

    /* renamed from: a */
    final skc f28489a;

    /* renamed from: b */
    public final asfb f28490b;

    /* renamed from: c */
    public long f28491c;

    /* renamed from: d */
    private final Intent f28492d;

    /* renamed from: e */
    private final PendingIntent f28493e;

    /* renamed from: f */
    private long f28494f;

    public aams(Context context, String str, String str2) {
        this.f28489a = new skc(context);
        asfb asfb = new asfb(context, str, (String) null);
        this.f28490b = asfb;
        asfb.mo49115a(false);
        Intent intent = new Intent(str2);
        this.f28492d = intent;
        this.f28493e = PendingIntent.getBroadcast(context, 0, intent, 0);
    }

    /* renamed from: a */
    public final long mo17055a() {
        long j;
        synchronized (this) {
            j = this.f28494f;
        }
        return j;
    }

    /* renamed from: b */
    public final void mo17057b() {
        synchronized (this) {
            if (this.f28492d != null) {
                mo17059d();
                this.f28493e.cancel();
            }
        }
    }

    /* renamed from: c */
    public final boolean mo17058c() {
        boolean z;
        synchronized (this) {
            z = this.f28494f != 0;
        }
        return z;
    }

    /* renamed from: d */
    public final void mo17059d() {
        synchronized (this) {
            if (this.f28494f != 0) {
                this.f28489a.mo25668a(this.f28493e);
                this.f28494f = 0;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("alarm(");
        if (this.f28492d == null) {
            sb.append("STOPPED");
        } else {
            sb.append(DateUtils.formatElapsedTime((this.f28494f - SystemClock.elapsedRealtime()) / 1000));
            sb.append(" initial: ");
            sb.append(this.f28491c / 1000);
            sb.append("s");
        }
        if (this.f28490b.mo49124e()) {
            sb.append(" WAKE_LOCK");
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo17056a(long j) {
        synchronized (this) {
            if (this.f28494f != 0) {
                try {
                    mo17059d();
                } catch (SecurityException e) {
                    String message = e.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 94);
                    sb.append("Failed to cancel previous alarms due to SecurityException. ");
                    sb.append(message);
                    sb.append(". Previous alarms will stay active.");
                    Log.e("GCM", sb.toString());
                }
            }
            this.f28491c = j;
            long elapsedRealtime = SystemClock.elapsedRealtime() + j;
            this.f28494f = elapsedRealtime;
            aajg.m21338a(this.f28489a, "Gcm-Alarm", elapsedRealtime, this.f28493e);
        }
    }
}
