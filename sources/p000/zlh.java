package p000;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;

/* renamed from: zlh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zlh {

    /* renamed from: a */
    public static final srn f55380a = zvt.m46581a();

    /* renamed from: b */
    public final Context f55381b;

    public zlh(Context context) {
        this.f55381b = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bqgg mo31223a() {
        if (yua.m44838c(this.f55381b)) {
            return bqga.m112775a((Object) false);
        }
        boolean e = yua.m44840e(this.f55381b);
        Sensor b = mo31224b();
        if (b == null) {
            return bqga.m112775a(Boolean.valueOf(!e));
        }
        SensorManager sensorManager = (SensorManager) this.f55381b.getSystemService("sensor");
        bqgy c = bqgy.m112818c();
        if (sensorManager.registerListener(new zlg(this.f55381b, sensorManager, c), b, 0)) {
            return c;
        }
        bnsl bnsl = (bnsl) f55380a.mo68388c();
        bnsl.mo68432a("zlh", "a", 73, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Failed to register LLOB listener.");
        return bqga.m112775a(Boolean.valueOf(!e));
    }

    /* renamed from: b */
    public final Sensor mo31224b() {
        if (cdzm.m135647c()) {
            return (Sensor) bnjd.m109589b(((SensorManager) this.f55381b.getSystemService("sensor")).getSensorList(34), (Object) null);
        }
        return null;
    }
}
