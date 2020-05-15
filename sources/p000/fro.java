package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: fro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fro {

    /* renamed from: a */
    static final String[] f17157a = {"text1", "text2", "icon", "intent_action", "intent_data", "intent_data_id", "intent_extra_data", "suggest_large_icon", "intent_activity", "thing_proto"};

    /* renamed from: b */
    private static final Map f17158b = new HashMap(f17157a.length);

    static {
        int i = 0;
        while (true) {
            String[] strArr = f17157a;
            if (i < strArr.length) {
                f17158b.put(strArr[i], Integer.valueOf(i));
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static int m12228a() {
        return f17157a.length;
    }

    /* renamed from: a */
    public static int m12229a(String str) {
        Integer num = (Integer) f17158b.get(str);
        if (num != null) {
            return num.intValue();
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 44);
        sb.append("[");
        sb.append(str);
        sb.append("] is not a valid global search section name");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static String m12230a(int i) {
        if (i < 0) {
            return null;
        }
        String[] strArr = f17157a;
        if (i < strArr.length) {
            return strArr[i];
        }
        return null;
    }
}
