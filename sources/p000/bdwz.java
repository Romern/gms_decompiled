package p000;

import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: bdwz */
final /* synthetic */ class bdwz implements bqeh {

    /* renamed from: a */
    private final bdxi f106562a;

    public bdwz(bdxi bdxi) {
        this.f106562a = bdxi;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bqgg bqgg;
        bdxi bdxi = this.f106562a;
        List<bdxk> list = (List) obj;
        if (list.isEmpty()) {
            return bqga.m112775a((Object) null);
        }
        ArrayList arrayList = new ArrayList();
        bxvd da = bxqh.f164384b.mo74144da();
        long currentTimeMillis = System.currentTimeMillis();
        ArrayDeque arrayDeque = new ArrayDeque();
        for (bdxk bdxk : list) {
            if (bdxk.mo58405b() + bdxi.f106583g.f106589e >= currentTimeMillis) {
                try {
                    arrayDeque.add(Pair.create(bdxk, (bxbp) bxvk.m124007a(bxbp.f162718e, bdxk.mo58404a())));
                    if (arrayDeque.size() > bdxi.f106583g.f106590f) {
                        bdxi.f106582f++;
                        arrayList.add((bdxk) ((Pair) arrayDeque.removeFirst()).first);
                    }
                } catch (bxwf e) {
                    bdxi.f106581e++;
                    arrayList.add(bdxk);
                }
            } else {
                bdxi.f106580d++;
                arrayList.add(bdxk);
            }
        }
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            bxbp bxbp = (bxbp) pair.second;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxqh bxqh = (bxqh) da.f164949b;
            bxbp.getClass();
            if (!bxqh.f164386a.mo73666a()) {
                bxqh.f164386a = bxvk.m124021a(bxqh.f164386a);
            }
            bxqh.f164386a.add(bxbp);
            if (bdxi.f106584h.mo35048a(abry.m48160a())) {
                bdxi.f106577a.add(Long.valueOf(((bdxk) pair.first).mo58405b()));
            }
        }
        bxvd da2 = bxqj.f164389e.mo74144da();
        bxvd da3 = bxpo.f164291c.mo74144da();
        String d = bdxi.f106583g.f106588d.mo58306d();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bxpo bxpo = (bxpo) da3.f164949b;
        d.getClass();
        bxpo.f164293a |= 2;
        bxpo.f164294b = d;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bxqj bxqj = (bxqj) da2.f164949b;
        bxpo bxpo2 = (bxpo) da3.mo74062i();
        bxpo2.getClass();
        bxqj.f164392b = bxpo2;
        bxqj.f164391a |= 1;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bxqj bxqj2 = (bxqj) da2.f164949b;
        bxqj2.f164394d = 1;
        bxqj2.f164391a |= 4;
        bxqh bxqh2 = (bxqh) da.mo74062i();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bxqj bxqj3 = (bxqj) da2.f164949b;
        bxqh2.getClass();
        bxqj3.f164393c = bxqh2;
        bxqj3.f164391a |= 2;
        bxqj bxqj4 = (bxqj) da2.mo74062i();
        bxqh bxqh3 = bxqj4.f164393c;
        if (bxqh3 == null) {
            bxqh3 = bxqh.f164384b;
        }
        if (bxqh3.f164386a.isEmpty()) {
            bqgg = bqga.m112775a(bxqk.f164396a);
        } else {
            bqgg = bdxi.f106583g.f106585a.mo32600a(bxqj4);
        }
        bxqh bxqh4 = bxqj4.f164393c;
        if (bxqh4 == null) {
            bxqh4 = bxqh.f164384b;
        }
        bdxi.f106579c = bxqh4.f164386a.size();
        return bqdf.m112620a(bqdx.m112674a(bqgg, new bdxa(bdxi, list), bdxi.f106583g.f106587c), Exception.class, new bdxb(bdxi, arrayList, list), bdxi.f106583g.f106587c);
    }
}
