package com.google.android.gms.app.phone.settings;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DataManagementChimeraActivity extends fpv {

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SettingsIntentOperation extends qld {
        /* renamed from: b */
        public final GoogleSettingsItem mo7154b() {
            if (cdqm.f181559a.mo6606a().mo78185h()) {
                return null;
            }
            GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(fpv.m12148a(this), 5, (int) C0126R.string.core_data_management_title, 20);
            googleSettingsItem.f29960f = true;
            googleSettingsItem.f29965k = true;
            googleSettingsItem.f29968n = DataManagementChimeraActivity.class.getName();
            googleSettingsItem.f29967m = true;
            return googleSettingsItem;
        }
    }
}
