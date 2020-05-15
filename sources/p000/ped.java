package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.AdBreakClipInfo;
import com.google.android.gms.cast.VastAdsRequest;

/* renamed from: ped */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ped implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AdBreakClipInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        VastAdsRequest vastAdsRequest = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 3:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 4:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 5:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 6:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 7:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                case 8:
                    str6 = sed.m35020q(parcel2, readInt);
                    break;
                case 9:
                    str7 = sed.m35020q(parcel2, readInt);
                    break;
                case 10:
                    str8 = sed.m35020q(parcel2, readInt);
                    break;
                case 11:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                case 12:
                    str9 = sed.m35020q(parcel2, readInt);
                    break;
                case 13:
                    vastAdsRequest = (VastAdsRequest) sed.m34998a(parcel2, readInt, VastAdsRequest.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new AdBreakClipInfo(str, str2, j, str3, str4, str5, str6, str7, str8, j2, str9, vastAdsRequest);
    }
}
