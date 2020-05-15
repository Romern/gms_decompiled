package com.google.android.location.geofencer.service;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GeofencerStateMachine$Receiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ bfzt f150781a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GeofencerStateMachine$Receiver(bfzt bfzt) {
        super("location");
        this.f150781a = bfzt;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgan.b(int, java.lang.Object):void
     arg types: [int, boolean]
     candidates:
      bfzt.b(bfwc, android.location.Location):void
      bgan.b(int, java.lang.Object):void */
    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        String action = intent.getAction();
        bfzt bfzt = this.f150781a;
        int i = bfzt.f115788E;
        if (bfzt.f115814s.matchAction(intent.getAction())) {
            bfzt bfzt2 = this.f150781a;
            synchronized (bfzt2.f115806k) {
                boolean z = bfxc.f115575a;
                bfzt2.mo62545b(9, intent);
            }
        } else if ("android.intent.action.USER_BACKGROUND".equals(action) || "android.intent.action.USER_FOREGROUND".equals(action)) {
            bfzt bfzt3 = this.f150781a;
            synchronized (bfzt3.f115806k) {
                if (Log.isLoggable("GeofencerStateMachine", 4)) {
                    bfxc.m98132a("GeofencerStateMachine", "sendUserSwitched");
                }
                bfzt3.mo62553d(11);
            }
        } else if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
            bfzt bfzt4 = this.f150781a;
            if (intent.getBooleanExtra("android.intent.extra.DATA_REMOVED", false)) {
                boolean z2 = bfxc.f115575a;
                bfzt4.mo62508a(intent);
            }
        } else if ("android.intent.action.PACKAGE_DATA_CLEARED".equals(action) || "com.google.android.gms.INSTANT_APP_STOPPED".equals(action)) {
            this.f150781a.mo62508a(intent);
        } else if ("com.google.android.location.activity.DEEP_STILL_MODE_DISABLED".equals(action)) {
            this.f150781a.mo62545b(14, (Object) false);
        } else if ("com.google.android.location.activity.DEEP_STILL_MODE_ENABLED".equals(action)) {
            this.f150781a.mo62545b(14, (Object) true);
        }
    }
}
