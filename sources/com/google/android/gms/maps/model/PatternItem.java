package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PatternItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new afhi();

    /* renamed from: a */
    public final int f79913a;

    /* renamed from: b */
    public final Float f79914b;

    static {
        PatternItem.class.getSimpleName();
    }

    public PatternItem(int i, Float f) {
        boolean z = false;
        if (i == 1 || (f != null && f.floatValue() >= 0.0f)) {
            z = true;
        }
        String valueOf = String.valueOf(f);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
        sb.append("Invalid PatternItem: type=");
        sb.append(i);
        sb.append(" length=");
        sb.append(valueOf);
        sdo.m34975b(z, sb.toString());
        this.f79913a = i;
        this.f79914b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PatternItem) {
            PatternItem patternItem = (PatternItem) obj;
            return this.f79913a == patternItem.f79913a && sdg.m34949a(this.f79914b, patternItem.f79914b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f79913a), this.f79914b});
    }

    public final String toString() {
        int i = this.f79913a;
        String valueOf = String.valueOf(this.f79914b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append("[PatternItem: type=");
        sb.append(i);
        sb.append(" length=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f79913a);
        see.m35043a(parcel, 3, this.f79914b);
        see.m35062b(parcel, a);
    }
}
