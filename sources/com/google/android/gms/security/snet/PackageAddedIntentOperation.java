package com.google.android.gms.security.snet;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PackageAddedIntentOperation extends IntentOperation {

    /* renamed from: a */
    private Context f107555a;

    static {
        PackageAddedIntentOperation.class.getSimpleName();
    }

    public final void onCreate() {
        this.f107555a = getApplicationContext();
    }

    public final void onHandleIntent(Intent intent) {
        String str;
        if (intent != null && "android.intent.action.PACKAGE_ADDED".equals(intent.getAction())) {
            Uri data = intent.getData();
            if (data != null) {
                str = data.getSchemeSpecificPart();
            } else {
                str = null;
            }
            if (str != null) {
                Intent intent2 = new Intent("com.google.android.vending.verifier.ACTION_CHECK_VERIFY_INSTALL");
                intent2.setPackage("com.android.vending");
                intent2.putExtra("package_name", str);
                this.f107555a.sendBroadcast(intent2);
            }
        }
    }
}
