package p000;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;

/* renamed from: ssk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ssk {

    /* renamed from: a */
    public static final /* synthetic */ int f45087a = 0;

    static {
        try {
            try {
                ConnectivityManager.class.getMethod("isNetworkSupported", Integer.TYPE).setAccessible(true);
            } catch (Exception e) {
            }
        } catch (Exception e2) {
        }
    }

    /* renamed from: a */
    public static boolean m36235a(Context context) {
        NetworkInfo c = m36239c(context);
        return c != null && c.isConnectedOrConnecting();
    }

    /* renamed from: b */
    public static boolean m36238b(Context context) {
        NetworkInfo c = m36239c(context);
        return c == null || !c.isConnectedOrConnecting() || c.isRoaming();
    }

    /* renamed from: c */
    public static NetworkInfo m36239c(Context context) {
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
    }

    /* renamed from: d */
    public static NetworkInfo m36240d(Context context) {
        ConnectivityManager f = m36242f(context);
        if (f != null) {
            return f.getActiveNetworkInfo();
        }
        return null;
    }

    @Deprecated
    /* renamed from: e */
    public static boolean m36241e(Context context) {
        ConnectivityManager f = m36242f(context);
        int i = Build.VERSION.SDK_INT;
        if (f != null) {
            return f.isDefaultNetworkActive();
        }
        return false;
    }

    /* renamed from: f */
    public static ConnectivityManager m36242f(Context context) {
        try {
            return (ConnectivityManager) context.getSystemService("connectivity");
        } catch (SecurityException e) {
            Log.e("NetworkUtils", "Couldn't retrieve ConnectivityManager.", e);
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m36236a(Context context, int i) {
        int i2;
        ConnectivityManager f = m36242f(context);
        int i3 = Build.VERSION.SDK_INT;
        int i4 = i - 1;
        if (i4 != 0) {
            i2 = i4 != 1 ? 3 : 1;
        } else {
            i2 = 0;
        }
        Network[] allNetworks = f.getAllNetworks();
        if (allNetworks != null) {
            for (Network network : allNetworks) {
                if (f.getNetworkCapabilities(network).hasTransport(i2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m36237a(Context context, String str) {
        Intent intent = new Intent("android.intent.action.DIAL");
        String valueOf = String.valueOf(str);
        intent.setData(Uri.parse(valueOf.length() == 0 ? new String("tel:") : "tel:".concat(valueOf)));
        return context.getPackageManager().queryIntentActivities(intent, 0).size() > 0;
    }
}
