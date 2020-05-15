package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.service.p086ib.LoadFullWalletServiceRequest;

/* renamed from: awse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awse implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LoadFullWalletServiceRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        return new LoadFullWalletServiceRequest((Bundle) parcel.readParcelable(classLoader), (FullWalletRequest) parcel.readParcelable(classLoader), parcel.readByte() != 0);
    }
}
