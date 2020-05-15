package p000;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* renamed from: bjje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjje {

    /* renamed from: a */
    static final String f122816a = String.format(Locale.US, "http://localhost:%d/", 8887);

    /* renamed from: a */
    public static String m103643a(int i) {
        String str;
        if (i == 0) {
            str = "https://payments-pa.sandbox.googleapis.com/";
        } else if (i == 1) {
            str = "https://payments-pa.googleapis.com/";
        } else if (i == 22) {
            str = f122816a;
        } else if (i == 23) {
            str = "http://localhost:8582/";
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "Unknown environment: %d", Integer.valueOf(i)));
        }
        return String.valueOf(str).concat("payments/apis-secure/ui2/");
    }

    /* renamed from: b */
    public static String m103645b(int i) {
        return i != 1 ? "oauth2:https://www.googleapis.com/auth/sierrasandbox" : "oauth2:https://www.googleapis.com/auth/sierra";
    }

    /* renamed from: c */
    public static String m103646c(int i) {
        if (i == 0) {
            return "instrumentmanagerservice/initialize";
        }
        if (i == 1 || i == 2) {
            return "buyflowservice/initialize";
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Initialize not supported for widgetType: %d", Integer.valueOf(i)));
    }

    /* renamed from: d */
    public static String m103647d(int i) {
        if (i == 0) {
            return "instrumentmanagerservice/submit";
        }
        if (i == 1 || i == 2) {
            return "buyflowservice/submit";
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Initialize not supported for widgetType: %d", Integer.valueOf(i)));
    }

    /* renamed from: a */
    public static void m103644a(HashMap hashMap, List list) {
        boolean z;
        int size = list.size();
        if (size % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "Header arrays must have matching names and values");
        for (int i = 0; i < size; i += 2) {
            String str = (String) list.get(i);
            bmxy.m108589a(!TextUtils.isEmpty(str), "Header names must be non empty.");
            hashMap.put(str, (String) list.get(i + 1));
        }
    }
}
