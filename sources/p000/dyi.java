package p000;

import android.hardware.SensorEvent;

/* renamed from: dyi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dyi extends aaco {

    /* renamed from: a */
    final /* synthetic */ dyo f14402a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dyi(dyo dyo, String str, String str2) {
        super(str, str2);
        this.f14402a = dyo;
    }

    /* renamed from: a */
    public final void mo9869a(SensorEvent sensorEvent) {
        if (sensorEvent.values != null && sensorEvent.values.length == 1) {
            this.f14402a.f14414F = sensorEvent.values[0];
            new Object[1][0] = Float.valueOf(this.f14402a.f14414F);
            dyo dyo = this.f14402a;
            dyo.f14429r.unregisterListener(dyo.f14424m);
            dyo dyo2 = this.f14402a;
            dyo2.f14422k.mo9434a(dyo2.f14427p, cdgp.f180782a.mo6606a().mo77509A(), dqy.m9123a("DNDModeProducer_light_sensor"));
            this.f14402a.mo9875b(0L);
        }
    }
}
