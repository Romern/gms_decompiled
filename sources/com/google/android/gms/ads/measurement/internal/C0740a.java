package com.google.android.gms.ads.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.ads.measurement.internal.a */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0740a extends dcj implements C0742c {
    public C0740a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.internal.IGmpMeasurementReporterCreator");
    }

    public final IBinder newGmpMeasurementReporter(vzr vzr) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, vzr);
        Parcel a = mo8526a(1, bj);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
