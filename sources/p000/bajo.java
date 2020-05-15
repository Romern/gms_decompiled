package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: bajo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bajo extends cazu {

    /* renamed from: b */
    private final cazn f101065b;

    /* renamed from: c */
    private final cazn f101066c;

    /* renamed from: d */
    private final cazn f101067d;

    public bajo(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3) {
        super(cijl2, cbag.m127657a(bajo.class), cijl);
        this.f101065b = cbac.m127643a(cazn);
        this.f101066c = cbac.m127643a(cazn2);
        this.f101067d = cbac.m127643a(cazn3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f101065b.mo75201b(), this.f101066c.mo75201b(), this.f101067d.mo75201b());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnkn.a(java.util.List, bmxj):java.util.List
     arg types: [bngx, bajj]
     candidates:
      bnkn.a(java.util.List, int):java.util.List
      bnkn.a(java.util.List, java.lang.Object):boolean
      bnkn.a(java.util.List, bmxj):java.util.List */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        bafh bafh = (bafh) list.get(0);
        bngx bngx = (bngx) list.get(1);
        bais bais = (bais) list.get(2);
        banx a = bafh.mo55653a().mo55798a();
        try {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList(bafh.mo55660h());
            Collections.sort(arrayList, bair.f101011d);
            bnre i = bngx.m109368a((Collection) arrayList).listIterator();
            while (i.hasNext()) {
                badq badq = (badq) i.next();
                bmxy.m108582a(badq.mo55651c(), "Server state must have assigned timestamps!");
                ByteString a2 = bair.m86940a(badq.mo55650b());
                if (badq.mo55649a() != null) {
                    hashMap.put(a2, badq);
                } else {
                    hashMap.remove(a2);
                }
            }
            hashMap.getClass();
            baip baip = new baip(hashMap);
            a.close();
            bais.m86941a(baip, 1);
            bais.m86941a((acdd) bais.f101015a.mo6445a(), 2);
            cayo cayo = (cayo) bais.f101016b.mo6445a();
            bais.m86941a(cayo, 3);
            cayo cayo2 = (cayo) bais.f101017c.mo6445a();
            bais.m86941a(cayo2, 4);
            bair bair = new bair(baip, cayo, cayo2);
            bair.getClass();
            return bqga.m112775a((Object) bngx.m109368a((Collection) bnkn.m109668a((List) bngx, (bmxj) new bajj(bair))));
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
