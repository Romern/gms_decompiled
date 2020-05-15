package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.internal.GetChangesRequest;
import java.util.ArrayList;

/* renamed from: ute */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ute implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetChangesRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        int i = 0;
        ChangeSequenceNumber changeSequenceNumber = null;
        ArrayList arrayList = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                changeSequenceNumber = (ChangeSequenceNumber) sed.m34998a(parcel, readInt, ChangeSequenceNumber.CREATOR);
            } else if (a == 3) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 4) {
                arrayList = sed.m35005c(parcel, readInt, DriveSpace.CREATOR);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                z = sed.m35006c(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new GetChangesRequest(changeSequenceNumber, i, arrayList, z);
    }
}
