package com.google.android.gms.locationsharing.settings;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationSharingRedirectChimeraActivity extends Activity {
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        sre.m36087g(this);
        Intent className = new Intent().setClassName(this, "com.google.android.gms.locationsharing.activity.LocationSharingSettingsActivity");
        className.addFlags(33554432);
        className.addFlags(getIntent().getFlags());
        className.putExtras(getIntent());
        if (getCallingActivity() != null) {
            className.putExtra("calling_package_name", getCallingActivity().getPackageName());
        }
        startActivity(className);
        finish();
    }
}
