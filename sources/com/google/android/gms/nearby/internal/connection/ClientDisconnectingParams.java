package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ClientDisconnectingParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C1601aidl();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ClientDisconnectingParams);
    }

    public final int hashCode() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        see.m35062b(parcel, see.m35030a(parcel));
    }
}
