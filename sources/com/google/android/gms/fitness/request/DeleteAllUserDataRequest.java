package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeleteAllUserDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zep();

    /* renamed from: a */
    public final zcl f32255a;

    public DeleteAllUserDataRequest(IBinder iBinder) {
        zcl zcl;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            zcl = queryLocalInterface instanceof zcl ? (zcl) queryLocalInterface : new zcj(iBinder);
        } else {
            zcl = null;
        }
        this.f32255a = zcl;
    }

    public final String toString() {
        return String.format("DisableFitRequest", new Object[0]);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35038a(parcel, 1, this.f32255a.asBinder());
        see.m35062b(parcel, a);
    }

    public DeleteAllUserDataRequest(zcl zcl) {
        this.f32255a = zcl;
    }
}
