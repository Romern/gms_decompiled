package p000;

import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: dtd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dtd {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dtd.a(duu, dri, boolean):dtc
     arg types: [duu, dri, int]
     candidates:
      dtd.a(com.google.android.gms.contextmanager.internal.ContextManagerClientInfo, com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl, dto):dtb
      dtd.a(java.util.List, java.util.List, dri):void
      dtd.a(duu, dri, boolean):dtc */
    /* renamed from: a */
    public static dtb m9275a(ContextManagerClientInfo contextManagerClientInfo, FenceUpdateRequestImpl fenceUpdateRequestImpl, dto dto) {
        int i;
        char c;
        int i2;
        int i3;
        int i4;
        dri dri;
        int i5;
        ContextManagerClientInfo contextManagerClientInfo2 = contextManagerClientInfo;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = dto.mo9569a().iterator();
        while (true) {
            i = 2;
            c = 0;
            i2 = 1;
            if (!it.hasNext()) {
                break;
            }
            drk drk = (drk) it.next();
            for (duu duu : drk.mo9493d()) {
                Object[] objArr = {duu.f14122e, duu.f14119b};
                arrayList.add(m9276a(duu, drk.f13876a, true));
            }
        }
        Object[] objArr2 = {arrayList, arrayList2};
        ArrayList arrayList3 = fenceUpdateRequestImpl.f30661a;
        int size = arrayList3.size();
        int i6 = 0;
        while (i3 < size) {
            UpdateFenceOperation updateFenceOperation = (UpdateFenceOperation) arrayList3.get(i3);
            new Object[i2][c] = Integer.valueOf(updateFenceOperation.f30662a);
            int i7 = updateFenceOperation.f30662a;
            if (i7 == 3 || i7 == 4 || i7 == 5) {
                if (i7 == 3) {
                    m9277a(arrayList, arrayList2, dri.m9146a(contextManagerClientInfo2, updateFenceOperation.f30664c));
                } else if (i7 != 4) {
                    String a = duu.m9451a(contextManagerClientInfo2, updateFenceOperation.f30667f);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        dtc dtc = (dtc) it2.next();
                        Object[] objArr3 = new Object[3];
                        objArr3[c] = updateFenceOperation.f30667f;
                        objArr3[i2] = a;
                        String str = dtc.f13976a.f14122e;
                        objArr3[i] = str;
                        if (str.equals(a)) {
                            new Object[i2][c] = dtc.f13976a.f14122e;
                            arrayList2.add(dtc);
                            it2.remove();
                        }
                    }
                } else {
                    m9277a(arrayList, arrayList2, dri.m9145a(contextManagerClientInfo2, updateFenceOperation.f30666e));
                }
                new Object[i2][c] = Integer.valueOf(arrayList2.size());
            }
            int i8 = updateFenceOperation.f30662a;
            if (i8 == i2 || i8 == i) {
                if (i8 != i2) {
                    dri = dri.m9145a(contextManagerClientInfo2, updateFenceOperation.f30666e);
                } else {
                    dri = dri.m9146a(contextManagerClientInfo2, updateFenceOperation.f30664c);
                }
                new Object[i2][c] = dri;
                duu duu2 = new duu(updateFenceOperation.f30663b);
                String str2 = contextManagerClientInfo2.f30678b;
                String str3 = contextManagerClientInfo2.f30677a;
                String str4 = contextManagerClientInfo2.f30680d;
                duu2.f14123f = str2;
                duu2.f14124g = str3;
                duu2.f14125h = str4;
                duu2.f14122e = duu.m9452a(str2, str3, str4, duu2.f14118a);
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    dtc dtc2 = (dtc) it3.next();
                    if (dtc2.f13976a.f14122e.equals(duu2.f14122e) && dtc2.f13977b.equals(dri) && dtc2.f13976a.f14119b.equals(duu2.f14119b)) {
                        new Object[i2][c] = dtc2.f13976a.f14122e;
                        arrayList.add(dtc2);
                        it3.remove();
                    }
                }
                Iterator it4 = arrayList.iterator();
                boolean z = false;
                while (it4.hasNext()) {
                    dtc dtc3 = (dtc) it4.next();
                    if (dtc3.f13976a.f14122e.equals(duu2.f14122e)) {
                        if (dtc3.f13977b.equals(dri)) {
                            duu duu3 = dtc3.f13976a;
                            i5 = i3;
                            if (duu3.f14120c == duu2.f14120c && duu3.f14119b.equals(duu2.f14119b)) {
                                new Object[1][0] = dtc3.f13976a.f14122e;
                                i3 = i5;
                                z = true;
                            }
                        } else {
                            i5 = i3;
                        }
                        arrayList2.add(dtc3);
                        it4.remove();
                    } else {
                        i5 = i3;
                    }
                    i3 = i5;
                }
                i4 = i3;
                if (!z) {
                    new Object[1][0] = duu2.f14122e;
                    arrayList.add(m9276a(duu2, dri, false));
                }
            } else {
                i4 = i3;
            }
            i6 = i4 + 1;
            i = 2;
            c = 0;
            i2 = 1;
        }
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            dtc dtc4 = (dtc) it5.next();
            if (dtc4.f13978c) {
                new Object[1][0] = dtc4.f13976a.f14122e;
                it5.remove();
            }
        }
        Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            dtc dtc5 = (dtc) it6.next();
            if (!dtc5.f13978c) {
                new Object[1][0] = dtc5.f13976a.f14122e;
                it6.remove();
            }
        }
        dtb dtb = new dtb(arrayList, arrayList2);
        if (dss.m9250a(2)) {
            List list = dtb.f13974a;
            List list2 = dtb.f13975b;
            int size2 = list.size();
            for (int i9 = 0; i9 < size2; i9++) {
                dtc dtc6 = (dtc) list.get(i9);
                Object[] objArr4 = {dtc6.f13976a.f14122e, dtc6};
            }
            int size3 = list2.size();
            for (int i10 = 0; i10 < size3; i10++) {
                dtc dtc7 = (dtc) list2.get(i10);
                Object[] objArr5 = {dtc7.f13976a.f14122e, dtc7};
            }
        }
        return dtb;
    }

    /* renamed from: a */
    private static dtc m9276a(duu duu, dri dri, boolean z) {
        return new dtc(duu, dri, z);
    }

    /* renamed from: a */
    private static void m9277a(List list, List list2, dri dri) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dtc dtc = (dtc) it.next();
            Object[] objArr = {dri, Boolean.valueOf(dtc.f13977b.equals(dri))};
            if (dtc.f13977b.equals(dri)) {
                Object[] objArr2 = {dtc.f13976a.f14122e, dtc};
                list2.add(dtc);
                it.remove();
            }
        }
    }
}
