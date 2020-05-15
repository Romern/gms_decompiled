package p000;

import android.content.Context;
import android.hardware.SensorEvent;

/* renamed from: zip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zip extends aaco {

    /* renamed from: a */
    final /* synthetic */ ziq f55151a;

    /* renamed from: b */
    private Boolean f55152b = null;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zip(ziq ziq, Context context) {
        super(context);
        this.f55151a = ziq;
    }

    /* renamed from: a */
    public final void mo9869a(SensorEvent sensorEvent) {
        zir zir;
        boolean z = false;
        if (sensorEvent.values[0] != 0.0f) {
            z = true;
        }
        zis zis = zis.f55159f;
        Boolean valueOf = Boolean.valueOf(z);
        Boolean bool = this.f55152b;
        if (bool == null || !bool.equals(valueOf)) {
            this.f55152b = valueOf;
            synchronized (this.f55151a.f55153a) {
                zir = this.f55151a.f55154b;
            }
            if (zir != null) {
                zir.mo31154a(z);
            }
        }
    }
}
