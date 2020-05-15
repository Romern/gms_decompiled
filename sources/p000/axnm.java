package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.walletp2p.internal.zeroparty.ErrorDetails;
import com.google.android.gms.walletp2p.internal.zeroparty.GetEncryptedIdCreditParamsResponse;

/* renamed from: axnm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axnm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetEncryptedIdCreditParamsResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        byte[] bArr = null;
        ErrorDetails errorDetails = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                bArr = sed.m35023t(parcel, readInt);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                errorDetails = (ErrorDetails) sed.m34998a(parcel, readInt, ErrorDetails.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new GetEncryptedIdCreditParamsResponse(bArr, errorDetails);
    }
}
