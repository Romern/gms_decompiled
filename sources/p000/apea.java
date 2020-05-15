package p000;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: apea */
final /* synthetic */ class apea implements auca {
    /* renamed from: a */
    public final aucb mo13157a(Object obj) {
        List<Pair> list = (List) obj;
        if (list == null || list.size() < 2) {
            apeh.f84210c.mo46986d("Missing values for footprint or android backup list, Number of list : %d", Integer.valueOf(list.size()));
            int size = list.size();
            StringBuilder sb = new StringBuilder(79);
            sb.append("Missing values for footprint or android backup list, Number of list ");
            sb.append(size);
            throw new IllegalStateException(sb.toString());
        }
        HashMap hashMap = new HashMap();
        List<apej> list2 = null;
        List<apej> list3 = null;
        for (Pair pair : list) {
            if ("gms_backup".equals(pair.first)) {
                list3 = (List) pair.second;
            } else if ("footprint_backup".equals(pair.first)) {
                list2 = (List) pair.second;
            }
        }
        for (apej apej : list2) {
            hashMap.put(apej.f84230b, apej);
        }
        int i = 0;
        for (apej apej2 : list3) {
            if (apej2.mo47138b()) {
                i++;
            }
            hashMap.put(apej2.f84230b, apej2);
        }
        if (cgkf.f187143a.mo6606a().mo83972g()) {
            aoyj a = aoyj.m69819a();
            int size2 = list2.size();
            int size3 = list3.size();
            bxvd da = bzej.f169654i.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzej bzej = (bzej) da.f164949b;
            bzej.f169661f = size2;
            bzej.f169662g = size3;
            bzej.f169663h = i;
            a.mo46995a((bzej) da.mo74062i());
        }
        return aucu.m76778a((Object) new ArrayList(hashMap.values()));
    }
}
