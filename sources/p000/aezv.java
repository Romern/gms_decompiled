package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: aezv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aezv {

    /* renamed from: a */
    public final Context f64055a;

    /* renamed from: b */
    public final SharedPreferences f64056b;

    /* renamed from: c */
    private final String f64057c;

    public aezv(Context context) {
        this("METRICS_LOGGER_PREFERENCE_FILE", context);
    }

    /* renamed from: a */
    public final int mo34688a(String str) {
        return mo34689a().getInt(str, 0);
    }

    /* renamed from: b */
    public final String mo34693b(String str) {
        return mo34689a().getString(str, null);
    }

    /* renamed from: c */
    public final String mo34696c() {
        return mo34693b("com.google.android.gms.magictether.GENERATED_SSID");
    }

    public aezv(String str, Context context) {
        this.f64057c = str;
        this.f64055a = context;
        this.f64056b = mo34689a();
    }

    /* renamed from: a */
    public final SharedPreferences mo34689a() {
        return this.f64055a.getSharedPreferences(this.f64057c, 4);
    }

    /* renamed from: b */
    public final void mo34694b(String str, boolean z) {
        this.f64056b.edit().putBoolean(str, z).commit();
    }

    /* renamed from: a */
    public final void mo34690a(String str, int i) {
        this.f64056b.edit().putInt(str, i).commit();
    }

    /* renamed from: b */
    public final boolean mo34695b() {
        boolean z = false;
        if (cfcj.f183615a.mo6606a().mo80830d() || (cfcj.f183615a.mo6606a().mo80832f() && new afai(this.f64055a).mo34710d())) {
            z = true;
        }
        return mo34692a("com.google.android.gms.magictether.IS_HOST_TETHERING_ENABLED", z);
    }

    /* renamed from: a */
    public final void mo34691a(String str, String str2) {
        this.f64056b.edit().putString(str, str2).commit();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo34692a(String str, boolean z) {
        return mo34689a().getBoolean(str, z);
    }
}
