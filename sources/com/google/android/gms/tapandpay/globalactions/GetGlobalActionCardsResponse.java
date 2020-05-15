package com.google.android.gms.tapandpay.globalactions;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetGlobalActionCardsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aspp();

    /* renamed from: a */
    public GlobalActionCard[] f108504a;

    /* renamed from: b */
    public int f108505b;

    public GetGlobalActionCardsResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetGlobalActionCardsResponse) {
            GetGlobalActionCardsResponse getGlobalActionCardsResponse = (GetGlobalActionCardsResponse) obj;
            return Arrays.equals(this.f108504a, getGlobalActionCardsResponse.f108504a) && sdg.m34949a(Integer.valueOf(this.f108505b), Integer.valueOf(getGlobalActionCardsResponse.f108505b));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f108504a)), Integer.valueOf(this.f108505b)});
    }

    public GetGlobalActionCardsResponse(GlobalActionCard[] globalActionCardArr, int i) {
        this.f108504a = globalActionCardArr;
        this.f108505b = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35057a(parcel, 1, this.f108504a, i);
        see.m35063b(parcel, 2, this.f108505b);
        see.m35062b(parcel, a);
    }
}
