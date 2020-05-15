package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.wearable.internal.AddListenerRequest;
import java.util.HashMap;
import java.util.Map;

/* renamed from: axsb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axsb {

    /* renamed from: a */
    public final Map f96291a = new HashMap();

    /* renamed from: a */
    public final void mo53510a(IBinder iBinder) {
        axry axry;
        axtn axtn;
        synchronized (this.f96291a) {
            if (iBinder != null) {
                try {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                    axry = !(queryLocalInterface instanceof axry) ? new axrw(iBinder) : (axry) queryLocalInterface;
                } catch (RemoteException e) {
                    String valueOf = String.valueOf(r3.getKey());
                    String valueOf2 = String.valueOf(axtn);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32 + String.valueOf(valueOf2).length());
                    sb.append("onPostInitHandler: Didn't add: ");
                    sb.append(valueOf);
                    sb.append("/");
                    sb.append(valueOf2);
                    Log.w("WearableClient", sb.toString());
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                axry = null;
            }
            axtf axtf = new axtf();
            for (Map.Entry entry : this.f96291a.entrySet()) {
                axtn = (axtn) entry.getValue();
                axry.mo53471a(axtf, new AddListenerRequest(axtn));
                if (Log.isLoggable("WearableClient", 3)) {
                    String valueOf3 = String.valueOf(entry.getKey());
                    String valueOf4 = String.valueOf(axtn);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 27 + String.valueOf(valueOf4).length());
                    sb2.append("onPostInitHandler: added: ");
                    sb2.append(valueOf3);
                    sb2.append("/");
                    sb2.append(valueOf4);
                    Log.d("WearableClient", sb2.toString());
                }
            }
        }
    }
}
