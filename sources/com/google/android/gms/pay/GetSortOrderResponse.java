package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetSortOrderResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aleh();

    /* renamed from: a */
    public SortOrderInfo f81510a;

    private GetSortOrderResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetSortOrderResponse) {
            return sdg.m34949a(this.f81510a, ((GetSortOrderResponse) obj).f81510a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81510a});
    }

    public GetSortOrderResponse(SortOrderInfo sortOrderInfo) {
        this.f81510a = sortOrderInfo;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81510a, i, false);
        see.m35062b(parcel, a);
    }
}
