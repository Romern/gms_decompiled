package com.google.android.gms.photos.autobackup.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AutoBackupChimeraService extends Service {

    /* renamed from: a */
    public static final Set f82205a = Collections.unmodifiableSet(new HashSet(Arrays.asList("android.permission-group.STORAGE", "android.permission-group.PHONE")));

    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.photos.autobackup.service.START".equals(intent.getAction())) {
            return new ankg(this, this);
        }
        return null;
    }
}
