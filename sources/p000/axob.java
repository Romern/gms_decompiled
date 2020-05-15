package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.walletp2p.internal.zeroparty.ErrorDetails;
import com.google.android.gms.walletp2p.internal.zeroparty.ValidateDraftTokenResponse;

/* renamed from: axob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axob implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ValidateDraftTokenResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ErrorDetails errorDetails = null;
        byte[] bArr = null;
        long j = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    j = sed.m35012i(parcel, readInt);
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
                    str5 = sed.m35020q(parcel, readInt);
                    break;
                case 8:
                    errorDetails = (ErrorDetails) sed.m34998a(parcel, readInt, ErrorDetails.CREATOR);
                    break;
                case 9:
                    bArr = sed.m35023t(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new ValidateDraftTokenResponse(j, str, str2, str3, str4, str5, errorDetails, bArr);
    }
}
