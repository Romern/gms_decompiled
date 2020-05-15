package com.google.android.gms.security.settings;

import android.content.Intent;
import android.content.res.Resources;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SecuritySettingsIntentOperation extends qld {
    /* renamed from: b */
    public final GoogleSettingsItem mo7154b() {
        sre.m36087g(this);
        VerifyAppsSettingsChimeraActivity.m92400a(this);
        Intent className = new Intent().setClassName(this, "com.google.android.gms.security.settings.SecuritySettingsActivity");
        Resources resources = getResources();
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(className, 0, (int) C0126R.string.security_settings_activity_title, 53);
        googleSettingsItem.f29960f = false;
        googleSettingsItem.f29965k = true;
        googleSettingsItem.f29967m = true;
        googleSettingsItem.f29968n = "SecuritySettings";
        googleSettingsItem.mo17614a(resources.getString(C0126R.string.adm_settings_activity_title));
        googleSettingsItem.mo17614a(resources.getString(C0126R.string.security_status_section_title));
        googleSettingsItem.mo17614a(resources.getString(C0126R.string.security_settings_activity_title));
        googleSettingsItem.mo17614a(resources.getString(C0126R.string.google_play_protect_title));
        googleSettingsItem.mo17614a(resources.getString(C0126R.string.play_protect_title));
        return googleSettingsItem;
    }
}
