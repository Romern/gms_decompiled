package p000;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* renamed from: ebx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ebx {

    /* renamed from: a */
    public final WifiManager f14635a;

    /* renamed from: b */
    public final ebw f14636b;

    /* renamed from: c */
    public long f14637c;

    /* renamed from: d */
    public volatile boolean f14638d = false;

    /* renamed from: e */
    public volatile boolean f14639e;

    /* renamed from: f */
    public long f14640f;

    /* renamed from: g */
    public long f14641g;

    public ebx(Context context, Looper looper) {
        this.f14635a = (WifiManager) context.getSystemService("wifi");
        this.f14636b = new ebw(this, looper);
        long millis = TimeUnit.SECONDS.toMillis(10);
        this.f14637c = millis;
        m10080a(millis);
        this.f14640f = Long.MIN_VALUE;
    }

    /* renamed from: a */
    public static void m10080a(long j) {
        if (j < 5000) {
            StringBuilder sb = new StringBuilder(70);
            sb.append("scanPeriodMillis must be at least 5000, but found ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo9933a() {
        if (this.f14638d && this.f14639e) {
            long j = this.f14640f;
            long j2 = this.f14637c;
            ebw ebw = this.f14636b;
            long j3 = j + j2;
            if (!ebw.hasMessages(2)) {
                Message obtainMessage = ebw.obtainMessage(1);
                ebw.removeCallbacksAndMessages(null);
                ebw.sendMessageAtTime(obtainMessage, j3);
                return;
            }
            return;
        }
        this.f14636b.removeCallbacksAndMessages(null);
    }
}
