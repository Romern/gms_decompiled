package com.google.android.gms.trustlet.onbody.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.SystemClock;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.trustagent.common.receiver.ScreenOnOffReceiver;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PhonePositionTrustletChimeraService extends auou implements auwb, auny {

    /* renamed from: a */
    public static final aunx f109253a = new aunx("TrustAgent", "PhonePositionTrustletChimeraService");

    /* renamed from: b */
    public boolean f109254b;

    /* renamed from: c */
    public auvq f109255c;

    /* renamed from: d */
    public boolean f109256d;

    /* renamed from: h */
    private final BroadcastReceiver f109257h = new aacn("trustlet_onbody") {
        /* class com.google.android.gms.trustlet.onbody.internal.PhonePositionTrustletChimeraService.C16721 */

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            if ("com.google.android.gms.trustagent.TRUST_STATE_CHANGED".equals(intent.getAction())) {
                PhonePositionTrustletChimeraService phonePositionTrustletChimeraService = PhonePositionTrustletChimeraService.this;
                Bundle extras = intent.getExtras();
                aunx aunx = PhonePositionTrustletChimeraService.f109253a;
                if (extras.keySet().contains("is_trustagent_on")) {
                    auva.m77911d().mo50964e();
                    if (!extras.getBoolean("is_trustagent_on")) {
                        phonePositionTrustletChimeraService.f109255c.mo50977a();
                    }
                }
            }
        }
    };

    /* renamed from: i */
    private auwc f109258i;

    /* renamed from: j */
    private ScreenOnOffReceiver f109259j;

    /* renamed from: k */
    private boolean f109260k;

    /* renamed from: l */
    private SharedPreferences f109261l;

    /* renamed from: m */
    private auoq f109262m;

    /* renamed from: n */
    private auva f109263n;

    /* renamed from: o */
    private SharedPreferences.OnSharedPreferenceChangeListener f109264o;

    /* renamed from: a */
    public static boolean m93537a(Context context) {
        if (!chac.f188164a.mo6606a().mo84858n()) {
            f109253a.mo50711a("Gservices flag is not enabled", new Object[0]).mo50708c();
            return false;
        } else if (((SensorManager) context.getSystemService("sensor")).getDefaultSensor(1) != null) {
            return true;
        } else {
            f109253a.mo50711a("Hardware is not supported.", new Object[0]).mo50708c();
            return false;
        }
    }

    /* renamed from: h */
    private final boolean m93539h() {
        return aupo.m77578a(this).getBoolean("auth_trust_agent_pref_trustlet_enabled_com.google.android.gms.auth.trustagent.trustlet.PhonePositionTrustlet", false);
    }

    /* renamed from: i */
    private final String m93540i() {
        if (!m93537a(this)) {
            f109253a.mo50711a("Not supported by device.", new Object[0]);
            return "On-body_detection_can_not_started_due_to_absence_of_hardware";
        } else if (this.f109261l.getBoolean("auth_trust_agent_pref_trustlet_enabled_com.google.android.gms.auth.trustagent.trustlet.PhonePositionTrustlet", false)) {
            return "is_supported";
        } else {
            f109253a.mo50711a("User disabled phone position trustlet.", new Object[0]);
            auwc auwc = this.f109258i;
            if (!auwc.f92637g) {
                return "On-body_detection_is_disabled_by_user";
            }
            auwc.mo50990c();
            return "On-body_detection_is_disabled_by_user";
        }
    }

    /* renamed from: j */
    private final void m93541j() {
        if (this.f109264o == null) {
            this.f109264o = new auwe(this);
            aupo.m77578a(this).registerOnSharedPreferenceChangeListener(this.f109264o);
        }
    }

    /* renamed from: b */
    public final void mo50747b() {
        if (!mo50768m()) {
            bogj bogj = (bogj) bohi.f133070z.mo74144da();
            if (bogj.f164950c) {
                bogj.mo74035c();
                bogj.f164950c = false;
            }
            bohi bohi = (bohi) bogj.f164949b;
            bohi.f133072b = 5;
            int i = bohi.f133071a | 1;
            bohi.f133071a = i;
            bohi.f133073c = 2;
            bohi.f133071a = i | 2;
            boolean n = mo50769n();
            if (bogj.f164950c) {
                bogj.mo74035c();
                bogj.f164950c = false;
            }
            bohi bohi2 = (bohi) bogj.f164949b;
            bohi2.f133071a |= 512;
            bohi2.f133080j = n;
            this.f109258i.mo50988a(bogj);
            aupk.m77567a(this, (bohi) bogj.mo74062i());
            f109253a.mo50711a("Phone was locked, playlog sent", new Object[0]);
        }
        this.f109254b = true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: auou.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      com.google.android.gms.trustlet.onbody.internal.PhonePositionTrustletChimeraService.a(java.lang.String, org.json.JSONObject):void
      auou.a(java.lang.String, java.lang.String):void
      auou.a(java.lang.String, org.json.JSONObject):void
      auou.a(boolean, boolean):void */
    /* renamed from: bO */
    public final void mo50642bO() {
        if (this.f109254b) {
            this.f109254b = false;
            f109253a.mo50711a("screen from on to off, reset on-person state", new Object[0]);
            this.f109258i.mo50991d();
            String i = m93540i();
            if (!i.equals("is_supported")) {
                mo50763a(false, false);
                mo50778u(i);
                return;
            }
            mo50760a("Phone position trustlet granted trust.", "user-present");
            this.f109258i.mo50986a();
            mo50778u("screen_from_on_to_off_and_detected_the_phone_is_on_body");
        }
    }

    /* renamed from: c */
    public final void mo50643c() {
        auwc auwc = this.f109258i;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (auwc.f92637g && elapsedRealtime > auwc.f92641k + chac.m147847d() && elapsedRealtime > auwc.f92639i + chac.m147847d()) {
            auwc.f92631a.mo50711a("Activity recognition timeout, disable trustlet.", new Object[0]).mo50706a();
            auwc.f92635e.mo50982a("On-body_detection_is_disabled_due_to_activity_recognition_timeout");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: auou.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      com.google.android.gms.trustlet.onbody.internal.PhonePositionTrustletChimeraService.a(java.lang.String, org.json.JSONObject):void
      auou.a(java.lang.String, java.lang.String):void
      auou.a(java.lang.String, org.json.JSONObject):void
      auou.a(boolean, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo50752d() {
        super.mo50752d();
        this.f109262m = new auoq(this, new auwd(this));
        ScreenOnOffReceiver screenOnOffReceiver = new ScreenOnOffReceiver(this, this);
        this.f109259j = screenOnOffReceiver;
        screenOnOffReceiver.mo59552a();
        this.f109258i = new auwc(this, this);
        this.f109261l = aupo.m77578a(this);
        bqga.m112781a(this.f109262m.mo50741a(), new auwf(this), new aupl());
        String i = m93540i();
        if (!i.equals("is_supported")) {
            mo50763a(false, false);
            mo50778u(i);
            return;
        }
        this.f109260k = true;
        this.f109258i.mo50986a();
        if (this.f109256d) {
            mo50778u("On-body_detection_toggled_on");
        } else {
            mo50778u("On-body_detection_is_started");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo50753e() {
        this.f109258i.mo50990c();
        this.f109259j.mo59553b();
        this.f109260k = false;
        if (this.f109256d) {
            mo50778u("On-body_detectin_toggled_off");
        } else {
            mo50778u("On-body_detection_is_stopped");
        }
        super.mo50753e();
    }

    /* renamed from: f */
    public final void mo50984f() {
        if (mo50768m()) {
            mo50776t("Gait indicates the device is on an unauthorized person.");
        }
        mo50778u("gait_indicates_the_device_is_on_an_unauthorized_person");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: auou.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      com.google.android.gms.trustlet.onbody.internal.PhonePositionTrustletChimeraService.a(java.lang.String, org.json.JSONObject):void
      auou.a(java.lang.String, java.lang.String):void
      auou.a(java.lang.String, org.json.JSONObject):void
      auou.a(boolean, boolean):void */
    /* renamed from: g */
    public final void mo50985g() {
        auwc auwc = this.f109258i;
        if (auwc.f92637g) {
            auwc.mo50991d();
            String i = m93540i();
            if (!i.equals("is_supported")) {
                mo50763a(false, false);
                mo50778u(i);
                return;
            }
            mo50760a("gait_indicates_the_device_is_on_an_authorized_person", "gait_authorization");
            this.f109258i.mo50986a();
            mo50778u("gait_indicates_the_device_is_on_an_authorized_person");
            return;
        }
        f109253a.mo50711a("Can't reauthenticate when disabled.", new Object[0]).mo50709d();
    }

    /* renamed from: o */
    public final String mo50770o() {
        return "PhonePosition";
    }

    public final void onCreate() {
        m93541j();
        auva d = auva.m77911d();
        this.f109263n = d;
        d.mo50964e();
        this.f109255c = new auvq(this);
        registerReceiver(this.f109257h, new IntentFilter("com.google.android.gms.trustagent.TRUST_STATE_CHANGED"));
    }

    public final void onRebind(Intent intent) {
        super.onRebind(intent);
        m93541j();
        this.f109255c = new auvq(this);
        registerReceiver(this.f109257h, new IntentFilter("com.google.android.gms.trustagent.TRUST_STATE_CHANGED"));
    }

    public final boolean onUnbind(Intent intent) {
        this.f109255c.mo50977a();
        this.f109255c = null;
        if (this.f109264o != null) {
            aupo.m77578a(this).unregisterOnSharedPreferenceChangeListener(this.f109264o);
        }
        unregisterReceiver(this.f109257h);
        return super.onUnbind(intent);
    }

    /* renamed from: p */
    public final boolean mo50771p() {
        return aupq.m77579a().f92277c;
    }

    /* renamed from: r */
    public final Bundle mo50773r() {
        String str;
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.gms.trustagent.api.trustlet.key_trustlet_name", "PhonePosition");
        bundle.putBoolean("com.google.android.gms.trustagent.api.trustlet.key_is_user_initiated", false);
        bundle.putBoolean("com.google.android.gms.trustagent.api.trustlet.key_dismiss_keyguard", false);
        bundle.putBoolean("key_trustlet_is_suppored", mo50772q());
        bundle.putBoolean("key_trustlet_is_enabled_by_device_policy", mo50771p());
        bundle.putString("key_trustlet_pref_key", "auth_trust_agent_pref_activity_recognition_unlock_key");
        bundle.putString("key_trustlet_pref_title", getString(C0126R.string.auth_trust_agent_pref_activity_recognition_unlock_title));
        if (this.f109261l == null) {
            this.f109261l = aupo.m77578a(this);
        }
        if (!this.f109261l.getBoolean("auth_trust_agent_pref_trustlet_enabled_com.google.android.gms.auth.trustagent.trustlet.PhonePositionTrustlet", false)) {
            str = getString(C0126R.string.onbody_promotion_summary);
        } else {
            str = getString(C0126R.string.auth_trust_agent_pref_on_body_detection_enabled_summary);
        }
        bundle.putString("key_trustlet_pref_summary", str);
        bundle.putInt("key_trustlet_icon_res_id", C0126R.C0127drawable.quantum_ic_directions_walk_black_24);
        bundle.putString("key_trustlet_settings_activity_class_name", "com.google.android.gms.trustagent.GoogleTrustAgentOnBodyDetectionSettings");
        bundle.putString("key_trustlet_settings_activity_package_name", "com.google.android.gms");
        return bundle;
    }

    /* renamed from: u */
    public final void mo50777u() {
        super.mo50777u();
        this.f109263n.mo50964e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final boolean mo50779v() {
        return mo50772q() && mo50771p() && m93539h();
    }

    /* renamed from: x */
    public final int mo50781x() {
        return 6;
    }

    /* renamed from: q */
    public final boolean mo50772q() {
        return m93537a(rpr.m34216b());
    }

    /* renamed from: a */
    public static boolean m93538a(SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean("onbody_already_set", false) || sharedPreferences.getBoolean("auth_trust_agent_pref_trustlet_enabled_com.google.android.gms.auth.trustagent.trustlet.PhonePositionTrustlet", false);
    }

    /* renamed from: a */
    public final void mo50746a() {
        aunx aunx = f109253a;
        boolean m = mo50768m();
        StringBuilder sb = new StringBuilder(33);
        sb.append("onPhoneOffPerson, isTrusted:");
        sb.append(m);
        aunx.mo50711a(sb.toString(), new Object[0]);
        auwc auwc = this.f109258i;
        if (auwc.f92637g) {
            auwc.mo50990c();
        }
        if (mo50768m()) {
            mo50776t(null);
        }
        mo50778u("phone_is_off_person");
    }

    /* renamed from: a */
    public final void mo50759a(bogj bogj) {
        super.mo50759a(bogj);
        this.f109258i.mo50988a(bogj);
    }

    /* renamed from: a */
    public final void mo50982a(String str) {
        this.f109258i.mo50990c();
        mo50776t(str);
        mo50778u(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo50762a(String str, JSONObject jSONObject) {
        if (cgzt.m147783h()) {
            mo50761a("OnBody", str, null, this.f109260k, mo50772q(), mo50771p(), m93539h(), Long.valueOf(System.currentTimeMillis()));
        }
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
        bohf2.f133060a |= 4;
        bohf2.f133063d = k;
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

    /* renamed from: a */
    public final void mo50983a(boolean z) {
        mo50763a(z, z);
        if (!z) {
            if (mo50768m()) {
                mo50776t("Cannot register to activity recognition service.");
            }
            mo50778u("On-body_detection_cannot_work_because_it_cannot_register_to_activity_recognition_service");
            return;
        }
        mo50778u("accelerometer_registration_succeeded");
    }
}
