package p000;

import android.content.Context;
import android.util.Log;

/* renamed from: amdn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amdn {

    /* renamed from: c */
    private static amdn f74749c;

    /* renamed from: a */
    public final Context f74750a;

    /* renamed from: b */
    public final anck f74751b;

    private amdn(Context context) {
        this.f74750a = context;
        this.f74751b = anck.m63990a(context);
    }

    /* renamed from: a */
    public static synchronized amdn m62665a(Context context) {
        amdn amdn;
        synchronized (amdn.class) {
            if (f74749c == null) {
                f74749c = new amdn(context);
            }
            amdn = f74749c;
        }
        return amdn;
    }

    /* renamed from: a */
    public static String m62666a(String str) {
        return ancc.m63969a(ancc.m63971a(str, ""));
    }

    /* renamed from: a */
    public final synchronized void mo41125a() {
        try {
            alsj a = alsj.m61651a(this.f74750a);
            int i = a.f74200a.getInt("saved_cover_photo_width_pixels", -1);
            int a2 = alsh.m61646a(this.f74750a);
            if (i != a2) {
                this.f74751b.mo41703b();
                sdo.m34973b((String) null);
                a.f74200a.edit().putInt("saved_cover_photo_width_pixels", a2).commit();
            }
        } catch (Exception e) {
            Log.w("PeopleCPSM", "Failed to wipe cached files.", e);
            if (!rfy.m33543a()) {
                throw e;
            }
        }
    }
}
