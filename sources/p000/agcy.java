package p000;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: agcy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agcy {

    /* renamed from: a */
    public BitSet f65267a;

    /* renamed from: b */
    private boolean f65268b;

    /* renamed from: c */
    private agno f65269c;

    /* renamed from: d */
    private BitSet f65270d;

    /* renamed from: e */
    private Map f65271e;

    /* renamed from: f */
    private Map f65272f;

    public agcy() {
        this.f65268b = true;
        this.f65267a = new BitSet();
        this.f65270d = new BitSet();
        this.f65271e = new C1223np();
        this.f65272f = new C1223np();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final agng mo35298a(int i) {
        ArrayList arrayList;
        List list;
        bxvd da = agng.f66052f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        agng agng = (agng) da.f164949b;
        int i2 = agng.f66054a | 1;
        agng.f66054a = i2;
        agng.f66055b = i;
        boolean z = this.f65268b;
        int i3 = i2 | 8;
        agng.f66054a = i3;
        agng.f66058e = z;
        agno agno = this.f65269c;
        if (agno != null) {
            agno.getClass();
            agng.f66057d = agno;
            agng.f66054a = i3 | 4;
        }
        bxvd da2 = agno.f66134e.mo74144da();
        da2.mo73962Y(agmp.m54565a(this.f65267a));
        da2.mo73963Z(agmp.m54565a(this.f65270d));
        Map map = this.f65271e;
        if (map != null) {
            arrayList = new ArrayList(((C1245ok) map).f26809h);
            for (Integer num : this.f65271e.keySet()) {
                int intValue = num.intValue();
                bxvd da3 = agnh.f66059d.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                agnh agnh = (agnh) da3.f164949b;
                agnh.f66061a |= 1;
                agnh.f66062b = intValue;
                long longValue = ((Long) this.f65271e.get(Integer.valueOf(intValue))).longValue();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                agnh agnh2 = (agnh) da3.f164949b;
                agnh2.f66061a |= 2;
                agnh2.f66063c = longValue;
                arrayList.add((agnh) da3.mo74062i());
            }
        } else {
            arrayList = null;
        }
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        agno agno2 = (agno) da2.f164949b;
        agno2.mo35760a();
        bxsy.m123078a(arrayList, agno2.f66138c);
        Map map2 = this.f65272f;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(((C1245ok) map2).f26809h);
            for (Integer num2 : this.f65272f.keySet()) {
                bxvd da4 = agnp.f66140d.mo74144da();
                int intValue2 = num2.intValue();
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                agnp agnp = (agnp) da4.f164949b;
                agnp.f66142a |= 1;
                agnp.f66143b = intValue2;
                List list2 = (List) this.f65272f.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    agnp agnp2 = (agnp) da4.f164949b;
                    if (!agnp2.f66144c.mo73666a()) {
                        agnp2.f66144c = GeneratedMessageLite.m124020a(agnp2.f66144c);
                    }
                    bxsy.m123078a(list2, agnp2.f66144c);
                }
                arrayList2.add((agnp) da4.mo74062i());
            }
            list = arrayList2;
        }
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        agno agno3 = (agno) da2.f164949b;
        agno3.mo35761b();
        bxsy.m123078a(list, agno3.f66139d);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        agng agng2 = (agng) da.f164949b;
        agno agno4 = (agno) da2.mo74062i();
        agno4.getClass();
        agng2.f66056c = agno4;
        agng2.f66054a |= 2;
        return (agng) da.mo74062i();
    }

    public agcy(agno agno, BitSet bitSet, BitSet bitSet2, Map map, Map map2) {
        this.f65267a = bitSet;
        this.f65270d = bitSet2;
        this.f65271e = map;
        this.f65272f = new C1223np();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f65272f.put(num, arrayList);
        }
        this.f65268b = false;
        this.f65269c = agno;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35299a(agdb agdb) {
        int a = agdb.mo35301a();
        Boolean bool = agdb.f65281d;
        if (bool != null) {
            this.f65270d.set(a, bool.booleanValue());
        }
        Boolean bool2 = agdb.f65282e;
        if (bool2 != null) {
            this.f65267a.set(a, bool2.booleanValue());
        }
        if (agdb.f65283f != null) {
            Map map = this.f65271e;
            Integer valueOf = Integer.valueOf(a);
            Long l = (Long) map.get(valueOf);
            long longValue = agdb.f65283f.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f65271e.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (agdb.f65284g != null) {
            Map map2 = this.f65272f;
            Integer valueOf2 = Integer.valueOf(a);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.f65272f.put(valueOf2, list);
            }
            if (agdb.mo35303b()) {
                list.clear();
            }
            cfiw.m139808c();
            cfiw.m139808c();
            list.add(Long.valueOf(agdb.f65284g.longValue() / 1000));
        }
    }
}
