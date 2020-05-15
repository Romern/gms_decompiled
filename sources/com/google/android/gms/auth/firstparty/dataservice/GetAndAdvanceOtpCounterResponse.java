package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetAndAdvanceOtpCounterResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new iwr();

    /* renamed from: a */
    final int f10626a;

    /* renamed from: b */
    public final Long f10627b;

    public GetAndAdvanceOtpCounterResponse(int i, Long l) {
        this.f10626a = i;
        this.f10627b = l;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f10626a);
        see.m35045a(parcel, 2, this.f10627b);
        see.m35062b(parcel, a);
    }
}
