package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class NetworkLocationStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aein();

    /* renamed from: a */
    public final int f79374a;

    /* renamed from: b */
    public final int f79375b;

    /* renamed from: c */
    public final long f79376c;

    /* renamed from: d */
    public final long f79377d;

    public NetworkLocationStatus(int i, int i2, long j, long j2) {
        this.f79374a = i;
        this.f79375b = i2;
        this.f79376c = j;
        this.f79377d = j2;
    }

    /* renamed from: a */
    public static NetworkLocationStatus m66872a(int i, int i2, long j, long j2) {
        return new NetworkLocationStatus(i, i2, j, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            NetworkLocationStatus networkLocationStatus = (NetworkLocationStatus) obj;
            return this.f79374a == networkLocationStatus.f79374a && this.f79375b == networkLocationStatus.f79375b && this.f79376c == networkLocationStatus.f79376c && this.f79377d == networkLocationStatus.f79377d;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f79375b), Integer.valueOf(this.f79374a), Long.valueOf(this.f79377d), Long.valueOf(this.f79376c)});
    }

    public final String toString() {
        return "NetworkLocationStatus:" + " Wifi status: " + this.f79374a + " Cell status: " + this.f79375b + " elapsed time NS: " + this.f79377d + " system time ms: " + this.f79376c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f79374a);
        see.m35063b(parcel, 2, this.f79375b);
        see.m35036a(parcel, 3, this.f79376c);
        see.m35036a(parcel, 4, this.f79377d);
        see.m35062b(parcel, a);
    }
}
