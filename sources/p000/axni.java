package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.walletp2p.internal.zeroparty.DeclineChallengeResponse;
import com.google.android.gms.walletp2p.internal.zeroparty.ErrorDetails;

/* renamed from: axni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axni implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DeclineChallengeResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ErrorDetails errorDetails = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 1) {
                sed.m35002b(parcel, readInt);
            } else {
                errorDetails = (ErrorDetails) sed.m34998a(parcel, readInt, ErrorDetails.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new DeclineChallengeResponse(errorDetails);
    }
}
