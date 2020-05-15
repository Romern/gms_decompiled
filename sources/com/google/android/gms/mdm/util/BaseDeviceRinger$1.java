package com.google.android.gms.mdm.util;

import android.content.IntentFilter;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BaseDeviceRinger$1 extends IntentFilter {
    public BaseDeviceRinger$1() {
        addAction("android.intent.action.SCREEN_ON");
        addAction("android.intent.action.SCREEN_OFF");
        addAction("android.intent.action.USER_PRESENT");
    }
}
