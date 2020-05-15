package com.google.android.gms.auth.managed.config;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.managed.intentoperations.SetupWorkProfileSettingsIntentOperation;
import com.google.android.gms.auth.managed.p029ui.SetupWorkProfileChimeraActivity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConfigChangedIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final sek f11052a = ght.m13171a("AuthManaged", "ConfigChangedIntentOperation");

    public final void onHandleIntent(Intent intent) {
        f11052a.mo25409a("onHandleIntent", new Object[0]);
        SetupWorkProfileChimeraActivity.m6735a(getBaseContext(), SetupWorkProfileSettingsIntentOperation.m6703a(getBaseContext()));
        jho.m16722b().mo13750b(this);
    }
}
