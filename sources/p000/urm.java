package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.ControlProgressRequest;

/* renamed from: urm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class urm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ControlProgressRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        int i = 0;
        DriveId driveId = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 3) {
                i2 = sed.m35010g(parcel, readInt);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                driveId = (DriveId) sed.m34998a(parcel, readInt, DriveId.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new ControlProgressRequest(i, i2, driveId);
    }
}
