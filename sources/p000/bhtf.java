package p000;

import java.util.Map;

/* renamed from: bhtf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhtf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Map f119534a;

    /* renamed from: b */
    final /* synthetic */ boolean f119535b;

    /* renamed from: c */
    final /* synthetic */ bhtl f119536c;

    public bhtf(bhtl bhtl, Map map, boolean z) {
        this.f119536c = bhtl;
        this.f119534a = map;
        this.f119535b = z;
    }

    public final void run() {
        bhtl bhtl = this.f119536c;
        Map map = this.f119534a;
        boolean z = this.f119535b;
        if (bhtl.f119551b != null) {
            int size = map.size();
            StringBuilder sb = new StringBuilder(32);
            sb.append("adding ");
            sb.append(size);
            sb.append(" l2data points");
            sb.toString();
            bhtl.mo64275b(bhtl.f119551b.mo64239a(map, z));
        }
    }
}
