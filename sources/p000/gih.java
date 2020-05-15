package p000;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

/* renamed from: gih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class gih implements gij {

    /* renamed from: a */
    final /* synthetic */ AccountChangeEventsRequest f18292a;

    public gih(AccountChangeEventsRequest accountChangeEventsRequest) {
        this.f18292a = accountChangeEventsRequest;
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
        AccountChangeEventsResponse a = ddy.mo8549a(this.f18292a);
        gik.m13209a(a);
        return a.f9915b;
    }
}
