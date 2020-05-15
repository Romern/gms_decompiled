package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class DataChangeListenerType extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alcz();

    /* renamed from: a */
    public int f81455a;

    private DataChangeListenerType() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DataChangeListenerType) {
            return sdg.m34949a(Integer.valueOf(this.f81455a), Integer.valueOf(((DataChangeListenerType) obj).f81455a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f81455a)});
    }

    public DataChangeListenerType(int i) {
        this.f81455a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f81455a);
        see.m35062b(parcel, a);
    }
}
