package com.google.android.gms.userlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class UserLocationNearbyAlertRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avxb();

    /* renamed from: a */
    public final int f109592a;

    /* renamed from: b */
    public final int f109593b;

    /* renamed from: c */
    public final UserLocationNearbyAlertFilter f109594c;

    /* renamed from: d */
    public final boolean f109595d;

    /* renamed from: e */
    public final int f109596e;

    /* renamed from: f */
    public final int f109597f;

    public UserLocationNearbyAlertRequest(int i, int i2, UserLocationNearbyAlertFilter userLocationNearbyAlertFilter, boolean z, int i3, int i4) {
        this.f109592a = i;
        this.f109593b = i2;
        if (userLocationNearbyAlertFilter != null) {
            this.f109594c = userLocationNearbyAlertFilter;
        } else {
            this.f109594c = null;
        }
        this.f109595d = z;
        this.f109596e = i3;
        this.f109597f = i4;
    }

    /* renamed from: a */
    public static UserLocationNearbyAlertRequest m93775a(int i, UserLocationNearbyAlertFilter userLocationNearbyAlertFilter, int i2, boolean z, int i3, int i4) {
        return new UserLocationNearbyAlertRequest(i, i2, userLocationNearbyAlertFilter, z, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserLocationNearbyAlertRequest) {
            UserLocationNearbyAlertRequest userLocationNearbyAlertRequest = (UserLocationNearbyAlertRequest) obj;
            return this.f109592a == userLocationNearbyAlertRequest.f109592a && this.f109593b == userLocationNearbyAlertRequest.f109593b && sdg.m34949a(this.f109594c, userLocationNearbyAlertRequest.f109594c) && this.f109597f == userLocationNearbyAlertRequest.f109597f && this.f109596e == userLocationNearbyAlertRequest.f109596e;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f109592a), Integer.valueOf(this.f109593b), this.f109594c, Integer.valueOf(this.f109597f), Integer.valueOf(this.f109596e)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("transitionTypes", Integer.valueOf(this.f109592a));
        a.mo25396a("loiteringTimeMillis", Integer.valueOf(this.f109593b));
        a.mo25396a("filter", this.f109594c);
        a.mo25396a("priority", Integer.valueOf(this.f109597f));
        a.mo25396a("radiusType", Integer.valueOf(this.f109596e));
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f109592a);
        see.m35063b(parcel, 2, this.f109593b);
        see.m35040a(parcel, 4, this.f109594c, i, false);
        see.m35051a(parcel, 5, this.f109595d);
        see.m35063b(parcel, 6, this.f109596e);
        see.m35063b(parcel, 7, this.f109597f);
        see.m35062b(parcel, a);
    }
}
