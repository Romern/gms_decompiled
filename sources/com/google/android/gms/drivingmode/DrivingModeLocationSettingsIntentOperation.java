package com.google.android.gms.drivingmode;

import android.content.Intent;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DrivingModeLocationSettingsIntentOperation extends vug {
    /* renamed from: b */
    public final GoogleSettingsItem mo7154b() {
        if (!ccrj.m131353b()) {
            return null;
        }
        Log.i("CAR.DRIVINGMODE", "DrivingMode Settings Indexed from the location module");
        if (!ccra.m131312d() || !ccrm.f179804a.mo6606a().mo76683a() || !mo24068c()) {
            return null;
        }
        Intent className = new Intent().setClassName(this, vqx.m41083d());
        className.setAction("com.google.android.gms.drivingmode.Invoked_from_search");
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(className, 6, getApplicationContext().getString(C0126R.string.driving_mode_settings_search_title), 25);
        googleSettingsItem.f29962h = true;
        googleSettingsItem.f29964j = true;
        googleSettingsItem.f29965k = true;
        googleSettingsItem.f29967m = true;
        googleSettingsItem.f29968n = "DrivingModeSettings";
        googleSettingsItem.mo17614a(getApplicationContext().getString(C0126R.string.driving_mode_settings_search_car));
        googleSettingsItem.mo17614a(getApplicationContext().getString(C0126R.string.driving_mode_settings_search_do_not_disturb));
        googleSettingsItem.mo17614a(getApplicationContext().getString(C0126R.string.driving_mode_settings_search_drive));
        googleSettingsItem.mo17614a(getApplicationContext().getString(C0126R.string.gearhead_app_name));
        googleSettingsItem.mo17614a(getApplicationContext().getString(C0126R.string.driving_mode_settings_search_bluetooth));
        googleSettingsItem.mo17614a(getApplicationContext().getString(C0126R.string.driving_mode_settings_search_dnd));
        googleSettingsItem.mo17614a(getApplicationContext().getString(C0126R.string.driving_mode_settings_search_car_mode));
        return googleSettingsItem;
    }
}
