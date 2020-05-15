package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaQueueItem;

/* renamed from: pgm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pgm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MediaQueueItem[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        MediaInfo mediaInfo = null;
        long[] jArr = null;
        String str = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    mediaInfo = (MediaInfo) sed.m34998a(parcel2, readInt, MediaInfo.CREATOR);
                    break;
                case 3:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 4:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 5:
                    d = sed.m35017n(parcel2, readInt);
                    break;
                case 6:
                    d2 = sed.m35017n(parcel2, readInt);
                    break;
                case 7:
                    d3 = sed.m35017n(parcel2, readInt);
                    break;
                case 8:
                    jArr = sed.m35027x(parcel2, readInt);
                    break;
                case 9:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new MediaQueueItem(mediaInfo, i, z, d, d2, d3, jArr, str);
    }
}
