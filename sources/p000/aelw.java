package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.location.places.PlacePhotoResult;

/* renamed from: aelw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aelw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PlacePhotoResult[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Status status = null;
        BitmapTeleporter bitmapTeleporter = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                status = (Status) sed.m34998a(parcel, readInt, Status.CREATOR);
            } else if (a != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                bitmapTeleporter = (BitmapTeleporter) sed.m34998a(parcel, readInt, BitmapTeleporter.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new PlacePhotoResult(status, bitmapTeleporter);
    }
}
