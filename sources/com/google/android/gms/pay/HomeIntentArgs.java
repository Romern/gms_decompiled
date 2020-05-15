package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class HomeIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aler();

    /* renamed from: a */
    public boolean f81525a;

    /* renamed from: b */
    public IntentSource f81526b;

    public HomeIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HomeIntentArgs) {
            HomeIntentArgs homeIntentArgs = (HomeIntentArgs) obj;
            return sdg.m34949a(Boolean.valueOf(this.f81525a), Boolean.valueOf(homeIntentArgs.f81525a)) && sdg.m34949a(this.f81526b, homeIntentArgs.f81526b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f81525a), this.f81526b});
    }

    public HomeIntentArgs(boolean z, IntentSource intentSource) {
        this.f81525a = z;
        this.f81526b = intentSource;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 1, this.f81525a);
        see.m35040a(parcel, 2, this.f81526b, i, false);
        see.m35062b(parcel, a);
    }
}
