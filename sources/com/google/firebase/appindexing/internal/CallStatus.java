package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CallStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new brih();

    /* renamed from: a */
    public static final CallStatus f152354a = new CallStatus(1);

    /* renamed from: b */
    public static final CallStatus f152355b = new CallStatus(2);

    /* renamed from: c */
    public static final CallStatus f152356c = new CallStatus(3);

    /* renamed from: d */
    public final int f152357d;

    public CallStatus(int i) {
        this.f152357d = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f152357d);
        see.m35062b(parcel, a);
    }
}
