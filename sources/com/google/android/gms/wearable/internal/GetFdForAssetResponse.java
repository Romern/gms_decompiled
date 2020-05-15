package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetFdForAssetResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new axrn();

    /* renamed from: a */
    public final int f110942a;

    /* renamed from: b */
    public final ParcelFileDescriptor f110943b;

    public GetFdForAssetResponse(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.f110942a = i;
        this.f110943b = parcelFileDescriptor;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f110942a);
        see.m35040a(parcel, 3, this.f110943b, i | 1, false);
        see.m35062b(parcel, a);
    }
}
