package com.google.android.location.util;

import android.os.Build;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.SettingInjectorService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationAccuracyChimeraInjectorService extends SettingInjectorService {
    public LocationAccuracyChimeraInjectorService() {
        super("LocationAccuracySettingsInjectorService");
    }

    public final boolean onGetEnabled() {
        int i = Build.VERSION.SDK_INT;
        return true;
    }

    public final String onGetSummary() {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (!ceyd.f183506a.mo6606a().showSummaryForLocationAccuracy()) {
            return null;
        }
        boolean a = aeri.m52434a(this);
        if (!ceyd.f183506a.mo6606a().showOnOffStatusForLocationAccuracy()) {
            i = a ? C0126R.string.location_accuracy_summary_text_on : C0126R.string.location_accuracy_summary_text_off;
        } else {
            i = a ? C0126R.string.common_on : C0126R.string.common_off;
        }
        return getString(i);
    }
}
