package p000;

import java.util.Collections;

/* renamed from: kee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class kee extends kdn {

    /* renamed from: b */
    private final Class f23920b;

    /* renamed from: c */
    private final bnic f23921c;

    protected kee(Class cls, bnic bnic) {
        this.f23920b = cls;
        this.f23921c = bnic;
    }

    /* renamed from: a */
    public final Class mo14410a() {
        return this.f23920b;
    }

    /* renamed from: a */
    public final Object mo14411a(bnht bnht) {
        return null;
    }

    /* renamed from: a */
    public final boolean mo14412a(bnic bnic) {
        return !Collections.disjoint(bnic, this.f23921c);
    }
}
