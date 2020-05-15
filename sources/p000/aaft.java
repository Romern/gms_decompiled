package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;

/* renamed from: aaft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaft implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SnapshotMetadataChangeEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        Long l = null;
        BitmapTeleporter bitmapTeleporter = null;
        Uri uri = null;
        Long l2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 2) {
                l = sed.m35013j(parcel, readInt);
            } else if (a == 4) {
                uri = (Uri) sed.m34998a(parcel, readInt, Uri.CREATOR);
            } else if (a == 5) {
                bitmapTeleporter = (BitmapTeleporter) sed.m34998a(parcel, readInt, BitmapTeleporter.CREATOR);
            } else if (a != 6) {
                sed.m35002b(parcel, readInt);
            } else {
                l2 = sed.m35013j(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new SnapshotMetadataChangeEntity(str, l, bitmapTeleporter, uri, l2);
    }
}
