package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetSecurityParamsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asnx();

    /* renamed from: a */
    boolean f108380a;

    /* renamed from: b */
    boolean f108381b;

    public GetSecurityParamsResponse(boolean z, boolean z2) {
        this.f108380a = z;
        this.f108381b = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 2, this.f108380a);
        see.m35051a(parcel, 3, this.f108381b);
        see.m35062b(parcel, a);
    }
}
