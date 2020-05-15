package com.google.android.gms.car;

import android.content.Intent;
import android.os.IBinder;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InCallServiceVOIPImpl extends InCallServiceImpl {
    public final IBinder onBind(Intent intent) {
        if ("local_action".equals(intent.getAction())) {
            return new ntj(this);
        }
        return super.onBind(intent);
    }
}
