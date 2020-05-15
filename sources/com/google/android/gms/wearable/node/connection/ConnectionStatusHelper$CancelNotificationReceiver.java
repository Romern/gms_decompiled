package com.google.android.gms.wearable.node.connection;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConnectionStatusHelper$CancelNotificationReceiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ aydo f110995a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConnectionStatusHelper$CancelNotificationReceiver(aydo aydo) {
        super("wearable");
        this.f110995a = aydo;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("com.google.android.gms.wearable.node.connection.CANCEL_NOTIFICATION".equals(intent.getAction())) {
            this.f110995a.mo53965c();
        }
    }
}
