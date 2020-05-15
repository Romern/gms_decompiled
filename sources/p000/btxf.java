package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: btxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btxf {

    /* renamed from: a */
    public static final Map f152795a;

    /* renamed from: b */
    public static final int[] f152796b = {0, 1, 2, 3, 4, 5, 6, 7};

    /* renamed from: c */
    public static final int f152797c = f152796b.length;

    static {
        HashMap hashMap = new HashMap();
        f152795a = hashMap;
        hashMap.put(0, "IN_VEHICLE");
        f152795a.put(1, "STILL_IN_VEHICLE");
        f152795a.put(2, "ON_BICYCLE");
        f152795a.put(3, "STILL_ON_BICYCLE");
        f152795a.put(4, "WALKING");
        f152795a.put(5, "RUNNING");
        f152795a.put(6, "STILL");
        f152795a.put(7, "UNKNOWN");
    }

    /* renamed from: a */
    public static boolean m118978a(int i) {
        return i == 0 || i == 1 || i == 2 || i == 3;
    }
}
