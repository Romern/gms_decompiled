package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.AuthorizeAccessRequest;

/* renamed from: urg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class urg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AuthorizeAccessRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        DriveId driveId = null;
        long j = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                j = sed.m35012i(parcel, readInt);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                driveId = (DriveId) sed.m34998a(parcel, readInt, DriveId.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new AuthorizeAccessRequest(j, driveId);
    }
}
