package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.orchestration.BuyflowInitializeRequest;

/* renamed from: awth */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awth implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BuyflowInitializeRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new BuyflowInitializeRequest((Account) Account.CREATOR.createFromParcel(parcel), parcel.createByteArray(), (byaa) bjvp.m104731a(parcel, (bxxk) byaa.f165217d.mo74142c(7)));
    }
}
