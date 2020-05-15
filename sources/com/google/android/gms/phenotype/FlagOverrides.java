package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FlagOverrides extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new anec();

    /* renamed from: a */
    public final List f82112a;

    public FlagOverrides(List list) {
        this.f82112a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FlagOverrides) {
            return this.f82112a.equals(((FlagOverrides) obj).f82112a);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlagOverrides(");
        List list = this.f82112a;
        int size = list.size();
        boolean z = true;
        int i = 0;
        while (i < size) {
            FlagOverride flagOverride = (FlagOverride) list.get(i);
            if (!z) {
                sb.append(", ");
            }
            flagOverride.mo46508a(sb);
            i++;
            z = false;
        }
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 2, this.f82112a, false);
        see.m35062b(parcel, a);
    }
}
