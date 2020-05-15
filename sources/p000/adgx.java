package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.instantapps.internal.ContentRating;
import com.google.android.gms.instantapps.internal.VisitedApplication;
import java.util.ArrayList;

/* renamed from: adgx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adgx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new VisitedApplication[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        BitmapTeleporter bitmapTeleporter = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ArrayList arrayList = null;
        ContentRating contentRating = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    bitmapTeleporter = (BitmapTeleporter) sed.m34998a(parcel, readInt, BitmapTeleporter.CREATOR);
                    break;
                case 3:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 4:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 5:
                    str3 = sed.m35020q(parcel, readInt);
                    break;
                case 6:
                    str4 = sed.m35020q(parcel, readInt);
                    break;
                case 7:
                    arrayList = sed.m34992D(parcel, readInt);
                    break;
                case 8:
                    contentRating = (ContentRating) sed.m34998a(parcel, readInt, ContentRating.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new VisitedApplication(bitmapTeleporter, str, str2, str3, str4, arrayList, contentRating);
    }
}
