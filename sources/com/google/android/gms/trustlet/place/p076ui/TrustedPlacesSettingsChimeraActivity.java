package com.google.android.gms.trustlet.place.p076ui;

import android.content.Intent;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import androidx.preference.Preference;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.trustlet.place.ui.TrustedPlacesSettingsChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TrustedPlacesSettingsChimeraActivity extends aupg implements AdapterView.OnItemSelectedListener, auyi, auye {

    /* renamed from: c */
    public static final aunx f109309c = new aunx("TrustAgent", "TrustedPlacesSettingsChimeraActivity");

    /* renamed from: d */
    public static final int f109310d = Math.round(160.0f);

    /* renamed from: e */
    public String f109311e;

    /* renamed from: f */
    public String f109312f;

    /* renamed from: g */
    public boolean f109313g = false;

    /* renamed from: h */
    public boolean f109314h = false;

    /* renamed from: i */
    public bogq f109315i;

    /* renamed from: j */
    public String f109316j = "";

    /* renamed from: k */
    public auxe f109317k;

    /* renamed from: l */
    private suo f109318l;

    /* renamed from: m */
    private boolean f109319m = false;

    /* renamed from: n */
    private aelh f109320n;

    /* renamed from: a */
    private final void m93610a(bogq bogq, int i, long j) {
        String num = bogq != null ? Integer.toString(bogq.f133019h) : "";
        aunx aunx = f109309c;
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 60);
        sb.append("log notification type: ");
        sb.append(num);
        sb.append(", notification event type:");
        sb.append(i);
        aunx.mo50711a(sb.toString(), new Object[0]).mo50708c();
        bogj bogj = (bogj) bohi.f133070z.mo74144da();
        bxvd da = bogm.f133003e.mo74144da();
        if (bogq != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bogm bogm = (bogm) da.f164949b;
            bogm.f133006b = bogq.f133019h;
            bogm.f133005a |= 1;
        }
        int a = bogo.m111180a(i);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bogm bogm2 = (bogm) da.f164949b;
        int i2 = a - 1;
        if (a != 0) {
            bogm2.f133007c = i2;
            int i3 = bogm2.f133005a | 2;
            bogm2.f133005a = i3;
            bogm2.f133005a = i3 | 4;
            bogm2.f133008d = j;
            if (bogj.f164950c) {
                bogj.mo74035c();
                bogj.f164950c = false;
            }
            bohi bohi = (bohi) bogj.f164949b;
            bogm bogm3 = (bogm) da.mo74062i();
            bogm3.getClass();
            bohi.mo68911a();
            bohi.f133085o.add(bogm3);
            aupk.m77567a(this, (bohi) bogj.mo74062i());
            return;
        }
        throw null;
    }

    /* renamed from: bO */
    public final void mo50642bO() {
        finishActivity(1001);
        finishActivity(1002);
        finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final dns mo50789e() {
        return new auyk();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final String mo50790g() {
        return "TrustedPlacesFragment";
    }

    /* renamed from: h */
    public final void mo59589h() {
        if (mo59591j().mo51058f()) {
            auxe auxe = this.f109317k;
            if (auxe != null) {
                auxe.mo51007c();
            }
            auxe auxe2 = new auxe(this, this.f109311e, new auyt(this), mo59591j().mo50786g());
            this.f109317k = auxe2;
            auxe2.mo51005a(true);
        }
    }

    /* renamed from: i */
    public final void mo59590i() {
        this.f109313g = false;
        aepc aepc = new aepc();
        aepc.f63586a.putExtra("alias_title", "Home");
        aepc.f63586a.putExtra("account_name", mo59591j().mo51059i());
        int a = qkj.m32287a(this, C0126R.C0127drawable.circle_overlay);
        int i = f109310d;
        aepc.f63586a.putExtra("reference_marker_overlay_resource_id", a);
        aepc.f63586a.putExtra("reference_marker_overlay_width_meters", i);
        aepc.f63586a.putExtra("reference_marker_overlay_height_meters", i);
        aepc.f63586a.putExtra("gcore_client_name", "auth");
        try {
            startActivityForResult(aepc.mo34414a(getContainerActivity()), 1002);
        } catch (rfv | rfw e) {
            f109309c.mo50711a("GooglePlayServices failed. Cannot connect to places.", new Object[0]).mo50706a();
        }
    }

    /* renamed from: j */
    public final auyk mo59591j() {
        return (auyk) ((aupg) this).f92267b;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1001) {
            if (i != 1002) {
                return;
            }
            if (i2 != -1) {
                f109309c.mo50711a("Failed editing home address.", new Object[0]);
            } else if ("Home".equals(intent.getStringExtra("edited_alias_name"))) {
                f109309c.mo50711a("Edit home address is successful.", new Object[0]);
                this.f109313g = true;
            }
        } else if (i2 != -1) {
            f109309c.mo50711a("Place picker couldn't be launched.", new Object[0]);
            this.f109312f = null;
        } else {
            this.f109320n = aepf.m52337a(this, intent);
            this.f109319m = true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo59587a(5);
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
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (mo59591j().mo51058f() && !mo59591j().mo51059i().equals(this.f109318l.getItem(i))) {
            auyk j2 = mo59591j();
            String b = j2.mo51054b(mo59591j().mo51059i(), "Home");
            if (!TextUtils.isEmpty(b)) {
                j2.f92778e.mo50728a(auxi.m78021a(b), false);
            }
            mo59591j().mo51050a(mo59591j().mo51059i(), "Work");
            this.f109311e = this.f109318l.getItem(i);
            auyk j3 = mo59591j();
            j3.f92778e.mo50733b("auth_trust_agent_pref_trusted_place_home_work_account", this.f109311e);
            mo59589h();
        }
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        setIntent(intent);
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        auxe auxe = this.f109317k;
        if (auxe != null) {
            auxe.mo51007c();
            this.f109317k = null;
        }
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f109312f = bundle.getString("editing_place_id");
        this.f109313g = bundle.getBoolean("change_home_address");
        this.f109314h = bundle.getBoolean("launch_with_enable_home", false);
        this.f109315i = bogq.m111182a(bundle.getInt("notification_type", -1));
        this.f109316j = bundle.getString("last_prompted_enable_home_id");
        this.f109311e = bundle.getString("current_account_name");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* access modifiers changed from: protected */
    public final void onResume() {
        boolean z;
        boolean z2;
        long j;
        super.onResume();
        f109309c.mo50711a("onResume", new Object[0]);
        LocationManager locationManager = (LocationManager) getSystemService("location");
        if (!locationManager.isProviderEnabled("gps")) {
            z = locationManager.isProviderEnabled("network");
        } else {
            z = true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            z2 = activeNetworkInfo.isConnected();
        } else {
            z2 = false;
        }
        if (!z && z2) {
            Toast.makeText(this, getString(C0126R.string.auth_trust_agent_trusted_place_gps_off), 1).show();
        } else if (z && !z2) {
            Toast.makeText(this, getString(C0126R.string.auth_trust_agent_trusted_place_internet_off), 1).show();
        } else if (!z) {
            Toast.makeText(this, getString(C0126R.string.auth_trust_agent_trusted_place_internet_gps_off), 1).show();
        }
        DialogFragment dialogFragment = (DialogFragment) mo59591j().getFragmentManager().findFragmentByTag("TrustedPlaceConfirmationDialogFragment");
        if (dialogFragment != null) {
            dialogFragment.dismiss();
        }
        Intent intent = getIntent();
        if (intent != null) {
            String action = intent.getAction();
            Bundle extras = intent.getExtras();
            if (!TextUtils.isEmpty(action) && action.equals("trust_agent_trusted_places_action_enable_home")) {
                this.f109314h = true;
            }
            if (extras != null) {
                long j2 = extras.getLong("notification_shown_time", 0);
                long currentTimeMillis = System.currentTimeMillis();
                if (j2 != 0) {
                    j = currentTimeMillis - j2;
                } else {
                    j = -1;
                }
                this.f109315i = bogq.m111182a(extras.getInt("notification_type_key", -1));
                boolean z3 = extras.getBoolean("notification_logged", false);
                if (this.f109315i != null && !z3) {
                    f109309c.mo50711a("onResume: log notification tapped.", new Object[0]).mo50708c();
                    m93610a(this.f109315i, 3, j);
                    intent.putExtra("notification_logged", true);
                }
            }
            if (TextUtils.isEmpty(this.f109311e)) {
                this.f109311e = intent.getStringExtra("auth_trust_agent_bundle_trusted_place_home_work_account");
            }
        }
        if (TextUtils.isEmpty(this.f109311e)) {
            this.f109311e = aupo.m77578a(this).getString("auth_trust_agent_pref_trusted_place_home_work_account", "");
        }
        sun sun = new sun(mo8628aW());
        sun.mo26112a(C0126R.string.auth_trust_agent_pref_trusted_places_title);
        sun.f45175a = this;
        if (!TextUtils.isEmpty(this.f109311e)) {
            sun.f45176b = this.f109311e;
        }
        this.f109318l = sun.mo26111a();
    }

    public final void onResumeFragments() {
        super.onResumeFragments();
        if (this.f109319m) {
            this.f109319m = false;
            if (!TextUtils.isEmpty(this.f109312f)) {
                mo59591j().mo51049a(this.f109320n, this.f109312f);
                this.f109312f = null;
                return;
            }
            mo59591j().mo51049a(this.f109320n, (String) null);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putString("editing_place_id", this.f109312f);
        bundle.putBoolean("change_home_address", this.f109313g);
        bundle.putBoolean("launch_with_enable_home", this.f109314h);
        bogq bogq = this.f109315i;
        if (bogq != null) {
            bundle.putInt("notification_type", bogq.f133019h);
        }
        bundle.putString("last_prompted_enable_home_id", this.f109316j);
        bundle.putString("current_account_name", this.f109311e);
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: a */
    public final void mo51047a() {
        mo59589h();
        mo59587a(24);
    }

    /* renamed from: a */
    public final void mo59587a(int i) {
        bogj bogj = (bogj) bohi.f133070z.mo74144da();
        if (bogj.f164950c) {
            bogj.mo74035c();
            bogj.f164950c = false;
        }
        bohi bohi = (bohi) bogj.f164949b;
        bohi.f133088r = i - 1;
        bohi.f133071a |= 4096;
        if (this.f109315i != null) {
            bxvd da = bogm.f133003e.mo74144da();
            bogq bogq = this.f109315i;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bogm bogm = (bogm) da.f164949b;
            bogm.f133006b = bogq.f133019h;
            int i2 = bogm.f133005a | 1;
            bogm.f133005a = i2;
            bogm.f133007c = 4;
            bogm.f133005a = i2 | 2;
            bogj.mo68908a((bogm) da.mo74062i());
        }
        aupk.m77567a(this, (bohi) bogj.mo74062i());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: a */
    public final void mo59588a(String str) {
        aepn aepn = new aepn();
        sdo.m34975b(true, "unknown mode");
        aepn.f63586a.putExtra("mode", 0);
        aepn.f63586a.putExtra("hide_nearby_places", true);
        aepn.f63586a.putExtra("hide_add_a_place", true);
        aepn.f63586a.putExtra("gcore_client_name", "auth");
        if (!TextUtils.isEmpty(str)) {
            this.f109312f = str;
            bqga.m112781a(bqgs.m112811a((ExecutorService) snp.m35704b(9)).mo25819b(new auys(this)), new auyu(this, aepn), new auyv());
            return;
        }
        int a = qkj.m32287a(this, C0126R.C0127drawable.circle_overlay);
        int i = f109310d;
        aepn.mo34439a(a, i, i);
        try {
            startActivityForResult(aepn.mo34414a(getContainerActivity()), 1001);
        } catch (rfw e) {
            rfx.m33535a(e.f42890a, getContainerActivity(), -1);
        } catch (rfv e2) {
            f109309c.mo50711a("GooglePlayServicesNotAvailableException in TrustedPlacesSettings", new Object[0]).mo50706a();
        }
    }

    /* renamed from: a */
    public final void mo51044a(String str, String str2) {
        auyk j = mo59591j();
        String i = auxi.m78035i(str);
        String a = auxi.m78021a(i);
        int i2 = 1;
        while (true) {
            if (i2 >= j.f92779f) {
                break;
            }
            Preference g = j.f92777d.mo2024g(i2);
            if (g != null && !"auth_trust_agent_pref_trusted_places_add_trusted_place_key".equals(g.f1603s) && g.f1603s.equals(a)) {
                g.mo1986b((CharSequence) str2);
                break;
            }
            i2++;
        }
        j.f92778e.mo50733b(auxi.m78025b(i), str2);
        j.mo51061k();
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
    public final void mo51048a(String[] strArr) {
        mo59591j().f92778e.mo50728a("auth_trust_agent_pref_trusted_places_enable_home_work_first_time_key", true);
        mo59591j().mo51053a(strArr);
        m93610a(this.f109315i, 2, -1);
        mo59587a(23);
    }
}
