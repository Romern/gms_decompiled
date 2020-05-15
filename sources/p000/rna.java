package p000;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* renamed from: rna */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rna extends adzt {

    /* renamed from: a */
    final /* synthetic */ rnb f43346a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rna(rnb rnb, Looper looper) {
        super(looper);
        this.f43346a = rnb;
    }

    public final void handleMessage(Message message) {
        Lock lock;
        int i = message.what;
        if (i == 1) {
            rmz rmz = (rmz) message.obj;
            rnb rnb = this.f43346a;
            rnb.f43347a.lock();
            try {
                if (rnb.f43356j != rmz.f43345c) {
                    lock = rnb.f43347a;
                } else {
                    rmz.mo24891a();
                    lock = rnb.f43347a;
                }
                lock.unlock();
            } catch (Throwable th) {
                rnb.f43347a.unlock();
                throw th;
            }
        } else if (i != 2) {
            int i2 = message.what;
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i2);
            Log.w("GACStateManager", sb.toString());
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}
