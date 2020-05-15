package p000;

import android.util.LruCache;

/* renamed from: bcak */
final /* synthetic */ class bcak implements bbqr {

    /* renamed from: a */
    private final bcas f103878a;

    public bcak(bcas bcas) {
        this.f103878a = bcas;
    }

    /* renamed from: a */
    public final void mo56377a(Object obj) {
        bcas bcas = this.f103878a;
        Integer num = (Integer) obj;
        synchronized (bcas) {
            if (bcas.f103912g == null && num.intValue() > 0) {
                bcas.f103912g = new LruCache(num.intValue());
            }
        }
    }
}
