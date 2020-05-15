package p000;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.uiflows.removeaccount.GetAccountRemovalAllowedController;

/* renamed from: kak */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kak implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetAccountRemovalAllowedController[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        return new GetAccountRemovalAllowedController((AccountAuthenticatorResponse) parcel.readParcelable(systemClassLoader), (Account) parcel.readParcelable(systemClassLoader), parcel.readByte() != 0, parcel.readString());
    }
}
