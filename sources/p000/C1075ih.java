package p000;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1075ih implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ArrayList f20989a;

    /* renamed from: b */
    final /* synthetic */ Map f20990b;

    public C1075ih(ArrayList arrayList, Map map) {
        this.f20989a = arrayList;
        this.f20990b = map;
    }

    public final void run() {
        String str;
        int size = this.f20989a.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f20989a.get(i);
            String q = C1280ps.m19935q(view);
            if (q != null) {
                Iterator it = this.f20990b.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (q.equals(entry.getValue())) {
                        str = (String) entry.getKey();
                        break;
                    }
                }
                C1280ps.m19893a(view, str);
            }
        }
    }
}
