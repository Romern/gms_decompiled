package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: zkd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zkd implements zgg {

    /* renamed from: a */
    private final Runnable f55280a;

    /* renamed from: b */
    private final Map f55281b = new HashMap();

    /* renamed from: c */
    private final int f55282c;

    static {
        zvt.m46581a();
    }

    public zkd(int i, Runnable runnable) {
        this.f55282c = i;
        this.f55280a = runnable;
    }

    /* renamed from: d */
    private final synchronized bnic m45640d() {
        bnic a;
        a = bnic.m109495a((Collection) this.f55281b.keySet());
        if (!a.isEmpty() && this.f55282c != 1) {
            a = bnic.m109489a((zgg) a.iterator().next());
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized zkc mo31190a() {
        zkc zkc;
        synchronized (this) {
            long j = Long.MIN_VALUE;
            long j2 = Long.MAX_VALUE;
            long j3 = Long.MAX_VALUE;
            long j4 = Long.MAX_VALUE;
            int i = 1;
            for (zkc zkc2 : this.f55281b.values()) {
                j2 = Math.min(zkc2.f55274a, j2);
                j3 = Math.min(zkc2.f55275b, j3);
                i = Math.max(zkc2.f55276c, i);
                long j5 = zkc2.f55278e;
                if (j5 < j4) {
                    j = Math.max(zkc2.f55279f, j);
                    j4 = j5;
                }
            }
            HashSet hashSet = new HashSet();
            for (zkc zkc3 : this.f55281b.values()) {
                if (zkc3.f55274a <= j2 + j2) {
                    hashSet.addAll(zkc3.f55277d);
                }
            }
            zkc = new zkc(j2, j3, j4, i, new ArrayList(hashSet), j);
        }
        return zkc;
    }

    /* renamed from: b */
    public final synchronized boolean mo31194b() {
        return this.f55281b.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized bnic mo31195c() {
        return bnic.m109495a((Collection) this.f55281b.keySet());
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        int i = this.f55282c;
        String str = i != 1 ? i != 2 ? "null" : "FIRE_FIRST" : "FIRE_ALL";
        if (i != 0) {
            objArr[0] = str;
            objArr[1] = m45640d();
            objArr[2] = mo31190a();
            return String.format("CompositeRegistration{strategy=%s, listeners=%s, combinedRegistration=%s}", objArr);
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo30949a(List list) {
        bnic a;
        synchronized (this) {
            a = bnic.m109495a((Collection) this.f55281b.keySet());
        }
        a.size();
        int i = this.f55282c;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                bnrd a2 = a.iterator();
                while (a2.hasNext()) {
                    ((zgg) a2.next()).mo30949a(list);
                }
            } else if (i2 == 1 && !a.isEmpty()) {
                ((zgg) a.iterator().next()).mo30949a(list);
            }
            this.f55280a.run();
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final synchronized void mo31191a(zgh zgh) {
        this.f55281b.put(zgh.f55012b, new zkc(zgh.f55013c, zgh.f55014d, zgh.f55015e, zgh.f55016f, zgh.f55018h, zgh.f55017g));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized boolean mo31192a(zgg zgg) {
        return this.f55281b.remove(zgg) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo31193a(zkc zkc) {
        return !mo31190a().mo31186a(zkc);
    }
}
