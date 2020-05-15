package p000;

import android.hardware.Sensor;
import android.hardware.SensorManager;

/* renamed from: berl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class berl {
    /* renamed from: a */
    public static int m95587a(SensorManager sensorManager, int i) {
        Sensor defaultSensor = sensorManager.getDefaultSensor(i);
        if (defaultSensor != null) {
            return defaultSensor.getFifoMaxEventCount();
        }
        return 0;
    }
}
