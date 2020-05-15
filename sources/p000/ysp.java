package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: ysp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ysp {

    /* renamed from: a */
    public static final /* synthetic */ int f54555a = 0;

    static {
        zvt.m46581a();
    }

    /* renamed from: a */
    public static Object m44725a(Context context, yso yso) {
        sjq sjq;
        rex rex = new rex();
        skh.m35531a().mo25690a(context, soz.m35783a(), rex, 1);
        try {
            IBinder a = rex.mo24567a();
            if (a != null) {
                IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.common.service.IAccountService");
                sjq = !(queryLocalInterface instanceof sjq) ? new sjo(a) : (sjq) queryLocalInterface;
            } else {
                sjq = null;
            }
            Object a2 = yso.mo30731a(sjq);
            skh.m35531a().mo25689a(context, rex);
            return a2;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new ysu(e);
        } catch (RemoteException e2) {
            throw new ysu(e2);
        } catch (Throwable th) {
            skh.m35531a().mo25689a(context, rex);
            throw th;
        }
    }
}
