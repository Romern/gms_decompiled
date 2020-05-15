package p000;

import java.util.Map;

/* renamed from: bhzf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhzf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Map f119938a;

    /* renamed from: b */
    final /* synthetic */ bhzk f119939b;

    public bhzf(bhzk bhzk, Map map) {
        this.f119939b = bhzk;
        this.f119938a = map;
    }

    public final void run() {
        bhzk bhzk = this.f119939b;
        Map map = this.f119938a;
        if (bhzk.f119957h != null) {
            int size = map.size();
            StringBuilder sb = new StringBuilder(32);
            sb.append("adding ");
            sb.append(size);
            sb.append(" l2data points");
            sb.toString();
            int a = bhzk.f119957h.mo64240a(map, false, false);
            StringBuilder sb2 = new StringBuilder(33);
            sb2.append("L2 disk size: ");
            sb2.append(a);
            sb2.append(" entries");
            sb2.toString();
            if (((long) a) > cgfr.f186745a.mo6606a().mo83631f()) {
                bhzk.mo64448a(3);
            }
        }
    }
}
