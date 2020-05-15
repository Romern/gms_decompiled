package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: gig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class gig implements gij {

    /* renamed from: a */
    final /* synthetic */ String f18290a;

    /* renamed from: b */
    final /* synthetic */ Bundle f18291b;

    public gig(String str, Bundle bundle) {
        this.f18290a = str;
        this.f18291b = bundle;
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
        Bundle a = ddy.mo8548a(this.f18290a, this.f18291b);
        gik.m13209a((Object) a);
        String string = a.getString("Error");
        if (a.getBoolean("booleanResult")) {
            return null;
        }
        throw new gid(string);
    }
}
