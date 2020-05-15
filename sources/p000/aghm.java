package p000;

/* renamed from: aghm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aghm {

    /* renamed from: f */
    private static final Object f65437f = new Object();

    /* renamed from: a */
    public final String f65438a;

    /* renamed from: b */
    private final aghk f65439b;

    /* renamed from: c */
    private final Object f65440c;

    /* renamed from: d */
    private final Object f65441d;

    /* renamed from: e */
    private final Object f65442e = new Object();

    /* renamed from: g */
    private volatile Object f65443g = null;

    /* renamed from: h */
    private volatile Object f65444h = null;

    public aghm(String str, Object obj, Object obj2, aghk aghk) {
        this.f65438a = str;
        this.f65440c = obj;
        this.f65441d = obj2;
        this.f65439b = aghk;
    }

    /* renamed from: a */
    public final Object mo35389a() {
        return mo35390a(null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0023, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4 = p000.aghn.f65471a.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002f, code lost:
        if (r4.hasNext() == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0031, code lost:
        r0 = (p000.aghm) r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003b, code lost:
        if (p000.agde.m54034a() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003d, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r2 = r0.f65439b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0040, code lost:
        if (r2 == null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0042, code lost:
        r1 = r2.mo35388a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x005a, code lost:
        throw new java.lang.IllegalStateException("Refreshing flag cache must be done on a worker thread.");
     */
    /* renamed from: a */
    public final Object mo35390a(Object obj) {
        aghm aghm;
        Object obj2;
        Object obj3;
        synchronized (this.f65442e) {
        }
        if (obj != null) {
            return obj;
        }
        if (aghl.f65436a == null) {
            return this.f65441d;
        }
        if (!aghl.f65436a.f65291a) {
            synchronized (f65437f) {
                if (agde.m54034a()) {
                    if (this.f65444h != null) {
                        obj3 = this.f65444h;
                    } else {
                        obj3 = this.f65440c;
                    }
                }
            }
        }
        aghk aghk = this.f65439b;
        if (aghk == null) {
            return !aghl.f65436a.f65291a ? this.f65440c : this.f65441d;
        }
        try {
            return aghk.mo35388a();
        } catch (SecurityException e) {
            return !aghl.f65436a.f65291a ? this.f65440c : this.f65441d;
        } catch (IllegalStateException e2) {
            return !aghl.f65436a.f65291a ? this.f65440c : this.f65441d;
        }
        synchronized (f65437f) {
            aghm.f65444h = obj2;
        }
    }
}
