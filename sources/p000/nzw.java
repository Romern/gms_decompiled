package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: nzw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nzw extends dcj implements IInterface {
    public nzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.diagnostics.IDataCollectedCallback");
    }

    /* renamed from: a */
    public final void mo21878a(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, parcelFileDescriptor);
        mo8530c(1, bj);
    }
}
