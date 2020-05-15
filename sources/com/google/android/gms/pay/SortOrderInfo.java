package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SortOrderInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new algo();

    /* renamed from: a */
    public int f81609a;

    /* renamed from: b */
    public SortItem[] f81610b;

    public SortOrderInfo() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SortOrderInfo) {
            SortOrderInfo sortOrderInfo = (SortOrderInfo) obj;
            return sdg.m34949a(Integer.valueOf(this.f81609a), Integer.valueOf(sortOrderInfo.f81609a)) && Arrays.equals(this.f81610b, sortOrderInfo.f81610b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f81609a), Integer.valueOf(Arrays.hashCode(this.f81610b))});
    }

    public SortOrderInfo(int i, SortItem[] sortItemArr) {
        this.f81609a = i;
        this.f81610b = sortItemArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f81609a);
        see.m35057a(parcel, 2, this.f81610b, i);
        see.m35062b(parcel, a);
    }
}
