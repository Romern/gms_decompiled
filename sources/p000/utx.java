package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.OnChangesResponse;
import java.util.ArrayList;

/* renamed from: utx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class utx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new OnChangesResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        DataHolder dataHolder = null;
        ArrayList arrayList = null;
        ChangeSequenceNumber changeSequenceNumber = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                dataHolder = (DataHolder) sed.m34998a(parcel, readInt, DataHolder.CREATOR);
            } else if (a == 3) {
                arrayList = sed.m35005c(parcel, readInt, DriveId.CREATOR);
            } else if (a == 4) {
                changeSequenceNumber = (ChangeSequenceNumber) sed.m34998a(parcel, readInt, ChangeSequenceNumber.CREATOR);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                z = sed.m35006c(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new OnChangesResponse(dataHolder, arrayList, changeSequenceNumber, z);
    }
}
