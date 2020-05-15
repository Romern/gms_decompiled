package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: airs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class airs {

    /* renamed from: a */
    public final List f69582a = new ArrayList();

    /* renamed from: b */
    public final List f69583b = new ArrayList();

    /* renamed from: c */
    public final Map f69584c = new C1223np();

    /* renamed from: d */
    public final Map f69585d = new C1223np();

    /* renamed from: e */
    public final ScheduledExecutorService f69586e;

    /* renamed from: f */
    public final AtomicBoolean f69587f = new AtomicBoolean(false);

    /* renamed from: g */
    public airo f69588g;

    /* renamed from: h */
    private final airm f69589h;

    /* renamed from: i */
    private final Map f69590i = new C1223np();

    public airs() {
        airm airm = new airm();
        ScheduledExecutorService a = ahhr.m55804a();
        this.f69589h = airm;
        this.f69586e = a;
    }

    /* renamed from: a */
    public static String m57810a(Collection collection) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            airo airo = (airo) it.next();
            if (z) {
                sb.append(", ");
            }
            sb.append(airo.mo37902d());
            z = true;
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: b */
    private final void m57815b(airo airo, airo airo2) {
        if (!this.f69585d.containsKey(airo)) {
            this.f69585d.put(airo, new ArrayList());
        }
        ((List) this.f69585d.get(airo)).add(airo2);
    }

    /* renamed from: d */
    private final void m57816d(airo airo) {
        ((airq) this.f69584c.remove(airo)).f69576b.mo36396b();
    }

    /* renamed from: e */
    private final void m57817e(airo airo) {
        if (this.f69583b.remove(airo) || this.f69585d.remove(airo) != null) {
            airo.mo37900b(3);
        } else if (this.f69584c.containsKey(airo)) {
            m57816d(airo);
            airo.mo37900b(3);
        } else {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("airs", "e", 701, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("%s Can't stop %s because it was never registered successfully.", "[MMD]:", airo.mo37902d());
        }
    }

    /* renamed from: f */
    private final void m57818f(airo airo) {
        this.f69590i.put(airo, new ArrayList());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: airs.a(airo, boolean):void
     arg types: [airo, int]
     candidates:
      airs.a(java.util.Collection, airo):java.util.List
      airs.a(airo, int):boolean
      airs.a(airo, airo):boolean
      airs.a(airo, boolean):void */
    /* renamed from: c */
    public final synchronized void mo37910c(airo airo) {
        if (airo != null) {
            if (!this.f69583b.remove(airo)) {
                if (this.f69585d.remove(airo) == null) {
                    if (this.f69584c.containsKey(airo)) {
                        m57816d(airo);
                        airo.mo37900b(3);
                    } else {
                        bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                        bnsl.mo68432a("airs", "e", 701, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68424a("%s Can't stop %s because it was never registered successfully.", "[MMD]:", airo.mo37902d());
                    }
                    new Object[1][0] = airo.mo37902d();
                    m57812a(airo, false);
                    srn srn = ailf.f69111a;
                    return;
                }
            }
            airo.mo37900b(3);
            new Object[1][0] = airo.mo37902d();
            m57812a(airo, false);
            srn srn2 = ailf.f69111a;
            return;
        }
        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68388c();
        bnsl2.mo68432a("airs", "c", 670, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68420a("%s Null operation cannot be unregistered.", "[MMD]:");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: airs.a(airo, boolean):void
     arg types: [airo, int]
     candidates:
      airs.a(java.util.Collection, airo):java.util.List
      airs.a(airo, int):boolean
      airs.a(airo, airo):boolean
      airs.a(airo, boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ba, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r7.wait();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c4, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cb, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r0 = r6.f69590i.values().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00da, code lost:
        if (r0.hasNext() != false) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00dc, code lost:
        ((java.util.List) r0.next()).remove(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ea, code lost:
        return p000.airr.f69579c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ef, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r6.f69582a.add(r7);
        m57818f(r7);
        r0 = p000.ailf.f69111a;
     */
    /* renamed from: b */
    public final airr mo37908b(airo airo) {
        loop0:
        while (true) {
            if (this.f69587f.get()) {
                break;
            }
            synchronized (this) {
                airo airo2 = this.f69588g;
                if (airo2 == null) {
                    for (airo airo3 : mo37909b()) {
                        if (airm.m57798a(((airl) this.f69589h.f69565a.get(airo.f69571g)).f69563d, airo3.f69571g)) {
                            srn srn = ailf.f69111a;
                            airo3.mo37902d();
                            airr airr = airr.FAILURE;
                            return airr;
                        }
                    }
                    for (airo airo4 : mo37909b()) {
                        if (airm.m57798a(((airl) this.f69589h.f69565a.get(airo.f69571g)).f69561b, airo4.f69571g)) {
                            m57815b(airo, airo4);
                            srn srn2 = ailf.f69111a;
                            airo4.mo37902d();
                        }
                    }
                    if (!this.f69585d.containsKey(airo)) {
                        for (airo airo5 : mo37909b()) {
                            if (airm.m57798a(((airl) this.f69589h.f69565a.get(airo.f69571g)).f69562c, airo5.f69571g)) {
                                ((List) this.f69590i.get(airo5)).add(airo);
                                srn srn3 = ailf.f69111a;
                                airo5.mo37902d();
                            }
                        }
                        break loop0;
                    }
                    m57818f(airo);
                    airr airr2 = airr.DEFERRED;
                    return airr2;
                }
                throw new IllegalStateException(String.format("Error! MediumOperations cannot be registered in the start() method of another MediumOperation. Registering MediumOperation %s was attempted from within MediumOperation %s.", airo, airo2));
            }
        }
        if (this.f69587f.get()) {
            srn srn4 = ailf.f69111a;
            return airr.FAILURE;
        }
        synchronized (this) {
            try {
                this.f69588g = airo;
                for (airo airo6 : this.f69585d.keySet()) {
                    m57814a(airo6, airo);
                }
                this.f69583b.removeAll(m57811a(this.f69583b, airo));
                for (airo airo7 : m57811a(this.f69584c.keySet(), airo)) {
                    m57816d(airo7);
                }
                this.f69582a.remove(airo);
                if (!m57813a(airo, 0)) {
                    new Object[1][0] = airo.mo37902d();
                    m57812a(airo, false);
                    airr airr3 = airr.FAILURE;
                    this.f69588g = null;
                    return airr3;
                }
                airr airr4 = airr.SUCCESS;
                this.f69588g = null;
                return airr4;
            } catch (Throwable th) {
                this.f69588g = null;
                throw th;
            }
        }
    }

    /* renamed from: a */
    private final List m57811a(Collection collection, airo airo) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            airo airo2 = (airo) it.next();
            if (m57814a(airo2, airo)) {
                airo2.mo37900b(2);
                arrayList.add(airo2);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private final void m57812a(airo airo, boolean z) {
        List<airo> list;
        ArrayList arrayList = new ArrayList();
        for (airo airo2 : this.f69585d.keySet()) {
            if (cfnv.f184625a.mo6606a().mo81740Z()) {
                List list2 = (List) this.f69585d.get(airo2);
                if (!z) {
                    list2.remove(airo);
                } else if (!this.f69589h.mo37898a(airo2, airo)) {
                    list2.remove(airo);
                }
                if (list2.isEmpty()) {
                    arrayList.add(airo2);
                }
            } else if (((List) this.f69585d.get(airo2)).remove(airo) && ((List) this.f69585d.get(airo2)).isEmpty()) {
                arrayList.add(airo2);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            airo airo3 = (airo) arrayList.get(i);
            this.f69585d.remove(airo3);
            srn srn = ailf.f69111a;
            airo3.mo37902d();
            m57813a(airo3, 0);
        }
        if (this.f69590i.containsKey(airo)) {
            list = (List) this.f69590i.remove(airo);
        } else {
            list = new ArrayList();
        }
        airo.mo37902d();
        for (airo airo4 : list) {
            synchronized (airo4) {
                srn srn2 = ailf.f69111a;
                airo4.mo37902d();
                airo4.notify();
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: airs.a(airo, boolean):void
     arg types: [airo, int]
     candidates:
      airs.a(java.util.Collection, airo):java.util.List
      airs.a(airo, int):boolean
      airs.a(airo, airo):boolean
      airs.a(airo, boolean):void */
    /* renamed from: a */
    private final boolean m57813a(airo airo, int i) {
        String str;
        if (this.f69587f.get()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("airs", "a", 528, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68425a("%s Operation %s failed to start on retry attempt %d because the manager has been shutdown.", "[MMD]:", airo.mo37902d(), Integer.valueOf(i));
            return false;
        }
        String d = airo.mo37902d();
        int f = airo.mo37904f();
        int i2 = f - 1;
        if (f != 0) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            srn srn = ailf.f69111a;
                            airp airp = new airp(this, airo);
                            long ap = cfnv.f184625a.mo6606a().mo81783ap();
                            double pow = Math.pow(cfnv.f184625a.mo6606a().mo81782ao(), (double) i);
                            long an = cfnv.f184625a.mo6606a().mo81781an();
                            double d2 = (double) ap;
                            Double.isNaN(d2);
                            this.f69584c.put(airo, new airq(i + 1, ahfi.m55635b(airp, (long) Math.min(d2 * pow, (double) an), this.f69586e)));
                            airo.mo37902d();
                            return true;
                        } else if (i2 != 4) {
                            Object[] objArr = new Object[4];
                            objArr[0] = "[MMD]:";
                            if (f != 1) {
                                str = f != 2 ? f != 3 ? f != 4 ? f != 5 ? "null" : "CHANGED_TYPE" : "NEEDS_RETRY" : "FAILURE" : "SUCCESS";
                            } else {
                                str = "UNKNOWN";
                            }
                            objArr[1] = str;
                            objArr[2] = airo.mo37902d();
                            objArr[3] = Integer.valueOf(i);
                            throw new AssertionError(String.format("%s Unknown start state %s for operation %s on retry attempt %d", objArr));
                        } else {
                            srn srn2 = ailf.f69111a;
                            airo.mo37902d();
                            Object[] objArr2 = {d, airo.mo37902d()};
                            m57812a(airo, true);
                            m57818f(airo);
                        }
                    }
                }
                this.f69583b.add(airo);
                srn srn3 = ailf.f69111a;
                airo.mo37902d();
                return true;
            }
            srn srn4 = ailf.f69111a;
            airo.mo37902d();
            return false;
        }
        throw null;
    }

    /* renamed from: b */
    public final List mo37909b() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f69582a);
        arrayList.addAll(this.f69583b);
        arrayList.addAll(this.f69584c.keySet());
        arrayList.addAll(this.f69585d.keySet());
        return arrayList;
    }

    /* renamed from: a */
    private final boolean m57814a(airo airo, airo airo2) {
        if (!this.f69589h.mo37898a(airo, airo2)) {
            return false;
        }
        m57815b(airo, airo2);
        srn srn = ailf.f69111a;
        airo.mo37902d();
        return true;
    }

    /* renamed from: a */
    public final void mo37906a() {
        if (this.f69587f.compareAndSet(false, true)) {
            synchronized (this) {
                for (airq airq : this.f69584c.values()) {
                    airq.f69576b.mo36396b();
                }
                ahhr.m55805a(this.f69586e, "MultiMediumDependencyManager.needsRetryExecutor");
                for (airo airo : mo37909b()) {
                    bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
                    bnsl.mo68432a("airs", "a", 160, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68424a("%s MediumOperation %s is unexpectedly registered and will be unregistered.", "[MMD]:", airo.mo37902d());
                    mo37910c(airo);
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo37907a(airo airo) {
        airq airq = (airq) this.f69584c.remove(airo);
        srn srn = ailf.f69111a;
        int i = airq.f69575a;
        airo.mo37902d();
        m57813a(airo, airq.f69575a);
    }
}
