package p000;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* renamed from: bgrk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgrk extends bgtf implements bgrh {

    /* renamed from: a */
    public bgrx f117333a;

    /* renamed from: b */
    private final bgsd f117334b;

    /* renamed from: c */
    private final sqv f117335c;

    /* renamed from: d */
    private bgtk f117336d;

    /* renamed from: e */
    private final bgqt f117337e;

    public bgrk(bgsd bgsd, sqv sqv, bgqt bgqt) {
        super("Mon");
        this.f117334b = bgsd;
        this.f117335c = sqv;
        this.f117337e = bgqt;
    }

    /* renamed from: a */
    public final void mo63111a() {
        Sensor defaultSensor;
        if (this.f117334b.mo63083i()) {
            srn srn = bgrw.f117381a;
            if (this.f117336d == null) {
                if (!cezu.m138504y()) {
                    this.f117336d = new bgtj(cezu.m138495p());
                } else {
                    this.f117336d = bgta.m99877a("ea_q_s", this.f117335c, cezu.f183534a.mo6606a().seismicShakeThrottlerConfig(), new sty(this.f117482h.f117486b));
                }
            }
            bgqt bgqt = this.f117337e;
            bgrw bgrw = bgqt.f117309a;
            bgrx bgrx = new bgrx(bgrw.f117383b, bgrw.f117385d, bgqt.f117310b, bgrw.f117384c.mo63151a(7));
            this.f117333a = bgrx;
            bgrx.f117392e = (SensorManager) bgrx.f117388a.getSystemService("sensor");
            SensorManager sensorManager = bgrx.f117392e;
            if (sensorManager != null && (defaultSensor = sensorManager.getDefaultSensor(1)) != null) {
                try {
                    bgrx.f117392e.registerListener(bgrx, defaultSensor, (int) (TimeUnit.SECONDS.toMicros(1) / cezu.m138484e()), new adzt(bgrx.f117389b.getLooper()));
                } catch (IllegalStateException e) {
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo63113b() {
        bgrx bgrx = this.f117333a;
        if (bgrx != null) {
            SensorManager sensorManager = bgrx.f117392e;
            if (sensorManager != null) {
                sensorManager.unregisterListener(bgrx);
            }
            this.f117333a = null;
        }
    }

    /* renamed from: f */
    public final buoc mo63110f() {
        bgrx bgrx = this.f117333a;
        if (bgrx != null) {
            return bgrx.f117390c;
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo63112a(Message message) {
        int i = message.what;
        if (i == 7) {
            srn srn = bgrw.f117381a;
            if (!this.f117336d.mo63143a(new bgrj(this, message))) {
                this.f117482h.f117486b.mo63146a(9);
            }
            return false;
        } else if (i == 12 || !this.f117482h.f117486b.hasMessages(10)) {
            return false;
        } else {
            Message obtainMessage = this.f117482h.f117486b.obtainMessage(message.what);
            obtainMessage.setData(message.getData());
            this.f117482h.f117486b.sendMessageDelayed(obtainMessage, cezu.m138494o() / 2);
            srn srn2 = bgrw.f117381a;
            int i2 = message.what;
            return true;
        }
    }
}
