package com.google.android.gms.icing.proxy.calendar;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CalendarCorpusUpdateIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        Uri data;
        acnv.m49555d("Received intent: %s", intent);
        if (cemq.m137366c() && intent != null) {
            if ("android.intent.action.PROVIDER_CHANGED".equals(intent.getAction()) && (data = intent.getData()) != null && "content".equalsIgnoreCase(data.getScheme()) && "com.android.calendar".equalsIgnoreCase(data.getAuthority())) {
                acnv.m49550c("Received calendar change notification.");
                if (((Boolean) abzt.f58879aT.mo58455c()).booleanValue()) {
                    int i = Build.VERSION.SDK_INT;
                    if (!((Boolean) abzt.f58878aS.mo58455c()).booleanValue()) {
                        acpg.f60408a.mo32983a(getApplicationContext(), 1, 1);
                    }
                }
            } else if ("com.google.firebase.appindexing.UPDATE_INDEX".equals(intent.getAction())) {
                acnv.m49550c("Received calendar update index notification.");
                if (!((Boolean) abzt.f58880aU.mo58455c()).booleanValue()) {
                    acnv.m49541a("CalendarUpdateIndexOperation: skipping because handler is disabled.");
                } else {
                    acpg.f60408a.mo32983a(getApplicationContext(), 2, 1);
                }
            } else {
                acnv.m49557e("Unexpected Intent ignored: %s.", intent);
            }
        }
    }
}
