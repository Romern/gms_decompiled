package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: bigf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bigf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bigi f120503a;

    public bigf(bigi bigi) {
        this.f120503a = bigi;
    }

    public final void run() {
        bify bify = this.f120503a.f120514g;
        long j = bigi.f120507a;
        ArrayList arrayList = new ArrayList(bify.f120486a.size());
        Iterator it = bify.f120486a.entrySet().iterator();
        while (it.hasNext()) {
            bhtv bhtv = (bhtv) ((Map.Entry) it.next()).getValue();
            if (bhtv.f119577d + j >= System.currentTimeMillis()) {
                arrayList.add(bhtv);
            } else {
                it.remove();
            }
        }
        if (!arrayList.isEmpty()) {
            this.f120503a.mo64593a(arrayList);
        }
        this.f120503a.f120519l = false;
    }
}
