package com.google.android.gms.accountsettings.operations;

import android.content.Context;
import android.content.Intent;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.chimera.GoogleSettingsItem;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GoogleSettingsInitializer extends qld {
    public GoogleSettingsInitializer() {
    }

    /* renamed from: a */
    public final List mo6342a() {
        sre.m36087g(this);
        sre.m36088h(this);
        bngs j = bngx.m109377j();
        Intent putExtra = new Intent().setClassName("com.google.android.gms", "com.google.android.gms.accountsettings.mg.ui.main.MainActivity").addCategory("android.intent.category.DEFAULT").putExtra("extra.screenId", 1).putExtra("extra.launchApi", 2);
        if (cbro.m128206j()) {
            putExtra.putExtra("extra.callingPackageName", "com.google.android.gms").putExtra("extra.utmSource", "google-settings-classic");
        } else {
            putExtra.putExtra("extra.callingPackageName", "com.google.android.gms.app.settings");
        }
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(putExtra, 1, getResources().getString(C0126R.string.common_asm_google_account_title), 2);
        googleSettingsItem.f29960f = true;
        googleSettingsItem.f29971q = C0126R.string.accountsettings_google_account_subtitle;
        googleSettingsItem.f29959e = 1;
        j.mo67668c(googleSettingsItem);
        if (cbri.f178135a.mo6606a().mo75276z()) {
            bngs j2 = bngx.m109377j();
            j2.mo67668c(new GoogleSettingsItem(new Intent("com.android.settings.action.VIEW_ACCOUNT").setPackage("com.google.android.gms").putExtra("extra.callingPackageName", "com.google.android.gms"), 2, (int) C0126R.string.as_debug_android_me_card, 48));
            j2.mo67668c(new GoogleSettingsItem(new Intent().setClassName("com.google.android.gms", "com.google.android.gms.accountsettings.ui.PrivacyHubActivityControlsActivity").addCategory("android.intent.category.DEFAULT").putExtra("extra.callingPackageName", "com.google.android.gms"), 2, (int) C0126R.string.as_debug_android_privacy_hub_activty_controls, 51));
            j.mo67666b((Iterable) j2.mo67664a());
        }
        return j.mo67664a();
    }

    protected GoogleSettingsInitializer(Context context) {
        attachBaseContext(context);
    }
}
