package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.service.p086ib.LoadMaskedWalletServiceRequest;

/* renamed from: awsh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awsh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LoadMaskedWalletServiceRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        return new LoadMaskedWalletServiceRequest((Bundle) parcel.readParcelable(classLoader), (MaskedWalletRequest) parcel.readParcelable(classLoader));
    }
}
