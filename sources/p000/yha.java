package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: yha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yha {

    /* renamed from: a */
    private final List f53806a;

    /* renamed from: b */
    private final bnmu f53807b = bnge.m109299s();

    public yha(List list) {
        this.f53806a = new ArrayList(list);
    }

    /* renamed from: a */
    public final bngx mo30482a() {
        int i;
        bngs j = bngx.m109377j();
        List list = this.f53806a;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            ygy ygy = (ygy) list.get(i2);
            Iterator it = ((bndq) this.f53807b).mo67127c(ygy.f53786a).iterator();
            while (true) {
                i = i2 + 1;
                if (!it.hasNext()) {
                    break;
                }
                yhc yhc = (yhc) it.next();
                ygy.f53787b = ygv.m44051a(yhc.mo30445a());
                ygy.f53789d = yhc.mo30446b();
                ygy.f53788c = yhc.mo30447c();
                ygy.f53794i = yhc.mo30448d();
                j.mo67668c(ygy.mo30475a());
            }
            i2 = i;
        }
        HashSet hashSet = new HashSet(this.f53807b.mo67316o());
        bmxy.m108600b(bnpf.m110057c(hashSet, hashSet).isEmpty());
        return j.mo67664a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnmu.a(java.lang.Object, java.lang.Iterable):void
     arg types: [java.lang.String, java.util.List]
     candidates:
      bnmu.a(java.lang.Object, java.lang.Object):boolean
      bnmu.a(java.lang.Object, java.lang.Iterable):void */
    /* renamed from: a */
    public final void mo30483a(String str, List list) {
        this.f53807b.mo67308a((Object) str, (Iterable) list);
    }

    /* renamed from: a */
    public final void mo30484a(String str, yhc yhc) {
        this.f53807b.mo67268a(str, yhc);
    }

    /* renamed from: a */
    public final void mo30485a(ygy ygy) {
        this.f53806a.add(ygy);
    }
}
