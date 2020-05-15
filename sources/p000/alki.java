package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.payse.SecureElementStoredValue;
import com.google.android.gms.payse.internal.GetSeCardsResponse;

/* renamed from: alki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alki implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetSeCardsResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        SecureElementStoredValue[] secureElementStoredValueArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 1) {
                sed.m35002b(parcel, readInt);
            } else {
                secureElementStoredValueArr = (SecureElementStoredValue[]) sed.m35004b(parcel, readInt, SecureElementStoredValue.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new GetSeCardsResponse(secureElementStoredValueArr);
    }
}
