package p000;

import android.content.Context;

/* renamed from: avfv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avfv {

    /* renamed from: a */
    private static final Object f93111a = new Object();

    /* renamed from: b */
    private static volatile avfu f93112b;

    /* renamed from: a */
    public static avfu m78451a(Context context) {
        if (f93112b == null) {
            synchronized (f93111a) {
                if (f93112b == null) {
                    Context applicationContext = context.getApplicationContext();
                    f93112b = new avfu(applicationContext, avfo.m78440b(applicationContext));
                }
            }
        }
        return f93112b;
    }
}
