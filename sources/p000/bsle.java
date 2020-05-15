package p000;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/* renamed from: bsle */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsle extends bslb {

    /* renamed from: c */
    public final bnge f144911c = bnge.m109299s();

    /* renamed from: d */
    private final HashMap f144912d = new HashMap();

    /* renamed from: e */
    private final HashMap f144913e = new HashMap();

    /* renamed from: f */
    private final bnhe f144914f;

    public bsle(bnhe bnhe, Set set) {
        super(new bskp(set));
        this.f144914f = bnhe;
    }

    /* renamed from: a */
    private final bnic m115925a(bsjx bsjx) {
        bnia j = bnic.m109500j();
        bnre i = bsjx.mo70638c().listIterator();
        while (i.hasNext()) {
            bnia j2 = bnic.m109500j();
            bnrd a = ((bskf) i.next()).mo70644c().iterator();
            while (a.hasNext()) {
                bytw bytw = (bytw) a.next();
                j2.mo67629b(bytw);
                if (this.f144914f.containsKey(bytw.f167728b)) {
                    j2.mo67752b((Iterable) ((byty) this.f144914f.get(bytw.f167728b)).f167734b);
                }
            }
            j.mo67752b((Iterable) j2.mo67751a());
        }
        return j.mo67751a();
    }

    /* renamed from: b */
    public final void mo70685b(Collection collection) {
        super.mo70683a(collection);
    }

    /* renamed from: a */
    private final void m115926a(bsjx bsjx, String str, HashMap hashMap) {
        if (hashMap.containsKey(str)) {
            bsjx bsjx2 = (bsjx) hashMap.get(str);
            if (bsjx2 == bsjx) {
                return;
            }
            if (bsjx.equals(bsjx2)) {
                mo70682a(bsjx2, bsjx);
            } else {
                this.f144905a.mo68887a(bsjx, bsjx2);
            }
        } else {
            hashMap.put(str, bsjx);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bndl.a(java.lang.Object, java.lang.Iterable):void
     arg types: [bsjx, bnic]
     candidates:
      bndq.a(java.lang.Object, java.util.Collection):java.util.Collection
      bndd.a(bndd, int):void
      bndd.a(java.lang.Object, java.util.Collection):java.util.Collection
      bndd.a(java.lang.Object, java.lang.Object):boolean
      bndl.a(java.lang.Object, java.lang.Object):boolean
      bnmu.a(java.lang.Object, java.lang.Object):boolean
      bnmu.a(java.lang.Object, java.lang.Object):boolean
      bndl.a(java.lang.Object, java.lang.Iterable):void */
    /* renamed from: a */
    public final bnic mo70680a() {
        bnic a = super.mo70680a();
        bnrd a2 = a.iterator();
        while (a2.hasNext()) {
            bsjx bsjx = (bsjx) a2.next();
            if (!this.f144911c.mo67271d(bsjx)) {
                this.f144911c.mo67308a((Object) bsjx, (Iterable) m115925a(bsjx));
            }
        }
        return a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bndl.a(java.lang.Object, java.lang.Iterable):void
     arg types: [bsjx, bnic]
     candidates:
      bndq.a(java.lang.Object, java.util.Collection):java.util.Collection
      bndd.a(bndd, int):void
      bndd.a(java.lang.Object, java.util.Collection):java.util.Collection
      bndd.a(java.lang.Object, java.lang.Object):boolean
      bndl.a(java.lang.Object, java.lang.Object):boolean
      bnmu.a(java.lang.Object, java.lang.Object):boolean
      bnmu.a(java.lang.Object, java.lang.Object):boolean
      bndl.a(java.lang.Object, java.lang.Iterable):void */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo70681a(Object obj) {
        bsjx bsjx = (bsjx) obj;
        this.f144905a.mo68887a(bsjx, bsjx);
        bnic a = m115925a(bsjx);
        this.f144911c.mo67308a((Object) bsjx, (Iterable) a);
        bnrd a2 = a.iterator();
        while (a2.hasNext()) {
            bytw bytw = (bytw) a2.next();
            m115926a(bsjx, bytw.f167728b, this.f144912d);
            if ((bytw.f167727a & 4) != 0 && !bytw.f167730d.isEmpty()) {
                m115926a(bsjx, bytw.f167730d, this.f144913e);
            }
        }
    }
}
