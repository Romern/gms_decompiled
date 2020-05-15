package p000;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;

/* renamed from: yzc */
final /* synthetic */ class yzc implements bmzi {

    /* renamed from: a */
    private final yzp f54840a;

    public yzc(yzp yzp) {
        this.f54840a = yzp;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        zis zis;
        yzp yzp = this.f54840a;
        SensorManager sensorManager = (SensorManager) yzp.f54857c.getSystemService("sensor");
        zjn zjn = new zjn(yzp.f54857c, srb.f45012a);
        zjo zjo = new zjo(yzp.f54855b);
        EnumSet allOf = EnumSet.allOf(zjf.class);
        if (cdzd.m135493v()) {
            allOf.remove(zjf.STEP_COUNTER);
        }
        zjm zjm = new zjm(yzp.f54857c, allOf, sensorManager, zjn, zjo, yzp.f54859e, yzp.mo30887i());
        C1223np npVar = new C1223np();
        npVar.put(bzzn.f172073M, new yqg((int) cdzm.f182081a.mo6606a().mo78617i(), (int) cdzm.f182081a.mo6606a().mo78616h(), cdzm.f182081a.mo6606a().mo78615g(), TimeUnit.SECONDS, cdzm.f182081a.mo6606a().mo78609a(), cdzm.f182081a.mo6606a().mo78611c()));
        zgf a = zlf.m45677a(yzp.f54857c, zjm, npVar);
        if (cdzs.f182101a.mo6606a().mo78630d()) {
            Context context = yzp.f54857c;
            SensorManager sensorManager2 = (SensorManager) context.getSystemService("sensor");
            int i = Build.VERSION.SDK_INT;
            Sensor defaultSensor = sensorManager2.getDefaultSensor(34, true);
            if (defaultSensor == null) {
                zis = zis.f55159f;
            } else {
                zis = new ziq(context, sensorManager2, defaultSensor);
            }
            a = new zil(a, zis, snp.m35703a(1, 10));
        }
        return new zjr(yzp.f54855b, new zkf(a, "Local HW"), zjo, yzp.f54858d);
    }
}
