package p000;

import android.content.Context;

/* renamed from: adgs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adgs {

    /* renamed from: b */
    private static adgs f61605b;

    /* renamed from: a */
    public final Context f61606a;

    /* renamed from: c */
    private final boolean f61607c = true;

    public adgs(Context context) {
        this.f61606a = context;
    }

    /* renamed from: a */
    public static synchronized adgs m50453a(Context context) {
        adgs adgs;
        synchronized (adgs.class) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            if (f61605b != null) {
                if (f61605b.f61606a == context) {
                    boolean z = f61605b.f61607c;
                    adgs = f61605b;
                }
            }
            f61605b = new adgs(context);
            adgs = f61605b;
        }
        return adgs;
    }
}
