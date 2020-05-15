package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TimeSeriesFootprintsSubscriptionFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aflg();

    /* renamed from: a */
    public final int f80011a;

    /* renamed from: b */
    public final Long f80012b;

    /* renamed from: c */
    public final Long f80013c;

    static {
        new TimeSeriesFootprintsSubscriptionFilter(0, null, null);
    }

    public TimeSeriesFootprintsSubscriptionFilter(int i, Long l, Long l2) {
        this.f80011a = i;
        this.f80013c = l2;
        this.f80012b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter = (TimeSeriesFootprintsSubscriptionFilter) obj;
            return sdg.m34949a(Integer.valueOf(this.f80011a), Integer.valueOf(timeSeriesFootprintsSubscriptionFilter.f80011a)) && sdg.m34949a(this.f80012b, timeSeriesFootprintsSubscriptionFilter.f80012b) && sdg.m34949a(this.f80013c, timeSeriesFootprintsSubscriptionFilter.f80013c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f80011a), this.f80012b, this.f80013c});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f80011a);
        see.m35045a(parcel, 2, this.f80012b);
        see.m35045a(parcel, 3, this.f80013c);
        see.m35062b(parcel, a);
    }
}
