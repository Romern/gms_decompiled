package p000;

import android.hardware.Sensor;
import android.hardware.SensorEventListener2;
import com.google.android.gms.common.api.Status;

/* renamed from: zjl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zjl extends zjk implements SensorEventListener2 {

    /* renamed from: h */
    private bqgy f55216h;

    public zjl(zjm zjm, zgg zgg, zjf zjf, caae caae, zjn zjn, zjo zjo, zjs zjs) {
        super(zjm, zgg, zjf, caae, zjn, zjo, zjs);
    }

    /* renamed from: a */
    public final synchronized void mo31172a(bqgy bqgy) {
        this.f55216h = bqgy;
    }

    public final synchronized void onFlushCompleted(Sensor sensor) {
        bqgy bqgy = this.f55216h;
        if (bqgy != null) {
            bqgy.mo69138b(Status.f30107a);
            this.f55216h = null;
        }
    }
}
