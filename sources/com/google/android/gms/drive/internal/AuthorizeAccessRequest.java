package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AuthorizeAccessRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new urg();

    /* renamed from: a */
    public final long f30807a;

    /* renamed from: b */
    public final DriveId f30808b;

    public AuthorizeAccessRequest(long j, DriveId driveId) {
        this.f30807a = j;
        this.f30808b = driveId;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35036a(parcel, 2, this.f30807a);
        see.m35040a(parcel, 3, this.f30808b, i, false);
        see.m35062b(parcel, a);
    }
}
