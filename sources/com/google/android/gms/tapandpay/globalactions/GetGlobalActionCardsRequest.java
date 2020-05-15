package com.google.android.gms.tapandpay.globalactions;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetGlobalActionCardsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aspn();

    /* renamed from: a */
    public int f108501a;

    /* renamed from: b */
    public int f108502b;

    /* renamed from: c */
    public int f108503c;

    private GetGlobalActionCardsRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetGlobalActionCardsRequest) {
            GetGlobalActionCardsRequest getGlobalActionCardsRequest = (GetGlobalActionCardsRequest) obj;
            return sdg.m34949a(Integer.valueOf(this.f108501a), Integer.valueOf(getGlobalActionCardsRequest.f108501a)) && sdg.m34949a(Integer.valueOf(this.f108502b), Integer.valueOf(getGlobalActionCardsRequest.f108502b)) && sdg.m34949a(Integer.valueOf(this.f108503c), Integer.valueOf(getGlobalActionCardsRequest.f108503c));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f108501a), Integer.valueOf(this.f108502b), Integer.valueOf(this.f108503c)});
    }

    public GetGlobalActionCardsRequest(int i, int i2, int i3) {
        this.f108501a = i;
        this.f108502b = i2;
        this.f108503c = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f108501a);
        see.m35063b(parcel, 2, this.f108502b);
        see.m35063b(parcel, 3, this.f108503c);
        see.m35062b(parcel, a);
    }
}
