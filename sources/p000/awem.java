package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.buyflow.BuyFlowFragment$BuyFlowPageDetails;

/* renamed from: awem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awem implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new BuyFlowFragment$BuyFlowPageDetails(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BuyFlowFragment$BuyFlowPageDetails[i];
    }
}
