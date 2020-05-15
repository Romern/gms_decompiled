package com.google.android.gms.userlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CheckInResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avvx();

    /* renamed from: a */
    public final byte[][] f109559a;

    public CheckInResponse(byte[][] bArr) {
        this.f109559a = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35060a(parcel, 1, this.f109559a);
        see.m35062b(parcel, a);
    }
}
