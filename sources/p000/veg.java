package p000;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: veg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class veg {

    /* renamed from: a */
    private final ConnectivityManager f49115a;

    public veg(ConnectivityManager connectivityManager) {
        this.f49115a = connectivityManager;
    }

    /* renamed from: a */
    private static final boolean m40231a(NetworkInfo networkInfo) {
        return networkInfo != null && networkInfo.isConnected();
    }

    /* renamed from: b */
    public final vee mo28344b() {
        NetworkInfo c = mo28345c();
        if (!m40231a(c)) {
            return vee.DISCONNECTED;
        }
        int type = c.getType();
        if (type != 0) {
            if (type == 1) {
                return vee.WIFI;
            }
            if (!(type == 2 || type == 3 || type == 4 || type == 5)) {
                return vee.OTHER;
            }
        }
        return vee.MOBILE;
    }

    /* renamed from: c */
    public final NetworkInfo mo28345c() {
        return this.f49115a.getActiveNetworkInfo();
    }

    /* renamed from: a */
    public final boolean mo28343a() {
        return m40231a(mo28345c());
    }
}
