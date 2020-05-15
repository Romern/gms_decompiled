package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DistanceImpl extends AbstractSafeParcelable implements aiwu {
    public static final Parcelable.Creator CREATOR = new ajbw();

    /* renamed from: a */
    final int f80728a;

    /* renamed from: b */
    public final int f80729b;

    /* renamed from: c */
    public final double f80730c;

    public DistanceImpl(double d) {
        this(1, 1, d);
    }

    /* renamed from: a */
    public final double mo38183a() {
        return this.f80730c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DistanceImpl) {
            DistanceImpl distanceImpl = (DistanceImpl) obj;
            return this.f80729b == distanceImpl.f80729b && compareTo(distanceImpl) == 0;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f80729b), Double.valueOf(this.f80730c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[2];
        objArr[0] = Double.valueOf(this.f80730c);
        objArr[1] = this.f80729b != 1 ? "UNKNOWN" : "LOW";
        return String.format(locale, "(%.1fm, %s)", objArr);
    }

    public DistanceImpl(int i, int i2, double d) {
        this.f80728a = i;
        this.f80729b = i2;
        this.f80730c = d;
    }

    /* renamed from: a */
    public final int compareTo(aiwu aiwu) {
        if (!Double.isNaN(this.f80730c) || !Double.isNaN(aiwu.mo38183a())) {
            return Double.compare(this.f80730c, aiwu.mo38183a());
        }
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f80728a);
        see.m35063b(parcel, 2, this.f80729b);
        see.m35033a(parcel, 3, this.f80730c);
        see.m35062b(parcel, a);
    }
}
