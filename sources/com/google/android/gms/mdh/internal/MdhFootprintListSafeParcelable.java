package com.google.android.gms.mdh.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MdhFootprintListSafeParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alcr(new afnm());

    /* renamed from: a */
    public final List f80015a;

    public MdhFootprintListSafeParcelable(List list) {
        this.f80015a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f80015a.equals(((MdhFootprintListSafeParcelable) obj).f80015a);
    }

    public final int hashCode() {
        List list = this.f80015a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f80015a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
        sb.append("MdhFootprintListSafeParcelable{mdhFootprints=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        alcr.m60863a(this, parcel, new afnl());
    }
}
