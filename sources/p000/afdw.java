package p000;

import android.os.RemoteException;
import android.util.Log;

/* renamed from: afdw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class afdw extends afdx {

    /* renamed from: e */
    final /* synthetic */ afea f64218e;

    public afdw(afea afea) {
        this.f64218e = afea;
    }

    /* renamed from: a */
    public final Object mo34776a() {
        try {
            afea afea = this.f64218e;
            afeb afeb = afea.f64220a;
            if (afeb != null) {
                return vzs.m41641a(mo34775a(afeb));
            }
            afef afef = afea.f64221b.f79863a;
            if (afef == null) {
                return null;
            }
            afea.f64220a = afef.newCameraUpdateFactoryDelegate();
            return vzs.m41641a(mo34775a(this.f64218e.f64220a));
        } catch (RemoteException e) {
            Log.e("maps.CreatorImpl", "Failed to compute lazy value.", e);
            return null;
        }
    }
}
