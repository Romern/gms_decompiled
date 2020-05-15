package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.OpenFileIntentSenderRequest;
import com.google.android.gms.drive.query.internal.FilterHolder;

/* renamed from: uun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uun implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new OpenFileIntentSenderRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String[] strArr = null;
        DriveId driveId = null;
        FilterHolder filterHolder = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 3) {
                strArr = sed.m34989A(parcel, readInt);
            } else if (a == 4) {
                driveId = (DriveId) sed.m34998a(parcel, readInt, DriveId.CREATOR);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                filterHolder = (FilterHolder) sed.m34998a(parcel, readInt, FilterHolder.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new OpenFileIntentSenderRequest(str, strArr, driveId, filterHolder);
    }
}
