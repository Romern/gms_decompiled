package p000;

import android.app.Application;
import android.content.Context;

/* renamed from: rqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rqz {

    /* renamed from: a */
    private static beor f43535a;

    /* renamed from: a */
    public static Application m34280a(Context context) {
        Context context2;
        if (context == null) {
            context2 = rpr.m34216b().getApplicationContext();
        } else {
            context2 = context.getApplicationContext();
        }
        if (context2 instanceof Application) {
            return (Application) context2;
        }
        return null;
    }

    /* renamed from: b */
    public static synchronized beor m34281b(Context context) {
        beor beor;
        synchronized (rqz.class) {
            if (f43535a == null) {
                f43535a = new beof(context.getApplicationContext(), "STREAMZ_ANDROID_AUTH");
            }
            beor = f43535a;
        }
        return beor;
    }
}
