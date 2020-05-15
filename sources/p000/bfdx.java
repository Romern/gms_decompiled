package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener2;
import com.google.android.location.collectionlib.RealCollectorConfig;

/* renamed from: bfdx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfdx implements SensorEventListener2 {

    /* renamed from: a */
    final /* synthetic */ bfeb f113538a;

    protected bfdx(bfeb bfeb) {
        this.f113538a = bfeb;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009e, code lost:
        return;
     */
    public final void onFlushCompleted(Sensor sensor) {
        synchronized (this.f113538a.f113550c) {
            bfeb bfeb = this.f113538a;
            int i = bfeb.f113554g - 1;
            bfeb.f113554g = i;
            if (i <= 0) {
                long j = Long.MIN_VALUE;
                long j2 = Long.MAX_VALUE;
                for (int i2 = 0; i2 < this.f113538a.f113553f.size(); i2++) {
                    bfkf bfkf = ((bfdz) this.f113538a.f113553f.valueAt(i2)).f113541a;
                    int i3 = bfkf.f114284c;
                    if (i3 > 0) {
                        long a = bfkf.mo61829a(i3 - 1);
                        if (j2 > a) {
                            j2 = a;
                        }
                        if (j < a) {
                            j = a;
                        }
                    }
                }
                if (j2 != Long.MAX_VALUE) {
                    if (j != Long.MIN_VALUE && j - j2 > 1000000000) {
                        return;
                    }
                }
                for (bffc bffc : this.f113538a.f113552e) {
                    String valueOf = String.valueOf(bffc);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
                    sb.append("DataReader ");
                    sb.append(valueOf);
                    sb.append(" started by onFlushCompleted.");
                    sb.toString();
                    bffc.run();
                }
                this.f113538a.f113552e.clear();
            }
        }
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        bfkf bfkf;
        bfdz bfdz;
        synchronized (this.f113538a.f113550c) {
            bfgt bfgt = (bfgt) RealCollectorConfig.f150690b.get(Integer.valueOf(sensorEvent.sensor.getType()));
            bfkf = null;
            if (!(bfgt == null || (bfdz = (bfdz) this.f113538a.f113553f.get(bfgt.f113836x)) == null)) {
                bfkf = bfdz.f113541a;
            }
        }
        if (bfkf != null) {
            bfkf.mo61830a(sensorEvent.timestamp, sensorEvent.values);
        }
    }
}
