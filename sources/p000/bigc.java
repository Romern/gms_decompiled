package p000;

import com.google.android.gms.beacon.BleSighting;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bigc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bigc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ List f120498a;

    /* renamed from: b */
    final /* synthetic */ bige f120499b;

    public bigc(bige bige, List list) {
        this.f120499b = bige;
        this.f120498a = list;
    }

    public final void run() {
        bigi bigi = this.f120499b.f120502a;
        List list = this.f120498a;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bhtv a = bigi.mo64591a((BleSighting) list.get(i));
            if (a != null) {
                arrayList.add(a);
            }
        }
        if (!arrayList.isEmpty()) {
            bigi.mo64593a(arrayList);
        }
    }
}
