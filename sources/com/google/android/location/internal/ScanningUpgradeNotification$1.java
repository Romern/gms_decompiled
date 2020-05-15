package com.google.android.location.internal;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ScanningUpgradeNotification$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ bgbd f150796a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScanningUpgradeNotification$1(bgbd bgbd, String str) {
        super(str);
        this.f150796a = bgbd;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        this.f150796a.mo62592a();
        if (intent.getBooleanExtra("launch_settings", false)) {
            Intent intent2 = new Intent("android.settings.LOCATION_SCANNING_SETTINGS");
            intent2.setFlags(268435456);
            context.startActivity(intent2);
        }
    }
}
