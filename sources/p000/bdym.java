package p000;

import android.content.Context;

/* renamed from: bdym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdym {

    /* renamed from: a */
    public static bdym f106631a = null;

    /* renamed from: b */
    public static volatile boolean f106632b = false;

    /* renamed from: c */
    public static volatile boolean f106633c = false;

    /* renamed from: e */
    private static final Object f106634e = new Object();

    /* renamed from: f */
    private static final bmzi f106635f = bmzn.m108681a(bdyl.f106630a);

    /* renamed from: d */
    public final Context f106636d;

    /* renamed from: g */
    private final bmzi f106637g;

    public bdym(Context context) {
        bmzi bmzi = f106635f;
        Context applicationContext = context.getApplicationContext();
        bmxy.m108581a(applicationContext);
        bmxy.m108581a(bmzi);
        this.f106636d = applicationContext;
        this.f106637g = bmzn.m108681a(bmzi);
    }

    /* renamed from: a */
    public static void m91584a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            synchronized (f106634e) {
                if (f106631a != null) {
                    throw new IllegalStateException("Cannot call PhenotypeContext#setContext twice");
                } else if (!f106632b) {
                    f106631a = new bdym(applicationContext);
                } else {
                    throw new IllegalStateException("Cannot set setContext after a flag was already read");
                }
            }
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final bqgk mo58441a() {
        return (bqgk) this.f106637g.mo6606a();
    }
}
