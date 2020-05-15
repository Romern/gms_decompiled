package com.google.android.gms.car.display;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class CarRegionId extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new nzz();

    /* renamed from: a */
    public static final CarRegionId f29494a = new CarRegionId(0, CarDisplayId.f29492a);

    /* renamed from: b */
    public final int f29495b;

    /* renamed from: c */
    public final CarDisplayId f29496c;

    public CarRegionId(int i, CarDisplayId carDisplayId) {
        this.f29495b = i;
        this.f29496c = carDisplayId;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CarRegionId)) {
            return false;
        }
        CarRegionId carRegionId = (CarRegionId) obj;
        return this.f29496c.equals(carRegionId.f29496c) && carRegionId.f29495b == this.f29495b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f29495b), this.f29496c});
    }

    public final String toString() {
        int i = this.f29495b;
        String valueOf = String.valueOf(this.f29496c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("CarRegionId{regionId=");
        sb.append(i);
        sb.append(" carDisplayId=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f29495b);
        see.m35040a(parcel, 2, this.f29496c, i, false);
        see.m35062b(parcel, a);
    }
}
