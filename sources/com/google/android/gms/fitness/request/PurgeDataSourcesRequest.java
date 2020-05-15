package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PurgeDataSourcesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zez();

    /* renamed from: a */
    public final zcl f32267a;

    /* renamed from: b */
    public final List f32268b;

    public PurgeDataSourcesRequest(IBinder iBinder, List list) {
        zcl zcl;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            zcl = queryLocalInterface instanceof zcl ? (zcl) queryLocalInterface : new zcj(iBinder);
        } else {
            zcl = null;
        }
        this.f32267a = zcl;
        this.f32268b = list == null ? Collections.emptyList() : list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35038a(parcel, 1, this.f32267a.asBinder());
        see.m35065b(parcel, 3, this.f32268b, false);
        see.m35062b(parcel, a);
    }

    public PurgeDataSourcesRequest(zcl zcl, List list) {
        this.f32267a = zcl;
        this.f32268b = list;
    }
}
