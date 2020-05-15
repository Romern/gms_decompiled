package p000;

import android.content.Context;

/* renamed from: amur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amur {

    /* renamed from: a */
    private static amur f75971a;

    /* renamed from: b */
    private final Context f75972b;

    private amur(Context context) {
        this.f75972b = context.getApplicationContext();
    }

    /* renamed from: a */
    public static synchronized amur m63322a(Context context) {
        amur amur;
        synchronized (amur.class) {
            if (f75971a == null) {
                f75971a = new amur(context);
            }
            amur = f75971a;
        }
        return amur;
    }

    /* renamed from: b */
    public final boolean mo41357b() {
        return amut.m63328a(this.f75972b, "android.permission.READ_CONTACTS") && amut.m63328a(this.f75972b, "android.permission.WRITE_CONTACTS");
    }

    /* renamed from: a */
    public final boolean mo41356a() {
        return amut.m63328a(this.f75972b, "android.permission.READ_CONTACTS");
    }
}
