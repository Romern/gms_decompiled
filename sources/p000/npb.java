package p000;

import android.content.SharedPreferences;

/* renamed from: npb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class npb implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    final /* synthetic */ npd f36289a;

    public npb(npd npd) {
        this.f36289a = npd;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        bnsn bnsn = npd.f36292a;
        if ("car_telemetry_enabled".equals(str)) {
            this.f36289a.mo21398i();
        }
    }
}
