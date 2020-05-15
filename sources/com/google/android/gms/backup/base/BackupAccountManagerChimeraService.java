package com.google.android.gms.backup.base;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BackupAccountManagerChimeraService extends Service {

    /* renamed from: a */
    public static final lvn f28995a = new lvn("BackupAccountManagerService");

    /* renamed from: a */
    public static Intent m21858a() {
        Intent intent = new Intent("com.google.android.gms.backup.GmsBackupAccountManagerService").setPackage("com.google.android.gms");
        if (rpr.m34216b().getPackageManager().resolveService(intent, 0) != null) {
            return intent;
        }
        return null;
    }

    public final IBinder onBind(Intent intent) {
        return new lux(this);
    }
}
