package com.google.android.gms.common.account;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountBoundService extends BoundService {
    public final IBinder onBind(Intent intent) {
        return new sjp(this);
    }

    public final boolean onUnbind(Intent intent) {
        return true;
    }
}
