package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: sdn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sdn {

    /* renamed from: a */
    private static ando f44072a = null;

    /* renamed from: a */
    public static synchronized void m34958a(Context context) {
        ando ando;
        synchronized (sdn.class) {
            if (f44072a == null) {
                try {
                    IBinder a = waq.m41676a(context, waq.f50355c, "permissions").mo29007a("com.google.android.gms.permissions.PermissionsImpl");
                    if (a != null) {
                        IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.permissions.IPermissions");
                        ando = !(queryLocalInterface instanceof ando) ? new ando(a) : (ando) queryLocalInterface;
                    } else {
                        ando = null;
                    }
                    f44072a = ando;
                    vzr a2 = vzs.m41642a(context);
                    Parcel bj = ando.mo8529bj();
                    dcl.m8164a(bj, a2);
                    ando.mo8528b(1, bj);
                } catch (RemoteException | wam e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
                    sb.append("Failed to install AppOpsCollector: ");
                    sb.append(valueOf);
                    Log.w("PermissionsInstaller", sb.toString());
                    f44072a = null;
                }
            }
        }
    }
}
