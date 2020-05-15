package com.google.android.gms.nearby.sharing;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SettingsIntentOperation extends qld {
    /* renamed from: b */
    public final GoogleSettingsItem mo7154b() {
        if (!ModuleInitializer.m67468a(this)) {
            return null;
        }
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(mo24067a("com.google.android.gms.settings.SHARING"), 6, getString(C0126R.string.sharing_product_name), 43);
        googleSettingsItem.f29965k = true;
        googleSettingsItem.f29967m = true;
        googleSettingsItem.f29968n = "NearbySharingSettings";
        for (String str : getResources().getStringArray(C0126R.array.sharing_index_settings_keywords)) {
            googleSettingsItem.mo17614a(str);
        }
        return googleSettingsItem;
    }
}
