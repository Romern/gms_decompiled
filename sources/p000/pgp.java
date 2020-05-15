package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.AdBreakStatus;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLiveSeekableRange;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.VideoInfo;
import java.util.ArrayList;

/* renamed from: pgp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pgp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MediaStatus[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        MediaInfo mediaInfo = null;
        long[] jArr = null;
        String str = null;
        ArrayList arrayList = null;
        AdBreakStatus adBreakStatus = null;
        VideoInfo videoInfo = null;
        MediaLiveSeekableRange mediaLiveSeekableRange = null;
        MediaQueueData mediaQueueData = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    mediaInfo = (MediaInfo) sed.m34998a(parcel2, readInt, MediaInfo.CREATOR);
                    break;
                case 3:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 4:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 5:
                    d = sed.m35017n(parcel2, readInt);
                    break;
                case 6:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 7:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                case 8:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                case 9:
                    j3 = sed.m35012i(parcel2, readInt);
                    break;
                case 10:
                    d2 = sed.m35017n(parcel2, readInt);
                    break;
                case 11:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 12:
                    jArr = sed.m35027x(parcel2, readInt);
                    break;
                case 13:
                    i4 = sed.m35010g(parcel2, readInt);
                    break;
                case 14:
                    i5 = sed.m35010g(parcel2, readInt);
                    break;
                case 15:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 16:
                    i6 = sed.m35010g(parcel2, readInt);
                    break;
                case 17:
                    arrayList = sed.m35005c(parcel2, readInt, MediaQueueItem.CREATOR);
                    break;
                case 18:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 19:
                    adBreakStatus = (AdBreakStatus) sed.m34998a(parcel2, readInt, AdBreakStatus.CREATOR);
                    break;
                case 20:
                    videoInfo = (VideoInfo) sed.m34998a(parcel2, readInt, VideoInfo.CREATOR);
                    break;
                case 21:
                    mediaLiveSeekableRange = (MediaLiveSeekableRange) sed.m34998a(parcel2, readInt, MediaLiveSeekableRange.CREATOR);
                    break;
                case 22:
                    mediaQueueData = (MediaQueueData) sed.m34998a(parcel2, readInt, MediaQueueData.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new MediaStatus(mediaInfo, j, i, d, i2, i3, j2, j3, d2, z, jArr, i4, i5, str, i6, arrayList, z2, adBreakStatus, videoInfo, mediaLiveSeekableRange, mediaQueueData);
    }
}
