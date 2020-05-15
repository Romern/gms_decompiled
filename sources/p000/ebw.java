package p000;

import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;

/* renamed from: ebw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ebw extends adzt {

    /* renamed from: a */
    final /* synthetic */ ebx f14634a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ebw(ebx ebx, Looper looper) {
        super(looper);
        this.f14634a = ebx;
    }

    /* renamed from: a */
    private final void m10079a() {
        if (this.f14634a.f14639e) {
            this.f14634a.f14635a.startScan();
            this.f14634a.f14640f = SystemClock.uptimeMillis();
            removeCallbacksAndMessages(null);
            sendMessageDelayed(obtainMessage(2), 4000);
        }
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            m10079a();
        } else if (i == 2) {
            Log.w("IndoorOutdoorPredictor", "WiFi scan timed out");
            this.f14634a.f14641g++;
            m10079a();
        } else {
            String valueOf = String.valueOf(message);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("Unknown message ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
