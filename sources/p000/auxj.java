package p000;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.trustlet.place.internal.PlaceTrustletChimeraService;

/* renamed from: auxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auxj implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    final /* synthetic */ PlaceTrustletChimeraService f92713a;

    public auxj(PlaceTrustletChimeraService placeTrustletChimeraService) {
        this.f92713a = placeTrustletChimeraService;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: auou.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      com.google.android.gms.trustlet.place.internal.PlaceTrustletChimeraService.a(java.lang.String, org.json.JSONObject):void
      auou.a(java.lang.String, java.lang.String):void
      auou.a(java.lang.String, org.json.JSONObject):void
      auou.a(boolean, boolean):void */
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        String i = auxi.m78035i(str);
        String str2 = null;
        if (!TextUtils.isEmpty(i)) {
            if (this.f92713a.f109277b.getBoolean(str, false)) {
                PlaceTrustletChimeraService.f109276a.mo50711a("onSharedPreferenceChanged, addPlaceToTrustedPlaces", new Object[0]);
                this.f92713a.mo59583e(i);
                if (cgzt.m147783h()) {
                    this.f92713a.f109281i.add(i);
                    PlaceTrustletChimeraService placeTrustletChimeraService = this.f92713a;
                    placeTrustletChimeraService.mo50762a("add_place_to_trusted_places", aumv.m77340a("trustlet_id", i, "trustlet_source", placeTrustletChimeraService.mo59584f(i)));
                }
                this.f92713a.mo59581c(i);
                this.f92713a.mo59579b(true);
            } else {
                PlaceTrustletChimeraService.f109276a.mo50711a("onSharedPreferenceChanged, removePlaceFromTrustedPlaces", new Object[0]);
                PlaceTrustletChimeraService placeTrustletChimeraService2 = this.f92713a;
                PlaceTrustletChimeraService.f109276a.mo50711a("removePlaceFromTrustedPlaces()", new Object[0]);
                if (!placeTrustletChimeraService2.f109279d.remove(i)) {
                    PlaceTrustletChimeraService.f109276a.mo50711a("The requested place is not a trusted place. Ignore.", new Object[0]);
                } else {
                    placeTrustletChimeraService2.f109280h.remove(i);
                    placeTrustletChimeraService2.mo50746a();
                    if (placeTrustletChimeraService2.f109279d.isEmpty()) {
                        placeTrustletChimeraService2.mo50763a(false, false);
                        aunw a = PlaceTrustletChimeraService.f109276a.mo50711a("Place trustlet is disabled by user.", new Object[0]);
                        a.mo50708c();
                        a.mo50707b();
                    }
                    placeTrustletChimeraService2.mo59582d(i);
                    placeTrustletChimeraService2.mo50765b("remove place", null);
                }
                if (cgzt.m147783h()) {
                    try {
                        String a2 = auox.m77526a().mo50785a("Place", i);
                        if (a2 == null) {
                            a2 = this.f92713a.getString(C0126R.string.auth_trust_agent_trusted_places_place_unknown_place);
                        }
                        this.f92713a.mo50762a("remove_place_from_trusted_places", aumv.m77340a("trustlet_id", i, "trustlet_source", a2));
                    } catch (aumn e) {
                        PlaceTrustletChimeraService.f109276a.mo50710a("ModelNotFoundException", e, new Object[0]).mo50706a();
                    }
                }
                this.f92713a.mo59582d(i);
                this.f92713a.mo59579b(false);
            }
            if (TextUtils.isEmpty(this.f92713a.f109277b.getString("auth_trust_agent_pref_trusted_place_home_work_account", ""))) {
                PlaceTrustletChimeraService.f109276a.mo50711a("No account is set for trusted places.", new Object[0]);
                return;
            }
        }
        if (cgzt.m147783h()) {
            if (str.startsWith("auth_trust_agent_pref_trusted_place_name_")) {
                str2 = str.substring(41);
            }
            if (!TextUtils.isEmpty(str2) && this.f92713a.f109279d.contains(str2)) {
                if (!this.f92713a.f109281i.contains(str2)) {
                    try {
                        if (!this.f92713a.mo59584f(str2).equals(auox.m77526a().mo50785a("Place", str2))) {
                            PlaceTrustletChimeraService placeTrustletChimeraService3 = this.f92713a;
                            placeTrustletChimeraService3.mo50762a("rename_a_trusted_place", aumv.m77340a("trustlet_id", str2, "trustlet_source", placeTrustletChimeraService3.mo59584f(str2)));
                        }
                    } catch (aumn e2) {
                        PlaceTrustletChimeraService.f109276a.mo50710a("ModelNotFoundException", e2, new Object[0]).mo50706a();
                    }
                } else {
                    this.f92713a.f109281i.remove(str2);
                }
            }
        }
    }
}
