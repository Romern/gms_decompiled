package p000;

import android.content.Context;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.google.android.gms.fitness.sensors.sample.CollectSensorChimeraService;

/* renamed from: zkx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zkx extends aaco {

    /* renamed from: a */
    final /* synthetic */ SensorManager f55339a;

    /* renamed from: b */
    final /* synthetic */ bqgy f55340b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zkx(Context context, SensorManager sensorManager, bqgy bqgy) {
        super(context);
        this.f55339a = sensorManager;
        this.f55340b = bqgy;
    }

    /* renamed from: a */
    public final void mo9869a(SensorEvent sensorEvent) {
        this.f55339a.unregisterListener(this);
        boolean z = false;
        if (sensorEvent.values[0] != 0.0f) {
            z = true;
        }
        if (!z) {
            srn srn = CollectSensorChimeraService.f32383b;
        }
        this.f55340b.mo69138b(Boolean.valueOf(z));
    }
}
