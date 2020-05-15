package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: begg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class begg {

    /* renamed from: a */
    private final List f111531a = new ArrayList();

    public begg(List list) {
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                mo60684a((begh) list.get(i));
            }
        }
    }

    /* renamed from: a */
    public final begm mo60683a() {
        begi begi;
        ArrayList arrayList = new ArrayList();
        List list = this.f111531a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            begh begh = (begh) list.get(i);
            if (!begh.f111533b.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                List list2 = begh.f111533b;
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList2.add(((begj) list2.get(i2)).mo60688a());
                }
                begi = new begi(begh.f111532a, arrayList2);
            } else {
                begi = null;
            }
            if (begi != null) {
                arrayList.add(begi);
            }
        }
        return new begm(arrayList);
    }

    /* renamed from: a */
    public final void mo60684a(begh begh) {
        int i = 0;
        while (i < this.f111531a.size()) {
            if (!((begh) this.f111531a.get(i)).f111532a.equals(begh.f111532a)) {
                i++;
            } else {
                this.f111531a.set(i, begh);
                return;
            }
        }
        this.f111531a.add(begh);
    }
}
