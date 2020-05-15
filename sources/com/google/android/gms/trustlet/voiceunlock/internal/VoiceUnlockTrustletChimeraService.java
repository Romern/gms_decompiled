package com.google.android.gms.trustlet.voiceunlock.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class VoiceUnlockTrustletChimeraService extends auot implements auzb {

    /* renamed from: h */
    public static final aunx f109321h = new aunx("TrustAgent", "VoiceUnlockTrustletChimeraService");

    /* renamed from: i */
    private SharedPreferences f109322i;

    /* renamed from: j */
    private SharedPreferences.OnSharedPreferenceChangeListener f109323j;

    /* renamed from: k */
    private boolean f109324k;

    /* renamed from: l */
    private final bmzi f109325l = bmzn.m108681a(auzd.f92816a);

    /* renamed from: A */
    public static boolean m93622A() {
        if (aupq.m77579a().f92280f) {
            return true;
        }
        f109321h.mo50711a("Voice Unlock not allowed - trust agents disallowed by the DPM", new Object[0]).mo50708c();
        return false;
    }

    /* renamed from: B */
    private final void m93623B() {
        if (!this.f109322i.contains("auth_trust_agent_pref_trustlet_enabled_VoiceUnlockTrustletChimeraService")) {
            aunw a = f109321h.mo50711a("Migrating shared preference.", new Object[0]);
            a.mo50708c();
            a.mo50707b();
            mo51072b(this.f109322i.getBoolean("auth_trust_agent_pref_trustlet_enabled_VoiceUnlockTrustlet", false));
        }
    }

    /* renamed from: a */
    public static boolean m93624a(Context context) {
        boolean z;
        try {
            if (((long) context.getPackageManager().getPackageInfo("com.google.android.googlequicksearchbox", 0).versionCode) < chas.f188208a.mo6606a().mo84887d()) {
                f109321h.mo50711a("incorrect version code.", new Object[0]).mo50708c();
                return false;
            }
            if (sre.m36084d(context)) {
                z = false;
            } else if (!chas.f188208a.mo6606a().mo84885b()) {
                f109321h.mo50711a("isEnabledByGservices - false", new Object[0]).mo50708c();
                z = false;
            } else {
                z = true;
            }
            f109321h.mo50711a("#isSupported %b", Boolean.valueOf(z)).mo50708c();
            return z;
        } catch (PackageManager.NameNotFoundException e) {
            f109321h.mo50711a("GSA is not installed.", new Object[0]).mo50708c();
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo50747b() {
        f109321h.mo50711a("stopAuthenticatingUser()", new Object[0]);
        this.f109324k = false;
        mo50778u("voice_unlock_stops_authenticating_user");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo50751c() {
        return true;
    }

    /* renamed from: d */
    public final void mo50752d() {
        super.mo50752d();
        f109321h.mo50711a("VoiceUnlockTrustlerChimeraService initializeTrustlet()", new Object[0]).mo50708c();
        auzc.f92814a.f92815b = this;
        this.f109322i = aupo.m77578a(rpr.m34216b());
        m93623B();
        auze auze = new auze(this);
        this.f109323j = auze;
        this.f109322i.registerOnSharedPreferenceChangeListener(auze);
        mo59594z();
        mo50778u("trustlet_created");
    }

    /* renamed from: e */
    public final void mo50753e() {
        super.mo50753e();
        f109321h.mo50711a("VoiceUnlockTrustlerChimeraService destroyTrustlet()", new Object[0]);
        auzc.f92814a.f92815b = null;
        this.f109322i.unregisterOnSharedPreferenceChangeListener(this.f109323j);
        mo50778u("trustlet_destroyed");
    }

    /* renamed from: f */
    public final boolean mo51073f() {
        f109321h.mo50711a("VoiceUnlockTrustlerChimeraService isReady()", new Object[0]);
        if (m93624a(rpr.m34216b())) {
            rpr.m34216b();
            if (m93622A()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo50754g() {
        return 1;
    }

    /* renamed from: h */
    public final boolean mo51074h() {
        if (((Boolean) this.f109325l.mo6606a()).booleanValue()) {
            try {
                Bundle bundle = (Bundle) aucu.m76782a(aula.m77250b(getApplicationContext()).mo24675a(3, (Bundle) null));
                if (bundle == null) {
                    return false;
                }
                boolean z = bundle.getBoolean("trustagent.api.bridge.be.GetIsTrustagentStartOperation.is_trustagent_start_key");
                f109321h.mo50711a("isTrustAgentOn: %s", Boolean.valueOf(z)).mo50708c();
                return z;
            } catch (InterruptedException | ExecutionException e) {
                f109321h.mo50711a("isTrustAgentOn: %s", "false").mo50708c();
                return false;
            }
        } else {
            rjy rjy = new rjy(this);
            rjy.mo24779a(aula.f92019b);
            rkb b = rjy.mo24784b();
            if (b.mo24802f().mo17671b()) {
                rke a = aupy.m77595a(b, 3, null);
                b.mo24803g();
                Bundle bundle2 = ((aupr) a.mo9455a()).f92287b;
                if (!a.mo9461c() && bundle2 != null) {
                    boolean z2 = bundle2.getBoolean("trustagent.api.bridge.be.GetIsTrustagentStartOperation.is_trustagent_start_key");
                    f109321h.mo50711a("isTrustAgentOn: %s", Boolean.valueOf(z2)).mo50708c();
                    return z2;
                }
            }
            return false;
        }
    }

    /* renamed from: o */
    public final String mo50770o() {
        return "Voiceunlock";
    }

    /* renamed from: p */
    public final boolean mo50771p() {
        if (aupq.m77579a().f92280f) {
            return true;
        }
        f109321h.mo50711a("Voice Unlock not allowed - trust agents disallowed by the DPM", new Object[0]);
        return false;
    }

    /* renamed from: q */
    public final boolean mo50772q() {
        return m93624a(rpr.m34216b());
    }

    /* renamed from: r */
    public final Bundle mo50773r() {
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.gms.trustagent.api.trustlet.key_trustlet_name", "Voiceunlock");
        bundle.putBoolean("com.google.android.gms.trustagent.api.trustlet.key_is_user_initiated", false);
        bundle.putBoolean("com.google.android.gms.trustagent.api.trustlet.key_dismiss_keyguard", false);
        bundle.putBoolean("key_trustlet_is_suppored", mo50772q());
        bundle.putBoolean("key_trustlet_is_enabled_by_device_policy", mo50771p());
        bundle.putString("key_trustlet_pref_key", "auth_trust_agent_pref_voice_unlock_key");
        bundle.putString("key_trustlet_pref_title", getString(C0126R.string.auth_trust_agent_pref_voice_unlock_title));
        rpr.m34216b();
        bundle.putString("key_trustlet_pref_summary", !m93622A() ? getString(C0126R.string.auth_trust_agent_dpm_disabled) : mo59567y() ? getString(C0126R.string.auth_trust_agent_pref_voice_unlock_enabled_summary) : getString(C0126R.string.auth_trust_agent_pref_voice_unlock_disabled_summary));
        bundle.putInt("key_trustlet_icon_res_id", C0126R.C0127drawable.quantum_ic_mic_black_24);
        bundle.putString("key_trustlet_settings_activity_intent_action", "com.google.android.googlequicksearchbox.action.HOTWORD_DETECTION_SETTINGS");
        bundle.putString("key_trustlet_settings_activity_package_name", "com.google.android.googlequicksearchbox");
        return bundle;
    }

    /* renamed from: x */
    public final int mo50781x() {
        return 8;
    }

    /* renamed from: y */
    public final boolean mo59567y() {
        if (this.f109322i == null) {
            this.f109322i = aupo.m77578a(rpr.m34216b());
        }
        m93623B();
        return this.f109322i.getBoolean("auth_trust_agent_pref_trustlet_enabled_VoiceUnlockTrustletChimeraService", false);
    }

    /* renamed from: z */
    public final void mo59594z() {
        boolean z = this.f109322i.getBoolean("auth_trust_agent_pref_trustlet_enabled_VoiceUnlockTrustletChimeraService", false);
        f109321h.mo50711a("validateCanUnlock %b", Boolean.valueOf(z)).mo50708c();
        mo50763a(z, z);
    }

    /* renamed from: b */
    public final void mo50764b(bogj bogj) {
        bohf bohf = ((bohi) bogj.f164949b).f133089s;
        if (bohf == null) {
            bohf = bohf.f133058h;
        }
        bxvd bxvd = (bxvd) bohf.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bohf);
        boolean k = mo50766k();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bohf bohf2 = (bohf) bxvd.f164949b;
        bohf2.f133060a |= 8;
        bohf2.f133064e = k;
        if (bogj.f164950c) {
            bogj.mo74035c();
            bogj.f164950c = false;
        }
        bohi bohi = (bohi) bogj.f164949b;
        bohf bohf3 = (bohf) bxvd.mo74062i();
        bohi bohi2 = bohi.f133070z;
        bohf3.getClass();
        bohi.f133089s = bohf3;
        bohi.f133071a |= 8192;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo50762a(String str, JSONObject jSONObject) {
        if (cgzt.m147783h()) {
            mo50761a("VoiceUnlock", str, null, this.f109324k, mo50772q(), mo50771p(), true, Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* renamed from: a */
    public final void mo51071a(boolean z) {
        mo50757l(z);
    }

    /* renamed from: b */
    public final void mo51072b(boolean z) {
        SharedPreferences.Editor edit = this.f109322i.edit();
        edit.putBoolean("auth_trust_agent_pref_trustlet_enabled_VoiceUnlockTrustletChimeraService", z);
        edit.commit();
        aunx aunx = f109321h;
        Object[] objArr = new Object[1];
        objArr[0] = !z ? "disabled" : "enabled";
        aunw a = aunx.mo50711a("Voice trustlet is %s by user", objArr);
        a.mo50708c();
        a.mo50707b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo50746a() {
        f109321h.mo50711a("startAuthenticatingUser", new Object[0]).mo50708c();
        this.f109324k = true;
        mo50778u("voice_unlock_starts_authenticating_user");
        return true;
    }
}
