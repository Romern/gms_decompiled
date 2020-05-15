package com.google.android.gms.auth.account.authenticator;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TvAuthDelegateChimeraService extends BoundService {
    public final IBinder onBind(Intent intent) {
        return new gkg(this);
    }
}
