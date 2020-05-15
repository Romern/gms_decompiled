package com.google.android.gms.security.settings;

import android.os.Bundle;
import android.view.MenuItem;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SecuritySettingsChimeraActivity extends apwx {

    /* renamed from: c */
    public static final /* synthetic */ int f107528c = 0;

    /* renamed from: b */
    public sui f107529b;

    /* renamed from: d */
    private boolean f107530d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7102a(sug sug, Bundle bundle) {
        svf e = sug.mo26098e(C0126R.string.common_mdm_feature_name);
        boolean c = AdmSettingsChimeraActivity.m92387c(this);
        this.f107530d = c;
        if (c) {
            svk svk = new svk(this);
            svk.mo26106c(C0126R.string.common_mdm_feature_name);
            svk.mo26107d(C0126R.string.mdm_settings_locate_title);
            svk.mo26100a(AdmSettingsChimeraActivity.m92386a(this));
            e.mo26149a((sui) svk);
        }
        svf e2 = sug.mo26098e(C0126R.string.security_status_section_title);
        VerifyAppsSettingsChimeraActivity.m92400a(this);
        svk svk2 = new svk(this);
        this.f107529b = svk2;
        svk2.mo26106c(C0126R.string.google_play_protect_title);
        this.f107529b.mo26100a(apum.m71043a(this, 2));
        e2.mo26149a(this.f107529b);
    }

    public final void onCreate(Bundle bundle) {
        mo8628aW().mo15853b(true);
        super.onCreate(bundle);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        } else if (menuItem.getItemId() != C0126R.C0129id.security_apps_help) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            mo47674a(bnhe.m109409a("isMdmVisible", String.valueOf(this.f107530d), "isVerifyAppsVisible", "true"), sjx.m35499a(this));
            return true;
        }
    }

    public final void onResume() {
        super.onResume();
        if (this.f107529b != null) {
            new apwz(this).start();
        }
    }
}
