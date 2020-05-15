package com.google.android.gms.fitness.service.wearable;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FitAppPackageIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final srn f32429a = zvt.m46581a();

    /* renamed from: a */
    private static String m23804a(Intent intent) {
        Uri data = intent.getData();
        if (data != null) {
            return data.getSchemeSpecificPart();
        }
        return null;
    }

    /* renamed from: b */
    private static boolean m23807b(Context context) {
        try {
            aucu.m76783a(axoz.m82855c(context).mo24757l("com.google.android.gms.fitness.service.wearable.FIT_MOBILE_APP_NOT_INSTALLED_CAPABILITY"), cdzd.m135494w(), TimeUnit.SECONDS);
            return true;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            bnsl bnsl = (bnsl) f32429a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("com.google.android.gms.fitness.service.wearable.FitAppPackageIntentOperation", "b", 95, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to add Capability FIT_MOBILE_APP_NOT_INSTALLED_CAPABILITY");
            return false;
        }
    }

    public final void onHandleIntent(Intent intent) {
        sre.m36089i(getApplicationContext());
        String action = intent.getAction();
        if ("android.intent.action.PACKAGE_ADDED".equals(action) && yxy.m44965a(m23804a(intent))) {
            m23806a(getApplicationContext(), true);
        } else if ("android.intent.action.PACKAGE_FULLY_REMOVED".equals(action) && yxy.m44965a(m23804a(intent))) {
            m23806a(getApplicationContext(), false);
        }
    }

    /* renamed from: a */
    private static boolean m23805a(Context context) {
        try {
            aucu.m76783a(axoz.m82855c(context).mo24759m("com.google.android.gms.fitness.service.wearable.FIT_MOBILE_APP_NOT_INSTALLED_CAPABILITY"), cdzd.m135494w(), TimeUnit.SECONDS);
            return true;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            bnsl bnsl = (bnsl) f32429a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("com.google.android.gms.fitness.service.wearable.FitAppPackageIntentOperation", "a", 77, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to remove Capability FIT_MOBILE_APP_NOT_INSTALLED_CAPABILITY");
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m23806a(Context context, boolean z) {
        if (!z) {
            return m23807b(context);
        }
        if (!m23805a(context)) {
            return m23807b(context) && m23805a(context);
        }
        return true;
    }
}
