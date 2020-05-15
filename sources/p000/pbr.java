package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.io.File;

/* renamed from: pbr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pbr extends pbs {

    /* renamed from: a */
    public long f38796a = -1;

    /* renamed from: b */
    private final bmzi f38797b = bmzn.m108681a(pbq.f38795a);

    static {
        bnic.m109492a("times_show_reminder_notification", "car_connection_count", "frx_activation_logged", "android_go_device_screen_shown");
    }

    /* renamed from: a */
    public static void m30169a(Context context, Bundle bundle) {
        SharedPreferences.Editor edit = context.getSharedPreferences("carservice", 0).edit();
        m30170a(bundle, edit, "car_tos_main");
        m30170a(bundle, edit, "car_tos_safety");
        m30170a(bundle, edit, "car_tos_data");
        m30171b(bundle, edit, "car_save_audio");
        m30171b(bundle, edit, "car_save_mic");
        m30171b(bundle, edit, "car_enable_audio_latency_dump");
        m30171b(bundle, edit, "car_only_connect_to_known_cars");
        m30171b(bundle, edit, "car_telemetry_enabled");
        edit.apply();
    }

    /* renamed from: b */
    private static void m30171b(Bundle bundle, SharedPreferences.Editor editor, String str) {
        if (bundle.containsKey(str)) {
            editor.putBoolean(str, bundle.getBoolean(str));
        }
    }

    /* renamed from: a */
    public final int mo22873a() {
        return 1;
    }

    /* renamed from: a */
    public final void mo22875a(long j) {
        this.f38796a = j;
    }

    /* renamed from: b */
    public final String mo22876b() {
        return "com.google.android.gms.car.SETTINGS_MIGRATION";
    }

    /* renamed from: c */
    public final long mo22877c() {
        return ((Long) this.f38797b.mo6606a()).longValue();
    }

    /* renamed from: a */
    private static void m30170a(Bundle bundle, SharedPreferences.Editor editor, String str) {
        String string = bundle.getString(str);
        if (string != null) {
            editor.putString(str, string);
        }
    }

    /* renamed from: a */
    public final File mo22874a(Context context) {
        return new File(new File(context.getApplicationInfo().dataDir, "shared_prefs"), "carservice.xml");
    }
}
