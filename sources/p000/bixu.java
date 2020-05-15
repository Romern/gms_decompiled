package p000;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.ArrayMap;
import android.util.Log;

/* renamed from: bixu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bixu {
    /* renamed from: a */
    public static Bundle m102951a(PersistableBundle persistableBundle) {
        Bundle bundle = new Bundle();
        bundle.putAll(persistableBundle);
        return bundle;
    }

    /* renamed from: b */
    public static void m102955b(PersistableBundle persistableBundle) {
        bixv.m102956a(persistableBundle, "PersistableBundle cannot be null!");
        for (String str : persistableBundle.keySet()) {
            Object obj = persistableBundle.get(str);
            bixv.m102958a(m102954a(obj), String.format("Unknown/unsupported data type [%s] for key %s", obj, str));
        }
    }

    /* renamed from: a */
    private static ArrayMap m102952a(BaseBundle baseBundle) {
        if (baseBundle.isEmpty()) {
            return new ArrayMap(0);
        }
        ArrayMap arrayMap = new ArrayMap(baseBundle.size());
        for (String str : baseBundle.keySet()) {
            Object obj = baseBundle.get(str);
            if (!m102954a(obj)) {
                Log.w("SetupCompat.PersistBls", String.format("Unknown/unsupported data type [%s] for key %s", obj, str));
            } else {
                arrayMap.put(str, baseBundle.get(str));
            }
        }
        return arrayMap;
    }

    /* renamed from: a */
    public static boolean m102953a(PersistableBundle persistableBundle, PersistableBundle persistableBundle2) {
        return persistableBundle == persistableBundle2 || m102952a(persistableBundle).equals(m102952a(persistableBundle2));
    }

    /* renamed from: a */
    private static boolean m102954a(Object obj) {
        return (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof String) || (obj instanceof Boolean);
    }
}
