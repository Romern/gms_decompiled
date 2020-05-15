package com.google.android.gms.app.phone.settings;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.chimera.Activity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GoogleSettingsChimeraActivity extends Activity {
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = Build.VERSION.SDK_INT;
        sre.m36088h(this);
        Intent putExtra = new Intent("com.google.android.gms.accountsettings.VIEW_SETTINGS_0P").setPackage("com.google.android.gms").putExtra("extra.screenId", 524).putExtra("extra.screen.screenFlavor", Integer.toString(2)).putExtra("extra.callingPackageName", "com.google.android.gms");
        if (putExtra == null || putExtra.resolveActivity(getPackageManager()) == null) {
            putExtra = new Intent().setClassName(this, "com.google.android.gms.app.settings.BasicGoogleSettingsActivity");
        }
        startActivity(putExtra);
        finish();
    }
}
