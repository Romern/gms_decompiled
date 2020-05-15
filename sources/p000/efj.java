package p000;

import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Future;

/* renamed from: efj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class efj implements dqm {

    /* renamed from: a */
    public final HashMap f14830a = new HashMap();

    /* renamed from: a */
    public final Future mo9446a() {
        Set set;
        ArrayList arrayList;
        if (!this.f14830a.isEmpty()) {
            eel p = dwq.m9672p();
            for (doh doh : this.f14830a.keySet()) {
                if (!doh.mo9338b()) {
                    efk efk = (efk) this.f14830a.get(doh);
                    ego<Integer> ego = efk.f14831a;
                    tit tit = new tit();
                    for (Integer num : ego) {
                        int intValue = num.intValue();
                        tkb tkb = new tkb();
                        tkb.mo26624b();
                        tit.mo26580a(intValue, tkb.mo26620a());
                    }
                    tit.mo26581a(ContextData.f30618a);
                    tiu a = tit.mo26578a();
                    ContextManagerClientInfo a2 = dwq.m9652a(doh, "SyncOperation");
                    ArrayList b = p.f14778a.mo10063b((ContextDataFilterImpl) a, a2.mo18066a());
                    dom x = dwq.m9680x();
                    Iterator it = b.iterator();
                    while (it.hasNext()) {
                        ContextData contextData = (ContextData) it.next();
                        if (!x.mo9352a(a2, contextData.mo18019h())) {
                            new Object[1][0] = Integer.valueOf(contextData.mo18018g());
                            it.remove();
                        }
                    }
                    if (!b.isEmpty()) {
                        for (drb drb : efk.f14833c.mo67316o()) {
                            if (efk.f14833c.mo67271d(drb)) {
                                set = efk.f14833c.mo67361a(drb);
                            } else {
                                set = null;
                            }
                            if (set != null) {
                                arrayList = new ArrayList();
                                int size = b.size();
                                for (int i = 0; i < size; i++) {
                                    ContextData contextData2 = (ContextData) b.get(i);
                                    if (egb.m10348a(contextData2, set)) {
                                        arrayList.add(contextData2);
                                    }
                                }
                            } else {
                                arrayList = b;
                            }
                            if (!arrayList.isEmpty()) {
                                new efl(drb, arrayList, doh, new efi(doh)).mo9516a(dqy.m9123a("ConsumerSyncOperation"));
                            }
                        }
                    }
                }
            }
        }
        return dps.f13792a;
    }

    /* renamed from: a */
    public final void mo10074a(doh doh, dwa dwa) {
        efk efk = (efk) this.f14830a.get(doh);
        if (efk != null) {
            int i = dwa.mo9747b().f162973bD;
            int b = efk.f14831a.mo10100b(i, dwa);
            if (b == 3) {
                long j = Long.MAX_VALUE;
                for (dwa dwa2 : (Set) efk.f14831a.get(i)) {
                    j = Math.min(j, dwa2.mo9756i().mo9712c());
                }
                efk.f14832b.put(i, Long.valueOf(j));
            } else if (b == 4) {
                efk.f14832b.remove(i);
            }
            efk.f14833c.mo67270d();
            for (int i2 = 0; i2 < efk.f14831a.size(); i2++) {
                for (dwa dwa3 : (Set) efk.f14831a.valueAt(i2)) {
                    efk.f14833c.mo67268a(dwa3.f14243c, dwa3);
                }
            }
            if (efk.f14831a.mo10099a()) {
                this.f14830a.remove(doh);
            }
        }
    }
}
