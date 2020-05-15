package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UpdateMetadataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uvb();

    /* renamed from: a */
    public final DriveId f30927a;

    /* renamed from: b */
    public final MetadataBundle f30928b;

    public UpdateMetadataRequest(DriveId driveId, MetadataBundle metadataBundle) {
        this.f30927a = driveId;
        this.f30928b = metadataBundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f30927a, i, false);
        see.m35040a(parcel, 3, this.f30928b, i, false);
        see.m35062b(parcel, a);
    }
}
