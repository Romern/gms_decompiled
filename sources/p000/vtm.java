package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: vtm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vtm {

    /* renamed from: a */
    public final SharedPreferences f49955a;

    public vtm(Context context) {
        this.f49955a = context.getSharedPreferences("driving_mode_frx_prefs", 0);
    }

    /* renamed from: a */
    public final void mo28837a(boolean z) {
        this.f49955a.edit().putBoolean("force_frx_rerun_once", z).apply();
    }

    /* renamed from: b */
    public final boolean mo28839b() {
        return this.f49955a.getBoolean("gearhead_frx_completed", false);
    }

    /* renamed from: c */
    public final void mo28840c() {
        this.f49955a.edit().putBoolean("frx_completed", true).apply();
    }

    /* renamed from: a */
    public final boolean mo28838a() {
        return this.f49955a.getBoolean("frx_completed", false);
    }
}
