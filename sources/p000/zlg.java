package p000;

import android.content.Context;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* renamed from: zlg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zlg extends aaco {

    /* renamed from: a */
    final /* synthetic */ SensorManager f55378a;

    /* renamed from: b */
    final /* synthetic */ bqgy f55379b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zlg(Context context, SensorManager sensorManager, bqgy bqgy) {
        super(context);
        this.f55378a = sensorManager;
        this.f55379b = bqgy;
    }

    /* renamed from: a */
    public final void mo9869a(SensorEvent sensorEvent) {
        this.f55378a.unregisterListener(this);
        boolean z = false;
        if (sensorEvent.values[0] != 0.0f) {
            z = true;
        }
        if (!z) {
            srn srn = zlh.f55380a;
        }
        this.f55379b.mo69138b(Boolean.valueOf(z));
    }
}
