package p000;

import java.util.ArrayList;
import java.util.ListIterator;

/* renamed from: hzg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hzg {

    /* renamed from: a */
    public final Logger f20584a = new Logger("LegacyRequestHandler");

    /* renamed from: b */
    public final ArrayList f20585b = new ArrayList();

    /* renamed from: c */
    public final hzh f20586c = new hzf(this);

    /* renamed from: d */
    public final hzk f20587d;

    /* renamed from: e */
    public final hzq f20588e;

    public hzg(hzk hzk, hzq hzq) {
        this.f20587d = hzk;
        this.f20588e = hzq;
    }

    /* renamed from: a */
    public final void mo12827a(long j) {
        long b = j - ccdv.m129344b();
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = this.f20585b.listIterator();
        while (listIterator.hasNext()) {
            hzz hzz = (hzz) listIterator.next();
            if (hzz.f20618b <= b) {
                this.f20587d.mo12831a(ibh.m15177b(hzz.f20617a));
                arrayList.add(hzz.f20617a);
                this.f20584a.mo25412b("removeRequest. Timestamp: %d", Long.valueOf(hzz.f20618b));
                listIterator.remove();
            }
        }
        if (!arrayList.isEmpty()) {
            this.f20587d.mo12832a(arrayList);
        }
    }

    /* renamed from: a */
    public final boolean mo12828a() {
        return this.f20585b.isEmpty();
    }
}
