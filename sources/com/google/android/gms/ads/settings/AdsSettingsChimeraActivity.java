package com.google.android.gms.ads.settings;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.flag.C0397j;
import com.google.android.gms.ads.settings.p014ui.C0884b;
import com.google.android.gms.ads.settings.p014ui.C0885c;
import com.google.android.gms.ads.settings.p014ui.C0887e;
import com.google.android.gms.ads.settings.p014ui.C0888f;
import com.google.android.gms.ads.settings.p014ui.C0890h;
import com.google.android.gms.ads.settings.p014ui.C0891i;
import com.google.android.gms.googlehelp.GoogleHelp;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AdsSettingsChimeraActivity extends qkh implements DialogInterface.OnCancelListener, suh, C0884b, C0890h, C0887e {

    /* renamed from: f */
    public static final /* synthetic */ int f9418f = 0;

    /* renamed from: b */
    sui f9419b;

    /* renamed from: c */
    svm f9420c;

    /* renamed from: d */
    svm f9421d;

    /* renamed from: e */
    public SharedPreferences f9422e;

    /* renamed from: a */
    private final void m6059a(svk svk, int i, int i2) {
        svk.mo26084a(i2);
        svk.mo26106c(i2);
        svk.mo26086b(i);
        svk.mo26102a(this);
    }

    /* renamed from: b */
    private final void m6060b(boolean z) {
        if (m6062k()) {
            new C0878c(this).execute(Boolean.valueOf(z));
        }
    }

    /* renamed from: j */
    private final void m6061j() {
        this.f9420c.toggle();
        boolean z = this.f9420c.f45239a;
        new C0879d(this).execute(Boolean.valueOf(z));
        if (cbvp.m128515b()) {
            Bundle bundle = new Bundle();
            bundle.putString("action", "ads_settings_lat_change");
            bundle.putString("lat", Boolean.toString(z));
            C0387d.m5363a().mo6853a(this, null, "gmob-apps", bundle);
        }
    }

    /* renamed from: k */
    private final boolean m6062k() {
        int i = Build.VERSION.SDK_INT;
        if (!((Boolean) C0397j.f8338a.mo6621a()).booleanValue()) {
            return false;
        }
        try {
            if (Settings.Global.getInt(getContentResolver(), "development_settings_enabled", 0) != 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            Log.w("AdsSettingsActivity", "Fail to determine debug setting.", e);
            return false;
        }
    }

    /* renamed from: e */
    public final void mo7104e() {
        m6061j();
    }

    /* renamed from: g */
    public final void mo7105g() {
        this.f9421d.toggle();
        m6060b(this.f9421d.f45239a);
    }

    /* renamed from: i */
    public final void mo7107i() {
    }

    public final void onCancel(DialogInterface dialogInterface) {
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        this.f9422e = getSharedPreferences("ad_settings_cache", 0);
        C0371o.m5339a(getApplicationContext());
        super.onCreate(bundle);
        C1341rz aW = mo8628aW();
        if (soz.m35807f(this)) {
            aW.mo15853b(false);
            aW.mo15877p();
        } else {
            aW.mo15853b(true);
        }
        if (cbvp.m128515b()) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("action", "ads_settings_page_view");
            C0387d.m5363a().mo6853a(this, null, "gmob-apps", bundle2);
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0126R.C0130menu.ads_settings_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == C0126R.C0129id.help_and_feedback) {
            Uri parse = Uri.parse(cbvp.f178349a.mo6606a().mo75430b());
            GoogleHelp a = GoogleHelp.m66336a("android_ads");
            a.f78774q = parse;
            new aarh(this).mo31646a(a.mo43194a());
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            finish();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        new C0877b(this).execute(new Void[0]);
    }

    /* renamed from: a */
    public final void mo7099a(View view, sui sui) {
        int c = sui.mo26087c();
        if (c == C0126R.string.ads_prefs_ads_personalization) {
            if (!this.f9420c.f45239a) {
                try {
                    new C0891i().show(getSupportFragmentManager(), "toggle_lat_dialog");
                } catch (IllegalStateException e) {
                    Log.w("AdsSettingsActivity", "Cannot show Toggle Limit Ad Tracking Dialog.", e);
                }
            } else {
                m6061j();
            }
        } else if (c == C0126R.string.ads_prefs_reset_adid) {
            try {
                new C0885c().show(getSupportFragmentManager(), "reset_dialog");
            } catch (IllegalStateException e2) {
                Log.w("AdsSettingsActivity", "Cannot show Reset Advertising Id Dialog.", e2);
            }
        } else if (c == C0126R.string.ads_prefs_ads_by_google) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(cbvp.f178349a.mo6606a().mo75452x()));
            if (!spn.m35860a(this, intent)) {
                rid.m33629a(this, intent, 0);
            } else {
                startActivity(intent);
            }
        } else if (c == C0126R.string.debug_logging_enable) {
            svm svm = this.f9421d;
            if (!svm.f45239a) {
                try {
                    new C0888f().show(getSupportFragmentManager(), "toggle_debug_logging_dialog");
                } catch (IllegalStateException e3) {
                    Log.w("AdsSettingsActivity", "Cannot show Toggle Debug Logging Dialog.", e3);
                }
            } else {
                svm.toggle();
                m6060b(this.f9421d.f45239a);
            }
        }
    }

    /* renamed from: h */
    public final void mo7106h() {
        new C0876a(this).execute(new Void[0]);
        if (cbvp.m128515b()) {
            Bundle bundle = new Bundle();
            bundle.putString("action", "ads_settings_reset_adid");
            C0387d.m5363a().mo6853a(this, null, "gmob-apps", bundle);
        }
    }

    /* renamed from: a */
    public final void mo7100a(String str) {
        sui sui = this.f9419b;
        sui.mo26105b(getText(C0126R.string.ads_prefs_your_adid) + "\n" + str);
    }

    /* renamed from: a */
    public final void mo7101a(rfw rfw) {
        Dialog a = rfx.m33532a(rfw.f42890a, getContainerActivity(), 1, null);
        a.setCanceledOnTouchOutside(false);
        rey rey = new rey();
        sdo.checkIfNull(a, "Cannot display null dialog");
        a.setOnCancelListener(null);
        a.setOnDismissListener(null);
        rey.f42851a = a;
        rey.f42852b = this;
        try {
            rey.show(getSupportFragmentManager(), "error_dialog");
        } catch (IllegalStateException e) {
            Log.w("AdsSettingsActivity", "Cannot show Chimera Error Dialog.", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7102a(sug sug, Bundle bundle) {
        svf svf = ((svi) sug).f45221a;
        svk svk = new svk(this);
        m6059a(svk, 0, (int) C0126R.string.ads_prefs_reset_adid);
        svf.mo26149a((sui) svk);
        svm svm = new svm(this, false);
        m6059a(svm, 1, (int) C0126R.string.ads_prefs_ads_personalization);
        this.f9420c = svm;
        svm.mo26107d(C0126R.string.ads_prefs_ads_personalization_summary);
        this.f9420c.setChecked(this.f9422e.getBoolean("ad_settings_cache_lat", false));
        svf.mo26149a((sui) this.f9420c);
        svk svk2 = new svk(this);
        m6059a(svk2, 2, (int) C0126R.string.ads_prefs_ads_by_google);
        svf.mo26149a((sui) svk2);
        int i = 3;
        if (m6062k()) {
            svm svm2 = new svm(this, false);
            m6059a(svm2, 3, (int) C0126R.string.debug_logging_enable);
            this.f9421d = svm2;
            svm2.mo26107d(C0126R.string.debug_logging_enable_summary);
            this.f9421d.setChecked(this.f9422e.getBoolean("ad_settings_cache_enable_debug_logging", false));
            svf.mo26149a((sui) this.f9421d);
            i = 4;
        }
        svk svk3 = new svk(this);
        this.f9419b = svk3;
        svk3.mo26086b(i);
        this.f9419b.mo26107d(C0126R.string.ads_prefs_your_adid);
        svf.mo26149a(this.f9419b);
    }

    /* renamed from: a */
    public final void mo7103a(boolean z) {
        this.f9422e.edit().putBoolean("ad_settings_cache_lat", z).apply();
    }
}
