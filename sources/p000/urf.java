package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.Permission;
import com.google.android.gms.drive.internal.AddPermissionRequest;

/* renamed from: urf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class urf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AddPermissionRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        DriveId driveId = null;
        Permission permission = null;
        String str = null;
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    driveId = (DriveId) sed.m34998a(parcel, readInt, DriveId.CREATOR);
                    break;
                case 3:
                    permission = (Permission) sed.m34998a(parcel, readInt, Permission.CREATOR);
                    break;
                case 4:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 5:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 6:
                    z2 = sed.m35006c(parcel, readInt);
                    break;
                case 7:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new AddPermissionRequest(driveId, permission, z, str, z2, str2);
    }
}
