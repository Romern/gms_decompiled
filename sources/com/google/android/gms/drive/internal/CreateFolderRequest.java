package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CreateFolderRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new urq();

    /* renamed from: a */
    public final DriveId f30843a;

    /* renamed from: b */
    public final MetadataBundle f30844b;

    public CreateFolderRequest(DriveId driveId, MetadataBundle metadataBundle) {
        sdo.m34959a(driveId);
        this.f30843a = driveId;
        sdo.m34959a(metadataBundle);
        this.f30844b = metadataBundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f30843a, i, false);
        see.m35040a(parcel, 3, this.f30844b, i, false);
        see.m35062b(parcel, a);
    }
}
