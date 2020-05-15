package p000;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;

/* renamed from: arjm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arjm extends adzt {

    /* renamed from: a */
    final /* synthetic */ arim f87796a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public arjm(arim arim, Looper looper) {
        super(looper);
        this.f87796a = arim;
    }

    public final void handleMessage(Message message) {
        try {
            int i = message.what;
            if (i == 0) {
                ((arxl) ((arkz) this.f87796a.f87780a).f87835a).f88411a.f88431b.mo48903a((BootstrapProgressResult) message.obj);
            } else if (i == 1) {
                arao arao = this.f87796a.f87780a;
                ((arkz) arao).f87836b.mo48364n("source-bootstrap-api");
                arao arao2 = ((arkz) arao).f87835a;
                if (!cgpm.m146473c()) {
                    if (cgqy.m146727b()) {
                        arxy arxy = ((arxl) arao2).f88411a;
                        arxy.f88430a.logVerbose("Delay disconnect for %d milliseconds", 100L);
                        sns sns = new sns("delayDisconnect", 10);
                        sns.start();
                        new snr(sns).postDelayed(new arxf(arxy), 100);
                        ((arxl) arao2).f88411a.f88431b.mo48910f();
                    }
                }
                ((arxl) arao2).f88411a.f88432c.mo48359a();
                ((arxl) arao2).f88411a.f88431b.mo48910f();
            } else if (i == 2) {
                ((arxl) ((arkz) this.f87796a.f87780a).f87835a).f88411a.f88431b.mo48906b((String) message.obj);
            } else {
                int i2 = message.what;
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unrecognized message: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
        } catch (RemoteException e) {
            Log.e("SmartDevice", "Error invoking ISourceBootstrapListener.", e);
        }
    }
}
