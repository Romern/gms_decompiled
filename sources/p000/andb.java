package p000;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: andb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class andb {

    /* renamed from: a */
    private static final Map f76655a = new HashMap();

    /* renamed from: a */
    public static synchronized anda m64054a(Context context, String str) {
        anda anda;
        synchronized (andb.class) {
            anda = (anda) f76655a.get(str);
            if (anda == null) {
                anda = new anda(context, str);
                f76655a.put(str, anda);
            }
        }
        return anda;
    }
}
