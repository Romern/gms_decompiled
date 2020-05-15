package com.google.android.gms.backup.d2d.component;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class D2dMigrateHelperChimeraService extends Service {

    /* renamed from: a */
    public static final lvn f29015a = new lvn("D2dMigrateHelperService");

    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.backup.D2D_MIGRATE_HELPER".equals(intent.getAction())) {
            return new mqd(this);
        }
        return null;
    }
}
