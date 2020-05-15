package p000;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: afcr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afcr {

    /* renamed from: a */
    private static boolean f64186a = false;

    /* renamed from: a */
    public static synchronized void m52860a(Context context) {
        synchronized (afcr.class) {
            sdo.checkIfNull(context, "Context is null");
            if (!f64186a) {
                try {
                    afef a = afgu.m53063a(context);
                    try {
                        afeb newCameraUpdateFactoryDelegate = a.newCameraUpdateFactoryDelegate();
                        sdo.m34959a(newCameraUpdateFactoryDelegate);
                        afci.f64179a = newCameraUpdateFactoryDelegate;
                        afhu newBitmapDescriptorFactoryDelegate = a.newBitmapDescriptorFactoryDelegate();
                        if (afgw.f64238a == null) {
                            sdo.m34959a(newBitmapDescriptorFactoryDelegate);
                            afgw.f64238a = newBitmapDescriptorFactoryDelegate;
                        }
                        f64186a = true;
                    } catch (RemoteException e) {
                        throw new afhl(e);
                    }
                } catch (rfv e2) {
                }
            }
        }
    }
}
