package com.google.android.gms.thunderbird.settings;

import android.os.Build;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.SettingInjectorService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ThunderbirdChimeraSettingInjectorService extends SettingInjectorService {
    public ThunderbirdChimeraSettingInjectorService() {
        super("ThunderbirdSettingsInjectorService");
    }

    public final boolean onGetEnabled() {
        return true;
    }

    public final String onGetSummary() {
        int i = Build.VERSION.SDK_INT;
        if (!cgyq.f188062a.mo6606a().mo84772p()) {
            return null;
        }
        if (!cgyq.f188062a.mo6606a().mo84771o()) {
            if (auhf.m77066a(this)) {
                return getString(C0126R.string.common_on);
            }
            return getString(C0126R.string.common_off);
        } else if (auhf.m77066a(this)) {
            return getString(C0126R.string.thunderbird_settings_summary_text_on);
        } else {
            return getString(C0126R.string.thunderbird_settings_summary_text_off);
        }
    }
}
