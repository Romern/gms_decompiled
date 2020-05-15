package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RemoveListenerRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new axst();

    /* renamed from: a */
    final int f110961a;

    /* renamed from: b */
    public final axrv f110962b;

    public RemoveListenerRequest(int i, IBinder iBinder) {
        axrv axrv;
        this.f110961a = i;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            if (queryLocalInterface instanceof axrv) {
                axrv = (axrv) queryLocalInterface;
            } else {
                axrv = new axrt(iBinder);
            }
            this.f110962b = axrv;
            return;
        }
        this.f110962b = null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f110961a);
        axrv axrv = this.f110962b;
        if (axrv != null) {
            iBinder = axrv.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 2, iBinder);
        see.m35062b(parcel, a);
    }

    public RemoveListenerRequest(axrv axrv) {
        this.f110961a = 1;
        this.f110962b = axrv;
    }
}
