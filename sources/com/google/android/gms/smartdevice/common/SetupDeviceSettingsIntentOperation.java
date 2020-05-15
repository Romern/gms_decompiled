package com.google.android.gms.smartdevice.common;

import android.app.UiModeManager;
import android.content.Intent;
import android.os.Build;
import android.os.UserManager;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.chimera.GoogleSettingsItem;
import com.google.android.gms.smartdevice.d2d.p065ui.TargetChimeraActivity;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SetupDeviceSettingsIntentOperation extends qld {
    /* renamed from: a */
    public final List mo6342a() {
        return Collections.singletonList(new GoogleSettingsItem(TargetChimeraActivity.m92752a(getApplicationContext()).putExtra("smartdevice.theme", "glif_v2_light"), 2, "SmartDevice Target flow", 55));
    }

    /* renamed from: b */
    public final GoogleSettingsItem mo7154b() {
        GoogleSettingsItem googleSettingsItem = null;
        if (!sre.m36080a(this) && !sre.m36085e(this)) {
            sre.m36087g(this);
            sre.m36089i(this);
            sre.m36088h(this);
            if (((UiModeManager) getSystemService("uimode")).getCurrentModeType() != 7 && ((Boolean) rsv.f43621j.mo25081c()).booleanValue()) {
                Intent a = mo24067a("com.google.android.gms.settings.SMART_DEVICE_DISCOVERY");
                a.putExtra("android.intent.extra.REFERRER_NAME", "gcore-settings");
                googleSettingsItem = new GoogleSettingsItem(a, 7, (int) C0126R.string.common_set_up_nearby_device_settings_title, 54);
                int i = Build.VERSION.SDK_INT;
                UserManager userManager = (UserManager) getSystemService("user");
                boolean z = false;
                if (userManager != null && userManager.isManagedProfile()) {
                    z = true;
                }
                googleSettingsItem.f29964j = !z;
            }
        }
        return googleSettingsItem;
    }
}
