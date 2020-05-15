package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class RawDataSet extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new yxm();

    /* renamed from: a */
    public final int f32163a;

    /* renamed from: b */
    public final List f32164b;

    /* renamed from: c */
    public final boolean f32165c;

    public RawDataSet(int i, List list, boolean z) {
        this.f32163a = i;
        this.f32164b = list;
        this.f32165c = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RawDataSet) {
            RawDataSet rawDataSet = (RawDataSet) obj;
            return this.f32163a == rawDataSet.f32163a && this.f32165c == rawDataSet.f32165c && sdg.m34949a(this.f32164b, rawDataSet.f32164b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f32163a)});
    }

    public final String toString() {
        return String.format("RawDataSet{%s@[%s]}", Integer.valueOf(this.f32163a), this.f32164b);
    }

    public RawDataSet(DataSet dataSet, List list) {
        this.f32164b = dataSet.mo18902a(list);
        this.f32165c = dataSet.f32001d;
        this.f32163a = yue.m44849a(dataSet.f31999b, list);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f32163a);
        see.m35066c(parcel, 3, this.f32164b, false);
        see.m35051a(parcel, 4, this.f32165c);
        see.m35062b(parcel, a);
    }
}
