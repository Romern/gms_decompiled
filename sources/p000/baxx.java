package p000;

import android.content.SharedPreferences;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: baxx */
final /* synthetic */ class baxx implements bqeh {

    /* renamed from: a */
    private final bayg f102072a;

    public baxx(bayg bayg) {
        this.f102072a = bayg;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bayg bayg = this.f102072a;
        ArrayList arrayList = new ArrayList();
        for (Pair pair : (List) obj) {
            bavr bavr = (bavr) pair.first;
            bavd bavd = (bavd) pair.second;
            Long valueOf = Long.valueOf(bbfe.m87919a(bavd));
            Object[] objArr = {"ExpirationHandler", bavd.f101873c, valueOf};
            if (bbfe.m87921a(valueOf.longValue(), bayg.f102091f)) {
                bayg.f102090e.mo34980a(1051, bavd.f101873c, bavd.f101875e);
                Object[] objArr2 = {"ExpirationHandler", bavd.f101873c, valueOf};
                arrayList.add(bavr);
            }
        }
        bbaz bbaz = bayg.f102087b;
        SharedPreferences.Editor edit = bbfh.m87928a(bbaz.f102256a, "gms_icing_mdd_groups", bbaz.f102257b).edit();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bavr bavr2 = (bavr) arrayList.get(i);
            Object[] objArr3 = {"FileGroupsMetadata", bavr2.f101919b, bavr2.f101920c};
            edit.remove(bbfh.m87931a(bavr2));
        }
        return bqdx.m112673a(bqga.m112775a(Boolean.valueOf(edit.commit())), new baye(bayg), bayg.f102094i);
    }
}
