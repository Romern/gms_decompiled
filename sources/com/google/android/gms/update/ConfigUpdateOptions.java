package com.google.android.gms.update;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConfigUpdateOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avjy();

    /* renamed from: a */
    public final boolean f109445a;

    public ConfigUpdateOptions(boolean z) {
        this.f109445a = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConfigUpdateOptions) || this.f109445a != ((ConfigUpdateOptions) obj).f109445a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f109445a)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("userInitiated", Boolean.valueOf(this.f109445a));
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 1, this.f109445a);
        see.m35062b(parcel, a);
    }
}
