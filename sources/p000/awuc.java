package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.orchestration.IdCreditRefreshRequest;

/* renamed from: awuc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awuc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new IdCreditRefreshRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new IdCreditRefreshRequest((Account) Account.CREATOR.createFromParcel(parcel), parcel.createByteArray(), parcel.createStringArrayList());
    }
}
