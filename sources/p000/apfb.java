package p000;

import android.content.Context;

/* renamed from: apfb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apfb {

    /* renamed from: b */
    private static apfb f84286b;

    /* renamed from: a */
    private final sey f84287a;

    private apfb(Context context) {
        this.f84287a = sey.m35126a(context.getApplicationContext());
    }

    /* renamed from: a */
    static synchronized apfb m70132a(Context context) {
        apfb apfb;
        synchronized (apfb.class) {
            if (f84286b == null) {
                f84286b = new apfb(context);
            }
            apfb = f84286b;
        }
        return apfb;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo47147a() {
        return this.f84287a.mo25460a();
    }
}
