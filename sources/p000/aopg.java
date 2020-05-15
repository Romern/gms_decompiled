package p000;

import java.util.Arrays;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.Map;

/* renamed from: aopg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aopg {

    /* renamed from: b */
    private static final Map f78641b = new HashMap();

    /* renamed from: a */
    public final String f78642a;

    private aopg(String str) {
        this.f78642a = str.length() > 23 ? str.substring(0, 23) : str;
    }

    /* renamed from: a */
    public static aopg m66269a(String str) {
        aopg aopg;
        synchronized (f78641b) {
            aopg = (aopg) f78641b.get(str);
            if (aopg == null) {
                aopg = new aopg(str);
                f78641b.put(str, aopg);
            }
        }
        return aopg;
    }

    /* renamed from: a */
    public static String m66270a(String str, Object... objArr) {
        try {
            return String.format(str, objArr);
        } catch (IllegalFormatException e) {
            String arrays = Arrays.toString(objArr);
            StringBuilder sb = new StringBuilder(str.length() + 35 + String.valueOf(arrays).length());
            sb.append("Malformed log call. Format: ");
            sb.append(str);
            sb.append(" args: ");
            sb.append(arrays);
            return sb.toString();
        }
    }
}
