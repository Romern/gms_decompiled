package p000;

import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: fix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class fix {
    /* renamed from: a */
    public static String m11794a() {
        return m11796a(null, 1);
    }

    /* renamed from: a */
    public abstract void mo10877a(fix fix);

    /* renamed from: a */
    public static String m11795a(Object obj) {
        return m11796a(obj, 0);
    }

    /* renamed from: a */
    private static String m11796a(Object obj, int i) {
        if (i > 10) {
            return "ERROR: Recursive toString calls";
        }
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            if (!TextUtils.isEmpty((String) obj)) {
                return obj.toString();
            }
            return "";
        } else if (obj instanceof Integer) {
            if (((Integer) obj).intValue() != 0) {
                return obj.toString();
            }
            return "";
        } else if (obj instanceof Long) {
            if (((Long) obj).longValue() != 0) {
                return obj.toString();
            }
            return "";
        } else if (obj instanceof Double) {
            if (((Double) obj).doubleValue() != 0.0d) {
                return obj.toString();
            }
            return "";
        } else if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                return obj.toString();
            }
            return "";
        } else if (obj instanceof List) {
            StringBuilder sb = new StringBuilder();
            if (i > 0) {
                sb.append("[");
            }
            int length = sb.length();
            for (Object obj2 : (List) obj) {
                if (sb.length() > length) {
                    sb.append(", ");
                }
                sb.append(m11796a(obj2, i + 1));
            }
            if (i > 0) {
                sb.append("]");
            }
            return sb.toString();
        } else if (!(obj instanceof Map)) {
            return obj.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            boolean z = false;
            int i2 = 0;
            for (Map.Entry entry : new TreeMap((Map) obj).entrySet()) {
                String a = m11796a(entry.getValue(), i + 1);
                if (!TextUtils.isEmpty(a)) {
                    if (i > 0 && !z) {
                        sb2.append("{");
                        i2 = sb2.length();
                        z = true;
                    }
                    if (sb2.length() > i2) {
                        sb2.append(", ");
                    }
                    sb2.append((String) entry.getKey());
                    sb2.append('=');
                    sb2.append(a);
                }
            }
            if (z) {
                sb2.append("}");
            }
            return sb2.toString();
        }
    }
}
