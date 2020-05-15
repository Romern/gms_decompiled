package p000;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ecs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ecs {

    /* renamed from: a */
    public static final ArrayList f14696a = new ArrayList();

    /* renamed from: b */
    public final SparseArray f14697b = new SparseArray();

    /* renamed from: c */
    public final SparseArray f14698c = new SparseArray();

    public ecs(bxlm bxlm) {
        mo9968a(bxlm);
    }

    /* renamed from: a */
    public static int m10121a(int i, int i2, int i3) {
        return (i3 * 10000) + (i2 * 100) + i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxz):boolean
     arg types: [java.util.ArrayList, bmxz]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxz):boolean */
    /* renamed from: a */
    static ArrayList m10122a(List list) {
        ArrayList arrayList = new ArrayList(list);
        bnjd.m109580a((Iterable) arrayList, ecr.f14695a);
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    public final void mo9968a(bxlm bxlm) {
        this.f14697b.clear();
        if (!(bxlm == null || bxlm.f163861a.size() == 0)) {
            bxwc bxwc = bxlm.f163861a;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                bxkz bxkz = (bxkz) bxwc.get(i);
                SparseArray sparseArray = this.f14697b;
                bxkx bxkx = bxkz.f163820a;
                if (bxkx == null) {
                    bxkx = bxkx.f163810f;
                }
                int i2 = bxkx.f163813b;
                bxkx bxkx2 = bxkz.f163820a;
                if (bxkx2 == null) {
                    bxkx2 = bxkx.f163810f;
                }
                int i3 = bxkx2.f163814c;
                bxkx bxkx3 = bxkz.f163820a;
                if (bxkx3 == null) {
                    bxkx3 = bxkx.f163810f;
                }
                sparseArray.append(m10121a(i2, i3, bxkx3.f163815d), m10122a(new bxvv(bxkz.f163821b, bxkz.f163817c)));
            }
        }
        this.f14698c.clear();
        if (bxlm != null && bxlm.f163862b.size() != 0) {
            bxwc bxwc2 = bxlm.f163862b;
            int size2 = bxwc2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                bxlc bxlc = (bxlc) bxwc2.get(i4);
                SparseArray sparseArray2 = this.f14698c;
                int a = bxlj.m122835a(bxlc.f163831a);
                if (a == 0) {
                    a = 1;
                }
                sparseArray2.append(a - 1, m10122a(new bxvv(bxlc.f163832b, bxlc.f163828c)));
            }
        }
    }
}
