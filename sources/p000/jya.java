package p000;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.uiflows.gettoken.GetTokenController;

/* renamed from: jya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jya implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetTokenController[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z;
        AccountAuthenticatorResponse accountAuthenticatorResponse = (AccountAuthenticatorResponse) parcel.readParcelable(AccountAuthenticatorResponse.class.getClassLoader());
        TokenRequest tokenRequest = (TokenRequest) parcel.readParcelable(TokenRequest.class.getClassLoader());
        boolean z2 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (parcel.readByte() != 0) {
            z2 = true;
        }
        return new GetTokenController(accountAuthenticatorResponse, tokenRequest, z, z2, rrq.m34308a((Bundle) parcel.readParcelable(ClassLoader.getSystemClassLoader())), parcel.readInt());
    }
}
