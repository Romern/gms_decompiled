package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class StreetViewSource extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new afho();

    /* renamed from: a */
    public static final StreetViewSource f79942a = new StreetViewSource(0);

    /* renamed from: b */
    public final int f79943b;

    static {
        StreetViewSource.class.getSimpleName();
        new StreetViewSource(1);
    }

    public StreetViewSource(int i) {
        this.f79943b = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof StreetViewSource) && this.f79943b == ((StreetViewSource) obj).f79943b;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f79943b)});
    }

    public final String toString() {
        String str;
        int i = this.f79943b;
        if (i == 0) {
            str = "DEFAULT";
        } else if (i != 1) {
            str = String.format("UNKNOWN(%s)", Integer.valueOf(i));
        } else {
            str = "OUTDOOR";
        }
        return String.format("StreetViewSource:%s", str);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f79943b);
        see.m35062b(parcel, a);
    }
}
