package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: ikc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ikc extends aeaa {

    /* renamed from: a */
    final /* synthetic */ ike f21164a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ikc(ike ike, String str) {
        super(str);
        this.f21164a = ike;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        iyv iyv;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.firstparty.devicesignals.IDeviceSignalsService");
            iyv = queryLocalInterface instanceof iyv ? (iyv) queryLocalInterface : new iyt(iBinder);
        } else {
            iyv = null;
        }
        try {
            long a = iyv.mo13498a();
            ike ike = this.f21164a;
            long j = ike.f21171d - a;
            if (a > 0) {
                if (j < ike.f21169b.f167299i) {
                    ike.mo13079a(false);
                }
            }
        } catch (RemoteException e) {
        }
        this.f21164a.mo13082d();
    }
}
