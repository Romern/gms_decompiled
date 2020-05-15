package p000;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.smartdevice.d2d.D2DDevice;

/* renamed from: arjo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arjo extends adzt {

    /* renamed from: a */
    final /* synthetic */ ariy f87798a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public arjo(ariy ariy, Looper looper) {
        super(looper);
        this.f87798a = ariy;
    }

    public final void handleMessage(Message message) {
        try {
            int i = message.what;
            if (i == 0) {
                this.f87798a.f87785a.mo48217a();
            } else if (i == 1) {
                this.f87798a.f87785a.mo48219a((D2DDevice) message.obj);
            } else if (i == 2) {
                this.f87798a.f87785a.mo48218a(((Integer) message.obj).intValue());
            } else if (i == 3) {
                this.f87798a.f87785a.mo48220b((D2DDevice) message.obj);
            } else {
                int i2 = message.what;
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unrecognized message: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
        } catch (RemoteException e) {
            Log.e("SmartDevice", "Error invoking ISourceScanListener.", e);
        }
    }
}
