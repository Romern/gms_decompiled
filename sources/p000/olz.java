package p000;

import android.content.SharedPreferences;

/* renamed from: olz */
final /* synthetic */ class olz implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    private final oma f37940a;

    public olz(oma oma) {
        this.f37940a = oma;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        oma oma = this.f37940a;
        if (str.equals("touchpad_tuning_enabled")) {
            oma.mo17248d();
        }
    }
}
