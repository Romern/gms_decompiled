package p000;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: jtu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jtu {

    /* renamed from: a */
    private static WeakReference f23201a;

    /* renamed from: a */
    public static jtt m17328a(Context context) {
        jtt jtt;
        WeakReference weakReference = f23201a;
        if (weakReference != null) {
            jtt = (jtt) weakReference.get();
        } else {
            jtt = null;
        }
        if (jtt != null) {
            return jtt;
        }
        jtr jtr = new jtr(context);
        f23201a = new WeakReference(jtr);
        return jtr;
    }
}
