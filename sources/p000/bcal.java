package p000;

import android.util.LruCache;

/* renamed from: bcal */
final /* synthetic */ class bcal implements bbqr {

    /* renamed from: a */
    private final bcas f103879a;

    /* renamed from: b */
    private final bcdo f103880b;

    /* renamed from: c */
    private final bdar f103881c;

    public bcal(bcas bcas, bcdo bcdo, bdar bdar) {
        this.f103879a = bcas;
        this.f103880b = bcdo;
        this.f103881c = bdar;
    }

    /* renamed from: a */
    public final void mo56377a(Object obj) {
        bcas bcas = this.f103879a;
        bcdo bcdo = this.f103880b;
        bdar bdar = this.f103881c;
        Integer num = (Integer) obj;
        synchronized (bcas) {
            if (bcas.f103912g == null && num.intValue() > 0) {
                bcas.f103912g = new LruCache(num.intValue());
                bcas.f103912g.put(bcdo, bdar);
            }
        }
    }
}
