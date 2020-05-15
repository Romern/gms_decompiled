package p000;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: dxz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dxz {

    /* renamed from: a */
    private final SparseArray f14380a = new SparseArray();

    public dxz(bxmj bxmj) {
        if (bxmj != null && bxmj.f163944a.size() != 0) {
            bxwc bxwc = bxmj.f163944a;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                bxmi bxmi = (bxmi) bxwc.get(i);
                this.f14380a.put(bxmi.f163939a, Float.valueOf(bxmi.f163940b));
            }
        }
    }

    /* renamed from: a */
    private final List m9777a(C1245ok okVar, bxmm bxmm) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(bxmm);
        List list = (List) okVar.get(bxmm.f163951d);
        for (int i = 0; i < list.size(); i++) {
            if (m9778a((bxmm) list.get(i))) {
                arrayList.addAll(m9777a(okVar, (bxmm) list.get(i)));
            }
        }
        if (!arrayList.isEmpty()) {
            String[] strArr = new String[(arrayList.size() - 1)];
            for (int i2 = 1; i2 < arrayList.size(); i2++) {
                strArr[i2 - 1] = ((bxmm) arrayList.get(i2)).f163951d;
            }
            bxmm bxmm2 = (bxmm) arrayList.get(0);
            bxvd bxvd = (bxvd) bxmm2.mo74142c(5);
            bxvd.mo73625a((bxvk) bxmm2);
            bxml bxml = (bxml) bxvd;
            if (bxml.f164950c) {
                bxml.mo74035c();
                bxml.f164950c = false;
            }
            bxvu bxvu = bxmm.f163945o;
            ((bxmm) bxml.f164949b).f163964r = bxvk.m124030de();
            bxml.mo73590a(Arrays.asList(strArr));
            arrayList.set(0, (bxmm) bxml.mo74062i());
        }
        return arrayList;
    }

    /* renamed from: a */
    private final boolean m9778a(bxmm bxmm) {
        if (bxmm.f163961n.size() > 0) {
            double d = bxmm.f163963q;
            SparseArray sparseArray = this.f14380a;
            if (d >= ((double) ((Float) sparseArray.get(((bvoq) bxmm.f163945o.mo14948a(Integer.valueOf(bxmm.f163961n.mo74151b(0)))).f157198bx, (Float) sparseArray.get(0, Float.valueOf(0.5f)))).floatValue())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final List mo9843a(List list) {
        C1245ok okVar = new C1245ok();
        C1245ok okVar2 = new C1245ok();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            okVar.put(((bxmm) list.get(i)).f163951d, (bxmm) list.get(i));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bxmm bxmm = (bxmm) it.next();
            if (bxmm.f163962p == 0) {
                arrayList.add(bxmm);
            }
            ArrayList arrayList3 = new ArrayList(bxmm.f163964r.size());
            bxwc bxwc = bxmm.f163964r;
            int size = bxwc.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str = (String) bxwc.get(i2);
                if (okVar.containsKey(str)) {
                    arrayList3.add((bxmm) okVar.get(str));
                }
            }
            okVar2.put(bxmm.f163951d, arrayList3);
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (m9778a((bxmm) arrayList.get(i3))) {
                arrayList2.addAll(m9777a(okVar2, (bxmm) arrayList.get(i3)));
            }
        }
        return arrayList2;
    }
}
