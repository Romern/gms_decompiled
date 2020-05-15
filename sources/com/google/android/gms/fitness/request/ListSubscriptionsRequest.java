package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataType;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ListSubscriptionsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zey();

    /* renamed from: a */
    public final DataType f32265a;

    /* renamed from: b */
    public final zce f32266b;

    public ListSubscriptionsRequest(DataType dataType, IBinder iBinder) {
        zce zce;
        this.f32265a = dataType;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IListSubscriptionsCallback");
            zce = queryLocalInterface instanceof zce ? (zce) queryLocalInterface : new zce(iBinder);
        } else {
            zce = null;
        }
        this.f32266b = zce;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f32265a, i, false);
        zce zce = this.f32266b;
        if (zce != null) {
            iBinder = zce.f12819a;
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 2, iBinder);
        see.m35062b(parcel, a);
    }

    public ListSubscriptionsRequest(DataType dataType, zce zce) {
        this.f32265a = dataType;
        this.f32266b = zce;
    }
}
