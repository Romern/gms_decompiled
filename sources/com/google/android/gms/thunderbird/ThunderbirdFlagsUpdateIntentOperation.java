package com.google.android.gms.thunderbird;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.thunderbird.settings.provider.ThunderbirdSettingsChimeraContentProvider;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ThunderbirdFlagsUpdateIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final String f109061a = ssv.m36267a("com.google.android.gms.thunderbird");

    public final void onHandleIntent(Intent intent) {
        if (("com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) || f109061a.equals(intent.getAction())) && "com.google.android.gms.thunderbird".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            try {
                ThunderbirdSettingsChimeraContentProvider.m93360a(this, "corruptConfigs", new ArrayList());
            } catch (IOException e) {
                auho.m77069a(this, e);
            }
            aufz.m77008b();
        }
    }
}
