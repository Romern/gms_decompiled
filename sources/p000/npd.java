package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import java.util.Set;

/* renamed from: npd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class npd {

    /* renamed from: a */
    public static final bnsn f36292a = odk.m28481a("CAR.SETTING");

    /* renamed from: f */
    private static final bngx f36293f = bngx.m109359a("rotary_use_focus_finder", "touchpad_focus_navigation_history_max_size", "touchpad_focus_navigation_history_max_age_ms", "car_module_feature_set");

    /* renamed from: h */
    private static npd f36294h;

    /* renamed from: b */
    public final Context f36295b;

    /* renamed from: c */
    public final SharedPreferences f36296c;

    /* renamed from: d */
    public volatile boolean f36297d = true;

    /* renamed from: e */
    final SharedPreferences.OnSharedPreferenceChangeListener f36298e = new npb(this);

    /* renamed from: g */
    private SharedPreferences.OnSharedPreferenceChangeListener f36299g;

    public npd(Context context) {
        this.f36295b = context;
        this.f36296c = context.getSharedPreferences("carservice", 0);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static synchronized npd m27127a(Context context) {
        npd npd;
        synchronized (npd.class) {
            if (f36294h == null) {
                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    npd npd2 = new npd(context.getApplicationContext());
                    f36294h = npd2;
                    npd2.mo21398i();
                    npd npd3 = f36294h;
                    SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = f36294h.f36298e;
                    SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener2 = npd3.f36299g;
                    if (onSharedPreferenceChangeListener2 != null) {
                        npd3.f36296c.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener2);
                    }
                    npd3.f36299g = onSharedPreferenceChangeListener;
                    if (onSharedPreferenceChangeListener != null) {
                        npd3.f36296c.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    throw th;
                }
            }
            npd = f36294h;
        }
        return npd;
    }

    /* renamed from: l */
    private final String m27128l() {
        try {
            return Integer.toString(this.f36295b.getPackageManager().getPackageInfo(this.f36295b.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            bnsi c = f36292a.mo68388c();
            c.mo68432a("npd", "l", 433, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("cannot get package version");
            return "unknown";
        }
    }

    /* renamed from: b */
    public final String mo21387b() {
        return this.f36296c.getString("car_video_resolution", "none");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo21392c() {
        return this.f36296c.getBoolean("touchpad_tuning_enabled", false);
    }

    /* renamed from: d */
    public final boolean mo21393d() {
        return this.f36296c.getBoolean("car_disable_anr_monitoring", false);
    }

    /* renamed from: e */
    public final boolean mo21394e() {
        return this.f36296c.getBoolean("car_take_vf_on_start", false);
    }

    /* renamed from: f */
    public final boolean mo21395f() {
        return this.f36296c.getBoolean("car_enable_debug_background", false);
    }

    /* renamed from: g */
    public final oba mo21396g() {
        boolean z;
        int i;
        obm d = obn.m28355d();
        boolean z2 = false;
        d.mo21947c(ccsw.m131491d() ? this.f36296c.getBoolean("car_gal_snoop_log_video_ack", false) : false);
        d.mo21946b(ccsw.m131491d() ? this.f36296c.getBoolean("car_gal_snoop_log_media_ack", false) : false);
        if (ccsw.m131491d()) {
            z = this.f36296c.getBoolean("car_gal_snoop_log_guidance_ack", false);
        } else {
            z = false;
        }
        d.mo21945a(z);
        obn a = d.mo21944a();
        oaz d2 = oba.m28331d();
        if (ccsw.m131491d()) {
            z2 = this.f36296c.getBoolean("car_enable_gal_snoop", false);
        }
        d2.mo21935a(z2);
        int i2 = 1000;
        int i3 = 100;
        if (ccsw.m131491d()) {
            try {
                i = Integer.parseInt(this.f36296c.getString("car_gal_snoop_buffer_size", "100"));
            } catch (NumberFormatException e) {
                i = 100;
            }
            if (i >= 100) {
                i3 = i;
            }
            if (i3 <= 1000) {
                i2 = i3;
            }
        } else {
            i2 = 100;
        }
        d2.mo21934a(i2);
        d2.f37114a = a;
        return d2.mo21933a();
    }

    /* renamed from: h */
    public final String mo21397h() {
        String string = this.f36296c.getString("car_device_support_projection", null);
        if (string == null) {
            return "unknown";
        }
        String[] split = string.split(",");
        if (split.length == 2) {
            return split[1];
        }
        bnsi c = f36292a.mo68388c();
        c.mo68432a("npd", "h", 445, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68420a("cannot parse version string %s", string);
        return "unknown";
    }

    /* renamed from: i */
    public final void mo21398i() {
        this.f36297d = this.f36296c.getBoolean("car_telemetry_enabled", true);
    }

    /* renamed from: j */
    public final boolean mo21399j() {
        return this.f36296c.getBoolean("android_go_device_screen_shown", false);
    }

    /* renamed from: k */
    public final void mo21400k() {
        SharedPreferences.Editor edit = this.f36296c.edit();
        edit.putBoolean("android_go_device_screen_shown", true);
        edit.apply();
    }

    /* renamed from: b */
    public final void mo21388b(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f36296c.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    /* renamed from: b */
    public final void mo21389b(String str, int i) {
        this.f36296c.edit().putInt(str, i).apply();
    }

    /* renamed from: b */
    public final void mo21390b(String str, Set set) {
        this.f36296c.edit().putStringSet(str, set).apply();
    }

    /* renamed from: b */
    public final void mo21391b(String str, boolean z) {
        if ("car_telemetry_enabled".equals(str)) {
            mo21383a(z);
        } else {
            this.f36296c.edit().putBoolean(str, z).apply();
        }
    }

    /* renamed from: a */
    public final int mo21378a(String str, int i) {
        return this.f36296c.getInt(str, i);
    }

    /* renamed from: a */
    public final String mo21379a(String str, String str2) {
        return this.f36296c.getString(str, str2);
    }

    /* renamed from: a */
    public final Set mo21380a(String str, Set set) {
        return this.f36296c.getStringSet(str, set);
    }

    /* renamed from: a */
    public final void mo21381a(int i) {
        SharedPreferences.Editor edit = this.f36296c.edit();
        edit.putInt("car_connection_count", i);
        edit.apply();
    }

    /* renamed from: a */
    public final void mo21382a(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f36296c.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    /* renamed from: a */
    public final void mo21383a(boolean z) {
        this.f36296c.edit().putBoolean("car_telemetry_enabled", z).apply();
        mo21398i();
    }

    /* renamed from: a */
    public final boolean mo21384a() {
        return this.f36296c.getBoolean("car_save_audio", false);
    }

    /* renamed from: a */
    public final boolean mo21385a(String str) {
        return f36293f.contains(str);
    }

    /* renamed from: a */
    public final boolean mo21386a(String str, boolean z) {
        return this.f36296c.getBoolean(str, z);
    }
}
