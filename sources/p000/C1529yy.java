package p000;

import java.util.ArrayList;

/* renamed from: yy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1529yy implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ArrayList f27689a;

    /* renamed from: b */
    final /* synthetic */ C1538zg f27690b;

    public C1529yy(C1538zg zgVar, ArrayList arrayList) {
        this.f27690b = zgVar;
        this.f27689a = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.f27689a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f27690b.mo16614c((acm) arrayList.get(i));
        }
        this.f27689a.clear();
        this.f27690b.f27725a.remove(this.f27689a);
    }
}
