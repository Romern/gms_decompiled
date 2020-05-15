package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

/* renamed from: albl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class albl {

    /* renamed from: a */
    public Semaphore f73292a;

    /* renamed from: b */
    public final albb f73293b;

    /* renamed from: c */
    public final List f73294c = new ArrayList();

    /* renamed from: d */
    public final albu f73295d;

    /* renamed from: e */
    public albu f73296e;

    /* renamed from: f */
    public final alcn f73297f;

    public albl(alcn alcn) {
        this.f73297f = alcn;
        this.f73293b = alcn.f73477e;
        this.f73295d = new albk(this);
        mo40094a();
    }

    /* renamed from: a */
    public final void mo40094a() {
        List list = this.f73294c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            albe albe = (albe) list.get(i);
            albe.f73255a.remove(albe);
            albe.f73259d = null;
        }
        this.f73294c.clear();
        this.f73292a = new Semaphore(4);
    }
}
