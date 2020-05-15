package p000;

import android.content.Context;

/* renamed from: anfg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anfg extends anfw {
    public anfg(Context context, String str) {
        super(context, str, snp.m35703a(1, 10));
        srp.m36137a(this);
    }

    /* renamed from: a */
    public static anfg m64152a(Context context) {
        if (aytw.m84813a(context)) {
            context = context.createDeviceProtectedStorageContext();
        }
        return m64154c(context);
    }

    /* renamed from: b */
    public static anfg m64153b(Context context) {
        if (!context.isDeviceProtectedStorage()) {
            context = context.createDeviceProtectedStorageContext();
        }
        return m64154c(context);
    }

    /* renamed from: c */
    private static anfg m64154c(Context context) {
        aytw.m84814b();
        boolean isDeviceProtectedStorage = context.isDeviceProtectedStorage();
        synchronized (f76782c) {
            if (isDeviceProtectedStorage) {
                if (anfw.f76783d == null) {
                    anfw.f76783d = new anfg(context, "phenotype.db");
                }
                anfw.f76783d.f76787f++;
                if (anfw.f76783d.f76788g != null && anfw.f76783d.f76788g.cancel(true)) {
                    anfw.f76783d.f76788g = null;
                }
                anfw anfw = anfw.f76783d;
                return (anfg) anfw;
            }
            if (anfw.f76784e == null) {
                anfw.f76784e = new anfg(context, "phenotype.db");
            }
            anfw.f76784e.f76787f++;
            if (anfw.f76784e.f76788g != null && anfw.f76784e.f76788g.cancel(true)) {
                anfw.f76784e.f76788g = null;
            }
            anfw anfw2 = anfw.f76784e;
            return (anfg) anfw2;
        }
    }
}
