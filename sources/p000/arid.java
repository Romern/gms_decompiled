package p000;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;

/* renamed from: arid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arid extends adzt {

    /* renamed from: a */
    final /* synthetic */ arii f87771a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public arid(arii arii, Looper looper) {
        super(looper);
        this.f87771a = arii;
    }

    public final void handleMessage(Message message) {
        try {
            int i = message.what;
            if (i == 0) {
                this.f87771a.f87778a.mo48268a((BootstrapCompletionResult) message.obj);
            } else if (i == 1) {
                this.f87771a.f87778a.mo48270a((BootstrapProgressResult) message.obj);
            } else if (i == 2) {
                this.f87771a.f87778a.mo48266a((PendingIntent) message.obj);
            } else if (i == 3) {
                this.f87771a.f87778a.mo48265a(message.arg1, (String) message.obj);
            } else if (i == 4) {
                this.f87771a.f87778a.mo48269a((BootstrapOptions) message.obj);
            } else {
                int i2 = message.what;
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unrecognized message: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
        } catch (RemoteException e) {
            Log.w("DTListenerHandler2", "Error invoking ISourceBootstrapListener.", e);
        }
    }
}
