package p000;

import java.util.Map;

/* renamed from: zvs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zvs {
    /* renamed from: a */
    public static Object m46580a(Map map, Object obj, Object obj2) {
        synchronized (map) {
            Object obj3 = map.get(obj);
            if (obj3 != null) {
                return obj3;
            }
            map.put(obj, obj2);
            return obj2;
        }
    }
}
