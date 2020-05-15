package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.orchestration.BuyflowResponse;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awtj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awtj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BuyflowResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        byaa byaa = (byaa) bjvp.m104731a(parcel, (bxxk) byaa.f165217d.mo74142c(7));
        ServerResponse serverResponse = (ServerResponse) ServerResponse.CREATOR.createFromParcel(parcel);
        int a = bwfn.m121913a(parcel.readInt());
        if (a == 0) {
            a = 1;
        }
        BuyflowResponse buyflowResponse = new BuyflowResponse(serverResponse, byaa);
        buyflowResponse.f110382c = a;
        return buyflowResponse;
    }
}
