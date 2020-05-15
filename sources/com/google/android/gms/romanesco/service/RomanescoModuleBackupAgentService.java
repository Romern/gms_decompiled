package com.google.android.gms.romanesco.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RomanescoModuleBackupAgentService extends BoundService {

    /* renamed from: a */
    public static final aoyh f107313a = aoyh.m69805a("RomanescoBackupService");

    public final IBinder onBind(Intent intent) {
        return new lul(this);
    }
}
