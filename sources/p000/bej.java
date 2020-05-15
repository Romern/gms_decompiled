package p000;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* renamed from: bej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bej implements ayr {

    /* renamed from: a */
    private static final Set f3083a = new HashSet();

    /* renamed from: a */
    public final void mo2906a(String str, Throwable th) {
        if (!f3083a.contains(str)) {
            Log.w("LOTTIE", str, th);
            f3083a.add(str);
        }
    }
}
