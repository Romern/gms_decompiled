package p000;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: ii */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1076ii implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ArrayList f21045a;

    /* renamed from: b */
    final /* synthetic */ Map f21046b;

    public C1076ii(ArrayList arrayList, Map map) {
        this.f21045a = arrayList;
        this.f21046b = map;
    }

    public final void run() {
        int size = this.f21045a.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f21045a.get(i);
            C1280ps.m19893a(view, (String) this.f21046b.get(C1280ps.m19935q(view)));
        }
    }
}
