package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetStoredDataSourcesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zet();

    /* renamed from: a */
    public final zba f32258a;

    public GetStoredDataSourcesRequest(IBinder iBinder) {
        zba zba;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDataSourcesCallback");
            zba = queryLocalInterface instanceof zba ? (zba) queryLocalInterface : new zay(iBinder);
        } else {
            zba = null;
        }
        this.f32258a = zba;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35038a(parcel, 1, this.f32258a.asBinder());
        see.m35062b(parcel, a);
    }

    public GetStoredDataSourcesRequest(zba zba) {
        this.f32258a = zba;
    }
}
