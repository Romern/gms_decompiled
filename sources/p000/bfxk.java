package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: bfxk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bfxk {

    /* renamed from: a */
    public final bxvd f115591a;

    public bfxk(int i) {
        bxvd da = bfxw.f115630e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bfxw) da.f164949b).f115634c = i;
        long currentTimeMillis = System.currentTimeMillis();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bfxw) da.f164949b).f115635d = currentTimeMillis;
        this.f115591a = da;
    }

    /* renamed from: a */
    protected static bfxr m98142a(C1245ok okVar, bfyi bfyi, C1223np npVar) {
        bxvd da = bfxr.f115610b.mo74144da();
        for (Map.Entry entry : npVar.entrySet()) {
            Integer num = (Integer) okVar.get(entry.getKey());
            if (num == null) {
                num = Integer.valueOf(okVar.f26809h);
                okVar.put((bfwf) entry.getKey(), num);
                bfyi.mo62421a(((bfwf) entry.getKey()).mo62357e());
            }
            bxvd bxvd = (bxvd) entry.getValue();
            int intValue = num.intValue();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bfxq bfxq = bfxq.f115602g;
            ((bfxq) bxvd.f164949b).f115604a = intValue;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bfxr bfxr = (bfxr) da.f164949b;
            bfxq bfxq2 = (bfxq) bxvd.mo74062i();
            bfxq2.getClass();
            if (!bfxr.f115612a.mo73666a()) {
                bfxr.f115612a = GeneratedMessageLite.m124021a(bfxr.f115612a);
            }
            bfxr.f115612a.add(bfxq2);
        }
        return (bfxr) da.mo74062i();
    }

    /* renamed from: a */
    public abstract bfxw mo62420a();

    /* renamed from: a */
    protected static void m98143a(List list, C1245ok okVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bfwf bfwf = (bfwf) it.next();
            bxvd da = bfxq.f115602g.mo74144da();
            short a = bfwf.mo62353a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bfxq bfxq = (bfxq) da.f164949b;
            bfxq.f115605b = a;
            bfxq.f115606c = bfwf.f115487e;
            bfxq.f115607d = bfwf.f115489g;
            bfxq.f115608e = bfwf.f115490h;
            bfxq.f115609f = bfwf.f115491i;
            okVar.put(bfwf, da);
        }
    }
}
