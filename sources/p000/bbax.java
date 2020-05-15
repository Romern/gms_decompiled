package p000;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/* renamed from: bbax */
final /* synthetic */ class bbax implements bqeg {

    /* renamed from: a */
    private final List f102254a;

    /* renamed from: b */
    private final List f102255b;

    public bbax(List list, List list2) {
        this.f102254a = list;
        this.f102255b = list2;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        List list = this.f102254a;
        List list2 = this.f102255b;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            bavr bavr = (bavr) list.get(i);
            bavd bavd = (bavd) bqga.m112780a((Future) list2.get(i));
            if (bavd != null) {
                arrayList.add(Pair.create(bavr, bavd));
            }
        }
        return bqga.m112775a((Object) arrayList);
    }
}
