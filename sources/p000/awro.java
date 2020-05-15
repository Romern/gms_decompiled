package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.p086ib.IbBuyFlowInput;

/* renamed from: awro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awro implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new IbBuyFlowInput[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        IbBuyFlowInput a = IbBuyFlowInput.m94105a(parcel.createByteArray());
        a.mo59977a(parcel.readBundle(getClass().getClassLoader()));
        return a;
    }
}
