package com.google.android.gms.auth.proximity.multidevice;

import android.content.Context;
import android.content.Intent;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BetterTogetherGoogleSettingsIntentOperation extends qld {
    public BetterTogetherGoogleSettingsIntentOperation() {
    }

    /* renamed from: b */
    public final GoogleSettingsItem mo7154b() {
        if (!ccig.f179039a.mo6606a().mo76018o() && !mo24068c()) {
            return null;
        }
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent().setClassName(this, SettingsChimeraActivity.m6881e()), 0, (int) C0126R.string.better_together_app_name, 9);
        googleSettingsItem.f29960f = true;
        googleSettingsItem.f29967m = true;
        googleSettingsItem.f29965k = true;
        googleSettingsItem.f29968n = "BetterTogetherGoogleSettingsIntentOperation";
        return googleSettingsItem;
    }

    public BetterTogetherGoogleSettingsIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
