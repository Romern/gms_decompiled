package p000;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Semaphore;

/* renamed from: atxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atxs {

    /* renamed from: a */
    public final Semaphore f91088a;

    /* renamed from: b */
    public final Map f91089b;

    public atxs(int i) {
        this.f91088a = new Semaphore(i);
        this.f91089b = new HashMap(i);
    }

    /* renamed from: a */
    public final void mo50307a() {
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = this.f91089b.entrySet().iterator();
        while (it.hasNext()) {
            if (currentTimeMillis > ((atxu) ((Map.Entry) it.next()).getValue()).f91096a) {
                this.f91088a.release();
                it.remove();
            }
        }
    }
}
