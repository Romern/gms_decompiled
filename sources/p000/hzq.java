package p000;

import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: hzq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hzq {

    /* renamed from: a */
    public final WeakHashMap f20605a = new WeakHashMap();

    /* renamed from: b */
    final /* synthetic */ hzm f20606b;

    public hzq() {
    }

    /* renamed from: a */
    public final void mo12839a(hzh hzh, long j) {
        long j2;
        if (ccds.f178804a.mo6606a().mo75809a()) {
            long currentTimeMillis = System.currentTimeMillis();
            hzm hzm = this.f20606b;
            if ((currentTimeMillis + j) - hzm.f20599f > 10000) {
                hzm.f20599f = hzm.f20600g.mo12840a(j);
            }
            j2 = this.f20606b.f20599f;
        } else {
            j2 = this.f20606b.f20600g.mo12840a(j);
        }
        ArrayList arrayList = (ArrayList) this.f20605a.get(hzh);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f20605a.put(hzh, arrayList);
        }
        arrayList.add(Long.valueOf(j2));
    }

    public hzq(hzm hzm) {
        this.f20606b = hzm;
    }
}
