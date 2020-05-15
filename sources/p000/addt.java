package p000;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.iid.MessengerCompat;

/* renamed from: addt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class addt {

    /* renamed from: a */
    final Messenger f61453a;

    /* renamed from: b */
    final MessengerCompat f61454b;

    public addt(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f61453a = new Messenger(iBinder);
            this.f61454b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f61454b = new MessengerCompat(iBinder);
            this.f61453a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() == 0 ? new String("Invalid interface descriptor: ") : "Invalid interface descriptor: ".concat(valueOf));
            throw new RemoteException();
        }
    }
}
