package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NlpTestingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aeko();

    /* renamed from: a */
    public final long f79437a;

    public NlpTestingRequest(long j) {
        this.f79437a = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35036a(parcel, 1, this.f79437a);
        see.m35062b(parcel, a);
    }
}
