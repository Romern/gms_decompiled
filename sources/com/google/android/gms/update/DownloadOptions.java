package com.google.android.gms.update;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DownloadOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avjz();

    /* renamed from: a */
    public final boolean f109446a;

    /* renamed from: b */
    public final boolean f109447b;

    public DownloadOptions(boolean z, boolean z2) {
        this.f109446a = z;
        this.f109447b = z2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DownloadOptions) {
            DownloadOptions downloadOptions = (DownloadOptions) obj;
            if (this.f109446a == downloadOptions.f109446a && this.f109447b == downloadOptions.f109447b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f109446a), Boolean.valueOf(this.f109447b)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("ignoreNetworkCondition", Boolean.valueOf(this.f109446a));
        a.mo25396a("ignoreOffpeakWindow", Boolean.valueOf(this.f109447b));
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 1, this.f109446a);
        see.m35051a(parcel, 2, this.f109447b);
        see.m35062b(parcel, a);
    }
}
