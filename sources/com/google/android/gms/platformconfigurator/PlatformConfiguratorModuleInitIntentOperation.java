package com.google.android.gms.platformconfigurator;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PlatformConfiguratorModuleInitIntentOperation extends qlf {
    /* renamed from: a */
    private static void m68282a(Context context, String str) {
        context.startService(IntentOperation.getStartIntent(context, PhenotypeConfigurationUpdateListener.class, str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo6536b(Intent intent, boolean z) {
        m68282a(this, intent.getAction());
    }

    public final void onHandleIntent(Intent intent, boolean z) {
        if (!"com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) || !"com.google.android.gms.platformconfigurator".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            super.onHandleIntent(intent, z);
        } else {
            m68282a(this, intent.getAction());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6343a(Intent intent) {
        m68282a(this, intent.getAction());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6268a(Intent intent, boolean z) {
        m68282a(this, intent.getAction());
    }
}
