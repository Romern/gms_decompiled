package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.orchestration.EmbeddedSettingsInitializeRequest;

/* renamed from: awto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awto implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new EmbeddedSettingsInitializeRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new EmbeddedSettingsInitializeRequest((Account) Account.CREATOR.createFromParcel(parcel), parcel.createByteArray());
    }
}
