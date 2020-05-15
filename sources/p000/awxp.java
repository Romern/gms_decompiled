package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.reauth.ReauthProofTokenRequest;

/* renamed from: awxp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awxp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ReauthProofTokenRequest((Account) Account.CREATOR.createFromParcel(parcel), parcel.readString(), bslm.m115941a(parcel.readInt()), parcel.readInt());
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ReauthProofTokenRequest[i];
    }
}
