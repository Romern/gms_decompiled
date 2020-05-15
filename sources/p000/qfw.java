package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.concurrent.TimeUnit;

/* renamed from: qfw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qfw extends qfu {

    /* renamed from: a */
    private static final Logger f41136a = qgn.m32143a("NetworkBackoffDelayComputer");

    /* renamed from: b */
    private final Object f41137b = new Object();

    /* renamed from: c */
    private final rtj f41138c;

    /* renamed from: d */
    private final Context f41139d;

    public qfw(Context context) {
        this.f41138c = qey.m32045a(context, "network_backoff_shared_pref_name");
        this.f41139d = context;
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
    public final long mo24020a(long j, Bundle bundle) {
        long j2;
        long j3;
        long j4;
        if (qfu.m32093a(bundle)) {
            f41136a.mo25412b("Ignore network delay for forced checkin.", new Object[0]);
            return 0;
        }
        synchronized (this.f41137b) {
            j2 = this.f41138c.getLong("backoff_stage", 0);
            j3 = this.f41138c.getLong("last_checkin_start_time", 0);
        }
        if (j2 != 0) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            double z = (double) cdci.f180455a.mo6606a().mo77263z();
            double pow = Math.pow((double) cdci.f180455a.mo6606a().mo77262y(), (double) (j2 - 1));
            Double.isNaN(z);
            j4 = timeUnit.toMillis((long) Math.min(z * pow, (double) cdci.f180455a.mo6606a().mo77225B()));
        } else {
            j4 = 0;
        }
        if (!qdn.m31951c(this.f41139d)) {
            f41136a.mo25412b("Enforcing smaller max delay for initial checkin.", new Object[0]);
            j4 = Math.min(cdci.f180455a.mo6606a().mo77224A(), j4);
        }
        return Math.max(0L, (j3 + j4) - j);
    }

    /* renamed from: a */
    public final String mo24021a() {
        return "NetworkBackoffDelayComputer";
    }

    /* renamed from: b */
    public final void mo24023b() {
        synchronized (this.f41137b) {
            SharedPreferences.Editor edit = this.f41138c.edit();
            edit.clear();
            edit.commit();
        }
    }

    /* renamed from: a */
    public final void mo24022a(long j, qda qda) {
        if (qda.f40962e != 3) {
            synchronized (this.f41137b) {
                long j2 = 0;
                long j3 = this.f41138c.getLong("backoff_stage", 0);
                int i = qda.f40962e;
                if (i != 2) {
                    if (i != 1) {
                        if (i != 0) {
                            j2 = j3;
                        }
                        SharedPreferences.Editor edit = this.f41138c.edit();
                        edit.putLong("backoff_stage", j2);
                        edit.putLong("last_checkin_start_time", j);
                        edit.commit();
                    }
                }
                j2 = 1 + j3;
                SharedPreferences.Editor edit2 = this.f41138c.edit();
                edit2.putLong("backoff_stage", j2);
                edit2.putLong("last_checkin_start_time", j);
                edit2.commit();
            }
        }
    }
}
