package p000;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: rmv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rmv extends adzt {

    /* renamed from: a */
    final /* synthetic */ rmx f43319a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rmv(rmx rmx, Looper looper) {
        super(looper);
        this.f43319a = rmx;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            rmx rmx = this.f43319a;
            int i2 = rmx.f43321m;
            rmx.f43322b.lock();
            try {
                if (rmx.mo24916m()) {
                    rmx.mo24914k();
                }
            } finally {
                rmx.f43322b.unlock();
            }
        } else if (i != 2) {
            int i3 = message.what;
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i3);
            Log.w("GoogleApiClientImpl", sb.toString());
        } else {
            rmx rmx2 = this.f43319a;
            int i4 = rmx.f43321m;
            rmx2.mo24915l();
        }
    }
}
