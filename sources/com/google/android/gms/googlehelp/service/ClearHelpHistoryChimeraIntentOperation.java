package com.google.android.gms.googlehelp.service;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ClearHelpHistoryChimeraIntentOperation extends IntentOperation {

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class PackageActionIntentOperation extends IntentOperation {
        public final void onHandleIntent(Intent intent) {
            String str;
            if (intent != null && "android.intent.action.PACKAGE_REMOVED".equals(intent.getAction())) {
                Uri data = intent.getData();
                if (data != null) {
                    str = data.getSchemeSpecificPart();
                } else {
                    str = "";
                }
                Intent intent2 = new Intent("com.google.android.gms.googlehelp.clear_help_history");
                intent2.putExtra("app_package_name", str);
                startService(new Intent("com.google.android.chimera.container.IntentOperationService.MODULE_SPECIFIC").setPackage("com.google.android.gms").putExtra("moduleid", "com.google.android.gms.googlehelp").putExtra("intent", intent2));
            }
        }
    }

    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("app_package_name");
            if (!TextUtils.isEmpty(stringExtra)) {
                abcr abcr = new abcr(this);
                aaxx aaxx = new aaxx(this);
                abgc abgc = new abgc(this, stringExtra);
                abcr.mo32044b(stringExtra);
                abcr.close();
                aaxx.mo31892b(stringExtra);
                aaxx.close();
                abgc.mo31765b();
                abgc.close();
            }
        }
    }
}
