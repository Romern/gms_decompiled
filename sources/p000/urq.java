package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.CreateFolderRequest;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* renamed from: urq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class urq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CreateFolderRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        DriveId driveId = null;
        MetadataBundle metadataBundle = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                driveId = (DriveId) sed.m34998a(parcel, readInt, DriveId.CREATOR);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                metadataBundle = (MetadataBundle) sed.m34998a(parcel, readInt, MetadataBundle.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new CreateFolderRequest(driveId, metadataBundle);
    }
}
