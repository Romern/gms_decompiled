package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: dum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class dum {

    /* renamed from: a */
    private final long f14049a;

    public dum(long j) {
        this.f14049a = j;
    }

    /* renamed from: a */
    static final boolean m9391a(duk duk, duk duk2) {
        if (!duk.mo9623c(duk2.f14046a) && !duk.mo9623c(duk2.f14047b) && !duk2.mo9623c(duk.f14046a) && !duk2.mo9623c(duk.f14047b)) {
            return false;
        }
        duk.f14046a = Math.min(duk.f14046a, duk2.f14046a);
        duk.f14047b = Math.max(duk.f14047b, duk2.f14047b);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000b  */
    /* renamed from: b */
    public static final void m9392b(duk duk, Set set) {
        Iterator it = set.iterator();
        boolean z = false;
        while (it.hasNext() && !(z = m9391a((duk) it.next(), duk))) {
            while (it.hasNext()) {
                while (it.hasNext()) {
                }
            }
        }
        if (z) {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                duk duk2 = (duk) it2.next();
                Iterator it3 = set.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    duk duk3 = (duk) it3.next();
                    if (!duk2.equals(duk3) && m9391a(duk3, duk2)) {
                        it2.remove();
                        break;
                    }
                }
            }
            return;
        }
        set.add(duk);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9633a(duk duk, Set set) {
        long j;
        duk duk2 = duk;
        Set set2 = set;
        TreeSet<duk> treeSet = new TreeSet();
        if (!duk2.mo9626e(this.f14049a)) {
            while (duk2.f14046a < 0) {
                duk2.mo9621a(this.f14049a);
            }
            while (true) {
                long j2 = duk2.f14046a;
                j = this.f14049a;
                if (j2 <= j) {
                    break;
                }
                duk2.mo9621a(-j);
            }
            if (duk2.mo9626e(j)) {
                treeSet.add(duk2);
            } else {
                long j3 = duk2.f14047b;
                if (j3 > this.f14049a) {
                    while (true) {
                        long j4 = this.f14049a;
                        if (j3 <= j4) {
                            break;
                        }
                        j3 -= j4;
                    }
                    treeSet.add(duk.m9379a(0, j3));
                    treeSet.add(duk.m9379a(duk2.f14046a, this.f14049a));
                }
            }
        } else {
            treeSet.add(duk2);
        }
        for (duk duk3 : treeSet) {
            Iterator it = set.iterator();
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            while (it.hasNext()) {
                duk duk4 = (duk) it.next();
                long j5 = duk4.f14046a;
                long j6 = duk3.f14046a;
                if (j5 > j6 || j6 >= duk4.f14047b) {
                    long j7 = duk3.f14047b;
                    if ((j5 >= j7 || j7 >= duk4.f14047b) && (j5 <= j6 || j5 >= j7)) {
                        if (z) {
                            break;
                        }
                    }
                }
                long min = Math.min(j5, j6);
                long max = Math.max(duk4.f14046a, duk3.f14046a);
                long min2 = Math.min(duk4.f14047b, duk3.f14047b);
                long max2 = Math.max(duk4.f14047b, duk3.f14047b);
                if (min < max) {
                    arrayList.add(new duk(min, max));
                }
                if (max < min2) {
                    arrayList.add(new duk(max, min2));
                }
                duk3.f14046a = min2;
                duk3.f14047b = max2;
                it.remove();
                z = true;
            }
            set2.addAll(arrayList);
            if (duk3.f14047b - duk3.f14046a > 0) {
                set2.add(duk3);
            }
        }
    }
}
