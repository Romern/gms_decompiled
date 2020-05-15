package p000;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: dwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dwh {

    /* renamed from: a */
    public static final int[] f14269a = {10000, 10001, 10002, 10003, 10004, 10005};

    /* renamed from: b */
    public final Set f14270b = new HashSet();

    /* renamed from: c */
    public final Map f14271c = new HashMap();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, doh, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* renamed from: a */
    public final void mo9773a(doh doh, int i, int i2) {
        boolean z = true;
        if (i2 == 1) {
            z = false;
        }
        sdo.m34974b(z);
        if (!mo9775b(i)) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dwh", "a", 140, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68422a("[InterestSyncState] account=%s, contextName=%s is not synchronizable", (Object) doh, i);
            return;
        }
        SparseArray sparseArray = (SparseArray) this.f14271c.get(doh);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            this.f14271c.put(doh, sparseArray);
        }
        dwg dwg = (dwg) sparseArray.get(i);
        if (dwg == null) {
            dwg = new dwg(doh, i, i2);
            sparseArray.put(i, dwg);
        }
        dwg.mo9771b(i2);
    }

    /* renamed from: b */
    public final boolean mo9775b(int i) {
        return this.f14270b.contains(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final boolean mo9774a(int i) {
        Iterator it = this.f14271c.values().iterator();
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                return false;
            }
            SparseArray sparseArray = (SparseArray) it.next();
            while (true) {
                if (i2 < sparseArray.size()) {
                    if (((dwg) sparseArray.valueAt(i2)).mo9770a(i)) {
                        return true;
                    }
                    i2++;
                }
            }
        }
    }
}
