package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: albr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class albr implements SensorEventListener {

    /* renamed from: a */
    final /* synthetic */ albs f73346a;

    public albr(albs albs) {
        this.f73346a = albs;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            albs albs = this.f73346a;
            albs.f73348b.mo40068a(sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]);
            if (!albs.f73350d) {
                albs.f73349c.mo40068a(sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]);
                albs.f73350d = true;
            } else {
                float f = albs.f73351e;
                float f2 = 1.0f - f;
                alaz alaz = albs.f73349c;
                float f3 = sensorEvent.values[0];
                alaz alaz2 = albs.f73349c;
                alaz.f73239a = (f3 * f) + (alaz2.f73239a * f2);
                float f4 = sensorEvent.values[1];
                alaz alaz3 = albs.f73349c;
                alaz2.f73240b = (f4 * f) + (alaz3.f73240b * f2);
                alaz3.f73241c = (f * sensorEvent.values[2]) + (f2 * albs.f73349c.f73241c);
            }
            albs albs2 = this.f73346a;
            if (albs2.f73347a) {
                albs2.f73357k.mo40099b(sensorEvent.values, sensorEvent.timestamp);
            }
        } else if (sensorEvent.sensor.getType() == 2) {
            this.f73346a.f73352f[0] = sensorEvent.values[0];
            this.f73346a.f73352f[1] = sensorEvent.values[1];
            this.f73346a.f73352f[2] = sensorEvent.values[2];
        } else if (sensorEvent.sensor.getType() == 4) {
            float[] fArr = sensorEvent.values;
            fArr[0] = fArr[0] - this.f73346a.f73355i[0];
            float[] fArr2 = sensorEvent.values;
            fArr2[1] = fArr2[1] - this.f73346a.f73355i[1];
            float[] fArr3 = sensorEvent.values;
            fArr3[2] = fArr3[2] - this.f73346a.f73355i[2];
            float f5 = sensorEvent.values[0];
            float f6 = sensorEvent.values[0];
            float f7 = sensorEvent.values[1];
            float f8 = sensorEvent.values[1];
            float f9 = sensorEvent.values[2];
            float f10 = sensorEvent.values[2];
            albu albu = this.f73346a.f73360n;
            if (albu != null) {
                ((alcg) albu).f73403a.requestRender();
            }
            albs albs3 = this.f73346a;
            if (albs3.f73353g != 0) {
                float f11 = ((float) (sensorEvent.timestamp - albs3.f73353g)) * 1.0E-9f;
                synchronized (albs3) {
                    float[] fArr4 = albs3.f73354h;
                    fArr4[0] = fArr4[0] + (sensorEvent.values[0] * f11);
                    float[] fArr5 = albs3.f73354h;
                    fArr5[1] = fArr5[1] + (sensorEvent.values[1] * f11);
                    float[] fArr6 = albs3.f73354h;
                    fArr6[2] = fArr6[2] + (sensorEvent.values[2] * f11);
                    albs3.f73356j++;
                }
            }
            albs3.f73353g = sensorEvent.timestamp;
            albs albs4 = this.f73346a;
            if (albs4.f73347a) {
                albs4.f73357k.mo40098a(sensorEvent.values, sensorEvent.timestamp);
            }
        }
    }
}
