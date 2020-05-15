package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SleepSegmentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aeiu();

    /* renamed from: a */
    public final List f79393a;

    public SleepSegmentRequest(List list) {
        this.f79393a = list;
    }

    /* renamed from: a */
    public static SleepSegmentRequest m66874a() {
        return new SleepSegmentRequest(Arrays.asList(new UserPreferredSleepWindow(7, 0, 7, 0)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SleepSegmentRequest) {
            return sdg.m34949a(this.f79393a, ((SleepSegmentRequest) obj).f79393a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f79393a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 1, this.f79393a, false);
        see.m35062b(parcel, a);
    }
}
