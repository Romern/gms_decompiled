package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

@Deprecated
/* renamed from: qls */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qls {
    @Deprecated
    /* renamed from: a */
    public static Context m32403a(Context context, String str) {
        try {
            return waq.m41676a(context, waq.f50353a, str).f50364e;
        } catch (wam e) {
            Log.e("DynamiteUtils", str.length() == 0 ? new String("Failed to load ") : "Failed to load ".concat(str), e);
            return null;
        }
    }

    @Deprecated
    /* renamed from: a */
    public static IBinder m32404a(ClassLoader classLoader, String str) {
        try {
            return (IBinder) classLoader.loadClass(str).newInstance();
        } catch (ClassNotFoundException e) {
            RemoteException remoteException = new RemoteException();
            remoteException.initCause(e);
            throw remoteException;
        } catch (IllegalAccessException e2) {
            RemoteException remoteException2 = new RemoteException();
            remoteException2.initCause(e2);
            throw remoteException2;
        } catch (InstantiationException e3) {
            RemoteException remoteException3 = new RemoteException();
            remoteException3.initCause(e3);
            throw remoteException3;
        }
    }
}
