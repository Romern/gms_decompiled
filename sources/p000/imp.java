package p000;

import java.lang.ref.WeakReference;

/* renamed from: imp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class imp {

    /* renamed from: a */
    private static WeakReference f21365a = null;

    /* renamed from: a */
    public static synchronized imp m15726a() {
        imp imp;
        synchronized (imp.class) {
            if (f21365a != null) {
                imp = (imp) f21365a.get();
            } else {
                imp = null;
            }
            if (imp == null) {
                imp = new imp();
                f21365a = new WeakReference(imp);
            }
        }
        return imp;
    }
}
