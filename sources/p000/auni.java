package p000;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: auni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auni extends aunj {

    /* renamed from: c */
    private static WeakReference f92151c = new WeakReference(null);

    private auni(Context context) {
        super(context, aumt.f92096b);
    }

    /* renamed from: b */
    public static synchronized auni m77390b() {
        auni auni;
        synchronized (auni.class) {
            auni = (auni) f92151c.get();
            if (auni == null) {
                auni = new auni(rpr.m34216b());
                f92151c = new WeakReference(auni);
            }
        }
        return auni;
    }
}
