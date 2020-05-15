package com.google.android.gms.growth.watchdog.chimera;

import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AppInstalledIntentOperation extends IntentOperation {

    /* renamed from: a */
    ablh f79047a;

    public final void onCreate() {
        abli a = ablj.m47861a();
        a.mo32207a(abif.m47744a());
        ablh j = a.mo32206a().f57663a.mo32127j();
        cazf.m127593a(j, "Cannot return null from a non-@Nullable component method");
        this.f79047a = j;
    }

    public final void onHandleIntent(Intent intent) {
        Uri data;
        if (this.f79047a != null && "android.intent.action.PACKAGE_ADDED".equals(intent.getAction()) && (data = intent.getData()) != null) {
            this.f79047a.mo32203a(data.getSchemeSpecificPart());
        }
    }
}
