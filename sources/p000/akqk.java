package p000;

import android.hardware.SensorEvent;

/* renamed from: akqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akqk extends aaco {

    /* renamed from: a */
    final /* synthetic */ akql f72438a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public akqk(akql akql) {
        super("FlashlightManager$LightSensorListener", "ocr");
        this.f72438a = akql;
    }

    /* renamed from: a */
    public final void mo9869a(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 5 && sensorEvent.values != null && sensorEvent.values.length > 0) {
            new Object[1][0] = Float.valueOf(sensorEvent.values[0]);
            this.f72438a.f72448j = sensorEvent.values[0];
        }
    }
}
