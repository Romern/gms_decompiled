package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NetworkStateImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lrt();

    /* renamed from: a */
    public final int f11713a;

    /* renamed from: b */
    public final int f11714b;

    public NetworkStateImpl(int i, int i2) {
        this.f11713a = i;
        this.f11714b = i2;
    }

    public final String toString() {
        String num = Integer.toString(this.f11713a);
        String num2 = Integer.toString(this.f11714b);
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 41 + String.valueOf(num2).length());
        sb.append("ConnectionState = ");
        sb.append(num);
        sb.append(" NetworkMeteredState = ");
        sb.append(num2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f11713a);
        see.m35063b(parcel, 3, this.f11714b);
        see.m35062b(parcel, a);
    }
}
