package p000;

import java.util.Map;

/* renamed from: bhze */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhze implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Map f119936a;

    /* renamed from: b */
    final /* synthetic */ bhzk f119937b;

    public bhze(bhzk bhzk, Map map) {
        this.f119937b = bhzk;
        this.f119936a = map;
    }

    public final void run() {
        bhzk bhzk = this.f119937b;
        Map map = this.f119936a;
        if (bhzk.f119956g != null) {
            int size = map.size();
            StringBuilder sb = new StringBuilder(32);
            sb.append("adding ");
            sb.append(size);
            sb.append(" l1data points");
            sb.toString();
            int a = bhzk.f119956g.mo64240a(map, false, false);
            StringBuilder sb2 = new StringBuilder(33);
            sb2.append("L1 disk size: ");
            sb2.append(a);
            sb2.append(" entries");
            sb2.toString();
            if (((long) a) > cgfr.f186745a.mo6606a().mo83629d()) {
                bhzk.mo64448a(2);
            }
        }
    }
}
