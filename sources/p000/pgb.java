package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.AdBreakClipInfo;
import com.google.android.gms.cast.AdBreakInfo;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.cast.VastAdsRequest;
import java.util.ArrayList;

/* renamed from: pgb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pgb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MediaInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        MediaMetadata mediaMetadata = null;
        ArrayList arrayList = null;
        TextTrackStyle textTrackStyle = null;
        String str3 = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        String str4 = null;
        VastAdsRequest vastAdsRequest = null;
        String str5 = null;
        String str6 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 3:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 4:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 5:
                    mediaMetadata = (MediaMetadata) sed.m34998a(parcel2, readInt, MediaMetadata.CREATOR);
                    break;
                case 6:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 7:
                    arrayList = sed.m35005c(parcel2, readInt, MediaTrack.CREATOR);
                    break;
                case 8:
                    textTrackStyle = (TextTrackStyle) sed.m34998a(parcel2, readInt, TextTrackStyle.CREATOR);
                    break;
                case 9:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 10:
                    arrayList2 = sed.m35005c(parcel2, readInt, AdBreakInfo.CREATOR);
                    break;
                case 11:
                    arrayList3 = sed.m35005c(parcel2, readInt, AdBreakClipInfo.CREATOR);
                    break;
                case 12:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 13:
                    vastAdsRequest = (VastAdsRequest) sed.m34998a(parcel2, readInt, VastAdsRequest.CREATOR);
                    break;
                case 14:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                case 15:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                case 16:
                    str6 = sed.m35020q(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new MediaInfo(str, i, str2, mediaMetadata, j, arrayList, textTrackStyle, str3, arrayList2, arrayList3, str4, vastAdsRequest, j2, str5, str6);
    }
}
