package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.LoadRealtimeRequest;

/* renamed from: utu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class utu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LoadRealtimeRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        DriveId driveId = null;
        DataHolder dataHolder = null;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                driveId = (DriveId) sed.m34998a(parcel, readInt, DriveId.CREATOR);
            } else if (a == 3) {
                z = sed.m35006c(parcel, readInt);
            } else if (a == 5) {
                z2 = sed.m35006c(parcel, readInt);
            } else if (a == 6) {
                dataHolder = (DataHolder) sed.m34998a(parcel, readInt, DataHolder.CREATOR);
            } else if (a != 7) {
                sed.m35002b(parcel, readInt);
            } else {
                str = sed.m35020q(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new LoadRealtimeRequest(driveId, z, z2, dataHolder, str);
    }
}
