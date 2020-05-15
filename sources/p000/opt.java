package p000;

import android.os.Looper;
import android.os.Message;

/* renamed from: opt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class opt extends nvt {

    /* renamed from: a */
    public final opu f38191a;

    public opt(opu opu) {
        super(null, Looper.getMainLooper());
        this.f38191a = opu;
    }

    /* renamed from: a */
    public final void mo22494a() {
        boolean z;
        bnsn bnsn = opu.f38192a;
        synchronized (this.f38191a) {
            z = false;
            if (!this.f38191a.f38198e.isEmpty() && !this.f38191a.f38199f.isEmpty()) {
                z = true;
            }
        }
        if (z) {
            removeMessages(1);
            sendMessage(obtainMessage(1));
        } else if (!hasMessages(1)) {
            sendMessageDelayed(obtainMessage(1), ccpp.f179704a.mo6606a().mo76603d());
        }
    }

    public final void handleMessage(Message message) {
        if (message.what == 1) {
            opu opu = this.f38191a;
            bnsn bnsn = opu.f38192a;
            opu.mo22498b();
        }
    }
}
