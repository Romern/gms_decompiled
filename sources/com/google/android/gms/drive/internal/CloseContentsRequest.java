package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.Contents;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CloseContentsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new url();

    /* renamed from: a */
    public final Contents f30823a;

    /* renamed from: b */
    public final Boolean f30824b;

    /* renamed from: c */
    public final int f30825c;

    public CloseContentsRequest(Contents contents, Boolean bool, int i) {
        this.f30823a = contents;
        this.f30824b = bool;
        this.f30825c = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f30823a, i, false);
        see.m35041a(parcel, 3, this.f30824b);
        see.m35063b(parcel, 4, this.f30825c);
        see.m35062b(parcel, a);
    }
}
