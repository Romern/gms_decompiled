package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetPayCardArtResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aldy();

    /* renamed from: a */
    public PayCardArt[] f81494a;

    private GetPayCardArtResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetPayCardArtResponse) {
            return Arrays.equals(this.f81494a, ((GetPayCardArtResponse) obj).f81494a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f81494a))});
    }

    public GetPayCardArtResponse(PayCardArt[] payCardArtArr) {
        this.f81494a = payCardArtArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35057a(parcel, 2, this.f81494a, i);
        see.m35062b(parcel, a);
    }
}
