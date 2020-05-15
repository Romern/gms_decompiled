package p000;

import android.content.Context;
import android.location.LocationManager;
import android.net.NetworkScoreManager;
import android.os.Build;

/* renamed from: akmq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akmq {
    /* renamed from: b */
    public static boolean m60024b(Context context) {
        LocationManager locationManager;
        return m60023a(context) && soz.m35811h(context) && (locationManager = (LocationManager) context.getSystemService("location")) != null && locationManager.isProviderEnabled("network");
    }

    /* renamed from: c */
    public static void m60025c(Context context) {
        try {
            ((NetworkScoreManager) context.getSystemService("network_score")).clearScores();
        } catch (SecurityException e) {
            int i = eoa.f15378a;
        }
    }

    /* renamed from: a */
    public static boolean m60023a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return context.getPackageManager().hasSystemFeature("android.hardware.wifi") || Build.HARDWARE.contains("goldfish") || "ranchu".equals(Build.HARDWARE);
    }
}
