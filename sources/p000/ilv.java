package p000;

import android.app.Application;
import android.content.Context;

/* renamed from: ilv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ilv {

    /* renamed from: a */
    private static beor f21318a;

    /* renamed from: a */
    public static synchronized beor m15680a(Context context) {
        beor beor;
        synchronized (ilv.class) {
            if (f21318a == null) {
                f21318a = new beof(context.getApplicationContext(), "STREAMZ_ANDROID_AUTH_ACCOUNT");
            }
            beor = f21318a;
        }
        return beor;
    }

    /* renamed from: b */
    public static ilg m15681b(Context context) {
        Context context2;
        Application application;
        snf a = snp.m35703a(1, 10);
        beor a2 = m15680a(context);
        if (context == null) {
            context2 = rpr.m34216b().getApplicationContext();
        } else {
            context2 = context.getApplicationContext();
        }
        if (context2 instanceof Application) {
            application = (Application) context2;
        } else {
            application = null;
        }
        return new ilg(new giy(a, a2, application, "gmscore_android_auth_account"));
    }
}
