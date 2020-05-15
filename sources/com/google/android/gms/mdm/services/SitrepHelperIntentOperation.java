package com.google.android.gms.mdm.services;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SitrepHelperIntentOperation extends IntentOperation {
    /* renamed from: a */
    public static cakk m67239a(Intent intent, String str) {
        if (!intent.hasExtra(str)) {
            return cakk.UNKNOWN;
        }
        cakk a = cakk.m126724a(intent.getIntExtra(str, 0));
        return a == null ? cakk.UNKNOWN : a;
    }

    public final void onHandleIntent(Intent intent) {
        Intent a;
        if (intent != null) {
            boolean booleanExtra = intent.getBooleanExtra("force", false);
            boolean booleanExtra2 = intent.getBooleanExtra("enabled", false);
            cakk a2 = m67239a(intent, "reason");
            if ("com.google.android.gms.mdm.services.ACTION_DEVICE_ADMIN_CHANGED".equals(intent.getAction())) {
                Intent a3 = afzn.m53751a(this, booleanExtra, a2, cakk.UNKNOWN, booleanExtra2, afzw.m53778a(this));
                if (a3 != null) {
                    int i = eoa.f15378a;
                    startService(a3);
                }
            } else if ("com.google.android.gms.mdm.services.ACTION_DIALOG_DISMISSED".equals(intent.getAction()) && (a = afzn.m53750a(this, booleanExtra, a2)) != null) {
                startService(a);
            }
        }
    }
}
