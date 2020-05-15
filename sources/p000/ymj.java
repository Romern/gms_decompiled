package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: ymj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ymj extends yjd {
    public ymj(yja yja) {
        super(yja);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final ygx mo30567c(List list, yhg yhg, yhy yhy) {
        bnhe bnhe;
        int i;
        yhg yhg2 = yhg;
        ypq.m44537a();
        HashMap hashMap = new HashMap();
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            ygx ygx = (ygx) list.get(i3);
            yfr b = ygx.mo30474b();
            String f = b.mo30427f();
            if ("user_input".equals(f) || f.startsWith("session_activity_segment")) {
                bnhe = bnoj.f131912b;
            } else if (!b.mo30422b().mo30410b()) {
                bnhe = bnhe.m109409a(7, 1, 0, 1);
            } else if (f.startsWith("activity_from_steps")) {
                bnhe = bnhe.m109410a(7, 1, 0, 2, 3, 3);
            } else {
                bnhe = "detected_sports_session".equals(f) ? bnhe.m109408a(4, 4) : bnhe.m109410a(7, 1, 0, 1, 3, 3);
            }
            HashMap hashMap2 = new HashMap();
            bngx a = ygx.mo30473a();
            bngs b2 = bngx.m109371b(a.size());
            int size2 = a.size();
            long j = 0;
            int i4 = 0;
            while (i4 < size2) {
                yhu yhu = (yhu) a.get(i4);
                if (yhu.mo30509a(i2).mo30434a() != 4 && yhu.mo30385a() < yhu.mo30387b() && yhu.mo30385a() >= j) {
                    b2.mo67668c(yhu);
                    j = yhu.mo30387b();
                }
                i4++;
                i2 = 0;
            }
            bnre i5 = b2.mo67664a().listIterator();
            while (i5.hasNext()) {
                yhu yhu2 = (yhu) i5.next();
                Integer num = (Integer) bnhe.get(Integer.valueOf(yhu2.mo30517j()));
                if (num == null) {
                    num = 0;
                }
                List list2 = (List) hashMap2.get(num);
                if (list2 == null) {
                    list2 = new ArrayList();
                    hashMap2.put(num, list2);
                }
                list2.add(yhu2);
            }
            Iterator it = hashMap2.entrySet().iterator();
            while (true) {
                i = i3 + 1;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                List list3 = (List) hashMap.get(entry.getKey());
                if (list3 == null) {
                    list3 = new ArrayList();
                    hashMap.put((Integer) entry.getKey(), list3);
                }
                list3.add((List) entry.getValue());
            }
            i3 = i;
            i2 = 0;
        }
        bngs j2 = bngx.m109377j();
        for (int i6 = 0; i6 <= 3; i6++) {
            List list4 = (List) hashMap.get(Integer.valueOf(i6));
            if (list4 != null) {
                j2.mo67666b((Iterable) list4);
            }
        }
        return mo30563a(ymk.m44367a(j2.mo67664a(), yhg2), yhg2);
    }
}
