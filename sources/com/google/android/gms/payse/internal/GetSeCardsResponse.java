package com.google.android.gms.payse.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.payse.SecureElementStoredValue;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetSeCardsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alki();

    /* renamed from: a */
    public SecureElementStoredValue[] f81693a;

    public GetSeCardsResponse(SecureElementStoredValue[] secureElementStoredValueArr) {
        this.f81693a = secureElementStoredValueArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35057a(parcel, 1, this.f81693a, i);
        see.m35062b(parcel, a);
    }
}
