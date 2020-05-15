package com.google.android.gms.tapandpay.internal.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ReserveResourceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asyo();

    /* renamed from: a */
    public int f108549a;

    /* renamed from: b */
    public long f108550b;

    private ReserveResourceRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReserveResourceRequest) {
            ReserveResourceRequest reserveResourceRequest = (ReserveResourceRequest) obj;
            return sdg.m34949a(Integer.valueOf(this.f108549a), Integer.valueOf(reserveResourceRequest.f108549a)) && sdg.m34949a(Long.valueOf(this.f108550b), Long.valueOf(reserveResourceRequest.f108550b));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f108549a), Long.valueOf(this.f108550b)});
    }

    public ReserveResourceRequest(int i, long j) {
        this.f108549a = i;
        this.f108550b = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f108549a);
        see.m35036a(parcel, 2, this.f108550b);
        see.m35062b(parcel, a);
    }
}
