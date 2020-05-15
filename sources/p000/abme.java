package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;

/* renamed from: abme */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abme {
    /* renamed from: a */
    public static String m47896a(Context context, String str) {
        if (str != null) {
            aylp a = abnd.m47941a();
            if (!aeri.m52437b(context)) {
                a.mo54076a(str, "location");
            }
            if (!aeri.m52434a(context)) {
                a.mo54076a(str, "location-accuracy");
            }
        }
        if (cekz.f182874a.mo6606a().mo79250a() && !aeri.m52437b(context)) {
            return "LOCATION_DISABLED";
        }
        if (cekz.f182874a.mo6606a().mo79251b() && !aeri.m52434a(context)) {
            return "LOCATION_ACCURACY_DISABLED";
        }
        if (cekz.f182874a.mo6606a().mo79253d()) {
            Account[] a2 = adyd.m51363a(rpr.m34216b()).mo33916a("com.google");
            if (a2.length == 0 || !abnq.m47960a(a2)) {
                return "USER_LOCATION_REPORTING_DISABLED";
            }
        }
        if (!aboe.m47991a(context)) {
            return "USAGE_REPORTING_DISABLED";
        }
        return null;
    }

    /* renamed from: a */
    public static void m47897a(Context context) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            abol abol = aboj.f57790a;
            if (Looper.myLooper() == null) {
                eoa.m10824a("Herrevad", "TSSL.maybeInitOnMainThread is called on a thread w/o looper", new Object[0]);
            } else {
                synchronized (abol.f57799h) {
                    if (abol.f57798g == null) {
                        abol.f57798g = new abok(abol);
                        int i = eoa.f15378a;
                    }
                }
            }
            aboj.f57790a.mo32243a(context);
            abmu abmu = abms.f57709a;
            if (Looper.myLooper() == null) {
                eoa.m10824a("Herrevad", "TSSL.maybeInitOnMainThread is called on a thread w/o looper", new Object[0]);
            } else {
                synchronized (abmu.f57711b) {
                    if (abmu.f57710a == null) {
                        abmu.f57710a = new abmt();
                        int i2 = eoa.f15378a;
                    }
                }
            }
            abms.f57709a.mo32219a(context);
            if (cekz.m137120c()) {
                abnm.f57737a.mo32223a(context);
                return;
            }
            return;
        }
        eoa.m10824a("Herrevad", "initOnMainThread must be called on main thread", new Object[0]);
    }

    /* renamed from: a */
    public static final boolean m47898a() {
        if (cekt.f182867a.mo6606a().mo79246b()) {
            return cekt.f182867a.mo6606a().mo79245a();
        }
        return true;
    }
}
