package p000;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.awareness.fence.AwarenessFence;
import com.google.android.gms.awareness.fence.FenceState;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: eel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eel extends dwm implements dvw, lrj {

    /* renamed from: a */
    public final eez f14778a;

    /* renamed from: b */
    public final edy f14779b;

    /* renamed from: c */
    private final egi f14780c;

    /* renamed from: d */
    private final HashMap f14781d;

    /* renamed from: e */
    private final eek f14782e;

    public eel() {
        eek eek;
        eez eez = new eez();
        if (cdgs.f180893a.mo6606a().mo77608a()) {
            eek = new eek();
        } else {
            eek = null;
        }
        this.f14782e = eek;
        this.f14780c = new egi();
        this.f14778a = eez;
        this.f14779b = new edy();
        this.f14781d = new HashMap();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0142, code lost:
        if (r3 < p000.cdgp.f180782a.mo6606a().mo77568am()) goto L_0x0158;
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0275 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0256  */
    /* renamed from: a */
    private final int m10225a(List list, ContextManagerClientInfo contextManagerClientInfo, efa efa, boolean z) {
        String str;
        String str2;
        int i;
        String str3;
        long j;
        boolean z2;
        Iterator it;
        char c;
        String str4;
        String str5;
        dom dom;
        boolean z3;
        ContextManagerClientInfo contextManagerClientInfo2 = contextManagerClientInfo;
        String str6 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
        String str7 = "eel";
        if (list == null) {
            str = str6;
            str2 = str7;
        } else if (!list.isEmpty()) {
            dom x = dwq.m9680x();
            if (z) {
                sdo.m34959a(list);
                dol a = x.mo9349a(contextManagerClientInfo.mo18066a());
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (a.mo9346a(1, ((ContextData) it2.next()).mo18018g(), contextManagerClientInfo2) != 1) {
                        return 7503;
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            egr C = dwq.m9646C();
            Iterator it3 = list.iterator();
            boolean z4 = false;
            boolean z5 = false;
            while (it3.hasNext()) {
                ContextData contextData = (ContextData) it3.next();
                if (z) {
                    it = it3;
                    if (x.mo9349a(contextManagerClientInfo.mo18066a()).mo9346a(2, contextData.mo18018g(), contextManagerClientInfo2) != 1) {
                        c = x.mo9349a(contextManagerClientInfo.mo18066a()).mo9346a(1, contextData.mo18018g(), contextManagerClientInfo2) == 1 ? (char) 58036 : 7503;
                        bxco h = contextData.mo18019h();
                        if (c != 58036) {
                            str4 = str6;
                            str5 = str7;
                            dom = x;
                        } else if (c == 0) {
                            eek eek = this.f14782e;
                            if (eek == null) {
                                str4 = str6;
                                str5 = str7;
                                dom = x;
                                z3 = false;
                            } else {
                                doh a2 = contextManagerClientInfo.mo18066a();
                                dom = x;
                                str5 = str7;
                                if (contextData.mo18018g() == 1) {
                                    bxnm bxnm = (bxnm) contextData.mo18009a(bxnm.f164051j);
                                    if (bxnm != null) {
                                        Pair pair = (Pair) eek.f14777a.get(a2);
                                        long c2 = contextData.mo18022j().mo18096c();
                                        if (pair != null) {
                                            long longValue = c2 - ((Long) pair.first).longValue();
                                            str4 = str6;
                                            long a3 = (long) ayuo.m84843a(((bxnm) pair.second).f164054b, ((bxnm) pair.second).f164055c, bxnm.f164054b, bxnm.f164055c);
                                            Object[] objArr = {Long.valueOf(longValue), Long.valueOf(a3)};
                                            if (longValue < cdgp.f180782a.mo6606a().mo77569an()) {
                                            }
                                        } else {
                                            str4 = str6;
                                        }
                                        eek.f14777a.put(a2, Pair.create(Long.valueOf(c2), bxnm));
                                        z3 = false;
                                    } else {
                                        str4 = str6;
                                    }
                                    Object[] objArr2 = {Integer.valueOf(contextData.mo18018g()), contextManagerClientInfo.mo18066a().f13690b};
                                } else {
                                    str4 = str6;
                                    z3 = false;
                                }
                            }
                            arrayList.add(new edr(contextData, z3));
                            C.mo10105a(contextManagerClientInfo2, h, z3 ? 1 : 0);
                            z4 = true;
                            x = dom;
                            it3 = it;
                            str7 = str5;
                            str6 = str4;
                        } else if (c != 7503) {
                            C.mo10105a(contextManagerClientInfo2, h, 3);
                            return 13;
                        } else {
                            C.mo10105a(contextManagerClientInfo2, h, 2);
                            return 7503;
                        }
                        arrayList2.add(new edr(contextData, true));
                        C.mo10105a(contextManagerClientInfo2, h, 1);
                        z5 = true;
                        x = dom;
                        it3 = it;
                        str7 = str5;
                        str6 = str4;
                    }
                } else {
                    it = it3;
                }
                c = 0;
                bxco h2 = contextData.mo18019h();
                if (c != 58036) {
                }
                arrayList2.add(new edr(contextData, true));
                C.mo10105a(contextManagerClientInfo2, h2, 1);
                z5 = true;
                x = dom;
                it3 = it;
                str7 = str5;
                str6 = str4;
            }
            String str8 = str6;
            String str9 = str7;
            if (z4 && z5) {
                i = -7501;
            } else if (z4) {
                i = 0;
            } else if (z5) {
                i = -7500;
            } else {
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68432a(str9, "a", 464, str8);
                bnsl.mo68405a("[ContextManagerStore] This should never happen in insertBatchContextData");
                return 13;
            }
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                edr edr = (edr) arrayList.get(i2);
                eez eez = this.f14778a;
                ContextData contextData2 = edr.f14749a;
                doh a4 = contextManagerClientInfo.mo18066a();
                new Object[1][0] = contextData2;
                ((ArrayList) eez.m10272a(a4, eez.f14809a)).add(contextData2);
                List list2 = (List) eez.f14809a.get(a4);
                if (list2 != null) {
                    Iterator it4 = list2.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (eez.f14808b.contains(Integer.valueOf(((ContextData) it4.next()).mo18018g()))) {
                                z2 = eez.mo10061a(a4);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z2) {
                        bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
                        str3 = str8;
                        bnsl2.mo68432a("eez", "a", 83, str3);
                        bnsl2.mo68405a("[StoreReadWrite] Cache flush failed when writing to database in insert.");
                        j = -1;
                    } else {
                        str3 = str8;
                        j = 1;
                    }
                    if (j != 1) {
                        return 7505;
                    }
                    String d = edr.f14749a.mo18014d();
                    efa efa2 = efa;
                    if (efa2.f14819a == null) {
                        efa2.f14819a = new ArrayList();
                    }
                    efa2.f14819a.add(d);
                    i2++;
                    str8 = str3;
                }
                if (eez.m10272a(a4, eez.f14809a).size() >= ((int) cdgp.f180782a.mo6606a().mo77598r())) {
                    z2 = eez.mo10061a(a4);
                    if (z2) {
                    }
                    if (j != 1) {
                    }
                } else {
                    str3 = str8;
                    j = 1;
                    if (j != 1) {
                    }
                }
            }
            arrayList.addAll(arrayList2);
            this.f14779b.mo10018a(contextManagerClientInfo.mo18066a(), arrayList);
            if (!contextManagerClientInfo.mo18066a().mo9338b()) {
                this.f14779b.mo10018a(doh.f13688a, arrayList);
            }
            if (cdhf.m133435b()) {
                doh a5 = contextManagerClientInfo.mo18066a();
                int size2 = arrayList.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ContextData contextData3 = ((edr) arrayList.get(i3)).f14749a;
                    if (doi.m8940d(contextData3.mo18018g())) {
                        new Object[1][0] = Integer.toString(contextData3.mo18018g());
                        AwarenessFence a6 = eal.m9979a(contextData3.mo18014d(), "ContextManagerStore", a5);
                        if (a6 == null) {
                            new Object[1][0] = contextData3.mo18014d();
                        } else {
                            m10226a(a5, a6, contextData3.mo18018g());
                            if (!a5.mo9338b()) {
                                eal.m9980a(a6, contextData3.mo18014d(), doh.f13688a);
                                m10226a(doh.f13688a, a6, contextData3.mo18018g());
                            }
                        }
                    }
                }
            }
            this.f14780c.mo10086a((egg) new eeh(list, contextManagerClientInfo2));
            return i;
        } else {
            str = str6;
            str2 = str7;
        }
        bnsl bnsl3 = (bnsl) dss.f13961a.mo68388c();
        bnsl3.mo68432a(str2, "a", 384, str);
        bnsl3.mo68405a("[ContextManagerStore] Called insertBatch without any data to write.");
        return 0;
    }

    /* renamed from: a */
    public final void mo9390a(doh doh, dwa dwa) {
    }

    /* renamed from: a */
    public final void mo9391a(doh doh, dwa dwa, dwa dwa2) {
    }

    /* renamed from: b */
    public final int mo10041b(ContextDataFilterImpl contextDataFilterImpl, ContextManagerClientInfo contextManagerClientInfo) {
        this.f14779b.mo10017a(contextManagerClientInfo.mo18066a(), contextDataFilterImpl, false);
        return this.f14778a.mo10057a(contextDataFilterImpl, contextManagerClientInfo.mo18066a());
    }

    /* renamed from: b */
    public final void mo9394b(doh doh, bxco bxco) {
        this.f14779b.mo10016a(doh, bxco).mo10009a(false);
    }

    /* renamed from: a */
    private final void m10226a(doh doh, AwarenessFence awarenessFence, int i) {
        String str = doh.f13690b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
        sb.append("CM_Store_");
        sb.append(str);
        sb.append("_");
        sb.append(i);
        String sb2 = sb.toString();
        this.f14781d.put(sb2, new eeg(doh, i));
        lrk lrk = new lrk();
        lrk.mo15393a(sb2, awarenessFence, this);
        lrh.m19577a(dwq.m9662f(), lri.m19583b("ContextManagerStore", null)).mo24681a(lrk.mo15389a()).mo50371a(new eef("[ContextManagerStore] add fence", new Object[0]));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: eel.a(java.util.List, com.google.android.gms.contextmanager.internal.ContextManagerClientInfo, efa, boolean):int
     arg types: [java.util.ArrayList, com.google.android.gms.contextmanager.internal.ContextManagerClientInfo, efa, int]
     candidates:
      eel.a(java.util.Collection, int, long, com.google.android.gms.contextmanager.internal.ContextManagerClientInfo):void
      eel.a(java.util.List, com.google.android.gms.contextmanager.internal.ContextManagerClientInfo, efa, boolean):int */
    /* renamed from: a */
    public final int mo10035a(int i, long j, ContextManagerClientInfo contextManagerClientInfo) {
        tkb tkb = new tkb();
        tkb.mo26623a(2);
        tkb.mo26621a(j);
        TimeFilterImpl a = tkb.mo26620a();
        tit tit = new tit();
        tit.mo26580a(i, a);
        ArrayList b = this.f14778a.mo10063b((ContextDataFilterImpl) tit.mo26578a(), contextManagerClientInfo.mo18066a());
        if (!b.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            int size = b.size();
            for (int i2 = 0; i2 < size; i2++) {
                ContextData contextData = (ContextData) b.get(i2);
                tip tip = new tip(contextData);
                tip.mo26574a(tka.m37117a(contextData.mo18022j().mo18096c()));
                arrayList.add(tip.mo26570a());
            }
            efa efa = new efa();
            if (!arrayList.isEmpty()) {
                return m10225a((List) arrayList, contextManagerClientInfo, efa, false);
            }
        }
        return 0;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: eel.a(java.util.List, com.google.android.gms.contextmanager.internal.ContextManagerClientInfo, efa, boolean):int
     arg types: [java.util.ArrayList, com.google.android.gms.contextmanager.internal.ContextManagerClientInfo, efa, int]
     candidates:
      eel.a(java.util.Collection, int, long, com.google.android.gms.contextmanager.internal.ContextManagerClientInfo):void
      eel.a(java.util.List, com.google.android.gms.contextmanager.internal.ContextManagerClientInfo, efa, boolean):int */
    /* renamed from: a */
    public final int mo10036a(WriteBatchImpl writeBatchImpl, ContextManagerClientInfo contextManagerClientInfo) {
        efa efa = new efa();
        ArrayList arrayList = writeBatchImpl.f30703a;
        if (arrayList == null || arrayList.isEmpty()) {
            return 0;
        }
        int a = m10225a((List) arrayList, contextManagerClientInfo, efa, true);
        if (rjs.m33679e(a)) {
            return a;
        }
        ArrayList arrayList2 = efa.f14819a;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = efa.f14819a;
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                this.f14778a.mo10062a((String) arrayList3.get(i), contextManagerClientInfo.mo18066a());
            }
        }
        return a;
    }

    /* renamed from: a */
    public final eej mo10037a(ContextDataFilterImpl contextDataFilterImpl, ContextManagerClientInfo contextManagerClientInfo) {
        if (!dwq.m9680x().mo9351a(3, contextDataFilterImpl.mo18054d(), contextManagerClientInfo, false)) {
            return new eej(7503, null);
        }
        ArrayList b = this.f14778a.mo10063b(contextDataFilterImpl, contextManagerClientInfo.mo18066a());
        this.f14779b.mo10019a(b, contextManagerClientInfo.mo18066a(), contextDataFilterImpl, true, Long.MAX_VALUE);
        return new eej(0, b);
    }

    /* renamed from: a */
    public final eej mo10038a(ContextDataFilterImpl contextDataFilterImpl, ContextManagerClientInfo contextManagerClientInfo, long j) {
        if (!dwq.m9680x().mo9353a(contextDataFilterImpl.mo18054d(), contextManagerClientInfo)) {
            return new eej(7503, null);
        }
        edy edy = this.f14779b;
        doh a = contextManagerClientInfo.mo18066a();
        ArrayList arrayList = new ArrayList();
        edy.mo10019a(arrayList, a, contextDataFilterImpl, false, j);
        HashSet<Integer> hashSet = new HashSet();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hashSet.add(Integer.valueOf(((ContextData) arrayList.get(i)).mo18018g()));
        }
        HashSet<Integer> d = contextDataFilterImpl.mo18054d();
        d.removeAll(hashSet);
        for (Integer num : hashSet) {
            dwq.m9649F().mo9386a(tiq.m37051b(num.intValue()), 10);
        }
        for (Integer num2 : d) {
            dwq.m9649F().mo9386a(tiq.m37051b(num2.intValue()), 9);
        }
        return new eej(0, arrayList);
    }

    /* renamed from: a */
    public final void mo9826a(FenceState fenceState) {
        boolean z;
        boolean z2;
        edp edp;
        if (this.f14781d.containsKey(fenceState.mo8006b())) {
            eeg eeg = (eeg) this.f14781d.get(fenceState.mo8006b());
            Object[] objArr = {eeg.f14771a, Integer.toString(eeg.f14772b)};
            if (fenceState.mo8005a() != 2) {
                z = true;
            } else {
                z = false;
            }
            edy edy = this.f14779b;
            doh doh = eeg.f14771a;
            int i = eeg.f14772b;
            SparseArray sparseArray = (SparseArray) edy.f14759a.get(doh);
            if (sparseArray == null || (edp = (edp) sparseArray.get(i)) == null) {
                z2 = false;
            } else {
                z2 = edp.mo10011b(z);
            }
            Object[] objArr2 = {Boolean.valueOf(z2), Boolean.valueOf(z)};
            if (!z2 || !z) {
                this.f14781d.remove(fenceState.mo8006b());
            } else {
                return;
            }
        }
        bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
        bnsl.mo68432a("eel", "a", 147, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("[ContextManagerStore] Callback for unexpected key %s, or context is stale", fenceState.mo8006b());
        lrk lrk = new lrk();
        lrk.mo15390a(fenceState.mo8006b());
        lrh.m19577a(dwq.m9662f(), lri.m19583b("ContextManagerStore", null)).mo24681a(lrk.mo15389a()).mo50371a(new dqi("[ContextManagerStore] remove unexpected fence", new Object[0]));
    }

    /* renamed from: a */
    public final void mo9389a(doh doh, bxco bxco) {
        this.f14779b.mo10016a(doh, bxco).mo10009a(true);
    }

    /* renamed from: a */
    public final void mo10039a(eei eei, dqb dqb) {
        this.f14780c.mo10088a(eei, dqb);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List, java.util.Collection], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final void mo10040a(Collection r9, int i, long j, ContextManagerClientInfo contextManagerClientInfo) {
        eez eez = this.f14778a;
        doh a = contextManagerClientInfo.mo18066a();
        if (r9.isEmpty()) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("eez", "a", 275, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[StoreReadWrite] Empty context data batch to update syncState to %s", Integer.toString(i));
            return;
        }
        String[] strArr = new String[r9.size()];
        int size = r9.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            strArr[i3] = ((ContextData) r9.get(i2)).mo18014d();
            i2++;
            i3++;
        }
        eez.mo10058a("context", "context_id", strArr, i, j, a);
    }
}
