package com.google.android.gms.ads.measurement.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.ads.measurement.internal.b */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class C0741b extends dck implements C0742c {
    public C0741b() {
        super("com.google.android.gms.ads.measurement.internal.IGmpMeasurementReporterCreator");
    }

    public static C0742c asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.internal.IGmpMeasurementReporterCreator");
        if (queryLocalInterface instanceof C0742c) {
            return (C0742c) queryLocalInterface;
        }
        return new C0740a(iBinder);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        vzr vzr;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            vzr = queryLocalInterface instanceof vzr ? (vzr) queryLocalInterface : new vzp(readStrongBinder);
        } else {
            vzr = null;
        }
        IBinder newGmpMeasurementReporter = newGmpMeasurementReporter(vzr);
        parcel2.writeNoException();
        parcel2.writeStrongBinder(newGmpMeasurementReporter);
        return true;
    }
}
