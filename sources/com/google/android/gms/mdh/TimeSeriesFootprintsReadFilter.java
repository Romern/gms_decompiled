package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TimeSeriesFootprintsReadFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aflf();

    /* renamed from: a */
    public final int f80008a;

    /* renamed from: b */
    public final Long f80009b;

    /* renamed from: c */
    public final Long f80010c;

    public TimeSeriesFootprintsReadFilter(int i, Long l, Long l2) {
        this.f80008a = i;
        this.f80010c = l2;
        this.f80009b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TimeSeriesFootprintsReadFilter timeSeriesFootprintsReadFilter = (TimeSeriesFootprintsReadFilter) obj;
            return sdg.m34949a(Integer.valueOf(this.f80008a), Integer.valueOf(timeSeriesFootprintsReadFilter.f80008a)) && sdg.m34949a(this.f80009b, timeSeriesFootprintsReadFilter.f80009b) && sdg.m34949a(this.f80010c, timeSeriesFootprintsReadFilter.f80010c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f80008a), this.f80009b, this.f80010c});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f80008a);
        see.m35045a(parcel, 2, this.f80009b);
        see.m35045a(parcel, 3, this.f80010c);
        see.m35062b(parcel, a);
    }
}
