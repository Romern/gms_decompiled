package com.google.android.gms.trustagent.common.service;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PreferenceChimeraService extends Service {

    /* renamed from: a */
    public static final aumh f109153a = new auoc();

    /* renamed from: b */
    public SharedPreferences f109154b;

    /* renamed from: c */
    private final auoa f109155c = new auoa(this);

    public final IBinder onBind(Intent intent) {
        return this.f109155c;
    }

    public final void onCreate() {
        super.onCreate();
        this.f109154b = aupo.m77578a(rpr.m34216b());
    }
}
