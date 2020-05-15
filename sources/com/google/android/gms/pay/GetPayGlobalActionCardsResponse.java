package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetPayGlobalActionCardsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aleb();

    /* renamed from: a */
    public PayGlobalActionCard[] f81499a;

    /* renamed from: b */
    public int f81500b;

    private GetPayGlobalActionCardsResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetPayGlobalActionCardsResponse) {
            GetPayGlobalActionCardsResponse getPayGlobalActionCardsResponse = (GetPayGlobalActionCardsResponse) obj;
            return Arrays.equals(this.f81499a, getPayGlobalActionCardsResponse.f81499a) && sdg.m34949a(Integer.valueOf(this.f81500b), Integer.valueOf(getPayGlobalActionCardsResponse.f81500b));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f81499a)), Integer.valueOf(this.f81500b)});
    }

    public GetPayGlobalActionCardsResponse(PayGlobalActionCard[] payGlobalActionCardArr, int i) {
        this.f81499a = payGlobalActionCardArr;
        this.f81500b = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35057a(parcel, 1, this.f81499a, i);
        see.m35063b(parcel, 2, this.f81500b);
        see.m35062b(parcel, a);
    }
}
