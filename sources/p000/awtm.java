package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.orchestration.EmbeddedLandingPageInitializeRequest;

/* renamed from: awtm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awtm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new EmbeddedLandingPageInitializeRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new EmbeddedLandingPageInitializeRequest((Account) Account.CREATOR.createFromParcel(parcel), parcel.createByteArray());
    }
}
