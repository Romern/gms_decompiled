package p000;

import java.io.IOException;

/* renamed from: xla */
final /* synthetic */ class xla implements Runnable {

    /* renamed from: a */
    private final xlc f52640a;

    public xla(xlc xlc) {
        this.f52640a = xlc;
    }

    public final void run() {
        try {
            this.f52640a.f52644a.f52637a.close();
        } catch (IOException e) {
            adbd a = adbe.m50105a();
            a.f61234c = 8;
            a.f61233b = e;
            throw a.mo33301a().mo33303c();
        }
    }
}
