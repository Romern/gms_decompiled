package p000;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aozl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aozl {

    /* renamed from: a */
    private static final Map f83944a = new HashMap();

    /* renamed from: a */
    static synchronized aozk m69904a(Context context, String str) {
        aozk aozk;
        synchronized (aozl.class) {
            aozk = (aozk) f83944a.get(str);
            if (aozk == null) {
                aozk = new aozk(context, str);
                f83944a.put(str, aozk);
            }
        }
        return aozk;
    }
}
