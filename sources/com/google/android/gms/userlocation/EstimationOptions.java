package com.google.android.gms.userlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EstimationOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avvy();

    /* renamed from: a */
    public final boolean f109560a;

    /* renamed from: b */
    public final boolean f109561b;

    public EstimationOptions(boolean z, boolean z2) {
        this.f109560a = z;
        this.f109561b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EstimationOptions) {
            EstimationOptions estimationOptions = (EstimationOptions) obj;
            return estimationOptions.f109560a == this.f109560a && estimationOptions.f109561b == this.f109561b;
        }
    }

    public final int hashCode() {
        return (this.f109560a ? 1 : 0) + (!this.f109561b ? 0 : 2);
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("shouldEstimateDetails", Boolean.valueOf(this.f109560a));
        a.mo25396a("shouldProvidePlaceHierarchy", Boolean.valueOf(this.f109561b));
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 1, this.f109560a);
        see.m35051a(parcel, 2, this.f109561b);
        see.m35062b(parcel, a);
    }
}
