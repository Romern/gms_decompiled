package p000;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.io.IOException;

/* renamed from: qdf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qdf {
    /* renamed from: a */
    public static rex m31914a(Context context) {
        try {
            int i = rfj.f42871c;
            rfy.m33555l(context);
            rex rex = new rex();
            Intent intent = new Intent("com.google.android.gms.checkin.BIND_TO_SERVICE");
            intent.setPackage("com.google.android.gms");
            if (skh.m35531a().mo25690a(context, intent, rex, 1)) {
                return rex;
            }
            throw new IOException("Connection failure.");
        } catch (rfv e) {
            throw new IOException(e);
        }
    }

    /* renamed from: b */
    public static String m31915b(Context context) {
        qfo qfo;
        sdo.m34973b("Calling this from your main thread can lead to deadlock.");
        rex a = m31914a(context);
        try {
            IBinder a2 = a.mo24567a();
            if (a2 != null) {
                IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.checkin.internal.ICheckinService");
                qfo = !(queryLocalInterface instanceof qfo) ? new qfm(a2) : (qfo) queryLocalInterface;
            } else {
                qfo = null;
            }
            String a3 = qfo.mo24013a();
            try {
                skh.m35531a().mo25689a(context, a);
            } catch (IllegalArgumentException e) {
                Log.i("CheckinServiceClient", "unbind failed: ", e);
            }
            return a3;
        } catch (RemoteException e2) {
            Log.i("CheckinServiceClient", "GMS remote exception: ", e2);
            throw new IOException("Remote exception.");
        } catch (InterruptedException e3) {
            throw new IOException("Interrupted exception.");
        } catch (Throwable th) {
            try {
                skh.m35531a().mo25689a(context, a);
            } catch (IllegalArgumentException e4) {
                Log.i("CheckinServiceClient", "unbind failed: ", e4);
            }
            throw th;
        }
    }
}
