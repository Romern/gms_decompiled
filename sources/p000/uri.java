package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.ChangeResourceParentsRequest;
import java.util.ArrayList;

/* renamed from: uri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uri implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ChangeResourceParentsRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        DriveId driveId = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                driveId = (DriveId) sed.m34998a(parcel, readInt, DriveId.CREATOR);
            } else if (a == 3) {
                arrayList = sed.m35005c(parcel, readInt, DriveId.CREATOR);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                arrayList2 = sed.m35005c(parcel, readInt, DriveId.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new ChangeResourceParentsRequest(driveId, arrayList, arrayList2);
    }
}
