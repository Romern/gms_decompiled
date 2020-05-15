package com.google.android.gms.auth.managed.p029ui;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: com.google.android.gms.auth.managed.ui.ManagingAppDownloadBroadcastReceiver */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ManagingAppDownloadBroadcastReceiver extends aacn {

    /* renamed from: a */
    private final jgo f11068a;

    /* renamed from: b */
    private final Context f11069b;

    /* renamed from: c */
    private boolean f11070c;

    public ManagingAppDownloadBroadcastReceiver(Context context, jgo jgo) {
        super("auth_managed");
        sdo.m34959a(context);
        this.f11069b = context;
        sdo.m34959a(jgo);
        this.f11068a = jgo;
    }

    /* renamed from: a */
    public final synchronized void mo7764a() {
        if (!this.f11070c) {
            this.f11069b.registerReceiver(this, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
            this.f11070c = true;
        }
    }

    /* renamed from: b */
    public final synchronized void mo7765b() {
        if (this.f11070c) {
            this.f11069b.unregisterReceiver(this);
            this.f11070c = false;
        }
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("android.intent.action.DOWNLOAD_COMPLETE".equals(intent.getAction())) {
            jgu jgu = (jgu) this.f11068a;
            if (Long.valueOf(intent.getLongExtra("extra_download_id", -1)).equals(Long.valueOf(jgu.f22438b))) {
                jgu.f22439c = true;
            }
        }
    }
}
