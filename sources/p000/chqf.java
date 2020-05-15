package p000;

import java.util.IdentityHashMap;
import java.util.Map;

/* renamed from: chqf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chqf {

    /* renamed from: a */
    private chqh f188996a;

    /* renamed from: b */
    private Map f188997b;

    public chqf(chqh chqh) {
        this.f188996a = chqh;
    }

    /* renamed from: a */
    public final chqh mo85531a() {
        if (this.f188997b != null) {
            chqh chqh = this.f188996a;
            chqh chqh2 = chqh.f188999b;
            for (Map.Entry entry : chqh.f189000a.entrySet()) {
                if (!this.f188997b.containsKey(entry.getKey())) {
                    this.f188997b.put((chqg) entry.getKey(), entry.getValue());
                }
            }
            this.f188996a = new chqh(this.f188997b);
            this.f188997b = null;
        }
        return this.f188996a;
    }

    /* renamed from: a */
    public final void mo85532a(chqg chqg, Object obj) {
        if (this.f188997b == null) {
            this.f188997b = new IdentityHashMap(1);
        }
        this.f188997b.put(chqg, obj);
    }
}
