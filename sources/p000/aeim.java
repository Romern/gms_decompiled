package p000;

import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.location.WifiScan;
import java.lang.reflect.Method;

/* renamed from: aeim */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeim {

    /* renamed from: a */
    private static final Method f63423a;

    /* renamed from: a */
    private static int m51883a(Location location, String str, int i) {
        Bundle extras = location.getExtras();
        return extras != null ? extras.getInt(str, i) : i;
    }

    /* renamed from: b */
    public static String m51893b(Location location) {
        return m51901e(location, "levelId");
    }

    /* renamed from: c */
    public static void m51896c(Location location, String str) {
        m51891a(location, "floorLabel", str);
    }

    /* renamed from: d */
    public static boolean m51898d(Location location) {
        return m51899d(location, "levelNumberE3");
    }

    /* renamed from: e */
    public static Integer m51900e(Location location) {
        int a = m51883a(location, "levelNumberE3", -1);
        if (a != -1) {
            return Integer.valueOf(a);
        }
        return null;
    }

    /* renamed from: f */
    public static String m51902f(Location location) {
        return m51901e(location, "floorLabel");
    }

    /* renamed from: g */
    public static boolean m51903g(Location location) {
        return m51899d(location, "floorLabel");
    }

    /* renamed from: h */
    public static boolean m51904h(Location location) {
        int i = Build.VERSION.SDK_INT;
        if (!location.hasVerticalAccuracy()) {
            return m51899d(location, "verticalAccuracy");
        }
        return true;
    }

    /* renamed from: i */
    public static float m51905i(Location location) {
        int i = Build.VERSION.SDK_INT;
        if (location.hasVerticalAccuracy()) {
            return location.getVerticalAccuracyMeters();
        }
        Bundle extras = location.getExtras();
        if (extras != null) {
            return extras.getFloat("verticalAccuracy", -1.0f);
        }
        return -1.0f;
    }

    /* renamed from: j */
    public static int m51906j(Location location) {
        return m51883a(location, "locationType", 0);
    }

    static {
        Method method;
        int i = Build.VERSION.SDK_INT;
        try {
            method = Location.class.getMethod("setIsFromMockProvider", Boolean.TYPE);
        } catch (Exception e) {
            method = null;
        }
        f63423a = method;
    }

    /* renamed from: b */
    public static void m51894b(Location location, String str) {
        m51891a(location, "levelId", str);
    }

    /* renamed from: c */
    public static boolean m51897c(Location location) {
        return m51899d(location, "levelId");
    }

    /* renamed from: d */
    public static boolean m51899d(Location location, String str) {
        Bundle extras = location.getExtras();
        if (extras != null) {
            return extras.containsKey(str);
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m51907k(Location location) {
        Bundle extras = location.getExtras();
        if (extras != null && extras.getBoolean("mockLocation", false)) {
            return true;
        }
        int i = Build.VERSION.SDK_INT;
        return location.isFromMockProvider();
    }

    /* renamed from: l */
    public static void m51908l(Location location) {
        Bundle extras = location.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.putBoolean("mockLocation", true);
        m51887a(location, extras);
        Method method = f63423a;
        if (method != null) {
            try {
                method.invoke(location, true);
            } catch (Exception e) {
            }
        }
    }

    /* renamed from: b */
    private static void m51895b(Location location, String str, int i) {
        Bundle extras = location.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.putInt(str, i);
        m51887a(location, extras);
    }

    /* renamed from: e */
    private static String m51901e(Location location, String str) {
        Bundle extras = location.getExtras();
        if (extras != null) {
            return extras.getString(str);
        }
        return null;
    }

    /* renamed from: a */
    public static Location m51884a(Location location, String str) {
        Parcelable parcelable;
        Bundle extras = location.getExtras();
        if (extras != null) {
            parcelable = extras.getParcelable(str);
        } else {
            parcelable = null;
        }
        return (Location) parcelable;
    }

    /* renamed from: a */
    public static void m51885a(Location location, float f) {
        int i = Build.VERSION.SDK_INT;
        location.setVerticalAccuracyMeters(f);
        Bundle extras = location.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.putFloat("verticalAccuracy", f);
        m51887a(location, extras);
    }

    /* renamed from: a */
    public static void m51886a(Location location, int i) {
        m51895b(location, "locationType", i);
    }

    /* renamed from: a */
    private static void m51887a(Location location, Bundle bundle) {
        if (bundle.isEmpty()) {
            bundle = null;
        }
        location.setExtras(bundle);
    }

    /* renamed from: a */
    public static void m51888a(Location location, WifiScan wifiScan) {
        byte[] bArr;
        if (wifiScan != null) {
            bArr = sef.m35074a(wifiScan);
        } else {
            bArr = null;
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            if (bArr != null) {
                extras = new Bundle();
            } else {
                return;
            }
        }
        if (bArr == null) {
            extras.remove("wifiScan");
        } else {
            extras.putByteArray("wifiScan", bArr);
        }
        m51887a(location, extras);
    }

    /* renamed from: a */
    public static void m51889a(Location location, Integer num) {
        if (num != null) {
            m51895b(location, "levelNumberE3", num.intValue());
            return;
        }
        Bundle extras = location.getExtras();
        if (extras != null) {
            extras.remove("levelNumberE3");
            m51887a(location, extras);
        }
    }

    /* renamed from: a */
    public static void m51890a(Location location, String str, Location location2) {
        Bundle extras = location.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.putParcelable(str, location2);
        m51887a(location, extras);
    }

    /* renamed from: a */
    private static void m51891a(Location location, String str, String str2) {
        Bundle extras = location.getExtras();
        if (extras == null) {
            if (str2 != null) {
                extras = new Bundle();
            } else {
                return;
            }
        }
        if (str2 == null) {
            extras.remove(str);
        } else {
            extras.putString(str, str2);
        }
        m51887a(location, extras);
    }

    /* renamed from: a */
    public static boolean m51892a(Location location) {
        return m51899d(location, "wifiScan");
    }
}
