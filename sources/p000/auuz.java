package p000;

import android.content.SharedPreferences;

/* renamed from: auuz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auuz implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        boolean z = true;
        auva.f92566a.mo50711a("shared preference change: %s", str);
        if (str.equals("onbody_already_set")) {
            auva d = auva.m77911d();
            synchronized (d.f92568b) {
                if (!d.f92571e.getBoolean("onbody_already_set", false) && !d.f92571e.getBoolean("auth_trust_agent_pref_trustlet_enabled_com.google.android.gms.auth.trustagent.trustlet.PhonePositionTrustlet", false)) {
                    z = false;
                }
                d.f92569c = z;
                d.mo50965f();
            }
        }
    }
}
