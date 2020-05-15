package com.google.android.gms.car.display;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class CarDisplayId extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new nzy();

    /* renamed from: a */
    public static final CarDisplayId f29492a = new CarDisplayId(0);

    /* renamed from: b */
    public final int f29493b;

    public CarDisplayId(int i) {
        this.f29493b = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof CarDisplayId) && ((CarDisplayId) obj).f29493b == this.f29493b;
        }
        return true;
    }

    public final int hashCode() {
        return this.f29493b;
    }

    public final String toString() {
        int i = this.f29493b;
        StringBuilder sb = new StringBuilder(35);
        sb.append("CarDisplayId{displayId=");
        sb.append(i);
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f29493b);
        see.m35062b(parcel, a);
    }
}
