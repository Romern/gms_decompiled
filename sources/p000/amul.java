package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: amul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amul {

    /* renamed from: b */
    private static amul f75953b;

    /* renamed from: a */
    public final SharedPreferences f75954a;

    public amul(SharedPreferences sharedPreferences) {
        this.f75954a = sharedPreferences;
    }

    /* renamed from: a */
    public static synchronized amul m63304a(Context context) {
        amul amul;
        synchronized (amul.class) {
            if (f75953b == null) {
                f75953b = new amul(context.getSharedPreferences("gms.people.ui", 0));
            }
            amul = f75953b;
        }
        return amul;
    }

    /* renamed from: a */
    public final String mo41354a() {
        return this.f75954a.getString("core_ui_selected_account", "");
    }
}
