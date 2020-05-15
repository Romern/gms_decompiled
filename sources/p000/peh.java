package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.images.WebImage;
import java.util.ArrayList;

/* renamed from: peh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class peh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ApplicationMetadata[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        String str3 = null;
        Uri uri = null;
        String str4 = null;
        String str5 = null;
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
                    sed.m35005c(parcel, readInt, WebImage.CREATOR);
                    break;
                case 5:
                    arrayList = sed.m34992D(parcel, readInt);
                    break;
                case 6:
                    str3 = sed.m35020q(parcel, readInt);
                    break;
                case 7:
                    uri = (Uri) sed.m34998a(parcel, readInt, Uri.CREATOR);
                    break;
                case 8:
                    str4 = sed.m35020q(parcel, readInt);
                    break;
                case 9:
                    str5 = sed.m35020q(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new ApplicationMetadata(str, str2, arrayList, str3, uri, str4, str5);
    }
}
