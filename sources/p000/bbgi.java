package p000;

import android.util.LruCache;

/* renamed from: bbgi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbgi implements bbgj {

    /* renamed from: a */
    public final ayte f102587a;

    /* renamed from: b */
    public final LruCache f102588b = new LruCache(1);

    public bbgi(ayte ayte) {
        bmxy.m108600b(true);
        this.f102587a = ayte;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [java.lang.Iterable, bbgg]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    /* renamed from: a */
    public final bqgg mo56101a(Iterable iterable, bbfu bbfu) {
        bqgg a;
        bmxy.m108581a(iterable);
        bmxy.m108581a(bbfu);
        synchronized (this.f102588b) {
            bbfv b = bbfw.m87969b();
            b.mo56121a(bngx.m109355a(bnjd.m109575a(iterable, (bmxj) new bbgg(this))));
            a = bqga.m112775a(b.mo56119a());
        }
        return a;
    }

    /* renamed from: a */
    public final bqgg mo56133a(Iterable iterable, bbfw bbfw) {
        bmxy.m108581a(iterable);
        bmxy.m108581a(bbfw);
        synchronized (this.f102588b) {
            long a = this.f102587a.mo54417a();
            try {
                bnre i = bbhf.m88013a(iterable, bbfw.mo56107a()).listIterator();
                while (i.hasNext()) {
                    bbhf bbhf = (bbhf) i.next();
                    this.f102588b.put((bxtx) bbhf.mo56138a(), bbgh.m87988a((bbfz) bbhf.mo56139b(), a));
                }
            } catch (IllegalStateException e) {
                return bqga.m112777a((Throwable) e);
            }
        }
        return bqga.m112775a((Object) null);
    }
}
