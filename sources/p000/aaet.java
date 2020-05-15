package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;

/* renamed from: aaet */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaet implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MostRecentGameInfoEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        Uri uri2 = null;
        Uri uri3 = null;
        long j = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 2:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 3:
                    j = sed.m35012i(parcel, readInt);
                    break;
                case 4:
                    uri = (Uri) sed.m34998a(parcel, readInt, Uri.CREATOR);
                    break;
                case 5:
                    uri2 = (Uri) sed.m34998a(parcel, readInt, Uri.CREATOR);
                    break;
                case 6:
                    uri3 = (Uri) sed.m34998a(parcel, readInt, Uri.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new MostRecentGameInfoEntity(str, str2, j, uri, uri2, uri3);
    }
}
