package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.service.p086ib.LoadFullWalletServiceResponse;

/* renamed from: awsf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awsf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LoadFullWalletServiceResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        return new LoadFullWalletServiceResponse((Bundle) parcel.readParcelable(classLoader), (FullWallet) parcel.readParcelable(classLoader), parcel.readInt());
    }
}
