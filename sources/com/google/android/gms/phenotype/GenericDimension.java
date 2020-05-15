package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GenericDimension extends AbstractSafeParcelable implements Comparable {
    public static final Parcelable.Creator CREATOR = new aned();

    /* renamed from: a */
    public final int f82113a;

    /* renamed from: b */
    public final int f82114b;

    public GenericDimension(int i, int i2) {
        this.f82113a = i;
        this.f82114b = i2;
    }

    /* renamed from: a */
    public static int[] m68244a(GenericDimension... genericDimensionArr) {
        int length = genericDimensionArr.length;
        int[] iArr = new int[(length + length)];
        int i = 0;
        for (GenericDimension genericDimension : genericDimensionArr) {
            iArr[i] = genericDimension.f82113a;
            iArr[i + 1] = genericDimension.f82114b;
            i += 2;
        }
        return iArr;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericDimension) && compareTo((GenericDimension) obj) == 0;
    }

    public final int hashCode() {
        return (this.f82113a * 31) + this.f82114b;
    }

    public final String toString() {
        return "GenericDimension" + "(" + this.f82113a + ", " + this.f82114b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f82113a);
        see.m35063b(parcel, 2, this.f82114b);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final int compareTo(GenericDimension genericDimension) {
        int i = this.f82113a;
        int i2 = genericDimension.f82113a;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = this.f82114b;
        int i4 = genericDimension.f82114b;
        if (i3 < i4) {
            return -1;
        }
        if (i3 <= i4) {
            return 0;
        }
        return 1;
    }
}
