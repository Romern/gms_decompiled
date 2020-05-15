package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: burh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class burh {

    /* renamed from: a */
    private final Context f154766a;

    public burh(Context context) {
        this.f154766a = context;
    }

    /* renamed from: a */
    public final int mo73032a(String str) {
        if (mo73039c().contains(str)) {
            return mo73039c().getBoolean(str, true) ? 3 : 4;
        }
        return 2;
    }

    /* renamed from: b */
    public final void mo73037b(boolean z) {
        mo73039c().edit().putBoolean("has_pending_app_install", z).commit();
    }

    /* renamed from: c */
    public final SharedPreferences mo73039c() {
        return this.f154766a.getSharedPreferences("discovery_shared_pref", 4);
    }

    /* renamed from: e */
    public final boolean mo73041e() {
        return mo73039c().getBoolean("notification_settings_devcie", cfod.f184793a.mo6606a().mo81926o());
    }

    /* renamed from: f */
    public final void mo73042f() {
        int i = mo73039c().getInt("education_flow_counter", 0) + 1;
        if (((long) i) > cfod.f184793a.mo6606a().mo81910ae()) {
            mo73039c().edit().putBoolean("education_flow_completed", true).commit();
        }
        mo73039c().edit().putInt("education_flow_counter", i).commit();
    }

    /* renamed from: g */
    public final boolean mo73043g() {
        return mo73039c().getBoolean("education_flow_completed", false);
    }

    /* renamed from: b */
    public final boolean mo73038b() {
        return mo73039c().getBoolean("key_auto_test_running", false);
    }

    /* renamed from: d */
    public final boolean mo73040d() {
        return mo73039c().getBoolean("notification_settings_beacon", cfod.f184793a.mo6606a().mo81924m()) || mo73041e();
    }

    /* renamed from: a */
    public final void mo73033a(int i) {
        mo73039c().edit().putInt("KEY_NOTIFICATION_CONSECUTIVE_DISMISS", i).commit();
    }

    /* renamed from: a */
    public final void mo73034a(long j) {
        mo73039c().edit().putLong("KEY_NOTIFICATION_ALLOWED_AT_TIMESTAMP_SECONDS", j).commit();
    }

    /* renamed from: a */
    public final void mo73035a(boolean z) {
        mo73039c().edit().putBoolean("key_auto_test_running", z).commit();
    }

    /* renamed from: a */
    public final boolean mo73036a() {
        return mo73039c().getBoolean("nearby_debug_mode", cfod.m141143c());
    }
}
