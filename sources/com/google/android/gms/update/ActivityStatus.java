package com.google.android.gms.update;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ActivityStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avjo();

    /* renamed from: a */
    public final boolean f109420a;

    /* renamed from: b */
    public final boolean f109421b;

    public ActivityStatus(boolean z, boolean z2) {
        this.f109420a = z;
        this.f109421b = z2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ActivityStatus) {
            ActivityStatus activityStatus = (ActivityStatus) obj;
            if (this.f109420a == activityStatus.f109420a && this.f109421b == activityStatus.f109421b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f109420a), Boolean.valueOf(this.f109421b)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("isUp", Boolean.valueOf(this.f109420a));
        a.mo25396a("isSetupWizard", Boolean.valueOf(this.f109421b));
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 1, this.f109420a);
        see.m35051a(parcel, 2, this.f109421b);
        see.m35062b(parcel, a);
    }
}
