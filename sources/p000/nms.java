package p000;

import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: nms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nms {

    /* renamed from: a */
    public final LinkedList f36052a = new LinkedList();

    /* renamed from: b */
    public int f36053b;

    public nms(int i) {
        this.f36053b = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo21164a() {
        return this.f36052a.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final nmr mo21165a(nmq nmq) {
        Iterator it = this.f36052a.iterator();
        while (it.hasNext()) {
            nmr nmr = (nmr) it.next();
            if (bmxi.m108538a(nmr.f36050a, nmq)) {
                return nmr;
            }
        }
        return null;
    }
}
