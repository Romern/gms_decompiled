package com.google.android.gms.ads.identifier.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.ads.identifier.internal.C0274a;
import com.google.android.gms.ads.identifier.settings.C0287e;
import java.util.concurrent.Semaphore;

/* renamed from: com.google.android.gms.ads.identifier.service.a */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0278a extends aeaa {

    /* renamed from: a */
    public final String f8000a;

    /* renamed from: b */
    public final Intent f8001b;

    /* renamed from: c */
    public final Context f8002c;

    /* renamed from: d */
    public final Semaphore f8003d;

    /* renamed from: e */
    private final C0287e f8004e;

    public C0278a(String str, C0287e eVar, Context context, Semaphore semaphore) {
        super("ads");
        this.f8000a = str;
        this.f8001b = new Intent("com.google.android.gms.ads.identifier.BIND_LISTENER").setPackage(str);
        this.f8004e = eVar;
        this.f8002c = context;
        this.f8003d = semaphore;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        this.f8003d.release();
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        C0274a aVar;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdListener");
            aVar = queryLocalInterface instanceof C0274a ? (C0274a) queryLocalInterface : new C0274a(iBinder);
        } else {
            aVar = null;
        }
        try {
            String valueOf = String.valueOf(this.f8000a);
            Log.d("AdvertisingIdNS", valueOf.length() == 0 ? new String("Notifying advertising info update event for package ") : "Notifying advertising info update event for package ".concat(valueOf));
            Bundle bundle = new Bundle();
            bundle.putString("ad_id", this.f8004e.mo6512c());
            bundle.putBoolean("lat_enabled", this.f8004e.mo6518i());
            Parcel bj = aVar.mo8529bj();
            dcl.m8165a(bj, bundle);
            aVar.mo8530c(1, bj);
        } catch (Throwable th) {
            String str = this.f8000a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38);
            sb.append("Failed to notify listener service of ");
            sb.append(str);
            sb.append(".");
            Log.w("AdvertisingIdNS", sb.toString());
            Log.w("AdvertisingIdNS", th);
        }
        try {
            skh.m35531a().mo25689a(this.f8002c, this);
        } catch (IllegalArgumentException e) {
        }
        this.f8003d.release();
    }
}
