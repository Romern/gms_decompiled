package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ChangeResourceParentsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uri();

    /* renamed from: a */
    public final DriveId f30810a;

    /* renamed from: b */
    public final List f30811b;

    /* renamed from: c */
    public final List f30812c;

    public ChangeResourceParentsRequest(DriveId driveId, List list, List list2) {
        this.f30810a = driveId;
        this.f30811b = list;
        this.f30812c = list2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f30810a, i, false);
        see.m35066c(parcel, 3, this.f30811b, false);
        see.m35066c(parcel, 4, this.f30812c, false);
        see.m35062b(parcel, a);
    }
}
