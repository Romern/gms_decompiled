package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;

/* renamed from: ahfy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahfy {

    /* renamed from: a */
    long f67134a;

    /* renamed from: b */
    long f67135b;

    /* renamed from: c */
    private final SharedPreferences f67136c;

    public ahfy(Context context) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        SharedPreferences sharedPreferences = context.getSharedPreferences("salter_pref", 0);
        this.f67136c = sharedPreferences;
        this.f67134a = sharedPreferences.getLong("salt_elapsed_realtime_millis", elapsedRealtime);
        this.f67135b = this.f67136c.getLong("salt_last_used_time_millis", elapsedRealtime);
        if (this.f67136c.contains("salt_elapsed_realtime_millis") && this.f67136c.contains("salt_last_used_time_millis")) {
            if (!cfos.f185168a.mo6606a().mo82254f()) {
                return;
            }
            if (elapsedRealtime >= this.f67134a && elapsedRealtime >= this.f67135b) {
                return;
            }
        }
        m55676a(elapsedRealtime);
    }

    /* renamed from: a */
    private final void m55676a(long j) {
        this.f67134a = j;
        this.f67136c.edit().putLong("salt_elapsed_realtime_millis", this.f67134a).apply();
        m55677b(j);
    }

    /* renamed from: b */
    private final void m55677b(long j) {
        this.f67135b = j;
        this.f67136c.edit().putLong("salt_last_used_time_millis", this.f67135b).apply();
    }

    /* renamed from: a */
    public final long mo36414a(String str) {
        if (str == null) {
            return 0;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f67135b > cfos.f185168a.mo6606a().mo82259k() || elapsedRealtime - this.f67134a > cfos.f185168a.mo6606a().mo82261m()) {
            m55676a(elapsedRealtime);
        } else if (elapsedRealtime - this.f67135b > cfos.f185168a.mo6606a().mo82260l()) {
            m55677b(elapsedRealtime);
        }
        bnzd a = bnzi.m110900b().mo68732a();
        a.mo68727a(str);
        a.mo68713a(this.f67134a);
        return a.mo68729a().mo68742d();
    }
}
