package p000;

import android.content.SharedPreferences;
import com.google.android.gms.trustlet.voiceunlock.internal.VoiceUnlockTrustletChimeraService;

/* renamed from: auze */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auze implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    final /* synthetic */ VoiceUnlockTrustletChimeraService f92817a;

    public auze(VoiceUnlockTrustletChimeraService voiceUnlockTrustletChimeraService) {
        this.f92817a = voiceUnlockTrustletChimeraService;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        VoiceUnlockTrustletChimeraService voiceUnlockTrustletChimeraService;
        String str2;
        if ("auth_trust_agent_pref_trustlet_enabled_VoiceUnlockTrustletChimeraService".equals(str)) {
            this.f92817a.mo59594z();
            if (this.f92817a.mo59567y()) {
                voiceUnlockTrustletChimeraService = this.f92817a;
                str2 = "Trusted_voice_is_enabled_by_user";
            } else {
                voiceUnlockTrustletChimeraService = this.f92817a;
                str2 = "Trusted_voice_is_disabled_by_user";
            }
            voiceUnlockTrustletChimeraService.mo50778u(str2);
        }
    }
}
