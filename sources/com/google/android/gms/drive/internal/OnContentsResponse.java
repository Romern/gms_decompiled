package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.Contents;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OnContentsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uty();

    /* renamed from: a */
    public final Contents f30872a;

    /* renamed from: b */
    final boolean f30873b;

    public OnContentsResponse(Contents contents, boolean z) {
        this.f30872a = contents;
        this.f30873b = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f30872a, i, false);
        see.m35051a(parcel, 3, this.f30873b);
        see.m35062b(parcel, a);
    }
}
