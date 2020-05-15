package com.google.android.location.util;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WifiScanNotificationHelper$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ Handler f150968a;

    /* renamed from: b */
    public final /* synthetic */ bhci f150969b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WifiScanNotificationHelper$1(bhci bhci, String str, Handler handler) {
        super(str);
        this.f150969b = bhci;
        this.f150968a = handler;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        int i;
        String action = intent.getAction();
        if (!"com.google.android.location.internal.LOCATOR_ALARM_TRIGGERED".equals(action)) {
            i = !"com.google.android.location.internal.WIFI_SCAN_STARTED".equals(action) ? "com.google.android.location.internal.WIFI_SCAN_RECEIVED".equals(action) ? 3 : 0 : 2;
        } else {
            i = 1;
        }
        if (i != 0 && this.f150969b.f118300e != null) {
            this.f150968a.post(new bhch(this, i));
        }
    }
}
