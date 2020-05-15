package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AppMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ahhw();

    /* renamed from: a */
    public final List f80456a;

    public AppMetadata(List list) {
        sdo.m34966a(list, "Must specify application identifiers");
        this.f80456a = list;
        sdo.m34962a(list.size(), "Application identifiers cannot be empty");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 1, this.f80456a, false);
        see.m35062b(parcel, a);
    }
}
