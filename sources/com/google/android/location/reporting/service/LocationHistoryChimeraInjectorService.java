package com.google.android.location.reporting.service;

import android.accounts.Account;
import android.os.Build;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.SettingInjectorService;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationHistoryChimeraInjectorService extends SettingInjectorService {
    public LocationHistoryChimeraInjectorService() {
        super("LocationHistoryReportingInjectorService");
    }

    public final boolean onGetEnabled() {
        return sse.m36205a(this) && !soz.m35807f(this);
    }

    public final String onGetSummary() {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (ceyd.f183506a.mo6606a().showSummaryForLocationHistory()) {
            List d = soz.m35801d(this, getPackageName());
            if (d.size() == 1) {
                if (!aepw.m52375a(bgye.m100307a(this).mo63353a((Account) d.get(0)).mo70906b())) {
                    i = C0126R.string.common_off;
                } else {
                    i = C0126R.string.common_on;
                }
                return getString(i);
            }
        }
        return null;
    }
}
