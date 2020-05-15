package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MdhFootprintsReadResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alcr(new afkv());

    /* renamed from: a */
    public final List f79990a;

    /* renamed from: b */
    public final SyncStatus f79991b;

    public MdhFootprintsReadResult(List list, SyncStatus syncStatus) {
        this.f79990a = list;
        this.f79991b = syncStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MdhFootprintsReadResult mdhFootprintsReadResult = (MdhFootprintsReadResult) obj;
            return sdg.m34949a(this.f79990a, mdhFootprintsReadResult.f79990a) && sdg.m34949a(this.f79991b, mdhFootprintsReadResult.f79991b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f79990a, this.f79991b});
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "MdhFootprintsReadResult{mdhFootprints=%s, syncStatus=%s}", this.f79990a, this.f79991b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        alcr.m60863a(this, parcel, new afku(i));
    }
}
