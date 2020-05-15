package p000;

import android.content.Context;

/* renamed from: bjbm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjbm {

    /* renamed from: b */
    private static bjbm f122474b;

    /* renamed from: a */
    public final Context f122475a;

    protected bjbm(Context context) {
        this.f122475a = context;
    }

    /* renamed from: a */
    public static synchronized bjbm m103160a(Context context) {
        bjbm bjbm;
        synchronized (bjbm.class) {
            if (f122474b == null) {
                f122474b = new bjbm(context.getApplicationContext());
            }
            bjbm = f122474b;
        }
        return bjbm;
    }
}
