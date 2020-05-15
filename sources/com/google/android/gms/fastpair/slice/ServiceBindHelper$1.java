package com.google.android.gms.fastpair.slice;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ServiceBindHelper$1 extends aacn {
    public ServiceBindHelper$1(String str) {
        super(str);
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("android.bluetooth.device.action.ACL_CONNECTED".equals(intent.getAction()) || "android.bluetooth.device.action.ACL_DISCONNECTED".equals(intent.getAction())) {
            wuc.m42263a(context, "links");
        }
    }
}
