package p000;

/* renamed from: eoz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eoz implements C0013ak {

    /* renamed from: a */
    private static eoz f15453a = null;

    /* renamed from: b */
    private static int f15454b = 0;

    /* renamed from: c */
    private final C0015am f15455c = new C0015am(this);

    /* renamed from: d */
    private final epa f15456d;

    private eoz() {
        rzq a = rzq.m34710a();
        C0015am amVar = this.f15455c;
        cazf.m127594a(a);
        cazf.m127594a(amVar);
        this.f15456d = new epc(a, amVar);
        this.f15455c.mo1024a(C0007ae.CREATED);
    }

    /* renamed from: a */
    public static synchronized epa m10886a(C0008af afVar) {
        epa epa;
        synchronized (eoz.class) {
            if (f15453a == null) {
                f15453a = new eoz();
            }
            m10888b(afVar);
            epa = f15453a.f15456d;
        }
        return epa;
    }

    /* renamed from: b */
    private static synchronized void m10888b(C0008af afVar) {
        synchronized (eoz.class) {
            f15454b++;
            fgc.m11649a(afVar, eoy.f15452a);
        }
    }

    public final C0008af getLifecycle() {
        return this.f15455c;
    }

    /* renamed from: a */
    public static synchronized void m10887a() {
        synchronized (eoz.class) {
            int i = f15454b - 1;
            f15454b = i;
            if (i == 0) {
                f15453a.f15455c.mo1024a(C0007ae.DESTROYED);
                f15453a = null;
            }
        }
    }
}
