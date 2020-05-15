package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LatestFootprintFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new afkq();

    /* renamed from: b */
    private static final byte[] f79981b = new byte[0];

    /* renamed from: a */
    public final List f79982a;

    static {
        afkp afkp = new afkp();
        afkp.mo34926a(f79981b, 2);
        afkp.mo34925a();
        new afkp().mo34925a();
    }

    public LatestFootprintFilter(List list) {
        this.f79982a = list;
    }

    /* renamed from: a */
    public static afkp m67177a() {
        return new afkp();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return sdg.m34949a(this.f79982a, ((LatestFootprintFilter) obj).f79982a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f79982a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 1, this.f79982a, false);
        see.m35062b(parcel, a);
    }
}
