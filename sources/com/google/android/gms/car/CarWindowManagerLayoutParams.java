package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CarWindowManagerLayoutParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new npl();

    /* renamed from: a */
    public int f29396a;

    public CarWindowManagerLayoutParams() {
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.f29396a == ((CarWindowManagerLayoutParams) obj).f29396a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f29396a;
    }

    public final String toString() {
        int i = this.f29396a;
        StringBuilder sb = new StringBuilder(59);
        sb.append("CarWindowManagerLayoutParams{windowLayoutFlags=");
        sb.append(i);
        sb.append('}');
        return sb.toString();
    }

    public CarWindowManagerLayoutParams(int i) {
        this.f29396a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f29396a);
        see.m35062b(parcel, a);
    }
}
