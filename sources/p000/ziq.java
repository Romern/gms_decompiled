package p000;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* renamed from: ziq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ziq implements zis {

    /* renamed from: a */
    public final Object f55153a = new Object();

    /* renamed from: b */
    public zir f55154b;

    /* renamed from: c */
    final /* synthetic */ Context f55155c;

    /* renamed from: d */
    final /* synthetic */ SensorManager f55156d;

    /* renamed from: e */
    final /* synthetic */ Sensor f55157e;

    /* renamed from: g */
    private SensorEventListener f55158g;

    public ziq(Context context, SensorManager sensorManager, Sensor sensor) {
        this.f55155c = context;
        this.f55156d = sensorManager;
        this.f55157e = sensor;
    }

    /* renamed from: a */
    public final void mo31156a() {
        synchronized (this.f55153a) {
            SensorEventListener sensorEventListener = this.f55158g;
            if (sensorEventListener != null) {
                this.f55156d.unregisterListener(sensorEventListener);
                this.f55158g = null;
                this.f55154b = null;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo31158b() {
        boolean z;
        synchronized (this.f55153a) {
            z = this.f55154b != null;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo31157a(zir zir) {
        synchronized (this.f55153a) {
            if (this.f55154b == null) {
                this.f55154b = zir;
                zip zip = new zip(this, this.f55155c);
                this.f55158g = zip;
                this.f55156d.registerListener(zip, this.f55157e, 0);
            } else {
                throw new IllegalStateException("already enabled.");
            }
        }
    }
}
