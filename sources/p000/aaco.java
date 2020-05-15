package p000;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: aaco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aaco implements SensorEventListener {

    /* renamed from: a */
    private final aabp f27942a;

    public aaco(Context context) {
        this.f27942a = cdoz.m134483e() ? new aabp(new aabl(context, getClass(), 17)) : null;
    }

    /* renamed from: a */
    public abstract void mo9869a(SensorEvent sensorEvent);

    public final void onAccuracyChanged(Sensor sensor, int i) {
        blji a;
        aabp aabp = this.f27942a;
        if (aabp != null && (a = aabp.mo16700a()) != null) {
            a.close();
        }
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        aabp aabp = this.f27942a;
        if (aabp != null) {
            blji a = aabp.mo16700a();
            try {
                mo9869a(sensorEvent);
                if (a != null) {
                    a.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            mo9869a(sensorEvent);
            return;
        }
        throw th;
    }

    public aaco(String str, String str2) {
        this.f27942a = cdoz.m134483e() ? new aabp(new aabl(getClass(), 17, str, str2)) : null;
    }
}
