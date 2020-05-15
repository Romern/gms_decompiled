package p000;

import android.content.SharedPreferences;
import com.google.android.gms.trustlet.onbody.internal.PhonePositionTrustletChimeraService;

/* renamed from: auwe */
public final /* synthetic */ class auwe implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    private final PhonePositionTrustletChimeraService f92653a;

    public auwe(PhonePositionTrustletChimeraService phonePositionTrustletChimeraService) {
        this.f92653a = phonePositionTrustletChimeraService;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        PhonePositionTrustletChimeraService phonePositionTrustletChimeraService = this.f92653a;
        if ("auth_trust_agent_pref_trustlet_enabled_com.google.android.gms.auth.trustagent.trustlet.PhonePositionTrustlet".equals(str)) {
            phonePositionTrustletChimeraService.f109256d = true;
            phonePositionTrustletChimeraService.mo50780w();
            phonePositionTrustletChimeraService.f109256d = false;
        }
    }
}
