package p000;

import java.util.List;

/* renamed from: caqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caqy {

    /* renamed from: a */
    private final casg f175633a;

    /* renamed from: b */
    private final casy f175634b;

    /* renamed from: c */
    private final caso f175635c;

    /* renamed from: d */
    private final caov f175636d;

    /* renamed from: e */
    private final caqz f175637e;

    /* renamed from: f */
    private final boolean f175638f;

    public caqy(casg casg, casy casy, caso caso, caov caov, boolean z, int i, caqz caqz) {
        this.f175633a = casg;
        this.f175634b = casy;
        this.f175635c = caso;
        this.f175636d = caov;
        boolean z2 = false;
        if (casg.f175749b == 1 && i != 3) {
            if (i == 1) {
                z2 = true;
            } else if (z && !catg.m127167c(casg.f175748a)) {
                z2 = true;
            }
        }
        this.f175638f = z2;
        if (caqz != null) {
            this.f175637e = caqz;
            return;
        }
        throw new capk("Invalid action manager listener");
    }

    /* renamed from: b */
    private final Object m127001b() {
        return this.f175637e.mo74756a(this.f175633a.f175748a);
    }

    /* renamed from: a */
    public final Object mo74773a() {
        caou caou;
        cass cass = cass.CONTACTLESS_EMV;
        casg casg = this.f175633a;
        int i = casg.f175749b;
        if (i == 1) {
            int g = this.f175634b.mo74835g();
            try {
                int ordinal = this.f175635c.mo74823a().ordinal();
                if (!(ordinal == 0 || ordinal == 1 || ordinal == 2)) {
                    if (ordinal != 3) {
                        throw new capk("Unsupported Terminal Technology");
                    }
                }
                if (this.f175638f) {
                    caou = this.f175636d.mo49424h();
                } else {
                    caou = this.f175636d.mo49423g();
                }
                if (caou == null) {
                    throw new caps("Unable to access valid credentials");
                } else if (g != 2) {
                    return this.f175637e.mo74757a(this.f175633a.f175748a, caou);
                } else {
                    caqz caqz = this.f175637e;
                    List list = this.f175633a.f175748a;
                    return caqz.mo74755a(caou);
                }
            } catch (caps e) {
                return m127001b();
            }
        } else if (i != 2) {
            return m127001b();
        } else {
            List list2 = casg.f175748a;
            boolean contains = list2.contains(cash.MISSING_CONSENT);
            boolean c = catg.m127167c(list2);
            if (!contains && !c) {
                m127001b();
            }
            return this.f175637e.mo74758b(list2);
        }
    }
}
