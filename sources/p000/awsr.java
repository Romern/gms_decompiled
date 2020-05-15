package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.p086ib.IbBuyFlowInput;
import com.google.android.gms.wallet.service.p086ib.IbMerchantParameters;
import com.google.android.gms.wallet.service.p086ib.ProcessBuyFlowResultRequest;

/* renamed from: awsr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awsr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ProcessBuyFlowResultRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        return new ProcessBuyFlowResultRequest((IbBuyFlowInput) parcel.readParcelable(classLoader), (IbMerchantParameters) parcel.readParcelable(classLoader), parcel.createByteArray(), parcel.createByteArray(), parcel.readInt());
    }
}
