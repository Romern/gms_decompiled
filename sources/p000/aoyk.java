package p000;

import android.app.Application;
import android.content.Context;

/* renamed from: aoyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoyk implements aoym {

    /* renamed from: a */
    public static aoyb f83847a;

    /* renamed from: b */
    private static aoyk f83848b;

    /* renamed from: c */
    private static beor f83849c;

    private aoyk() {
    }

    /* renamed from: a */
    public static synchronized aoyk m69838a(Context context, Application application) {
        aoyk aoyk;
        synchronized (aoyk.class) {
            if (f83847a == null) {
                f83849c = new beof(new qws(context, "STREAMZ_ROMANESCO", null), "STREAMZ_ROMANESCO");
                f83847a = new aoyb(adzl.f62962b.mo25877a(1, 2), f83849c, application, "gmscore_romanesco");
                f83848b = new aoyk();
            }
            aoyk = f83848b;
        }
        return aoyk;
    }

    /* renamed from: a */
    public final void mo47006a(long j) {
        ((beoj) f83847a.f83830c.mo6606a()).mo60852a((double) j, new Object[0]);
    }

    /* renamed from: a */
    public final void mo47007a(String str) {
        ((beon) f83847a.f83829b.mo6606a()).mo60861b(str);
    }

    /* renamed from: a */
    public final void mo47008a(boolean z) {
        ((beon) f83847a.f83831d.mo6606a()).mo60861b(Boolean.valueOf(z));
    }
}
