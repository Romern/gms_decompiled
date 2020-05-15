package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.wearable.Asset;

/* renamed from: axoi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axoi implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Asset[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        byte[] bArr = null;
        String str = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        Uri uri = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                bArr = sed.m35023t(parcel, readInt);
            } else if (a == 3) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 4) {
                parcelFileDescriptor = (ParcelFileDescriptor) sed.m34998a(parcel, readInt, ParcelFileDescriptor.CREATOR);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                uri = (Uri) sed.m34998a(parcel, readInt, Uri.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new Asset(bArr, str, parcelFileDescriptor, uri);
    }
}
