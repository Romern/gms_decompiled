package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.walletp2p.internal.zeroparty.ErrorDetails;

/* renamed from: axnk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axnk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ErrorDetails[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        Uri uri = null;
        byte[] bArr = null;
        byte[] bArr2 = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 3:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 4:
                    str3 = sed.m35020q(parcel, readInt);
                    break;
                case 5:
                    uri = (Uri) sed.m34998a(parcel, readInt, Uri.CREATOR);
                    break;
                case 6:
                    bArr = sed.m35023t(parcel, readInt);
                    break;
                case 7:
                    bArr2 = sed.m35023t(parcel, readInt);
                    break;
                case 8:
                    z = sed.m35006c(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new ErrorDetails(str, str2, str3, uri, bArr, bArr2, z);
    }
}
