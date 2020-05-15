package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: nul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nul extends aeaa {

    /* renamed from: a */
    final /* synthetic */ num f36517a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nul(num num) {
        super("car");
        this.f36517a = num;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        this.f36517a.mo21468r();
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        nse nse;
        bnsn bnsn = num.f36518v;
        toString();
        num num = this.f36517a;
        nwp.m28031a(num.f36548y, num.f36549z);
        num.f36520A = 0;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.ICarProjection");
            nse = queryLocalInterface instanceof nse ? (nse) queryLocalInterface : new nse(iBinder);
        } else {
            nse = null;
        }
        num.f36540U = nse;
        num.f36548y.mo20749a(0, 47);
    }
}
