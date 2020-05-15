package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: begh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class begh {

    /* renamed from: a */
    public final String f111532a;

    /* renamed from: b */
    public final List f111533b = new ArrayList();

    public begh(String str, List list) {
        this.f111532a = str;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                mo60685a((begj) list.get(i));
            }
        }
    }

    /* renamed from: a */
    public final void mo60685a(begj begj) {
        int i = 0;
        while (i < this.f111533b.size()) {
            if (!((begj) this.f111533b.get(i)).f111536a.equals(begj.f111536a)) {
                i++;
            } else {
                this.f111533b.set(i, begj);
                return;
            }
        }
        this.f111533b.add(begj);
    }
}
