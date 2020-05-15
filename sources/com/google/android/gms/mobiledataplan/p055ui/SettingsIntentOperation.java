package com.google.android.gms.mobiledataplan.p055ui;

import android.content.Intent;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* renamed from: com.google.android.gms.mobiledataplan.ui.SettingsIntentOperation */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SettingsIntentOperation extends qld {

    /* renamed from: a */
    static final int[] f80337a = {C0126R.string.mdp_keyword_mobile, C0126R.string.pmtcs_generic, C0126R.string.plan, C0126R.string.mdp_keyword_network, C0126R.string.mdp_keyword_internet, C0126R.string.mdp_keyword_cell, C0126R.string.mdp_keyword_cellular, C0126R.string.mdp_keyword_wireless, C0126R.string.mdp_keyword_connect, C0126R.string.mdp_keyword_limit, C0126R.string.mdp_keyword_limited, C0126R.string.mdp_keyword_unlimited, C0126R.string.mdp_keyword_prepaid, C0126R.string.mdp_keyword_postpaid, C0126R.string.mdp_keyword_carrier, C0126R.string.mdp_keyword_usage, C0126R.string.common_kilobyte_short, C0126R.string.common_megabyte_short, C0126R.string.common_gigabyte_short, C0126R.string.mdp_keyword_kilobyte, C0126R.string.mdp_keyword_megabyte, C0126R.string.mdp_keyword_gigabyte, C0126R.string.mdp_keyword_quota, C0126R.string.mdp_keyword_balance, C0126R.string.mdp_keyword_sms, C0126R.string.mdp_keyword_call, C0126R.string.mdp_keyword_4g, C0126R.string.mdp_keyword_3g, C0126R.string.mdp_keyword_2g, C0126R.string.mdp_keyword_lte, C0126R.string.mdp_keyword_connection};

    /* renamed from: b */
    private static final srn f80338b = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: b */
    public final GoogleSettingsItem mo7154b() {
        f80338b.mo26019b(agyt.m55307c()).mo68420a("Creating MobileDataPlan Settings item, show UI: %b", agqg.m54844K());
        if (!agqg.m54844K().booleanValue()) {
            return null;
        }
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent("com.google.android.gms.mobiledataplan.ui.SETTING_TO_ACTIVITY").setClassName(this, "com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsActivity"), 0, (int) C0126R.string.mobile_data_plan, 40);
        googleSettingsItem.f29960f = false;
        googleSettingsItem.f29962h = true;
        googleSettingsItem.f29967m = false;
        if (cflx.f184311a.mo6606a().mo81431i()) {
            googleSettingsItem.f29965k = true;
            googleSettingsItem.f29968n = "MobileDataPlanSettingsActivity";
            googleSettingsItem.f29967m = true;
            for (int i : f80337a) {
                googleSettingsItem.mo17614a(getString(i));
            }
            String a = agpk.m54726a().mo35826a(agyq.m55288i(this));
            if (a != null) {
                googleSettingsItem.mo17614a(a);
            }
        }
        return googleSettingsItem;
    }
}
