package p000;

import android.content.Intent;
import android.hardware.Sensor;
import com.google.android.gms.fitness.sensors.sample.CollectSensorChimeraService;

/* renamed from: zkv */
public final /* synthetic */ class zkv implements bqeh {

    /* renamed from: a */
    private final CollectSensorChimeraService f55331a;

    /* renamed from: b */
    private final Intent f55332b;

    /* renamed from: c */
    private final zlf f55333c;

    /* renamed from: d */
    private final int f55334d;

    /* renamed from: e */
    private final zgh f55335e;

    /* renamed from: f */
    private final Sensor f55336f;

    public zkv(CollectSensorChimeraService collectSensorChimeraService, Intent intent, zlf zlf, int i, zgh zgh, Sensor sensor) {
        this.f55331a = collectSensorChimeraService;
        this.f55332b = intent;
        this.f55333c = zlf;
        this.f55334d = i;
        this.f55335e = zgh;
        this.f55336f = sensor;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        boolean z;
        CollectSensorChimeraService collectSensorChimeraService = this.f55331a;
        Intent intent = this.f55332b;
        zlf zlf = this.f55333c;
        int i = this.f55334d;
        zgh zgh = this.f55335e;
        Sensor sensor = this.f55336f;
        if (((Boolean) obj).booleanValue()) {
            if (!intent.getBooleanExtra("allow_in_doze", false)) {
                z = false;
            } else {
                z = sensor != null;
            }
            if (cdzm.m135646b()) {
                caae caae = zgh.f55011a;
                caah caah = caae.f172330f;
                if (caah == null) {
                    caah = caah.f172333d;
                }
                if (caah.equals(bzzn.f172073M) && (caae.f172325a & 32) != 0) {
                    caap caap = caap.WATCH;
                    caaq caaq = caae.f172331g;
                    if (caaq == null) {
                        caaq = caaq.f172356h;
                    }
                    caap a = caap.m126421a(caaq.f172360c);
                    if (a == null) {
                        a = caap.UNKNOWN;
                    }
                    if (caap.equals(a)) {
                        zgh = zgh.mo31080a();
                    }
                }
            }
            int intExtra = intent.getIntExtra("max_sample_secs", 20);
            int intExtra2 = intent.getIntExtra("max_sample_points", 10);
            bqgy c = bqgy.m112818c();
            bqga.m112781a(zlf.f55149a.mo19155a(zgh.mo31081a(new zkz(zgh.f55012b, intExtra2, intExtra, zlf, collectSensorChimeraService.f32385d, i, z, c))), new zky(zgh, zlf, i, c), bqfb.INSTANCE);
            return c;
        }
        zlf.mo31222a(i, false);
        return bqga.m112775a((Object) false);
    }
}
