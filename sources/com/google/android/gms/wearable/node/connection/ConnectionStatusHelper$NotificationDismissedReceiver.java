package com.google.android.gms.wearable.node.connection;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConnectionStatusHelper$NotificationDismissedReceiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ aydo f110996a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConnectionStatusHelper$NotificationDismissedReceiver(aydo aydo) {
        super("wearable");
        this.f110996a = aydo;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("com.google.android.gms.wearable.node.connection.NOTIFICATION_DISMISSED".equals(intent.getAction())) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aydo aydo = this.f110996a;
            if (elapsedRealtime - aydo.f97232a > 5000) {
                aydo.f97233b = SystemClock.elapsedRealtime();
            }
        }
    }
}
