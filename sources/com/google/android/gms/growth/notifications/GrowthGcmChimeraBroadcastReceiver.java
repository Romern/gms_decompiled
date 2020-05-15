package com.google.android.gms.growth.notifications;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GrowthGcmChimeraBroadcastReceiver extends asfd {

    /* renamed from: b */
    private static final srn f79021b = srn.m36127a(sgj.GROWTH);

    public final void onReceive(Context context, Intent intent) {
        try {
            asfd.m73947b(context, GrowthNotificationsIntentOperation.m66641a(context, intent));
        } catch (Exception e) {
            bnsl bnsl = (bnsl) f79021b.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Failed to handle: %s", intent);
        }
    }
}
