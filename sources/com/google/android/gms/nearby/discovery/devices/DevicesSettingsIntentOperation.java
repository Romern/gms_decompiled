package com.google.android.gms.nearby.discovery.devices;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DevicesSettingsIntentOperation extends qld {
    /* renamed from: b */
    public final GoogleSettingsItem mo7154b() {
        if (!burl.m120297b(this, ahfl.m55644a(this))) {
            return null;
        }
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(mo24067a("com.google.android.gms.settings.DEVICES").putExtra("caller", 2), 6, (int) C0126R.string.common_devices, 41);
        googleSettingsItem.f29965k = true;
        googleSettingsItem.f29967m = true;
        googleSettingsItem.f29968n = "NearbyDevicesSettings";
        for (String str : getResources().getStringArray(C0126R.array.devices_index_settings_keywords)) {
            googleSettingsItem.mo17614a(str);
        }
        return googleSettingsItem;
    }
}
