package com.google.android.gms.ads.settings.internal;

import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: com.google.android.gms.ads.settings.internal.c */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0882c extends aeaa {

    /* renamed from: a */
    private final Context f9439a;

    /* renamed from: b */
    private final C0880a f9440b;

    public C0882c(Context context, C0880a aVar) {
        super("ads");
        this.f9439a = context;
        this.f9440b = aVar;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        bhpr bhpr;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.nfcprovision.ISchoolOwnedService");
            bhpr = queryLocalInterface instanceof bhpr ? (bhpr) queryLocalInterface : new bhpr(iBinder);
        } else {
            bhpr = null;
        }
        boolean z = false;
        try {
            Parcel a = bhpr.mo8526a(1, bhpr.mo8529bj());
            z = dcl.m8167a(a);
            a.recycle();
        } catch (RemoteException e) {
            Log.w("EduDeviceHelper", "Error calling school-ownership service; assume it's not school-owned.");
            Log.w("EduDeviceHelper", e);
        } finally {
            skh.m35531a().mo25689a(this.f9439a, this);
            this.f9440b.mo7117a(z);
        }
    }
}
