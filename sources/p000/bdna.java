package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: bdna */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdna {

    /* renamed from: a */
    public static final bnrt f106024a = bnrt.m110178a("bdna");

    /* renamed from: a */
    public static int m91126a(Context context) {
        NetworkInfo activeNetworkInfo;
        int i = -1;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (!(connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null)) {
                i = activeNetworkInfo.getType();
            }
        } catch (SecurityException e) {
            bnrq bnrq = (bnrq) f106024a.mo68388c();
            bnrq.mo68437a(e);
            bnrq.mo68432a("bdna", "a", 36, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq.mo68405a("Failed to get network type, Please add: android.permission.ACCESS_NETWORK_STATE to AndroidManifest.xml");
        }
        int a = cinh.m150631a(i);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
