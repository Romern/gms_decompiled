package com.google.android.gms.payse.loader;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import com.felicanetworks.mfc.BuildConfig;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.ModuleManager;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PaySeInitIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        int i = Build.VERSION.SDK_INT;
        try {
            getBaseContext().getPackageManager().getPackageInfo(BuildConfig.APPLICATION_ID, 512);
            if (!cfuj.f185732a.mo6606a().mo82741a() && cfuj.f185732a.mo6606a().mo82742b()) {
                ModuleManager.FeatureRequest featureRequest = new ModuleManager.FeatureRequest();
                featureRequest.requestFeatureAtLatestVersion(alju.f73582a.f30068a);
                featureRequest.setUrgent();
                ModuleManager.get(getBaseContext()).requestFeatures(featureRequest);
            }
        } catch (PackageManager.NameNotFoundException e) {
        }
    }
}
