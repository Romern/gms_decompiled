package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;

/* renamed from: bfgw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfgw implements SensorEventListener {

    /* renamed from: a */
    final /* synthetic */ bfgx f113845a;

    public bfgw(bfgx bfgx) {
        this.f113845a = bfgx;
    }

    /* renamed from: a */
    private final boolean m96737a(bfgt bfgt) {
        int i;
        bfgy bfgy = this.f113845a.f113846a;
        if (bfgy == null || bfgt != bfgt.f113814d || (i = bfgy.f113854d) >= bfgy.f113851a) {
            return false;
        }
        bfgy.f113854d = i + 1;
        return true;
    }

    /* renamed from: a */
    public final void mo61676a(int i, long j, long j2, int i2, float f, float f2, float f3, float f4, float f5, float f6, SensorEvent sensorEvent) {
        if (!this.f113845a.mo61674i()) {
            bfgt a = bfgx.m96741a(i);
            if (!m96737a(a)) {
                bfev bfev = this.f113845a.f113805h;
                if (i == 14) {
                    bfev.f113606a.mo61581a(f, f2, f3, f4, f5, f6, i2, j, j2);
                }
            }
            this.f113845a.mo61672a(a, j2, sensorEvent);
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        long j;
        SensorEvent sensorEvent2 = sensorEvent;
        this.f113845a.f113807j.mo61864a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int type = sensorEvent2.sensor.getType();
        bfgt a = bfgx.m96741a(type);
        long j2 = sensorEvent2.timestamp;
        if (a.f113835B == 2) {
            j = 1000000 * elapsedRealtime;
        } else {
            j = j2;
        }
        int i = a.f113834A;
        float[] fArr = sensorEvent2.values;
        if (i == 1) {
            mo61678a(type, j, elapsedRealtime, sensorEvent2.accuracy, fArr[0], sensorEvent);
        } else if (i == 3) {
            mo61677a(type, j, elapsedRealtime, sensorEvent2.accuracy, fArr[0], fArr[1], fArr[2], sensorEvent);
        } else if (i == 4) {
            int i2 = sensorEvent2.accuracy;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            if (!this.f113845a.mo61674i()) {
                bfgt a2 = bfgx.m96741a(type);
                if (!m96737a(a2)) {
                    bfev bfev = this.f113845a.f113805h;
                    if (type == 65541) {
                        bfev.f113606a.mo61582a(f, f2, f3, f4, i2, j, elapsedRealtime);
                    }
                }
                this.f113845a.mo61672a(a2, elapsedRealtime, sensorEvent2);
            }
        } else if (i == 6) {
            mo61676a(type, j, elapsedRealtime, sensorEvent2.accuracy, fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], sensorEvent);
        } else {
            String valueOf = String.valueOf(a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
            sb.append("Unknown sensor data dimension: ");
            sb.append(i);
            sb.append(", scannerType: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo61677a(int i, long j, long j2, int i2, float f, float f2, float f3, SensorEvent sensorEvent) {
        int i3 = i;
        if (!this.f113845a.mo61674i()) {
            bfgt a = bfgx.m96741a(i);
            if (!m96737a(a)) {
                bfev bfev = this.f113845a.f113805h;
                if (i3 == 3) {
                    bfev.f113606a.mo61583a(f, f2, f3, i2, j, j2);
                } else if (i3 == 1) {
                    bfev.f113606a.mo61601b(f, f2, f3, i2, j, j2);
                } else if (i3 == 2) {
                    bfev.f113606a.mo61604c(f, f2, f3, i2, j, j2);
                } else if (i3 == 4) {
                    bfev.f113606a.mo61606d(f, f2, f3, i2, j, j2);
                }
            }
            this.f113845a.mo61672a(a, j2, sensorEvent);
        }
    }

    /* renamed from: a */
    public final void mo61678a(int i, long j, long j2, int i2, float f, SensorEvent sensorEvent) {
        int i3 = i;
        if (!this.f113845a.mo61674i()) {
            bfgt a = bfgx.m96741a(i);
            if (!m96737a(a)) {
                bfev bfev = this.f113845a.f113805h;
                if (i3 == 6) {
                    bfev.f113606a.mo61584a(f, i2, j, j2);
                } else if (i3 == 5) {
                    bfev.f113606a.mo61602b(f, i2, j, j2);
                } else if (i3 == 8) {
                    bfev.f113606a.mo61605c(f, i2, j, j2);
                } else if (i3 == 21) {
                    bfev.f113606a.mo61607d(f, i2, j, j2);
                } else if (i3 == 19) {
                    bfev.f113606a.mo61608e(f, i2, j, j2);
                }
            }
            this.f113845a.mo61672a(a, j2, sensorEvent);
        }
    }
}
