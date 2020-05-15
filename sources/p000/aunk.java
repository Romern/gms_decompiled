package p000;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: aunk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aunk extends aunj {

    /* renamed from: c */
    private static WeakReference f92152c = new WeakReference(null);

    private aunk(Context context) {
        super(context, aumv.f92107b);
    }

    /* renamed from: b */
    public static synchronized aunk m77394b() {
        aunk aunk;
        synchronized (aunk.class) {
            aunk = (aunk) f92152c.get();
            if (aunk == null) {
                aunk = new aunk(rpr.m34216b());
                f92152c = new WeakReference(aunk);
            }
        }
        return aunk;
    }
}
