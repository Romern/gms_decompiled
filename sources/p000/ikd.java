package p000;

import android.content.Context;

/* renamed from: ikd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ikd {

    /* renamed from: b */
    private static ikd f21165b;

    /* renamed from: a */
    public final igh f21166a;

    private ikd(Context context) {
        igh igh = new igh(context);
        sdo.m34959a(context);
        sdo.m34959a(igh);
        this.f21166a = igh;
    }

    /* renamed from: a */
    public static synchronized ikd m15574a(Context context) {
        ikd ikd;
        synchronized (ikd.class) {
            if (f21165b == null) {
                f21165b = new ikd(context.getApplicationContext());
            }
            ikd = f21165b;
        }
        return ikd;
    }
}
