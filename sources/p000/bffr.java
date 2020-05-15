package p000;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import com.google.android.location.collectionlib.RealCollectorConfig;

/* renamed from: bffr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bffr {

    /* renamed from: a */
    public final SensorManager f113711a;

    public bffr(Context context) {
        this.f113711a = (SensorManager) context.getSystemService("sensor");
    }

    /* renamed from: a */
    public final Sensor mo61623a(int i) {
        return this.f113711a.getDefaultSensor(i);
    }

    /* renamed from: a */
    public final Sensor mo61624a(bfgt bfgt) {
        Integer num = (Integer) RealCollectorConfig.f150689a.get(bfgt);
        if (num != null) {
            return (Sensor) bnjd.m109589b(this.f113711a.getSensorList(num.intValue()), (Object) null);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo61625a(SensorEventListener sensorEventListener) {
        this.f113711a.unregisterListener(sensorEventListener);
    }

    /* renamed from: a */
    public final boolean mo61626a(SensorEventListener sensorEventListener, Sensor sensor, int i, Handler handler) {
        return this.f113711a.registerListener(sensorEventListener, sensor, i, handler);
    }
}
