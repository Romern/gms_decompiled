package p000;

import java.util.Map;

/* renamed from: jna */
final /* synthetic */ class jna implements Runnable {

    /* renamed from: a */
    private final jnb f22852a;

    /* renamed from: b */
    private final Map f22853b;

    public jna(jnb jnb, Map map) {
        this.f22852a = jnb;
        this.f22853b = map;
    }

    public final void run() {
        jnb jnb = this.f22852a;
        Map map = this.f22853b;
        if (map != null) {
            jnb.mo13786a(map);
        } else {
            jnb.mo13785a();
        }
    }
}
