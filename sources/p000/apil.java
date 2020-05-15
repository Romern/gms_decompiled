package p000;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: apil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apil {
    /* renamed from: a */
    public static boolean m70420a(IBinder iBinder) {
        return m70421a("android.os.IMessenger", iBinder);
    }

    /* renamed from: a */
    public static boolean m70421a(String str, IBinder iBinder) {
        if (iBinder != null) {
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if (str.equals(interfaceDescriptor)) {
                    return true;
                }
                StringBuilder sb = new StringBuilder(str.length() + 15 + String.valueOf(interfaceDescriptor).length());
                sb.append("Expected ");
                sb.append(str);
                sb.append(", got ");
                sb.append(interfaceDescriptor);
                Log.w("BinderUtils", sb.toString());
                return false;
            } catch (RemoteException e) {
                Log.w("BinderUtils", "Couldn't identify descriptor.");
                return false;
            }
        } else {
            Log.w("BinderUtils", str.length() == 0 ? new String("Binder is null, expected ") : "Binder is null, expected ".concat(str));
            return false;
        }
    }
}
