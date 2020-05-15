package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;

/* renamed from: bgsf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgsf extends bgtd {
    static {
        srn.m36125a("EAlert");
    }

    public bgsf(Context context, bgsq bgsq) {
        super(context, bgsq);
    }

    /* renamed from: a */
    static int m99841a(Context context) {
        if (!cevi.f183455a.mo6606a().enableConnectivityReporting()) {
            return -1;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return -2;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.getType();
        }
        return -3;
    }

    /* renamed from: b */
    static String m99842b(Context context) {
        TelephonyManager telephonyManager;
        if (!cevi.f183455a.mo6606a().enableOperatorReporting() || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
            return null;
        }
        return telephonyManager.getNetworkOperator();
    }

    /* renamed from: d */
    static boolean m99843d() {
        if (!cevi.f183455a.mo6606a().enable() || (!cevi.m138292g() && !cevi.m138290e())) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo63123e() {
        if (!m99843d() || C1145kt.m18540a(this.f117478a, "android.permission.ACCESS_COARSE_LOCATION") == -1) {
            return true;
        }
        if (cevi.m138298m() && !bgtd.m99887c(this.f117478a)) {
            return true;
        }
        if (!cevi.f183455a.mo6606a().disableForSupervised() || !bgtd.m99888d(this.f117478a)) {
            return super.mo63123e();
        }
        return true;
    }
}
