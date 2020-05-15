package p000;

import android.content.Context;

/* renamed from: bbqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbqe {

    /* renamed from: c */
    private static bbqe f103061c;

    /* renamed from: a */
    public final bbqt f103062a;

    /* renamed from: b */
    public bmxv f103063b = bmvz.f131120a;

    /* renamed from: d */
    private final Context f103064d;

    private bbqe(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f103064d = applicationContext;
        this.f103062a = bbqt.m88417a(applicationContext);
    }

    /* renamed from: a */
    public static synchronized bbqe m88387a(Context context) {
        synchronized (bbqe.class) {
            if (f103061c == null) {
                bbqe bbqe = new bbqe(context);
                f103061c = bbqe;
                return bbqe;
            }
            bbqe bbqe2 = f103061c;
            return bbqe2;
        }
    }

    /* renamed from: b */
    public final boolean mo56358b() {
        return mo56357a(2, this.f103062a.f103114aI);
    }

    /* renamed from: c */
    public final boolean mo56359c() {
        return mo56357a(5, this.f103062a.f103131aZ);
    }

    /* renamed from: d */
    public final boolean mo56360d() {
        return mo56357a(10, this.f103062a.f103098T);
    }

    /* renamed from: e */
    public final boolean mo56361e() {
        return mo56357a(13, this.f103062a.f103097S);
    }

    /* renamed from: f */
    public final boolean mo56362f() {
        return mo56357a(17, this.f103062a.f103135ad);
    }

    /* renamed from: g */
    public final boolean mo56363g() {
        return mo56357a(18, this.f103062a.f103136ae);
    }

    /* renamed from: h */
    public final boolean mo56364h() {
        return mo56357a(16, this.f103062a.f103125aT);
    }

    /* renamed from: i */
    public final boolean mo56365i() {
        return mo56357a(15, this.f103062a.f103126aU);
    }

    /* renamed from: j */
    public final boolean mo56366j() {
        return mo56357a(20, this.f103062a.f103094P);
    }

    /* renamed from: k */
    public final boolean mo56367k() {
        return mo56357a(21, this.f103062a.f103096R);
    }

    /* renamed from: l */
    public final boolean mo56368l() {
        return mo56357a(23, this.f103062a.f103152au);
    }

    /* renamed from: m */
    public final boolean mo56369m() {
        return mo56357a(14, this.f103062a.f103122aQ);
    }

    /* renamed from: a */
    public final boolean mo56356a() {
        return mo56357a(1, this.f103062a.f103113aH);
    }

    /* renamed from: a */
    public final boolean mo56357a(int i, bdyx bdyx) {
        boolean booleanValue = ((Boolean) bdyx.mo58455c()).booleanValue();
        if (!this.f103063b.mo66813a()) {
            return booleanValue;
        }
        azbn azbn = (azbn) this.f103063b.mo66814b();
        return azbn.m85208a(i, booleanValue);
    }
}
