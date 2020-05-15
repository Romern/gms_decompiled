package p000;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: rlp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rlp extends adzt {
    public rlp() {
        super(Looper.getMainLooper());
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            Pair pair = (Pair) message.obj;
            rkl rkl = (rkl) pair.first;
            rkk rkk = (rkk) pair.second;
            try {
                rkl.mo9454a(rkk);
            } catch (RuntimeException e) {
                BasePendingResult.m22492b(rkk);
                throw e;
            }
        } else if (i != 2) {
            int i2 = message.what;
            StringBuilder sb = new StringBuilder(45);
            sb.append("Don't know how to handle message: ");
            sb.append(i2);
            Log.wtf("BasePendingResult", sb.toString(), new Exception());
        } else {
            ((BasePendingResult) message.obj).mo17719d(Status.f30110d);
        }
    }

    /* renamed from: a */
    public final void mo24865a(rkl rkl, rkk rkk) {
        sendMessage(obtainMessage(1, new Pair(BasePendingResult.m22491b(rkl), rkk)));
    }

    public rlp(Looper looper) {
        super(looper);
    }
}
