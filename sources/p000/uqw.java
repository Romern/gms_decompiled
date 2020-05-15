package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.events.TransferProgressEvent;
import com.google.android.gms.drive.events.internal.TransferProgressData;

/* renamed from: uqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uqw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TransferProgressEvent[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        TransferProgressData transferProgressData = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                transferProgressData = (TransferProgressData) sed.m34998a(parcel, readInt, TransferProgressData.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new TransferProgressEvent(transferProgressData);
    }
}
