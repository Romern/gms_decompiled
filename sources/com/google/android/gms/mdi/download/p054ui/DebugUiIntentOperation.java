package com.google.android.gms.mdi.download.p054ui;

import android.content.Intent;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* renamed from: com.google.android.gms.mdi.download.ui.DebugUiIntentOperation */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DebugUiIntentOperation extends qld {
    /* renamed from: b */
    public final GoogleSettingsItem mo7154b() {
        if (!((Boolean) afok.f64443d.mo58455c()).booleanValue()) {
            return null;
        }
        Intent intent = new Intent("com.google.android.gms.mdi.download.ui.DEBUG_UI");
        boolean g = ceni.f183073a.mo6606a().mo79430g();
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(intent, 2, (int) C0126R.string.mdd_debug_ui_title, 38);
        googleSettingsItem.f29961g = !g;
        return googleSettingsItem;
    }
}
