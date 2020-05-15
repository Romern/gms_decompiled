package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaQueueData;

/* renamed from: pge */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pge implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MediaLoadRequestData[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        String str = null;
        long j = 0;
        long j2 = 0;
        MediaInfo mediaInfo = null;
        MediaQueueData mediaQueueData = null;
        Boolean bool = null;
        long[] jArr = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        double d = 0.0d;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    mediaInfo = (MediaInfo) sed.m34998a(parcel2, readInt, MediaInfo.CREATOR);
                    break;
                case 3:
                    mediaQueueData = (MediaQueueData) sed.m34998a(parcel2, readInt, MediaQueueData.CREATOR);
                    break;
                case 4:
                    bool = sed.m35007d(parcel2, readInt);
                    break;
                case 5:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 6:
                    d = sed.m35017n(parcel2, readInt);
                    break;
                case 7:
                    jArr = sed.m35027x(parcel2, readInt);
                    break;
                case 8:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 9:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 10:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 11:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 12:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                case 13:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new MediaLoadRequestData(mediaInfo, mediaQueueData, bool, j, d, jArr, ptk.m31240d(str), str2, str3, str4, str5, j2);
    }
}
