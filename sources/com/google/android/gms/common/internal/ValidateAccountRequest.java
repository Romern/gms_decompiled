package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ValidateAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new sea();

    /* renamed from: a */
    final int f30253a;

    public ValidateAccountRequest(int i) {
        this.f30253a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f30253a);
        see.m35062b(parcel, a);
    }
}
