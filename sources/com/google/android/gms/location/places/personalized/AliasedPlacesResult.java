package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AliasedPlacesResult extends AbstractSafeParcelable implements rkk {
    public static final Parcelable.Creator CREATOR = new aeop();

    /* renamed from: a */
    public final Status f79580a;

    /* renamed from: b */
    public final List f79581b;

    public AliasedPlacesResult(Status status, List list) {
        this.f79580a = status;
        this.f79581b = list;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f79580a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f79580a, i, false);
        see.m35066c(parcel, 2, this.f79581b, false);
        see.m35062b(parcel, a);
    }
}
