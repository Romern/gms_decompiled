package p000;

import android.os.Bundle;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: agns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agns {
    /* renamed from: a */
    public static int m54670a(Bundle bundle) {
        if (bundle == null) {
            return 0;
        }
        Set<String> keySet = bundle.keySet();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : keySet) {
            linkedHashSet.add(bundle.get(str));
        }
        return Arrays.hashCode(new Object[]{keySet, linkedHashSet});
    }

    /* renamed from: a */
    public static boolean m54671a(Bundle bundle, Bundle bundle2) {
        boolean z;
        boolean z2;
        if (bundle == null && bundle2 == null) {
            return true;
        }
        if (bundle != null) {
            z = false;
        } else {
            z = true;
        }
        if (bundle2 != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z != z2 || bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj != null) {
                if (obj instanceof Bundle) {
                    if (!(obj2 instanceof Bundle) || !m54671a((Bundle) obj, (Bundle) obj2)) {
                        return false;
                    }
                } else if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    if (obj2.getClass().isArray() && length == Array.getLength(obj2)) {
                        int i = 0;
                        while (i < length) {
                            if (sdg.m34949a(Array.get(obj, i), Array.get(obj2, i))) {
                                i++;
                            }
                        }
                        continue;
                    }
                    return false;
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            } else if (obj2 != null || !bundle2.containsKey(str)) {
                return false;
            }
        }
        return true;
    }
}
