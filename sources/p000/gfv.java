package p000;

import com.google.android.gms.audiomodem.AudioModemBroadcastReceiver;

/* renamed from: gfv */
final /* synthetic */ class gfv implements Runnable {

    /* renamed from: a */
    private final gfx f18109a;

    /* renamed from: b */
    private final Runnable f18110b;

    public gfv(gfx gfx, Runnable runnable) {
        this.f18109a = gfx;
        this.f18110b = runnable;
    }

    public final void run() {
        gdc gdc;
        gfx gfx = this.f18109a;
        Runnable runnable = this.f18110b;
        gcy gcy = gfx.f18114b;
        gfw gfw = new gfw(gfx, runnable);
        AudioModemBroadcastReceiver audioModemBroadcastReceiver = gcy.f17902g;
        if (audioModemBroadcastReceiver.f9850c) {
            audioModemBroadcastReceiver.f9848a.unregisterReceiver(audioModemBroadcastReceiver);
            audioModemBroadcastReceiver.f9850c = false;
        }
        if (gcy.f17901f) {
            gcy.f17900e.mo11737a();
        }
        if (gcy.f17899d) {
            geq geq = gcy.f17898c;
            geq.f18067c = gfw;
            gdd gdd = geq.f18065a;
            gdd.f17931k = true;
            for (int i = 0; i < gdd.f17921a.length; i++) {
                if (gdd.f17927g[i]) {
                    gdd.mo11674b(i);
                }
            }
            for (int i2 = 0; i2 < gdd.f17921a.length; i2++) {
                gdd.f17924d[i2].post(new gda(gdd, i2));
            }
            if (!gdd.mo11672a() && (gdc = gdd.f17925e) != null) {
                gdc.mo11668a();
                return;
            }
            return;
        }
        gfw.run();
    }
}
