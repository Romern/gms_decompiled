package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aehx();
    @Deprecated

    /* renamed from: a */
    public int f79344a;
    @Deprecated

    /* renamed from: b */
    public int f79345b;

    /* renamed from: c */
    public long f79346c;

    /* renamed from: d */
    public int f79347d;

    /* renamed from: e */
    public NetworkLocationStatus[] f79348e;

    public LocationAvailability(int i, int i2, int i3, long j, NetworkLocationStatus[] networkLocationStatusArr) {
        this.f79347d = i;
        this.f79344a = i2;
        this.f79345b = i3;
        this.f79346c = j;
        this.f79348e = networkLocationStatusArr;
    }

    /* renamed from: a */
    public static LocationAvailability m66850a(int i, int i2, int i3, long j) {
        return new LocationAvailability(i, i2, i3, j, null);
    }

    /* renamed from: b */
    public static LocationAvailability m66852b(Intent intent) {
        if (m66851a(intent)) {
            try {
                return (LocationAvailability) intent.getExtras().getParcelable("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
            } catch (ClassCastException e) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo43544a() {
        return this.f79347d < 1000;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            return this.f79344a == locationAvailability.f79344a && this.f79345b == locationAvailability.f79345b && this.f79346c == locationAvailability.f79346c && this.f79347d == locationAvailability.f79347d && Arrays.equals(this.f79348e, locationAvailability.f79348e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f79347d), Integer.valueOf(this.f79344a), Integer.valueOf(this.f79345b), Long.valueOf(this.f79346c), this.f79348e});
    }

    public final String toString() {
        boolean a = mo43544a();
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(a);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m66851a(Intent intent) {
        if (intent != null) {
            return intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f79344a);
        see.m35063b(parcel, 2, this.f79345b);
        see.m35036a(parcel, 3, this.f79346c);
        see.m35063b(parcel, 4, this.f79347d);
        see.m35057a(parcel, 5, this.f79348e, i);
        see.m35062b(parcel, a);
    }
}
