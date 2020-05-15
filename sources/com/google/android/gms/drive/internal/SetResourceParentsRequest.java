package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SetResourceParentsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uuu();

    /* renamed from: a */
    public final DriveId f30920a;

    /* renamed from: b */
    public final List f30921b;

    public SetResourceParentsRequest(DriveId driveId, List list) {
        this.f30920a = driveId;
        this.f30921b = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f30920a, i, false);
        see.m35066c(parcel, 3, this.f30921b, false);
        see.m35062b(parcel, a);
    }
}
