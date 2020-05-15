package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.trustlet.place.p076ui.TrustedPlacesHomePreference;
import com.google.android.gms.trustlet.place.p076ui.TrustedPlacesSettingsChimeraActivity;
import java.util.Set;

/* renamed from: auyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auyk extends aupa implements aoa, auyq {

    /* renamed from: k */
    private static final aunx f92775k = new aunx("TrustAgent", "TrustedPlacesFragment");

    /* renamed from: c */
    public TrustedPlacesHomePreference f92776c;

    /* renamed from: d */
    public PreferenceScreen f92777d;

    /* renamed from: e */
    public auol f92778e;

    /* renamed from: f */
    public int f92779f;

    /* renamed from: h */
    public boolean f92780h;

    /* renamed from: i */
    public boolean f92781i;

    /* renamed from: j */
    public boolean f92782j;

    /* renamed from: l */
    private Preference f92783l;

    /* renamed from: m */
    private String[] f92784m;

    /* renamed from: n */
    private int f92785n;

    /* renamed from: o */
    private aelh f92786o;

    /* renamed from: p */
    private String f92787p;

    /* renamed from: q */
    private aupq f92788q;

    /* renamed from: c */
    private final String m78080c(String str) {
        String valueOf = String.valueOf(mo51054b(str, "Home"));
        return valueOf.length() == 0 ? new String("auth_trust_agent_pref_trusted_place_enabled_") : "auth_trust_agent_pref_trusted_place_enabled_".concat(valueOf);
    }

    /* renamed from: d */
    private final String m78081d(String str) {
        String valueOf = String.valueOf(mo51054b(str, "Home"));
        return valueOf.length() == 0 ? new String("auth_trust_agent_pref_trusted_place_address_") : "auth_trust_agent_pref_trusted_place_address_".concat(valueOf);
    }

    /* renamed from: e */
    private final String m78083e(String str) {
        auol auol = this.f92778e;
        String valueOf = String.valueOf(str);
        return auol.mo50725a(valueOf.length() == 0 ? new String("auth_trust_agent_pref_trusted_place_name_") : "auth_trust_agent_pref_trusted_place_name_".concat(valueOf), "");
    }

    /* renamed from: a */
    public final void mo51049a(aelh aelh, String str) {
        auol auol = this.f92778e;
        if (auol == null || !auol.mo50734b()) {
            this.f92786o = aelh;
            this.f92787p = str;
        } else if (this.f92778e.mo50729a(auxi.m78021a(aelh.mo8007a()))) {
            Toast.makeText(getActivity(), getString(C0126R.string.auth_trust_agent_add_trusted_place_duplicated_place), 1).show();
        } else {
            String a = aelh.mo8007a();
            String charSequence = aelh.mo8025r().toString();
            String charSequence2 = aelh.mo8024q().toString();
            if (TextUtils.isEmpty(charSequence)) {
                charSequence2 = getString(C0126R.string.auth_trust_agent_trusted_places_place_dropped_pin);
                LatLng d = aelh.mo8010d();
                double d2 = d.f79894a;
                double d3 = d.f79895b;
                StringBuilder sb = new StringBuilder(50);
                sb.append(d2);
                sb.append(", ");
                sb.append(d3);
                charSequence = sb.toString();
            }
            if (str != null) {
                charSequence2 = m78083e(str);
            }
            if (str != null) {
                mo51055b(str);
            }
            if (str == null) {
                auyf.m78076a(auxi.m78021a(a), charSequence2, charSequence).show(getFragmentManager(), "TrustedPlacesRenameDiaglogFragment");
                return;
            }
            mo51051a(a, charSequence2, charSequence);
            mo51061k();
        }
    }

    /* renamed from: a */
    public final boolean mo2219a(Preference preference) {
        return false;
    }

    /* renamed from: b */
    public final String mo51054b(String str, String str2) {
        return auxi.m78023a(str, str2, this.f92778e);
    }

    /* renamed from: f */
    public final boolean mo51058f() {
        auol g = mo50786g();
        this.f92778e = g;
        return g != null;
    }

    /* renamed from: i */
    public final String mo51059i() {
        return this.f92778e.mo50725a("auth_trust_agent_pref_trusted_place_home_work_account", "");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: auol.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      auol.a(java.lang.String, long):long
      auol.a(java.lang.String, java.lang.String):java.lang.String
      auol.a(java.lang.String, java.lang.Object):void
      aupn.a(java.lang.String, long):long
      aupn.a(java.lang.String, java.lang.String):java.lang.String
      auol.a(java.lang.String, boolean):void */
    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo51060j() {
        if (!this.f92778e.mo50736c("auth_trust_agent_pref_trusted_places_enable_home_work_first_time_key")) {
            this.f92778e.mo50728a("auth_trust_agent_pref_trusted_places_enable_home_work_first_time_key", true);
            new auyb().show(getFragmentManager(), "TrustedPlacesRadiusNoteDialogFragment");
        }
    }

    /* renamed from: k */
    public final void mo51061k() {
        this.f92777d.mo2025v();
        f92775k.mo50711a("showUserHome", new Object[0]);
        if (this.f92778e.mo50729a(m78081d(mo51059i()))) {
            mo51052a(this.f92778e.mo50736c(m78080c(mo51059i())));
            TrustedPlacesHomePreference trustedPlacesHomePreference = this.f92776c;
            trustedPlacesHomePreference.f109299b = false;
            trustedPlacesHomePreference.f109300c.setVisibility(0);
            this.f92776c.mo1966a((CharSequence) this.f92778e.mo50725a(m78081d(mo51059i()), ""));
        } else {
            if (!this.f92780h) {
                mo51052a(false);
            } else {
                mo51052a(true);
            }
            TrustedPlacesHomePreference trustedPlacesHomePreference2 = this.f92776c;
            trustedPlacesHomePreference2.f109299b = true;
            trustedPlacesHomePreference2.f109300c.setVisibility(8);
            this.f92776c.mo1966a((CharSequence) getString(C0126R.string.auth_trust_agent_pref_trusted_places_none_home_summary));
        }
        this.f92777d.mo2019a((Preference) this.f92776c);
        this.f92777d.mo2019a(this.f92783l);
        this.f92779f = 1;
        f92775k.mo50711a("showCustomPlaces", new Object[0]);
        Set<String> c = this.f92778e.mo50735c();
        if (c == null) {
            f92775k.mo50711a("No key found in shared preference.", new Object[0]);
            return;
        }
        for (String str : c) {
            String i = auxi.m78035i(str);
            if (!TextUtils.isEmpty(i)) {
                String e = m78083e(i);
                auol auol = this.f92778e;
                String valueOf = String.valueOf(i);
                String a = auol.mo50725a(valueOf.length() == 0 ? new String("auth_trust_agent_pref_trusted_place_address_") : "auth_trust_agent_pref_trusted_place_address_".concat(valueOf), "");
                boolean z = !auxi.m78024a(i, this.f92778e).isEmpty();
                if (!"Home".equals(e) || !z) {
                    if ("Work".equals(e)) {
                        f92775k.mo50711a("adding preference item for work.", new Object[0]);
                    }
                    if (TextUtils.isEmpty(e)) {
                        e = getString(C0126R.string.auth_trust_agent_trusted_places_place_unknown_place);
                    }
                    Preference preference = new Preference(getActivity());
                    preference.f1571A = C0126R.C0128layout.preference_material;
                    preference.mo1990c(str);
                    preference.f1607w = false;
                    preference.mo1986b((CharSequence) e);
                    preference.mo1974a(this.f92779f);
                    if (!this.f92788q.f92279e) {
                        preference.mo1981a(false);
                        preference.mo1966a((CharSequence) getString(C0126R.string.auth_trust_agent_dpm_disabled));
                    } else {
                        preference.mo1966a((CharSequence) a);
                    }
                    this.f92777d.mo2019a(preference);
                    this.f92779f++;
                }
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f92775k.mo50711a("onCreate", new Object[0]);
        mo9318a((int) C0126R.xml.trusted_places_preferences);
        this.f92777d = (PreferenceScreen) mo2204a((CharSequence) "auth_trust_agent_pref_trusted_places_preference_screen_key");
        TrustedPlacesHomePreference trustedPlacesHomePreference = (TrustedPlacesHomePreference) mo2204a((CharSequence) "auth_trust_agent_pref_trusted_places_home_key");
        this.f92776c = trustedPlacesHomePreference;
        trustedPlacesHomePreference.f109301d = this;
        trustedPlacesHomePreference.mo1981a(false);
        this.f92780h = false;
        this.f92779f = 1;
        this.f92783l = mo2204a((CharSequence) "auth_trust_agent_pref_trusted_places_add_trusted_place_key");
        this.f92788q = aupq.m77579a();
    }

    public final void onPause() {
        super.onPause();
        this.f92778e = null;
    }

    /* renamed from: d */
    private final void m78082d(String[] strArr) {
        f92775k.mo50711a("updateHomeAddress", new Object[0]);
        String b = mo51054b(mo51059i(), "Home");
        if (TextUtils.isEmpty(b) || !b.equals(strArr[0])) {
            if (!TextUtils.isEmpty(b)) {
                mo51050a(mo51059i(), "Home");
            }
            if (!TextUtils.isEmpty(strArr[0])) {
                this.f92778e.mo50733b(auxi.m78025b(strArr[0]), "Home");
                this.f92778e.mo50733b(auxi.m78028c(strArr[0]), strArr[1]);
                this.f92778e.mo50733b(auxi.m78030d(strArr[0]), mo51059i());
                this.f92778e.mo50733b(auxi.m78034h(mo51059i()), strArr[0]);
                return;
            }
            return;
        }
        f92775k.mo50711a("home address is not changed. ignore", new Object[0]);
    }

    /* renamed from: b */
    public final void mo51055b(String str) {
        String a = auxi.m78021a(str);
        int i = this.f92779f;
        while (true) {
            if (i <= 0) {
                break;
            }
            Preference g = this.f92777d.mo2024g(i);
            if (g != null && !"auth_trust_agent_pref_trusted_places_add_trusted_place_key".equals(g.f1603s) && g.f1603s.equals(a)) {
                this.f92777d.mo2020b(g);
                break;
            }
            i--;
        }
        this.f92778e.mo50731b(auxi.m78021a(str));
        this.f92778e.mo50731b(auxi.m78025b(str));
        this.f92778e.mo50731b(auxi.m78028c(str));
        mo51061k();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: auol.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      auol.a(java.lang.String, long):long
      auol.a(java.lang.String, java.lang.String):java.lang.String
      auol.a(java.lang.String, java.lang.Object):void
      aupn.a(java.lang.String, long):long
      aupn.a(java.lang.String, java.lang.String):java.lang.String
      auol.a(java.lang.String, boolean):void */
    /* renamed from: c */
    public final void mo51057c(String[] strArr) {
        f92775k.mo50711a("setUserHomeAddress", new Object[0]);
        auol auol = this.f92778e;
        if (auol != null && auol.mo50734b()) {
            String b = mo51054b(mo51059i(), "Home");
            String str = strArr[0];
            m78082d(strArr);
            if (this.f92778e.mo50736c(auxi.m78031e(mo51059i())) && !TextUtils.isEmpty(b) && !TextUtils.isEmpty(str) && !b.equals(str)) {
                String string = getString(C0126R.string.auth_trust_agent_home_address_changed_notification_public);
                int a = aupf.m77548a();
                PendingIntent a2 = aupf.m77549a(getActivity(), bogq.HOME_ADDRESS_CHANGE, a);
                Bundle bundle = new Bundle();
                bundle.putString("auth_trust_agent_bundle_trusted_place_home_work_account", mo51059i());
                aupf aupf = new aupf(getActivity());
                aupf.f92250c = string;
                aupf.f92255h = "com.google.android.gms.trustlet.place.ui.TrustedPlacesSettingsActivity";
                aupf.f92256i = "trust_agent_trusted_places_action_enable_home";
                aupf.f92261n = bundle;
                aupf.f92264q = a;
                aupf.f92253f = bogq.HOME_ADDRESS_CHANGE;
                aupf.f92252e = a2;
                aupf.mo50787b();
                f92775k.mo50711a("log notification type: TrustAgentEvent.HOME_ADDRESS_CHANGE, notification event type: TrustAgentEvent.NOTIFICATION_SHOWN", new Object[0]);
                bogj bogj = (bogj) bohi.f133070z.mo74144da();
                bxvd da = bogm.f133003e.mo74144da();
                bogq bogq = bogq.HOME_ADDRESS_CHANGE;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bogm bogm = (bogm) da.f164949b;
                bogm.f133006b = bogq.f133019h;
                int i = bogm.f133005a | 1;
                bogm.f133005a = i;
                bogm.f133007c = 0;
                bogm.f133005a = i | 2;
                bogj.mo68908a((bogm) da.mo74062i());
                aupk.m77567a(getActivity(), (bohi) bogj.mo74062i());
                this.f92778e.mo50728a(auxi.m78021a(str), false);
            } else if (TextUtils.isEmpty(b) && !TextUtils.isEmpty(str)) {
                this.f92778e.mo50728a(auxi.m78021a(str), this.f92778e.mo50736c(auxi.m78031e(mo51059i())));
            } else if (!TextUtils.isEmpty(b) && !TextUtils.isEmpty(str) && b.equals(str)) {
                this.f92778e.mo50728a(auxi.m78021a(str), this.f92778e.mo50736c(auxi.m78031e(mo51059i())));
            } else if (!TextUtils.isEmpty(b) && TextUtils.isEmpty(str)) {
                this.f92778e.mo50731b(auxi.m78031e(mo51059i()));
            }
            mo51061k();
            return;
        }
        this.f92784m = strArr;
        this.f92785n = 0;
    }

    /* renamed from: e */
    public final void mo50626e() {
        this.f92781i = true;
        if (this.f92782j) {
            mo17248d();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: auol.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      auol.a(java.lang.String, long):long
      auol.a(java.lang.String, java.lang.String):java.lang.String
      auol.a(java.lang.String, java.lang.Object):void
      aupn.a(java.lang.String, long):long
      aupn.a(java.lang.String, java.lang.String):java.lang.String
      auol.a(java.lang.String, boolean):void */
    /* renamed from: b */
    public final void mo51056b(String[] strArr) {
        auol auol = this.f92778e;
        if (auol == null || !auol.mo50734b()) {
            this.f92784m = strArr;
            this.f92785n = 1;
            return;
        }
        String b = mo51054b(mo51059i(), "Home");
        m78082d(strArr);
        if (TextUtils.isEmpty(strArr[0])) {
            this.f92778e.mo50731b(auxi.m78031e(mo51059i()));
        } else if (TextUtils.isEmpty(b) && !TextUtils.isEmpty(strArr[0])) {
            this.f92778e.mo50728a(auxi.m78021a(strArr[0]), true);
            mo51060j();
        } else if (!TextUtils.isEmpty(strArr[0])) {
            this.f92778e.mo50728a(auxi.m78021a(strArr[0]), this.f92778e.mo50736c(auxi.m78031e(mo51059i())));
        }
        mo51061k();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0085  */
    /* renamed from: d */
    public final void mo17248d() {
        TrustedPlacesSettingsChimeraActivity trustedPlacesSettingsChimeraActivity;
        f92775k.mo50711a("onPreferenceReady", new Object[0]);
        this.f92778e = mo50786g();
        String[] strArr = this.f92784m;
        if (strArr != null) {
            String[] strArr2 = {strArr[0], strArr[1]};
            int i = this.f92785n;
            this.f92784m = null;
            this.f92785n = 0;
            if (i == 2) {
                mo51053a(strArr2);
            } else if (i != 1) {
                mo51057c(strArr2);
            } else {
                mo51056b(strArr2);
            }
        }
        aelh aelh = this.f92786o;
        if (aelh != null) {
            mo51049a(aelh, this.f92787p);
            this.f92786o = null;
            this.f92787p = null;
        }
        if (this.f92788q.mo50792b()) {
            aupq aupq = this.f92788q;
            if (!aupq.f92278d || !aupq.f92279e) {
                this.f92783l.mo1981a(false);
                this.f92783l.mo1966a((CharSequence) getString(C0126R.string.auth_trust_agent_dpm_disabled));
                mo51061k();
                trustedPlacesSettingsChimeraActivity = (TrustedPlacesSettingsChimeraActivity) getActivity();
                if (!TextUtils.isEmpty(trustedPlacesSettingsChimeraActivity.f109311e)) {
                    trustedPlacesSettingsChimeraActivity.mo59589h();
                }
                f92775k.mo50711a("end of onResumeWithPreferenceReady", new Object[0]);
            }
        }
        this.f92783l.mo1981a(true);
        this.f92783l.mo1966a((CharSequence) "");
        mo51061k();
        trustedPlacesSettingsChimeraActivity = (TrustedPlacesSettingsChimeraActivity) getActivity();
        if (!TextUtils.isEmpty(trustedPlacesSettingsChimeraActivity.f109311e)) {
        }
        f92775k.mo50711a("end of onResumeWithPreferenceReady", new Object[0]);
    }

    /* renamed from: a */
    public final void mo51050a(String str, String str2) {
        String b = mo51054b(str, str2);
        if (!TextUtils.isEmpty(b)) {
            if (str2.equals("Home")) {
                auxi.m78026b(str, this.f92778e);
            }
            if (auxi.m78024a(b, this.f92778e).isEmpty()) {
                auxi.m78029c(b, this.f92778e);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: auol.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      auol.a(java.lang.String, long):long
      auol.a(java.lang.String, java.lang.String):java.lang.String
      auol.a(java.lang.String, java.lang.Object):void
      aupn.a(java.lang.String, long):long
      aupn.a(java.lang.String, java.lang.String):java.lang.String
      auol.a(java.lang.String, boolean):void */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo51051a(String str, String str2, String str3) {
        this.f92778e.mo50728a(auxi.m78021a(str), true);
        this.f92778e.mo50733b(auxi.m78025b(str), str2);
        this.f92778e.mo50733b(auxi.m78028c(str), str3);
    }

    /* renamed from: a */
    public final void mo51052a(boolean z) {
        TrustedPlacesHomePreference trustedPlacesHomePreference = this.f92776c;
        trustedPlacesHomePreference.f109298a = z;
        trustedPlacesHomePreference.mo2004h(z);
        trustedPlacesHomePreference.mo59585g();
        if (!TextUtils.isEmpty(mo51054b(mo51059i(), "Home"))) {
            this.f92778e.mo50728a(m78080c(mo51059i()), this.f92776c.f109298a);
            this.f92778e.mo50728a(auxi.m78031e(mo51059i()), this.f92776c.f109298a);
            if (z) {
                mo51060j();
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: auol.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      auol.a(java.lang.String, long):long
      auol.a(java.lang.String, java.lang.String):java.lang.String
      auol.a(java.lang.String, java.lang.Object):void
      aupn.a(java.lang.String, long):long
      aupn.a(java.lang.String, java.lang.String):java.lang.String
      auol.a(java.lang.String, boolean):void */
    /* renamed from: a */
    public final void mo51053a(String[] strArr) {
        auol auol = this.f92778e;
        if (auol != null && auol.mo50734b()) {
            m78082d(strArr);
            if (!TextUtils.isEmpty(strArr[0])) {
                this.f92778e.mo50728a(auxi.m78021a(strArr[0]), true);
            } else {
                this.f92778e.mo50731b(auxi.m78031e(mo51059i()));
            }
            mo51061k();
            return;
        }
        this.f92784m = strArr;
        this.f92785n = 2;
    }

    /* renamed from: c */
    public final boolean mo2233c(Preference preference) {
        if (!mo51058f()) {
            return false;
        }
        if ("auth_trust_agent_pref_trusted_places_home_key".equals(preference.f1603s)) {
            String b = mo51054b(mo51059i(), "Home");
            f92775k.mo50711a("pref key equals PREF_TRUSTED_PLACE_HOME_KEY, currentHomePlaceId: %s", b);
            if (TextUtils.isEmpty(b)) {
                ((TrustedPlacesSettingsChimeraActivity) getActivity()).mo59590i();
            } else {
                new auyo(getActivity(), this.f92776c.f109298a).show();
            }
        } else if ("auth_trust_agent_pref_trusted_places_add_trusted_place_key".equals(preference.f1603s)) {
            ((TrustedPlacesSettingsChimeraActivity) getActivity()).mo59588a((String) null);
        } else {
            new auxz(getActivity(), preference.f1603s, preference.f1602r.toString(), preference.mo1969f().toString()).show();
        }
        return false;
    }
}
