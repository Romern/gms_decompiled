package com.google.android.gms.gcm.connection;

import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ReconnectManager$ReconnectBroadcastReceiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ aank f32830a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReconnectManager$ReconnectBroadcastReceiver(aank aank) {
        super("gcm");
        this.f32830a = aank;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        String action;
        aand aand;
        if (intent != null && (action = intent.getAction()) != null) {
            if (action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                aank aank = this.f32830a;
                if (!cecz.m136073u() || !aank.f28570s.mo17105b()) {
                    this.f32830a.mo17120a((NetworkInfo) intent.getParcelableExtra("networkInfo"), !intent.getBooleanExtra("noConnectivity", false));
                    return;
                }
            }
            if (action.equals("android.intent.action.AIRPLANE_MODE")) {
                this.f32830a.mo17124b(intent.getBooleanExtra("state", false));
            } else if ("com.google.android.intent.action.GCM_RECONNECT".equals(action) && (aand = this.f32830a.f28564m) != null) {
                if (aand.mo17094b()) {
                    this.f32830a.mo17127d();
                    return;
                }
                aank aank2 = this.f32830a;
                aank2.f28557f = false;
                aank2.mo17122a(false);
            }
        }
    }
}
