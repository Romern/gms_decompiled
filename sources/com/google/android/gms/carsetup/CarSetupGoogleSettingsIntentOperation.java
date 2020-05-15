package com.google.android.gms.carsetup;

import android.content.Context;
import android.content.Intent;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CarSetupGoogleSettingsIntentOperation extends qld {
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: b */
    public final GoogleSettingsItem mo7154b() {
        if (!ccui.f179964a.mo6606a().mo76817a()) {
            return null;
        }
        if ((ccrv.f179815a.mo6606a().mo76694d() && nzi.m28224a()) || ovr.m29886a(this)) {
            return null;
        }
        Intent component = new Intent().setComponent(AaSettingsActivityImpl.f29533b);
        try {
            String b = nuu.m27794b(this, ccqx.m131305b());
            if (!AaSettingsActivityImpl.m22105a(getPackageManager(), b)) {
                return null;
            }
            component.putExtra("gearhead_package", b);
            return new GoogleSettingsItem(component, 6, getString(C0126R.string.car_app_name), 22);
        } catch (IllegalStateException | SecurityException e) {
        }
    }
}
