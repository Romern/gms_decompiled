package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MdhBroadcastListenerParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new afks();

    /* renamed from: a */
    public final LatestFootprintFilter f79986a;

    public MdhBroadcastListenerParams(LatestFootprintFilter latestFootprintFilter) {
        this.f79986a = latestFootprintFilter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return sdg.m34949a(this.f79986a, ((MdhBroadcastListenerParams) obj).f79986a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f79986a});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f79986a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
        sb.append("MdhBroadcastListenerParams{latestFootprintFilter=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f79986a, i, false);
        see.m35062b(parcel, a);
    }
}
