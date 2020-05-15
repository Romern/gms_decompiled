package p000;

import android.os.Handler;
import android.os.Message;

/* renamed from: bfpk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfpk extends bhcg {

    /* renamed from: a */
    public static final String[] f114794a = {"unknown", "remove updates overlay", "request updates overlay", "received AR result", "received NLP status", "received NLP locations", "fusion engine disabled", "fusion engine enabled", "fusion engine set requests", "fusion engine inject location", "fusion engine flush locations", "fusion engine set callback", "fusion engine getLastLocation", "fusion engine dump", "WearableHelper peer disconnected", "WearableHelper peer connected", "WearableHelper connected nodes", "WearableHelper message received", "WearableHelper capability changed", "init system cache", "dump", "requestLocationUpdates", "removeLocationUpdates", "setMockMode", "setMockLocation", "all clients disconnected", "gps status received", "flush complete", "wifi connection changed", "device orientation dump", "requestDeviceOrientationUpdates", "removeDeviceOrientationUpdates", "received NLP compute Wifi locations result", "received NLP Wifi scan wake up events"};

    /* renamed from: b */
    public static final short[] f114795b = new short[33];

    public bfpk(Handler handler, asfb asfb) {
        super(handler, asfb);
    }

    /* renamed from: a */
    public final void mo62098a(int i, int i2, int i3, int i4, Object obj) {
        Message obtainMessage = this.f118293e.obtainMessage(i2, i3, i4, obj);
        asfb asfb = this.f118292d;
        if (asfb != null) {
            asfb.mo49111a(60000);
            if (!this.f118293e.sendMessage(obtainMessage)) {
                if (this.f118292d.mo49124e()) {
                    this.f118292d.mo49120c();
                    return;
                }
                return;
            }
        } else if (!this.f118291c.sendMessage(obtainMessage)) {
            return;
        }
        short[] sArr = f114795b;
        sArr[i] = (short) (sArr[i] + 1);
    }

    /* renamed from: a */
    public final boolean mo62099a(int i, Runnable runnable) {
        boolean a = mo63549a(runnable);
        if (a) {
            short[] sArr = f114795b;
            sArr[i] = (short) (sArr[i] + 1);
        }
        return a;
    }
}
