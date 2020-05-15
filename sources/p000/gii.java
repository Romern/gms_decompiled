package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;

/* renamed from: gii */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class gii implements gij {

    /* renamed from: a */
    final /* synthetic */ String f18293a;

    /* renamed from: b */
    final /* synthetic */ String[] f18294b;

    public gii(String str, String[] strArr) {
        this.f18293a = str;
        this.f18294b = strArr;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11906a(IBinder iBinder) {
        ddy ddy;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            ddy = queryLocalInterface instanceof ddy ? (ddy) queryLocalInterface : new ddw(iBinder);
        } else {
            ddy = null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("accountType", this.f18293a);
        bundle.putStringArray("account_features", this.f18294b);
        Bundle a = ddy.mo8547a(bundle);
        gik.m13209a((Object) a);
        Parcelable[] parcelableArray = a.getParcelableArray("accounts");
        Account[] accountArr = new Account[parcelableArray.length];
        for (int i = 0; i < parcelableArray.length; i++) {
            accountArr[i] = (Account) parcelableArray[i];
        }
        return accountArr;
    }
}
