package p000;

import android.os.RemoteException;
import android.util.Log;

/* renamed from: afdk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class afdk extends afdx {

    /* renamed from: b */
    final /* synthetic */ afht f64200b;

    public afdk(afht afht) {
        this.f64200b = afht;
    }

    /* renamed from: a */
    public final Object mo34776a() {
        try {
            afht afht = this.f64200b;
            afhu afhu = afht.f64246a;
            if (afhu != null) {
                return vzs.m41641a(mo34775a(afhu));
            }
            afef afef = afht.f64247b.f79863a;
            if (afef == null) {
                return null;
            }
            afht.f64246a = afef.newBitmapDescriptorFactoryDelegate();
            return vzs.m41641a(mo34775a(this.f64200b.f64246a));
        } catch (RemoteException e) {
            Log.e("maps.CreatorImpl", "Failed to compute lazy value.", e);
            return null;
        }
    }
}
