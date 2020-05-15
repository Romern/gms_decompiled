package p000;

import java.util.Map;

/* renamed from: bhte */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhte implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Map f119531a;

    /* renamed from: b */
    final /* synthetic */ boolean f119532b;

    /* renamed from: c */
    final /* synthetic */ bhtl f119533c;

    public bhte(bhtl bhtl, Map map, boolean z) {
        this.f119533c = bhtl;
        this.f119531a = map;
        this.f119532b = z;
    }

    public final void run() {
        bhtl bhtl = this.f119533c;
        Map map = this.f119531a;
        boolean z = this.f119532b;
        if (bhtl.f119550a != null) {
            int size = map.size();
            StringBuilder sb = new StringBuilder(32);
            sb.append("adding ");
            sb.append(size);
            sb.append(" l1data points");
            sb.toString();
            int a = bhtl.f119550a.mo64239a(map, z);
            bhuj.m101555a();
            StringBuilder sb2 = new StringBuilder(33);
            sb2.append("L1 disk size: ");
            sb2.append(a);
            sb2.append(" entries");
            sb2.toString();
            if (a > ((int) cggm.f186849a.mo6606a().mo83736o())) {
                bhuj.m101555a();
                bhtl.mo64269a(2);
            }
        }
    }
}
