package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ghs();

    /* renamed from: a */
    final int f9914a;

    /* renamed from: b */
    public final List f9915b;

    public AccountChangeEventsResponse(int i, List list) {
        this.f9914a = i;
        sdo.m34959a(list);
        this.f9915b = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f9914a);
        see.m35066c(parcel, 2, this.f9915b, false);
        see.m35062b(parcel, a);
    }

    public AccountChangeEventsResponse(List list) {
        this.f9914a = 1;
        sdo.m34959a(list);
        this.f9915b = list;
    }
}
