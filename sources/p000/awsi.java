package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.service.p086ib.LoadMaskedWalletServiceResponse;

/* renamed from: awsi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awsi implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LoadMaskedWalletServiceResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        return new LoadMaskedWalletServiceResponse((Bundle) parcel.readParcelable(classLoader), (MaskedWallet) parcel.readParcelable(classLoader), parcel.readInt());
    }
}
