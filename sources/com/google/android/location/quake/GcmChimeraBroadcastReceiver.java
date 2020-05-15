package com.google.android.location.quake;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmChimeraBroadcastReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        if (cevi.m138289d()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (bgsg.f117406b != null) {
                bgtg bgtg = bgsg.f117406b.f117407a.f117486b;
                int i = bgth.f117484d;
                String str = bgtg.f117483a.f117485a;
                Bundle bundle = new Bundle();
                bundle.putLong("t", currentTimeMillis);
                Message obtainMessage = bgtg.obtainMessage(4);
                obtainMessage.setData(bundle);
                bgtg.sendMessage(obtainMessage);
            }
        }
    }
}
