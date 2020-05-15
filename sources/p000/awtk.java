package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.orchestration.BuyflowSubmitRequest;

/* renamed from: awtk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awtk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BuyflowSubmitRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new BuyflowSubmitRequest((Account) Account.CREATOR.createFromParcel(parcel), parcel.createByteArray(), parcel.createByteArray(), (blzf) bjvp.m104731a(parcel, (bxxk) blzf.f128337k.mo74142c(7)), (byaa) bjvp.m104731a(parcel, (bxxk) byaa.f165217d.mo74142c(7)), parcel.createStringArrayList());
    }
}
