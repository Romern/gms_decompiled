package p000;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: asjl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asjl {

    /* renamed from: a */
    private static fjk f89071a;

    /* renamed from: b */
    private static final boolean f89072b;

    /* renamed from: c */
    private static final AtomicReference f89073c = new AtomicReference("");

    static {
        sgj sgj = sgj.UNKNOWN;
        boolean z = false;
        if (!spn.m35859a() && askc.m74274c(askc.m74272b())) {
            z = true;
        }
        f89072b = z;
    }

    /* renamed from: a */
    public static synchronized fjk m74235a(Context context) {
        fjk fjk;
        synchronized (asjl.class) {
            if (f89071a == null) {
                fjk = fip.m11765a(context).mo10855a("UA-22847105-16");
                f89071a = fjk;
            } else {
                fjk = f89071a;
            }
        }
        return fjk;
    }

    /* renamed from: b */
    public static void m74237b(Context context, String str) {
        if (f89072b) {
            fir fir = new fir("Service", str);
            fir.mo10867e(null);
            m74235a(context).mo10893a(fir.mo10861a());
        }
    }

    /* renamed from: a */
    public static void m74236a(Context context, String str) {
        if (f89072b && !str.equals((String) f89073c.getAndSet(str))) {
            fjk a = m74235a(context);
            a.mo10892a("&cd", str);
            a.mo10893a(new fir((byte[]) null).mo10861a());
        }
    }
}
