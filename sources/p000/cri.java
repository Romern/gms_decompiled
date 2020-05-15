package p000;

/* renamed from: cri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cri implements C1241og {

    /* renamed from: a */
    private final crh f11880a;

    /* renamed from: b */
    private final crk f11881b;

    /* renamed from: c */
    private final C1241og f11882c;

    public cri(C1241og ogVar, crh crh, crk crk) {
        this.f11882c = ogVar;
        this.f11880a = crh;
        this.f11881b = crk;
    }

    /* renamed from: a */
    public final Object mo8188a() {
        Object a = this.f11882c.mo8188a();
        if (a == null) {
            a = this.f11880a.mo3820a();
        }
        if (a instanceof crj) {
            ((crj) a).mo3811aQ().f11884a = false;
        }
        return a;
    }

    /* renamed from: a */
    public final boolean mo8189a(Object obj) {
        if (obj instanceof crj) {
            ((crj) obj).mo3811aQ().f11884a = true;
        }
        this.f11881b.mo8187a(obj);
        return this.f11882c.mo8189a(obj);
    }
}
