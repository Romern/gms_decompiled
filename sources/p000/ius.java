package p000;

import com.google.android.gms.auth.proximity.ConnectionInfo;
import com.google.android.gms.auth.proximity.RemoteDevice;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* renamed from: ius */
final /* synthetic */ class ius implements Callable {

    /* renamed from: a */
    private final iuv f21818a;

    /* renamed from: b */
    private final RemoteDevice f21819b;

    public ius(iuv iuv, RemoteDevice remoteDevice) {
        this.f21818a = iuv;
        this.f21819b = remoteDevice;
    }

    public final Object call() {
        byte[] bArr;
        iuv iuv = this.f21818a;
        RemoteDevice remoteDevice = this.f21819b;
        iuy iuy = iuv.f21825a;
        synchronized (iuy.f21838b) {
            Iterator it = iuy.mo13353d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    bArr = null;
                    break;
                }
                ConnectionInfo connectionInfo = (ConnectionInfo) it.next();
                if (connectionInfo.f11124b.equals(remoteDevice)) {
                    bArr = connectionInfo.f11127e;
                    break;
                }
            }
        }
        if (bArr == null) {
            iuv.f21824j.mo25414c("Failed to decrypt request, no channel binding data.", new Object[0]);
        }
        return bArr;
    }
}
