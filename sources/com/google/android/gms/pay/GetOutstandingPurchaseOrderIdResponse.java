package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetOutstandingPurchaseOrderIdResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aldv();

    /* renamed from: a */
    public long f81491a;

    private GetOutstandingPurchaseOrderIdResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetOutstandingPurchaseOrderIdResponse) {
            return sdg.m34949a(Long.valueOf(this.f81491a), Long.valueOf(((GetOutstandingPurchaseOrderIdResponse) obj).f81491a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f81491a)});
    }

    public GetOutstandingPurchaseOrderIdResponse(long j) {
        this.f81491a = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35036a(parcel, 1, this.f81491a);
        see.m35062b(parcel, a);
    }
}
