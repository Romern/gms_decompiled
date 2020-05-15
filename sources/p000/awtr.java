package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.payse.SecureElementStoredValue;
import com.google.android.gms.wallet.service.orchestration.FetchPaySeCardsResponse;

/* renamed from: awtr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awtr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FetchPaySeCardsResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        SecureElementStoredValue[] secureElementStoredValueArr = new SecureElementStoredValue[readInt];
        for (int i = 0; i < readInt; i++) {
            secureElementStoredValueArr[i] = (SecureElementStoredValue) SecureElementStoredValue.CREATOR.createFromParcel(parcel);
        }
        return new FetchPaySeCardsResponse(secureElementStoredValueArr);
    }
}
