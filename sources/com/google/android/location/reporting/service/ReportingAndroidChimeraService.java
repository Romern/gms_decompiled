package com.google.android.location.reporting.service;

import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.chimera.Service;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ReportingAndroidChimeraService extends Service {

    /* renamed from: a */
    public bgye f150884a;

    /* renamed from: b */
    public bgyg f150885b;

    /* renamed from: c */
    private Future f150886c;

    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.location.reporting.service.START".equals(intent.getAction())) {
            return new bgxj(this, this);
        }
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        this.f150886c = new sny(1, 9).submit(new bgxi(this));
    }

    /* renamed from: a */
    public final void mo70903a() {
        try {
            this.f150886c.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RemoteException();
        }
    }
}
