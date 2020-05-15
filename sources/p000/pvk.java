package p000;

import com.google.android.gms.cast.CastDevice;

/* renamed from: pvk */
final /* synthetic */ class pvk implements Runnable {

    /* renamed from: a */
    private final pvq f40364a;

    public pvk(pvq pvq) {
        this.f40364a = pvq;
    }

    public final void run() {
        pvq pvq = this.f40364a;
        pvq.f40379n.mo23670a("onSelect", new Object[0]);
        pvv pvv = pvq.f40382q;
        CastDevice castDevice = pvq.f40381p;
        String a = castDevice.mo17494a();
        pvt pvt = (pvt) pvv.f40408d.get(a);
        if (pvt == null) {
            pvv.f40405a.mo23670a("creating CastDeviceController for %s", castDevice);
            pvt pvt2 = new pvt(pvv.f40406b, castDevice, pvv.f40410f, pvv.f40411g, pvv.f40412h, castDevice.f29723k);
            pvv.f40408d.put(a, pvt2);
            pvv.f40407c.mo23842a();
            for (pvu pvu : pvv.f40409e) {
                pvu.mo17601a(a);
            }
            pvt = pvt2;
        }
        pvt.f40398b.add(pvq);
        pvq.f40388w = pvt.f40399c;
        pvq.f40386u = pvq.f40388w.mo23256j();
        if (pvq.f40388w.mo23211b()) {
            pvq.mo23697a();
        } else if (!pvq.f40388w.mo23213c()) {
            pvq.f40388w.mo23198a();
        }
    }
}
