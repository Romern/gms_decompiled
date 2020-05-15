package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: znm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class znm {

    /* renamed from: c */
    public static final /* synthetic */ int f55559c = 0;

    /* renamed from: d */
    private static final bnic f55560d;

    /* renamed from: a */
    public final yga f55561a;

    /* renamed from: b */
    public final yec f55562b;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [java.util.Set, bmxj]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    static {
        bnia j = bnic.m109500j();
        j.mo67752b(bnjd.m109575a((Iterable) ywi.f54702a.keySet(), znk.f55558a));
        j.mo67629b("com.google.calories.consumed");
        f55560d = j.mo67751a();
    }

    public znm(yga yga, yec yec) {
        this.f55561a = yga;
        this.f55562b = yec;
    }

    /* renamed from: a */
    public static boolean m45808a(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            bnic bnic = f55560d;
            caah caah = ((caae) it.next()).f172330f;
            if (caah == null) {
                caah = caah.f172333d;
            }
            if (!bnic.contains(caah.f172336b)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final List mo31274a(String str, cadl cadl, List list, List list2, ygc ygc, TimeUnit timeUnit, long j, long j2, int i) {
        boolean z;
        int i2;
        if (cadl == cadl.UNKNOWN_BUCKET) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        List a = mo31275a(list, list2, str);
        long nanos = timeUnit.toNanos(j);
        long nanos2 = timeUnit.toNanos(j2);
        if (i == 0) {
            i2 = -1;
        } else {
            i2 = i;
        }
        return this.f55561a.mo30457a(a, nanos, nanos2, i2, ygc);
    }

    /* renamed from: a */
    public final List mo31275a(List list, List list2, String str) {
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            caae caae = (caae) list.get(i);
            if (!"empty_aggregation_placeholder".equals(caae.f172327c)) {
                arrayList.add(this.f55561a.mo30458a(caae, str));
            }
        }
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList.add(this.f55561a.mo30459a((caah) list2.get(i2)));
        }
        return arrayList;
    }
}
