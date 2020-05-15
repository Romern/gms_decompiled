package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.ChangeSequenceNumber;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetChangesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ute();

    /* renamed from: a */
    public final ChangeSequenceNumber f30851a;

    /* renamed from: b */
    public final int f30852b;

    /* renamed from: c */
    public final List f30853c;

    /* renamed from: d */
    public final boolean f30854d;

    public GetChangesRequest(ChangeSequenceNumber changeSequenceNumber, int i, List list, boolean z) {
        this.f30851a = changeSequenceNumber;
        this.f30852b = i;
        this.f30853c = list;
        this.f30854d = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f30851a, i, false);
        see.m35063b(parcel, 3, this.f30852b);
        see.m35066c(parcel, 4, this.f30853c, false);
        see.m35051a(parcel, 5, this.f30854d);
        see.m35062b(parcel, a);
    }
}
