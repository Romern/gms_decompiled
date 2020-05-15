package p000;

import android.hardware.TriggerEvent;
import android.hardware.TriggerEventListener;
import java.util.concurrent.TimeUnit;

/* renamed from: dyh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dyh extends TriggerEventListener {

    /* renamed from: a */
    final /* synthetic */ dyo f14401a;

    public dyh(dyo dyo) {
        this.f14401a = dyo;
    }

    public final void onTrigger(TriggerEvent triggerEvent) {
        new Object[1][0] = Long.valueOf(triggerEvent.timestamp);
        if (triggerEvent.values != null && triggerEvent.values.length == 1 && triggerEvent.values[0] == 1.0f) {
            this.f14401a.f14413E = TimeUnit.NANOSECONDS.toMillis(triggerEvent.timestamp);
            new Object[1][0] = Long.valueOf(this.f14401a.f14413E);
            dyo dyo = this.f14401a;
            dxr dxr = dyo.f14407L;
            dyo.f14422k.mo9434a(dyo.f14426o, cdgp.f180782a.mo6606a().mo77510B(), dqy.m9123a("DNDModeProducer_motion_sensor"));
            this.f14401a.mo9875b(0L);
            this.f14401a.mo9875b(cdgp.m133202k());
        }
    }
}
