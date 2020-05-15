package p000;

import java.util.Map;
import java.util.Set;

/* renamed from: adyi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adyi {

    /* renamed from: a */
    public static adyj f62902a = new adyh();

    /* renamed from: b */
    private static boolean f62903b = false;

    /* renamed from: a */
    public static Map m51410a() {
        return f62902a.mo33926a();
    }

    /* renamed from: b */
    public static Set m51413b() {
        return f62902a.mo33929b();
    }

    /* renamed from: a */
    public static Map m51411a(int i) {
        return f62902a.mo33927a(i);
    }

    /* renamed from: a */
    public static synchronized void m51412a(adyj adyj) {
        synchronized (adyi.class) {
            if (!f62903b) {
                f62902a = adyj;
                f62903b = true;
            } else {
                throw new IllegalStateException("Factory already set.");
            }
        }
    }
}
