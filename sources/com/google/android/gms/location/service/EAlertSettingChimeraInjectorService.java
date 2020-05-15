package com.google.android.gms.location.service;

import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.SettingInjectorService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EAlertSettingChimeraInjectorService extends SettingInjectorService {
    public EAlertSettingChimeraInjectorService() {
        super("EAlertSettingInjectorService");
        new aeqq();
    }

    public final boolean onGetEnabled() {
        cevl.m138301c();
        return false;
    }

    public final String onGetSummary() {
        cevl.m138301c();
        return getString(C0126R.string.common_off);
    }
}
