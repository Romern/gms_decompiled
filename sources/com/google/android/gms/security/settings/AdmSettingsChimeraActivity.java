package com.google.android.gms.security.settings;

import android.accounts.Account;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MenuItem;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import java.net.URLEncoder;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AdmSettingsChimeraActivity extends apwx implements suh, apwd, apvu, sux {

    /* renamed from: p */
    private static final IntentFilter f107512p = new IntentFilter("com.google.android.gms.mdm.DEVICE_ADMIN_CHANGE_INTENT");

    /* renamed from: b */
    apwn f107513b;

    /* renamed from: c */
    apwk f107514c;

    /* renamed from: d */
    apwq f107515d;

    /* renamed from: e */
    apwq f107516e;

    /* renamed from: f */
    apwh f107517f;

    /* renamed from: j */
    apvy f107518j;

    /* renamed from: k */
    apvy f107519k;

    /* renamed from: l */
    apvy f107520l;

    /* renamed from: m */
    apwb f107521m;

    /* renamed from: n */
    boolean f107522n;

    /* renamed from: o */
    boolean f107523o;

    /* renamed from: q */
    private boolean f107524q;

    /* renamed from: r */
    private boolean f107525r = false;

    /* renamed from: s */
    private BroadcastReceiver f107526s;

    /* renamed from: a */
    public static Intent m92386a(Context context) {
        return apuh.m71021a(context, AdmSettingsChimeraActivity.class);
    }

    /* renamed from: c */
    public static boolean m92387c(Context context) {
        return !sre.m36080a(context) && soz.m35811h(context);
    }

    /* renamed from: j */
    private final void m92388j() {
        boolean a = srs.m36149a(this);
        if (this.f107525r && a) {
            this.f107513b.setChecked(true);
            afzd.f64991e.mo10352a((Object) true);
        }
        boolean b = afzq.m53764b(this);
        boolean b2 = cgki.m145894b();
        int i = C0126R.string.common_disabled;
        if (b2) {
            boolean booleanValue = ((Boolean) afzd.f64991e.mo10351a()).booleanValue();
            this.f107514c.mo26104a(booleanValue);
            if (!booleanValue && b) {
                afzq.m53759a(this);
            } else {
                this.f107514c.setChecked(b);
                apwk apwk = this.f107514c;
                if (b) {
                    i = C0126R.string.security_status_remote_lock_enabled_summary;
                }
                apwk.mo26107d(i);
            }
        } else {
            this.f107514c.mo26104a(true);
            this.f107514c.setChecked(b);
            apwk apwk2 = this.f107514c;
            if (b) {
                i = C0126R.string.security_status_remote_lock_enabled_summary;
            }
            apwk2.mo26107d(i);
        }
        this.f107513b.setChecked(((Boolean) afzd.f64991e.mo10351a()).booleanValue());
        mo58933e();
        aki.m919a(this).mo873a(this.f107526s, f107512p);
    }

    /* renamed from: k */
    private final void m92389k() {
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.adm");
        if (launchIntentForPackage != null) {
            startActivity(launchIntentForPackage);
            return;
        }
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.apps.adm")));
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.adm")));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    public final void mo58933e() {
        boolean z;
        svf svf = ((svi) this.f41601g).f45221a;
        try {
            Account[] d = gie.m13199d(this, "com.google");
            if (d != null) {
                z = d.length > 0;
                boolean a = agab.m53789a(this);
                if (!z) {
                    if (this.f107522n) {
                        svf.mo26153d(this.f107515d);
                        this.f107522n = false;
                    }
                    if (!a) {
                        if (!this.f107523o) {
                            svf.mo26149a((sui) this.f107516e);
                            this.f107523o = true;
                            return;
                        }
                        return;
                    }
                } else if (!this.f107522n) {
                    svf.mo26149a((sui) this.f107515d);
                    this.f107522n = true;
                }
                if (!this.f107523o) {
                    svf.mo26153d(this.f107516e);
                    this.f107523o = false;
                    return;
                }
                return;
            }
        } catch (RemoteException | rfv | rfw e) {
        }
        z = false;
        boolean a2 = agab.m53789a(this);
        if (!z) {
        }
        if (!this.f107523o) {
        }
    }

    /* renamed from: g */
    public final void mo47669g() {
        startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        mo58933e();
    }

    /* renamed from: h */
    public final void mo47667h() {
        startActivity(new Intent("android.settings.ADD_ACCOUNT_SETTINGS"));
        mo58933e();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo8628aW().mo15853b(true);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == C0126R.C0129id.security_apps_help) {
            mo47674a(bnhe.m109408a("isMdmVisible", String.valueOf(this.f107524q)), sjx.m35499a(this));
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            finish();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        if (this.f107524q) {
            aki.m919a(this).mo872a(this.f107526s);
        }
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        if (this.f107524q) {
            m92388j();
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.f107524q) {
            m92388j();
        }
    }

    /* renamed from: a */
    public final void mo7099a(View view, sui sui) {
        if (!sui.equals(this.f107514c)) {
            if (sui.equals(this.f107515d)) {
                new apvv().show(getSupportFragmentManager(), "fmd_add_account_confirmation_dialog");
            } else if (sui.equals(this.f107516e)) {
                new apwe().show(getSupportFragmentManager(), "fmd_enable_location_confirmation_dialog");
            } else if (sui.equals(this.f107518j)) {
                String valueOf = String.valueOf(URLEncoder.encode(getString(C0126R.string.adm_settings_activity_title).toLowerCase()));
                startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(valueOf.length() == 0 ? new String("https://www.google.com/search?q=") : "https://www.google.com/search?q=".concat(valueOf))));
            } else if (sui.equals(this.f107519k)) {
                startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse("https://www.google.com/android/find")));
            } else if (sui.equals(this.f107520l)) {
                m92389k();
            }
        } else if (((svm) this.f107514c).f45239a) {
            afzq.m53759a(this);
        } else {
            afzq.m53770g(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7102a(sug sug, Bundle bundle) {
        svf svf = ((svi) sug).f45221a;
        boolean c = m92387c(this);
        this.f107524q = c;
        if (c) {
            apwn apwn = new apwn(this);
            this.f107513b = apwn;
            apwn.f85019c = 0;
            svf.mo26149a((sui) apwn);
            apwk apwk = new apwk(this);
            apum.m71047a(apwk, this, 2, C0126R.string.mdm_settings_wipe_title);
            this.f107514c = apwk;
            int i = Build.VERSION.SDK_INT;
            apwb apwb = new apwb(this);
            this.f107521m = apwb;
            apwb.mo26086b(7);
            this.f107521m.mo26107d(C0126R.string.mdm_find_device_description);
            this.f107521m.mo26101a(mo47672a((int) C0126R.C0127drawable.quantum_ic_info_outline_grey600_48));
            svf.mo26149a((sui) this.f107521m);
            this.f107526s = new aacn("security") {
                /* class com.google.android.gms.security.settings.AdmSettingsChimeraActivity.C16611 */

                /* renamed from: a */
                public final void mo6253a(Context context, Intent intent) {
                    boolean booleanExtra = intent.getBooleanExtra("device_admin_enabled", false);
                    AdmSettingsChimeraActivity.this.f107514c.setChecked(booleanExtra);
                    AdmSettingsChimeraActivity.this.f107514c.mo26107d(!booleanExtra ? C0126R.string.common_disabled : C0126R.string.security_status_remote_lock_enabled_summary);
                }
            };
            apwh apwh = new apwh(this);
            apum.m71047a(apwh, null, 3, C0126R.string.mdm_ways_to_locate);
            this.f107517f = apwh;
            int i2 = Build.VERSION.SDK_INT;
            boolean hasSystemFeature = getPackageManager().hasSystemFeature("android.hardware.type.featurephone");
            if (!hasSystemFeature) {
                apvy apvy = new apvy(this);
                apum.m71047a(apvy, this, 4, C0126R.string.adm_settings_activity_title);
                this.f107520l = apvy;
                try {
                    getPackageManager().getPackageInfo("com.google.android.apps.adm", 0);
                    this.f107520l.mo26105b(getString(C0126R.string.mdm_open_app));
                } catch (PackageManager.NameNotFoundException e) {
                    this.f107520l.mo26105b(getString(C0126R.string.mdm_get_app));
                }
                this.f107520l.mo26101a(mo47672a((int) C0126R.C0127drawable.ic_launcher_fmd_icon));
            }
            apvy apvy2 = new apvy(this);
            apum.m71047a(apvy2, this, 5, C0126R.string.mdm_find_device_website);
            this.f107519k = apvy2;
            apvy2.mo26105b(getString(C0126R.string.mdm_visit_website));
            String a = afzw.m53777a(getPackageManager(), new Intent("android.intent.action.VIEW", Uri.parse("http://")));
            Drawable a2 = mo47672a((int) C0126R.C0127drawable.ic_launcher_fmd_icon);
            if (a != null) {
                try {
                    a2 = getPackageManager().getApplicationIcon(a);
                } catch (PackageManager.NameNotFoundException e2) {
                }
            }
            this.f107519k.mo26101a(a2);
            apvy apvy3 = new apvy(this);
            apum.m71047a(apvy3, this, 6, C0126R.string.common_google);
            this.f107518j = apvy3;
            apvy3.mo26105b(getString(C0126R.string.mdm_google_search));
            this.f107518j.mo26101a(mo47672a((int) C0126R.C0127drawable.product_logo_googleg_color_24));
            apvy apvy4 = this.f107518j;
            apvy4.f85010a = true;
            apvy4.mo26164i();
            if (hasSystemFeature) {
                svf.mo26150a(this.f107517f, this.f107519k, this.f107518j);
            } else {
                svf.mo26150a(this.f107517f, this.f107520l, this.f107519k, this.f107518j);
            }
            apwq apwq = new apwq(this);
            apum.m71047a(apwq, this, 1, C0126R.string.security_status_find_device_not_working);
            this.f107515d = apwq;
            apwq.mo26107d(C0126R.string.security_status_no_google_account_summary);
            this.f107515d.mo26101a(mo47672a((int) C0126R.C0127drawable.fmd_error_icon));
            apwq apwq2 = new apwq(this);
            apum.m71047a(apwq2, this, 1, C0126R.string.security_status_find_device_not_working);
            this.f107516e = apwq2;
            apwq2.mo26107d(C0126R.string.security_status_find_device_location_off_summary);
            this.f107516e.mo26101a(mo47672a((int) C0126R.C0127drawable.fmd_error_icon));
            mo58933e();
            Intent intent = getIntent();
            if (intent.getBooleanExtra("show_device_admin", false)) {
                afzq.m53770g(this);
            }
            if (intent.getBooleanExtra("show_modal_request", false) && bundle == null) {
                new afyw().show(getSupportFragmentManager(), "activate_device_admin_dialog");
            }
            if (bundle != null) {
                this.f107525r = bundle.getBoolean("verify_google_location", false);
            }
        }
    }

    /* renamed from: a */
    public final void mo15271a(boolean z) {
        if (srs.m36149a(this)) {
            this.f107513b.setChecked(z);
            afzd.f64991e.mo10352a(Boolean.valueOf(z));
        } else {
            startActivity(new Intent("com.google.android.gsf.GOOGLE_LOCATION_SETTINGS"));
            this.f107525r = true;
        }
        if (cgki.m145894b()) {
            this.f107514c.mo26104a(z);
            if (!z && ((svm) this.f107514c).f45239a) {
                afzq.m53759a(this);
            }
        }
        mo58933e();
    }
}
