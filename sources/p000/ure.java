package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.ChangesAvailableOptions;
import com.google.android.gms.drive.events.TransferProgressOptions;
import com.google.android.gms.drive.events.TransferStateOptions;
import com.google.android.gms.drive.internal.AddEventListenerRequest;

/* renamed from: ure */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ure implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AddEventListenerRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        DriveId driveId = null;
        ChangesAvailableOptions changesAvailableOptions = null;
        TransferStateOptions transferStateOptions = null;
        TransferProgressOptions transferProgressOptions = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                driveId = (DriveId) sed.m34998a(parcel, readInt, DriveId.CREATOR);
            } else if (a == 3) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 4) {
                changesAvailableOptions = (ChangesAvailableOptions) sed.m34998a(parcel, readInt, ChangesAvailableOptions.CREATOR);
            } else if (a == 5) {
                transferStateOptions = (TransferStateOptions) sed.m34998a(parcel, readInt, TransferStateOptions.CREATOR);
            } else if (a != 6) {
                sed.m35002b(parcel, readInt);
            } else {
                transferProgressOptions = (TransferProgressOptions) sed.m34998a(parcel, readInt, TransferProgressOptions.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new AddEventListenerRequest(driveId, i, changesAvailableOptions, transferStateOptions, transferProgressOptions);
    }
}
