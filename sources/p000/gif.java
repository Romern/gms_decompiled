package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: gif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class gif implements gij {

    /* renamed from: a */
    final /* synthetic */ Account f18287a;

    /* renamed from: b */
    final /* synthetic */ String f18288b;

    /* renamed from: c */
    final /* synthetic */ Bundle f18289c;

    public gif(Account account, String str, Bundle bundle) {
        this.f18287a = account;
        this.f18288b = str;
        this.f18289c = bundle;
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
        Bundle a = ddy.mo8546a(this.f18287a, this.f18288b, this.f18289c);
        gik.m13209a((Object) a);
        return gik.m13205a(a);
    }
}
