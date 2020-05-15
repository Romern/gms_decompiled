package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

/* renamed from: qfx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qfx extends qfu {

    /* renamed from: a */
    private final Object f41140a = new Object();

    /* renamed from: b */
    private final rtj f41141b;

    public qfx(Context context) {
        this.f41141b = qey.m32045a(context, "package_rate_limit_backoff_shared_pref_name");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: a */
    public final long mo24020a(long j, Bundle bundle) {
        long max;
        if (!cdci.f180455a.mo6606a().mo77250m()) {
            return 0;
        }
        String string = bundle.getString("checkin_source_package", "");
        String valueOf = String.valueOf(string);
        String str = valueOf.length() == 0 ? new String("package_last_checkin_time_") : "package_last_checkin_time_".concat(valueOf);
        synchronized (this.f41140a) {
            if (string.isEmpty() || !this.f41141b.contains(str)) {
                return 0;
            }
            synchronized (this.f41140a) {
                max = Math.max((this.f41141b.getLong(str, 0) + cdci.f180455a.mo6606a().mo77261x()) - j, 0L);
            }
            return max;
        }
    }

    /* renamed from: a */
    public final String mo24021a() {
        return "PackageRateLimitBackoffDelayComputer";
    }

    /* renamed from: b */
    public final void mo24023b() {
        synchronized (this.f41140a) {
            SharedPreferences.Editor edit = this.f41141b.edit();
            edit.clear();
            edit.commit();
        }
    }

    /* renamed from: a */
    public final void mo24022a(long j, qda qda) {
        qgu qgu = qda.f40961d;
        String str = null;
        if (qgu != null) {
            qhg qhg = qgu.f41235l;
            if (qhg == null) {
                qhg = qhg.f41336o;
            }
            if ((qhg.f41338a & 2048) != 0) {
                qhg qhg2 = qgu.f41235l;
                if (qhg2 == null) {
                    qhg2 = qhg.f41336o;
                }
                qhj qhj = qhg2.f41349l;
                if (qhj == null) {
                    qhj = qhj.f41354g;
                }
                str = qhj.f41359d;
            }
        }
        String b = bmxx.m108578b(str);
        if (!b.isEmpty()) {
            synchronized (this.f41140a) {
                SharedPreferences.Editor edit = this.f41141b.edit();
                edit.putLong(b.length() == 0 ? new String("package_last_checkin_time_") : "package_last_checkin_time_".concat(b), j);
                edit.commit();
            }
        }
    }
}
