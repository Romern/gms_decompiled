package p000;

import android.content.Context;

/* renamed from: ngz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ngz {

    /* renamed from: a */
    private static ngy f35557a = null;

    /* renamed from: a */
    public static synchronized void m26239a() {
        synchronized (ngz.class) {
            f35557a = null;
        }
    }

    /* renamed from: b */
    public static void m26242b(int i) {
        if (f35557a != null && ccos.f179648a.mo6606a().mo76555c()) {
            f35557a.mo20635a(i);
        }
    }

    /* renamed from: a */
    public static void m26240a(int i) {
        if (i == 1) {
            m26242b(10);
        } else if (i == 2) {
            m26242b(14);
        } else if (i == 3) {
            m26242b(5);
        } else if (i != 7) {
            m26242b(19);
        } else {
            m26242b(17);
        }
    }

    /* renamed from: a */
    public static synchronized void m26241a(Context context) {
        synchronized (ngz.class) {
            if (f35557a == null) {
                f35557a = new ngy(context);
            }
        }
    }
}
