package com.google.android.gms.instantapps.p051ui;

import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.chimera.GoogleSettingsItem;
import com.google.android.gms.instantapps.internal.OptInInfo;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.instantapps.ui.SettingsIntentOperation */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SettingsIntentOperation extends qld {

    /* renamed from: a */
    private static final adfs f79253a = new adfs("SettingsIntentOperation");

    /* renamed from: b */
    public final GoogleSettingsItem mo7154b() {
        if (!adko.m50744a(this).mo33605a()) {
            f79253a.mo33426b("Killed with a switch", new Object[0]);
        } else {
            aucb j = adee.m50255b(this).mo24752j();
            try {
                aucu.m76782a(j);
                if (((OptInInfo) j.mo50386d()).f79184c.length == 0) {
                    f79253a.mo33426b("No accounts", new Object[0]);
                } else {
                    Intent intent = new Intent("com.google.android.instantapps.supervisor.SETTINGS_ACTIVITY");
                    int i = Build.VERSION.SDK_INT;
                    String g = cepl.m137726g();
                    String f = cepl.m137725f();
                    if (TextUtils.isEmpty(g) || TextUtils.isEmpty(f)) {
                        f79253a.mo33426b("Cannot find settings page in O+", new Object[0]);
                        return null;
                    }
                    intent.setClassName(g, f);
                    GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(intent, 4, (int) C0126R.string.instantapps_module_display_name, 31);
                    googleSettingsItem.f29960f = true;
                    googleSettingsItem.f29965k = true;
                    googleSettingsItem.f29968n = SettingsChimeraActivity.class.getName();
                    googleSettingsItem.f29967m = true;
                    return googleSettingsItem;
                }
            } catch (InterruptedException | ExecutionException e) {
                f79253a.mo33425a(e, "Cannot display Instant Apps settings.", new Object[0]);
            }
        }
        return null;
    }
}
