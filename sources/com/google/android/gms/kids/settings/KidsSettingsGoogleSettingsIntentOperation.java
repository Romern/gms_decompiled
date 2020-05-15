package com.google.android.gms.kids.settings;

import android.content.Intent;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class KidsSettingsGoogleSettingsIntentOperation extends qld {
    /* renamed from: b */
    public final GoogleSettingsItem mo7154b() {
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent().setComponent(KidsSettingsChimeraActivity.m66806a(this)), 0, (int) C0126R.string.parental_controls_label_for_category_settings, 46);
        googleSettingsItem.f29965k = false;
        googleSettingsItem.f29960f = false;
        return googleSettingsItem;
    }
}
