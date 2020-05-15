package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bdqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdqi {

    /* renamed from: a */
    private static final AtomicReference f106265a = new AtomicReference(null);

    /* renamed from: a */
    public static bdqh m91282a(bdid bdid, String str) {
        bmxy.m108581a(bdid);
        bmxy.m108600b(!TextUtils.isEmpty(str));
        bdqh bdqh = (bdqh) f106265a.getAndSet(null);
        if (bdqh != null) {
            bdqh.f106262b.f106249a = str;
        }
        return bdqh;
    }

    /* renamed from: b */
    public static void m91286b(bdid bdid) {
        bmxy.m108581a(bdid);
        f106265a.set(null);
    }

    /* renamed from: a */
    public static void m91283a(bdid bdid) {
        bmxy.m108581a(bdid);
        bdqh bdqh = (bdqh) f106265a.getAndSet(null);
        if (bdqh != null) {
            String str = bdqh.f106262b.f106249a;
        }
    }

    /* renamed from: b */
    public static boolean m91287b(bdid bdid, String str) {
        bmxy.m108581a(bdid);
        bmxy.m108581a(str);
        return f106265a.get() == null && f106265a.compareAndSet(null, new bdqh(str));
    }

    /* renamed from: a */
    public static void m91284a(bdid bdid, String str, long j, long j2) {
        bmxy.m108581a(bdid);
        bdqh bdqh = (bdqh) f106265a.get();
        if (bdqh != null && bdqh.f106262b.f106250b <= j) {
            bdqd a = bdqd.m91277a(bdid.f105688a, str, j, j + j2, Thread.currentThread().getId());
            synchronized (bdqh.f106264d) {
                bdqh.f106264d.add(a);
            }
            bdqh.f106261a.incrementAndGet();
        }
    }

    /* renamed from: a */
    public static cinx[] m91285a(bdid bdid, bdqh bdqh) {
        bmxy.m108581a(bdid);
        beel.m91856c();
        if (bdqh.f106261a.get() == 0) {
            return null;
        }
        Comparator comparator = bdqf.f106259a;
        synchronized (bdqh.f106264d) {
            Collections.sort(bdqh.f106264d, comparator);
            bdqh.f106262b.mo58293a(bdqh.f106264d);
        }
        ArrayList arrayList = new ArrayList(bdqh.f106263c.keySet());
        Collections.sort(arrayList, comparator);
        bdqh.f106262b.mo58293a(arrayList);
        bdqe bdqe = new bdqe(bdqh.f106262b);
        bdqe.mo58295a(bdqe.f106256a, 0);
        if (bdqe.f106257b.size() == 1) {
            return null;
        }
        List list = bdqe.f106257b;
        return (cinx[]) list.toArray(new cinx[list.size()]);
    }
}
