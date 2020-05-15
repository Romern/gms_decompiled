package com.google.android.gms.drive.p039ui.select.path;

import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.drive.DriveId;

/* renamed from: com.google.android.gms.drive.ui.select.path.TopLevelView$MyDrivePathElement */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TopLevelView$MyDrivePathElement extends ViewPathElement implements DriveIdPathElement {
    public static final Parcelable.Creator CREATOR = new vnq();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: vfu.a(uwa, java.lang.Object):com.google.android.gms.drive.query.Filter
     arg types: [uwa, com.google.android.gms.drive.DriveId]
     candidates:
      vfu.a(uwb, java.lang.Object):com.google.android.gms.drive.query.Filter
      vfu.a(uwa, java.lang.Object):com.google.android.gms.drive.query.Filter */
    public TopLevelView$MyDrivePathElement() {
        super(C0126R.string.drive_view_my_drive, C0126R.C0127drawable.quantum_ic_drive_grey600_24, vfu.m40351a(vgc.f49220d, (Object) DriveId.m22924a("root")), voc.f49620a);
    }

    /* renamed from: a */
    public final DriveId mo18340a() {
        return DriveId.m22924a("root");
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }
}
