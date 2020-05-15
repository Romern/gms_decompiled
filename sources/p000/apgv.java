package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

/* renamed from: apgv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apgv {

    /* renamed from: a */
    public int[] f84350a;

    static {
        apgv.class.getSimpleName();
    }

    public apgv(int i, TreeSet treeSet) {
        Iterator it = treeSet.iterator();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        boolean z = true;
        while (it.hasNext()) {
            int a = (int) m70256a(((apgr) it.next()).mo47194b().f84346a);
            if (i2 != a || z) {
                arrayList.add(Integer.valueOf(a));
            }
            i2 = a;
            z = false;
        }
        int[] iArr = new int[(arrayList.size() + 3)];
        this.f84350a = iArr;
        iArr[0] = 1;
        iArr[1] = 1936614772;
        iArr[2] = i;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.f84350a[i3 + 3] = ((Integer) arrayList.get(i3)).intValue();
        }
    }

    /* renamed from: a */
    public static long m70255a(long j) {
        return j & 4294967295L;
    }

    /* renamed from: a */
    public static long m70256a(byte[] bArr) {
        return (((long) bArr[3]) & 255) | ((((long) bArr[2]) & 255) << 8) | ((((long) bArr[1]) & 255) << 16) | ((255 & ((long) bArr[0])) << 24);
    }
}
