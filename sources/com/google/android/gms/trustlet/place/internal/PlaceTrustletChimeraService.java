package com.google.android.gms.trustlet.place.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PlaceTrustletChimeraService extends auou implements auxt, auxo, auxm {

    /* renamed from: a */
    public static final aunx f109276a = new aunx("TrustAgent", "PlaceTrustletChimeraService");

    /* renamed from: b */
    public SharedPreferences f109277b;

    /* renamed from: c */
    public boolean f109278c;

    /* renamed from: d */
    public Set f109279d;

    /* renamed from: h */
    public Set f109280h;

    /* renamed from: i */
    public Set f109281i;

    /* renamed from: j */
    private SharedPreferences.Editor f109282j;

    /* renamed from: k */
    private SharedPreferences.OnSharedPreferenceChangeListener f109283k;

    /* renamed from: l */
    private auxp f109284l;

    /* renamed from: m */
    private auxu f109285m = null;

    /* renamed from: n */
    private auxg f109286n = null;

    /* renamed from: o */
    private auxn f109287o = null;

    /* renamed from: p */
    private UserPresentBroadcastReceiver f109288p;

    /* renamed from: q */
    private boolean f109289q = false;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class UserPresentBroadcastReceiver extends aacn {
        public UserPresentBroadcastReceiver() {
            super("trustlet_place");
        }

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            aunx aunx = PlaceTrustletChimeraService.f109276a;
            String valueOf = String.valueOf(intent.getAction());
            aunx.mo50711a(valueOf.length() == 0 ? new String("User Present broadcast receiver action: ") : "User Present broadcast receiver action: ".concat(valueOf), new Object[0]);
            if (!PlaceTrustletChimeraService.this.f109278c) {
                PlaceTrustletChimeraService.f109276a.mo50711a("Place trustlet is not started.", new Object[0]);
            } else if (((double) new Random().nextFloat()) <= chal.f188193a.mo6606a().mo84875e()) {
                for (ActivityManager.RunningServiceInfo runningServiceInfo : ((ActivityManager) PlaceTrustletChimeraService.this.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE)) {
                    if (GeofenceLogsChimeraService.class.getName().equals(runningServiceInfo.service.getClassName())) {
                        return;
                    }
                }
                Intent className = new Intent().setClassName(PlaceTrustletChimeraService.this, "com.google.android.gms.trustagent.trustlet.GeofenceLogsService");
                Set set = PlaceTrustletChimeraService.this.f109279d;
                className.putExtra("auth_trust_agent_trusted_places_id_list_key", (String[]) set.toArray(new String[set.size()]));
                Set set2 = PlaceTrustletChimeraService.this.f109280h;
                className.putExtra("auth_trust_agent_entered_trusted_places_id_list_key", (String[]) set2.toArray(new String[set2.size()]));
                PlaceTrustletChimeraService.this.startService(className);
            }
        }
    }

    /* renamed from: b */
    protected static final SharedPreferences m93568b() {
        return aupo.m77578a(rpr.m34216b());
    }

    /* renamed from: c */
    private final void m93569c(String str, String str2) {
        String str3 = "";
        for (String str4 : this.f109280h) {
            String valueOf = String.valueOf(str3);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str4).length());
            sb.append(valueOf);
            sb.append(str4);
            sb.append(" ");
            str3 = sb.toString();
        }
        aunx aunx = f109276a;
        String valueOf2 = String.valueOf(str3);
        aunx.mo50711a(valueOf2.length() == 0 ? new String("Entered Trusted Places Id List: ") : "Entered Trusted Places Id List: ".concat(valueOf2), new Object[0]);
        aunx aunx2 = f109276a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12 + str2.length());
        sb2.append("Geofence: ");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(str2);
        aunx2.mo50711a(sb2.toString(), new Object[0]);
    }

    /* renamed from: f */
    private final void m93570f() {
        f109276a.mo50711a("Place trustlet started", new Object[0]);
        this.f109284l.f92737f = true;
        this.f109278c = true;
        this.f109277b.registerOnSharedPreferenceChangeListener(this.f109283k);
        registerReceiver(this.f109288p, new IntentFilter("android.intent.action.USER_PRESENT"));
        this.f109285m.mo51024a(this);
        f109276a.mo50711a("removeWorkFromTrustedPlaces", new Object[0]);
        String string = this.f109277b.getString("auth_trust_agent_pref_trusted_place_home_work_account", "");
        if (TextUtils.isEmpty(string)) {
            f109276a.mo50711a("No account is set for trusted places.", new Object[0]);
        } else {
            String a = auxi.m78022a(string, "Work", this.f109277b);
            if (TextUtils.isEmpty(a)) {
                f109276a.mo50711a("removeWorkFromTrustedPlaces: No work id for account.", new Object[0]);
            } else {
                if (this.f109277b.getBoolean(auxi.m78021a(a), false)) {
                    f109276a.mo50711a("removeWorkFromTrustedPlaces: Work is enabled. Adding to trusted places.", new Object[0]);
                    mo59583e(a);
                } else {
                    f109276a.mo50711a("removeWorkFromTrustedPlaces: Work place is not enabled.", new Object[0]);
                    this.f109282j.remove(auxi.m78021a(a));
                    this.f109282j.remove(auxi.m78025b(a));
                    this.f109282j.remove(auxi.m78028c(a));
                }
                this.f109282j.remove(auxi.m78030d(a));
                SharedPreferences.Editor editor = this.f109282j;
                String valueOf = String.valueOf(string);
                editor.remove(valueOf.length() == 0 ? new String("auth_trust_agent_pref_trusted_place_work_account_enabled_") : "auth_trust_agent_pref_trusted_place_work_account_enabled_".concat(valueOf));
                this.f109282j.apply();
            }
        }
        f109276a.mo50711a("PlaceLure enabled: %s", Boolean.valueOf(chai.m147896b()));
        if (chai.m147896b()) {
            m93571g();
        }
        this.f109287o = new auxn(this, aupo.m77578a(this), aupo.m77578a(this).edit(), this);
        mo50778u("place_trustlet_is_started");
    }

    /* renamed from: g */
    private final void m93571g() {
        f109276a.mo50711a("enableHomeLure", new Object[0]);
        if (this.f109286n == null && !this.f109277b.getBoolean("auth_trust_agent_pref_place_lure_notification_do_not_show", false)) {
            auxg auxg = new auxg(this);
            this.f109286n = auxg;
            if (!auxg.f92699f.getBoolean("auth_trust_agent_pref_place_lure_notification_do_not_show", false)) {
                auxg.f92700g = new auxf(auxg);
                auxg.f92699f.registerOnSharedPreferenceChangeListener(auxg.f92700g);
                synchronized (auxg.f92698e) {
                    auxg.f92695b = new HomeLure$GoogleAccountChangeBroadcastReceiver(auxg);
                    IntentFilter intentFilter = new IntentFilter("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE");
                    intentFilter.addCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED");
                    intentFilter.addCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED");
                    auxg.f92696c.registerReceiver(auxg.f92695b, intentFilter);
                }
                auxg.mo51012b();
            }
        }
    }

    /* renamed from: h */
    private final void m93572h() {
        f109276a.mo50711a("disableHomeLure", new Object[0]);
        auxg auxg = this.f109286n;
        if (auxg != null) {
            synchronized (auxg.f92698e) {
                if (auxg.f92697d != null) {
                    auxg.f92699f.unregisterOnSharedPreferenceChangeListener(auxg.f92700g);
                    auxg.f92700g = null;
                    auxg.mo51010a();
                    auxg.f92697d.mo51014a();
                    auxg.f92697d = null;
                }
            }
            this.f109286n = null;
        }
    }

    /* renamed from: i */
    private final void m93573i() {
        this.f109279d.clear();
        this.f109280h.clear();
        m93572h();
        auxn auxn = this.f109287o;
        if (auxn != null) {
            auxn.f92726b.unregisterReceiver(auxn.f92730f);
            auxn.f92726b.unregisterReceiver(auxn.f92729e);
            this.f109287o = null;
        }
        this.f109285m.mo51028b(this);
        unregisterReceiver(this.f109288p);
        this.f109277b.unregisterOnSharedPreferenceChangeListener(this.f109283k);
        this.f109278c = false;
        if (mo50768m()) {
            mo50776t(null);
        }
        this.f109284l.f92737f = false;
        f109276a.mo50711a("stopPlaceTrustlet(), revokeTrust(null)", new Object[0]);
        mo50778u("place_trustlet_is_stopped");
    }

    /* renamed from: a */
    public final void mo50746a() {
        if (mo50768m() || this.f109280h.isEmpty()) {
            if (mo50768m() && this.f109280h.isEmpty()) {
                mo50776t(null);
                f109276a.mo50711a("isTrusted() && mEnteredTrustedPlacesIdList.isEmpty(), revokeTrust(null)", new Object[0]);
            }
            f109276a.mo50711a("end of validateTrust", new Object[0]);
            return;
        }
        mo50760a("location trusted.", mo59584f((String) this.f109280h.iterator().next()));
        f109276a.mo50711a("!isTrusted() && !mEnteredTrustedPlacesIdList.isEmpty(), grantTrust!", new Object[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo50752d() {
        super.mo50752d();
        f109276a.mo50711a("initializeTrustlet", new Object[0]);
        this.f109278c = false;
        this.f109279d = new HashSet();
        this.f109280h = new HashSet();
        this.f109281i = new HashSet();
        auxp auxp = new auxp(this, this);
        this.f109284l = auxp;
        auxp.f92733b.registerReceiver(auxp.f92736e, auxp.f92735d);
        boolean b = chal.m147901b();
        this.f109289q = b;
        if (b) {
            this.f109285m = auxl.m78036a((Context) this);
        } else {
            this.f109285m = auxs.m78055a((Context) this);
        }
        this.f109288p = new UserPresentBroadcastReceiver();
        mo50778u("trustlet_created");
        this.f109283k = new auxj(this);
        if (this.f109284l.mo51034a()) {
            m93570f();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo50753e() {
        super.mo50753e();
        if (this.f109278c) {
            m93573i();
        }
        this.f109285m = null;
        auxp auxp = this.f109284l;
        auxp.f92737f = false;
        auxp.f92733b.unregisterReceiver(auxp.f92736e);
        f109276a.mo50711a("destroyTrustlet(), stop()", new Object[0]);
        mo50778u("trustlet_destroyed");
    }

    /* renamed from: o */
    public final String mo50770o() {
        return "Place";
    }

    public final void onCreate() {
        SharedPreferences b = m93568b();
        this.f109277b = b;
        this.f109282j = b.edit();
    }

    /* renamed from: p */
    public final boolean mo50771p() {
        return aupq.m77579a().f92278d;
    }

    /* renamed from: q */
    public final boolean mo50772q() {
        boolean b = chal.f188193a.mo6606a().mo84872b();
        f109276a.mo50711a("Trusted Places isSupported: %s", Boolean.valueOf(b)).mo50708c();
        return b;
    }

    /* renamed from: r */
    public final Bundle mo50773r() {
        String str;
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.gms.trustagent.api.trustlet.key_trustlet_name", "Place");
        bundle.putBoolean("com.google.android.gms.trustagent.api.trustlet.key_is_user_initiated", false);
        bundle.putBoolean("com.google.android.gms.trustagent.api.trustlet.key_dismiss_keyguard", false);
        bundle.putBoolean("key_trustlet_is_suppored", mo50772q());
        bundle.putBoolean("key_trustlet_is_enabled_by_device_policy", mo50771p());
        bundle.putString("key_trustlet_pref_key", "auth_trust_agent_pref_trusted_places_key");
        bundle.putString("key_trustlet_pref_title", getString(C0126R.string.auth_trust_agent_pref_trusted_places_title));
        StringBuilder sb = new StringBuilder();
        SharedPreferences b = m93568b();
        Set<String> keySet = b.getAll().keySet();
        if (keySet != null) {
            for (String str2 : keySet) {
                String i = auxi.m78035i(str2);
                if (!TextUtils.isEmpty(i) && b.getBoolean(str2, false)) {
                    String string = b.getString(auxi.m78025b(i), "");
                    if (TextUtils.isEmpty(string)) {
                        string = getString(C0126R.string.auth_trust_agent_trusted_places_place_unknown_place);
                    }
                    if (sb.length() != 0) {
                        sb.append(", ");
                    }
                    sb.append(string);
                }
            }
        }
        if (sb.length() == 0) {
            str = getString(C0126R.string.auth_trust_agent_pref_trusted_places_default_summary);
        } else {
            str = getString(C0126R.string.auth_trust_agent_pref_trusted_places_configured_summary, new Object[]{sb.toString()});
        }
        bundle.putString("key_trustlet_pref_summary", str);
        bundle.putInt("key_trustlet_icon_res_id", C0126R.C0127drawable.quantum_ic_place_black_24);
        bundle.putString("key_trustlet_settings_activity_intent_action", "com.google.android.gms.trustlet.place.ui.TrustedPlacesSettingsActivity.START");
        bundle.putString("key_trustlet_settings_activity_package_name", "com.google.android.gms");
        Bundle bundle2 = new Bundle();
        Account[] accountsByType = AccountManager.get(this).getAccountsByType("com.google");
        SharedPreferences a = aupo.m77578a(this);
        int length = accountsByType.length;
        if (length > 0) {
            String string2 = a.getString("auth_trust_agent_pref_trusted_place_home_work_account", "");
            if (!TextUtils.isEmpty(string2)) {
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (accountsByType[i2].name.equals(string2)) {
                        bundle2.putString("auth_trust_agent_bundle_trusted_place_home_work_account", a.getString("auth_trust_agent_pref_trusted_place_home_work_account", ""));
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            String str3 = accountsByType[0].name;
            a.edit().putString("auth_trust_agent_pref_trusted_place_home_work_account", str3).apply();
            bundle2.putString("auth_trust_agent_bundle_trusted_place_home_work_account", str3);
        } else if (a.contains("auth_trust_agent_pref_trusted_place_home_work_account")) {
            a.edit().remove("auth_trust_agent_pref_trusted_place_home_work_account").apply();
        }
        bundle.putBundle("key_trustlet_intent_extras", bundle2);
        return bundle;
    }

    /* renamed from: t */
    public final void mo50775t() {
        super.mo50775t();
        if (mo50774s()) {
            if (this.f109289q != chal.m147901b()) {
                mo50753e();
                mo50752d();
            }
            if (chai.m147896b()) {
                m93571g();
            } else {
                m93572h();
            }
        }
    }

    /* renamed from: x */
    public final int mo50781x() {
        return 3;
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
        bohf2.f133060a |= 2;
        bohf2.f133062c = k;
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
        if (mo50766k()) {
            mo59580c(bogj);
        }
    }

    /* renamed from: c */
    public final void mo51019c() {
        f109276a.mo50711a("initTrustedPlaces()", new Object[0]);
        for (String str : this.f109277b.getAll().keySet()) {
            String i = auxi.m78035i(str);
            if (!TextUtils.isEmpty(i) && this.f109277b.getBoolean(str, false)) {
                SharedPreferences sharedPreferences = this.f109277b;
                String valueOf = String.valueOf(i);
                if ("Work".equals(sharedPreferences.getString(valueOf.length() == 0 ? new String("auth_trust_agent_pref_trusted_place_name_") : "auth_trust_agent_pref_trusted_place_name_".concat(valueOf), ""))) {
                    f109276a.mo50711a("initTrustedPlaces: adding work.", new Object[0]);
                }
                mo59583e(i);
            }
        }
        this.f109285m.mo51026a(this, (String[]) this.f109279d.toArray(new String[0]));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: auou.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      com.google.android.gms.trustlet.place.internal.PlaceTrustletChimeraService.a(java.lang.String, org.json.JSONObject):void
      auou.a(java.lang.String, java.lang.String):void
      auou.a(java.lang.String, org.json.JSONObject):void
      auou.a(boolean, boolean):void */
    /* renamed from: e */
    public final void mo59583e(String str) {
        f109276a.mo50711a("addPlaceToTrustedPlaces()", new Object[0]);
        if (TextUtils.isEmpty(str)) {
            f109276a.mo50711a("Ignore empty place id.", new Object[0]);
            return;
        }
        SharedPreferences sharedPreferences = this.f109277b;
        String valueOf = String.valueOf(str);
        String string = sharedPreferences.getString(valueOf.length() == 0 ? new String("auth_trust_agent_pref_trusted_place_name_") : "auth_trust_agent_pref_trusted_place_name_".concat(valueOf), "");
        if ("Home".equals(string) || aupq.m77579a().f92279e) {
            boolean isEmpty = this.f109279d.isEmpty();
            this.f109279d.add(str);
            if (isEmpty) {
                mo50763a(true, true);
                aunw a = f109276a.mo50711a("Place trustlet is enabled by user.", new Object[0]);
                a.mo50708c();
                a.mo50707b();
            }
            mo59581c(str);
            mo50765b("add place", null);
            return;
        }
        aunx aunx = f109276a;
        String valueOf2 = String.valueOf(string);
        aunx.mo50711a(valueOf2.length() == 0 ? new String("Place is disabled by device admin: ") : "Place is disabled by device admin: ".concat(valueOf2), new Object[0]);
    }

    /* renamed from: a */
    public final void mo51015a(int i) {
        String str;
        aunx aunx = f109276a;
        StringBuilder sb = new StringBuilder(41);
        sb.append("onTrustedPlaceDetectionError(");
        sb.append(i);
        sb.append(")");
        aunx.mo50711a(sb.toString(), new Object[0]);
        String str2 = "nearby alert";
        if (this.f109289q ? i != 1003 : i != 9101) {
            aunx aunx2 = f109276a;
            if (this.f109289q) {
                str2 = "geofence";
            }
            StringBuilder sb2 = new StringBuilder(str2.length() + 39);
            sb2.append("Unexpected error from ");
            sb2.append(str2);
            sb2.append(" api: ");
            sb2.append(i);
            aunx2.mo50711a(sb2.toString(), new Object[0]).mo50706a();
        } else {
            m93569c("Unknown", "Current location cannot be determined.");
            aunx aunx3 = f109276a;
            if (this.f109289q) {
                str2 = "geofence";
            }
            StringBuilder sb3 = new StringBuilder(str2.length() + 39);
            sb3.append("Reset ");
            sb3.append(str2);
            sb3.append(" requests for all trusted places.");
            aunx3.mo50711a(sb3.toString(), new Object[0]);
            this.f109280h.clear();
            this.f109285m.mo51030c(this);
            mo50746a();
            this.f109285m.mo51026a(this, (String[]) this.f109279d.toArray(new String[0]));
        }
        if (this.f109289q) {
            str = aehg.m51838a(i);
        } else {
            str = aemj.m52156a(i);
        }
        mo50762a("error_from_near_by_detection", aumv.m77339a("place_detection_error", str));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a9  */
    /* renamed from: c */
    public final void mo59580c(bogj bogj) {
        boolean z;
        bxvd da;
        String string = this.f109277b.getString("auth_trust_agent_pref_trusted_place_home_work_account", "");
        if (TextUtils.isEmpty(string)) {
            f109276a.mo50711a("No account is set for trusted places.", new Object[0]);
            return;
        }
        long j = 0;
        for (String str : this.f109277b.getAll().keySet()) {
            if (!TextUtils.isEmpty(auxi.m78035i(str)) && this.f109277b.getBoolean(str, false)) {
                j++;
            }
        }
        if (bogj.f164950c) {
            bogj.mo74035c();
            bogj.f164950c = false;
        }
        bohi bohi = (bohi) bogj.f164949b;
        bohi bohi2 = bohi.f133070z;
        bohi.f133071a |= 64;
        bohi.f133077g = j;
        boolean z2 = this.f109277b.getBoolean(auxi.m78031e(string), false);
        if (z2) {
            if (j - 1 > 0) {
                z = true;
                da = bohd.f133052d.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bohd bohd = (bohd) da.f164949b;
                int i = 1 | bohd.f133054a;
                bohd.f133054a = i;
                bohd.f133055b = z2;
                bohd.f133054a = i | 2;
                bohd.f133056c = z;
                if (bogj.f164950c) {
                    bogj.mo74035c();
                    bogj.f164950c = false;
                }
                bohi bohi3 = (bohi) bogj.f164949b;
                bohd bohd2 = (bohd) da.mo74062i();
                bohd2.getClass();
                bohi3.f133082l = bohd2;
                bohi3.f133071a |= 1024;
            }
        } else if (j > 0) {
            z = true;
            da = bohd.f133052d.mo74144da();
            if (da.f164950c) {
            }
            bohd bohd3 = (bohd) da.f164949b;
            int i2 = 1 | bohd3.f133054a;
            bohd3.f133054a = i2;
            bohd3.f133055b = z2;
            bohd3.f133054a = i2 | 2;
            bohd3.f133056c = z;
            if (bogj.f164950c) {
            }
            bohi bohi32 = (bohi) bogj.f164949b;
            bohd bohd22 = (bohd) da.mo74062i();
            bohd22.getClass();
            bohi32.f133082l = bohd22;
            bohi32.f133071a |= 1024;
        }
        z = false;
        da = bohd.f133052d.mo74144da();
        if (da.f164950c) {
        }
        bohd bohd32 = (bohd) da.f164949b;
        int i22 = 1 | bohd32.f133054a;
        bohd32.f133054a = i22;
        bohd32.f133055b = z2;
        bohd32.f133054a = i22 | 2;
        bohd32.f133056c = z;
        if (bogj.f164950c) {
        }
        bohi bohi322 = (bohi) bogj.f164949b;
        bohd bohd222 = (bohd) da.mo74062i();
        bohd222.getClass();
        bohi322.f133082l = bohd222;
        bohi322.f133071a |= 1024;
    }

    /* renamed from: d */
    public final void mo59582d(String str) {
        if (this.f109289q) {
            this.f109285m.mo51029b(this, str);
        } else {
            this.f109285m.mo51025a(this, str);
        }
    }

    /* renamed from: b */
    public final void mo51018b(String str) {
        this.f109280h.remove(str);
        m93569c(str, "Exit");
        mo50746a();
        mo50762a("exited_trusted_place", aumv.m77340a("trustlet_id", str, "trustlet_source", mo59584f(str)));
    }

    /* renamed from: b */
    public final void mo59579b(boolean z) {
        bogj bogj = (bogj) bohi.f133070z.mo74144da();
        mo59580c(bogj);
        if (bogj.f164950c) {
            bogj.mo74035c();
            bogj.f164950c = false;
        }
        bohi bohi = (bohi) bogj.f164949b;
        bohi.f133072b = 2;
        int i = bohi.f133071a | 1;
        bohi.f133071a = i;
        if (!z) {
            bohi.f133076f = 2;
            bohi.f133071a = i | 32;
        } else {
            bohi.f133076f = 1;
            bohi.f133071a = i | 32;
        }
        long size = (long) this.f109279d.size();
        if (bogj.f164950c) {
            bogj.mo74035c();
            bogj.f164950c = false;
        }
        bohi bohi2 = (bohi) bogj.f164949b;
        bohi2.f133071a |= 64;
        bohi2.f133077g = size;
        aupk.m77567a(this, (bohi) bogj.mo74062i());
    }

    /* renamed from: a */
    public final void mo51016a(String str) {
        if (this.f109279d.contains(str)) {
            this.f109280h.add(str);
            m93569c(str, "Enter");
            mo50746a();
            mo50762a("entered_trusted_place", aumv.m77340a("trustlet_id", str, "trustlet_source", mo59584f(str)));
        }
    }

    /* renamed from: c */
    public final void mo59581c(String str) {
        this.f109285m.mo51025a(this, str);
    }

    /* renamed from: f */
    public final String mo59584f(String str) {
        if (this.f109277b.contains(auxi.m78025b(str))) {
            return this.f109277b.getString(auxi.m78025b(str), "");
        }
        return getString(C0126R.string.auth_trust_agent_trusted_places_place_unknown_place);
    }

    /* renamed from: a */
    public final void mo51031a(String str, String str2, String str3) {
        boolean z = !TextUtils.isEmpty(str2) && this.f109277b.getBoolean(auxi.m78031e(str), false);
        this.f109282j.remove(auxi.m78021a(str2)).putBoolean(auxi.m78021a(str3), false).putBoolean(auxi.m78031e(str), false).apply();
        if (this.f109277b.getString("auth_trust_agent_pref_trusted_place_home_work_account", "").equals(str) && z && !TextUtils.isEmpty(str3)) {
            PendingIntent a = aupf.m77549a(this, bogq.HOME_ADDRESS_CHANGE, 0);
            String string = getString(C0126R.string.auth_trust_agent_home_address_changed_notification_public);
            Bundle bundle = new Bundle();
            bundle.putString("auth_trust_agent_bundle_trusted_place_home_work_account", str);
            bundle.putInt("notification_type_key", 1);
            bundle.putLong("notification_shown_time", System.currentTimeMillis());
            aupf aupf = new aupf(this);
            aupf.f92250c = string;
            aupf.f92255h = "com.google.android.gms.trustlet.place.ui.TrustedPlacesSettingsActivity";
            aupf.f92256i = "trust_agent_trusted_places_action_enable_home";
            aupf.f92252e = a;
            aupf.f92261n = bundle;
            aupf.f92253f = bogq.HOME_ADDRESS_CHANGE;
            aupf.mo50787b();
            f109276a.mo50711a("log notification type: TrustAgentEvent.HOME_ADDRESS_CHANGE, notification event type: TrustAgentEvent.NOTIFICATION_SHOWN", new Object[0]);
            bogj bogj = (bogj) bohi.f133070z.mo74144da();
            bxvd da = bogm.f133003e.mo74144da();
            bogq bogq = bogq.HOME_ADDRESS_CHANGE;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bogm bogm = (bogm) da.f164949b;
            bogm.f133006b = bogq.f133019h;
            int i = 1 | bogm.f133005a;
            bogm.f133005a = i;
            bogm.f133007c = 0;
            bogm.f133005a = i | 2;
            bogj.mo68908a((bogm) da.mo74062i());
            aupk.m77567a(this, (bohi) bogj.mo74062i());
        }
        auxg auxg = this.f109286n;
        if (auxg != null) {
            auxg.mo51011a(str, str3);
        }
    }

    /* renamed from: a */
    public final void mo50762a(String str, JSONObject jSONObject) {
        if (cgzt.m147783h()) {
            mo50761a("Place", str, jSONObject, this.f109278c, mo50772q(), mo50771p(), true, Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* renamed from: a */
    public final void mo51033a(boolean z) {
        mo50762a("location_provider_state_changed", aumv.m77339a("place_location_provider", String.valueOf(z)));
        if (this.f109278c) {
            if (z) {
                return;
            }
        } else if (z) {
            m93570f();
            return;
        }
        m93573i();
    }
}
