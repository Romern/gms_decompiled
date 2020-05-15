package com.google.android.gms.auth.account.p016be.channelid;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;

/* renamed from: com.google.android.gms.auth.account.be.channelid.ChannelBindingChimeraBroadcastReceiver */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ChannelBindingChimeraBroadcastReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        context.startService(new Intent().setClassName(context, "com.google.android.gms.auth.account.be.channelid.ChannelBindingStateIntentService").setAction("com.google.gservices.intent.action.GSERVICES_CHANGED"));
    }
}
