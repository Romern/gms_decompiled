package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DebugInfoRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zer();

    /* renamed from: a */
    public final zbc f32254a;

    public DebugInfoRequest(IBinder iBinder) {
        zbc zbc;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDebugInfoCallback");
            zbc = queryLocalInterface instanceof zbc ? (zbc) queryLocalInterface : new zbc(iBinder);
        } else {
            zbc = null;
        }
        this.f32254a = zbc;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35038a(parcel, 1, this.f32254a.f12819a);
        see.m35062b(parcel, a);
    }
}
