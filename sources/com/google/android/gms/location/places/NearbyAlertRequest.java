package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class NearbyAlertRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aelc();

    /* renamed from: a */
    public final int f79467a;

    /* renamed from: b */
    public final int f79468b;

    /* renamed from: c */
    public final NearbyAlertFilter f79469c;

    /* renamed from: d */
    public final boolean f79470d;

    /* renamed from: e */
    public final int f79471e;

    /* renamed from: f */
    public int f79472f = 110;

    public NearbyAlertRequest(int i, int i2, PlaceFilter placeFilter, NearbyAlertFilter nearbyAlertFilter, boolean z, int i3, int i4) {
        this.f79467a = i;
        this.f79468b = i2;
        if (nearbyAlertFilter != null) {
            this.f79469c = nearbyAlertFilter;
        } else {
            NearbyAlertFilter nearbyAlertFilter2 = null;
            if (placeFilter != null) {
                Set set = placeFilter.f79479g;
                if (set != null && !set.isEmpty()) {
                    nearbyAlertFilter2 = NearbyAlertFilter.m66906b(placeFilter.f79479g);
                } else {
                    Set set2 = placeFilter.f79477e;
                    if (set2 != null && !set2.isEmpty()) {
                        nearbyAlertFilter2 = NearbyAlertFilter.m66907c(placeFilter.f79477e);
                    }
                    this.f79469c = nearbyAlertFilter2;
                }
            }
            this.f79469c = nearbyAlertFilter2;
        }
        this.f79470d = z;
        this.f79471e = i3;
        this.f79472f = i4;
    }

    /* renamed from: a */
    public static NearbyAlertRequest m66910a(NearbyAlertFilter nearbyAlertFilter, int i) {
        return m66911a(nearbyAlertFilter, i, 110);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NearbyAlertRequest) {
            NearbyAlertRequest nearbyAlertRequest = (NearbyAlertRequest) obj;
            return this.f79467a == nearbyAlertRequest.f79467a && this.f79468b == nearbyAlertRequest.f79468b && sdg.m34949a(this.f79469c, nearbyAlertRequest.f79469c) && this.f79472f == nearbyAlertRequest.f79472f && this.f79471e == nearbyAlertRequest.f79471e;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f79467a), Integer.valueOf(this.f79468b), this.f79469c, Integer.valueOf(this.f79472f), Integer.valueOf(this.f79471e)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("transitionTypes", Integer.valueOf(this.f79467a));
        a.mo25396a("loiteringTimeMillis", Integer.valueOf(this.f79468b));
        a.mo25396a("nearbyAlertFilter", this.f79469c);
        a.mo25396a("priority", Integer.valueOf(this.f79472f));
        a.mo25396a("radiusType", Integer.valueOf(this.f79471e));
        return a.toString();
    }

    /* renamed from: a */
    public static NearbyAlertRequest m66911a(NearbyAlertFilter nearbyAlertFilter, int i, int i2) {
        return new NearbyAlertRequest(3, -1, null, nearbyAlertFilter, false, i, i2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f79467a);
        see.m35063b(parcel, 2, this.f79468b);
        see.m35040a(parcel, 3, null, i, false);
        see.m35040a(parcel, 4, this.f79469c, i, false);
        see.m35051a(parcel, 5, this.f79470d);
        see.m35063b(parcel, 6, this.f79471e);
        see.m35063b(parcel, 7, this.f79472f);
        see.m35062b(parcel, a);
    }
}
