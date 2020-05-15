package com.google.android.gms.matchstick.intent;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MatchstickIntentHandler$OnPackageChangeOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        int i = Build.VERSION.SDK_INT;
        String action = intent.getAction();
        Uri data = intent.getData();
        String schemeSpecificPart = data != null ? data.getSchemeSpecificPart() : "";
        Object[] objArr = {action, schemeSpecificPart};
        if ("android.intent.action.PACKAGE_REPLACED".equals(action) && getBaseContext().getPackageName().equals(schemeSpecificPart)) {
            afiw.m53144g(getBaseContext());
            afiw.m53135a(getBaseContext(), cfeo.f183719a.mo6606a().mo80998bE(), 2);
        }
        if (("android.intent.action.PACKAGE_ADDED".equals(action) || "android.intent.action.PACKAGE_REMOVED".equals(action)) && cfeo.m138863T().equals(schemeSpecificPart)) {
            afiw.m53142e(getBaseContext());
        }
        if (("android.intent.action.PACKAGE_ADDED".equals(action) || "android.intent.action.PACKAGE_REMOVED".equals(action) || "android.intent.action.PACKAGE_CHANGED".equals(action)) && cfdq.m138746b().contains(schemeSpecificPart)) {
            afiw.m53143f(getBaseContext());
        }
        if ("android.intent.action.PACKAGE_ADDED".equals(action) && cfeo.m138886q().equals(schemeSpecificPart)) {
            afiw.m53134a(getBaseContext());
        }
    }
}
