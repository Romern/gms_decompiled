package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.pay.GetPayCardArtResponse;
import com.google.android.gms.pay.PayCardArt;

/* renamed from: aldy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aldy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetPayCardArtResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        PayCardArt[] payCardArtArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                payCardArtArr = (PayCardArt[]) sed.m35004b(parcel, readInt, PayCardArt.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new GetPayCardArtResponse(payCardArtArr);
    }
}
