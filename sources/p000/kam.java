package p000;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.uiflows.updatecredentials.FinishUpdateCredentialsSessionController;

/* renamed from: kam */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kam implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FinishUpdateCredentialsSessionController[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z;
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        AccountAuthenticatorResponse accountAuthenticatorResponse = (AccountAuthenticatorResponse) parcel.readParcelable(systemClassLoader);
        Account account = (Account) parcel.readParcelable(systemClassLoader);
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new FinishUpdateCredentialsSessionController(accountAuthenticatorResponse, account, z, rrq.m34308a((Bundle) parcel.readParcelable(systemClassLoader)), parcel.readString(), parcel.readString());
    }
}
