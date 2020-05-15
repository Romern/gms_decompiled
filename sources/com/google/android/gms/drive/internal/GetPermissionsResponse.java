package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetPermissionsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uti();

    /* renamed from: a */
    final List f30860a;

    /* renamed from: b */
    final int f30861b;

    public GetPermissionsResponse(List list, int i) {
        this.f30860a = list;
        this.f30861b = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 2, this.f30860a, false);
        see.m35063b(parcel, 3, this.f30861b);
        see.m35062b(parcel, a);
    }
}
