package p000;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.instantapps.LaunchData;

/* renamed from: adeg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adeg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LaunchData[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Intent intent = null;
        String str = null;
        String str2 = null;
        BitmapTeleporter bitmapTeleporter = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                intent = (Intent) sed.m34998a(parcel, readInt, Intent.CREATOR);
            } else if (a == 3) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 4) {
                str2 = sed.m35020q(parcel, readInt);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                bitmapTeleporter = (BitmapTeleporter) sed.m34998a(parcel, readInt, BitmapTeleporter.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new LaunchData(intent, str, str2, bitmapTeleporter);
    }
}
