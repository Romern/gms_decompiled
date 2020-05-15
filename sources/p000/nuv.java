package p000;

import android.content.SharedPreferences;

/* renamed from: nuv */
final /* synthetic */ class nuv implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    private final nvk f36573a;

    public nuv(nvk nvk) {
        this.f36573a = nvk;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        nvk nvk = this.f36573a;
        if (str.equals("car_enable_debug_background")) {
            nvk.f36656b = nvk.f36658d.mo21395f();
        }
    }
}
