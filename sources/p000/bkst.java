package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: bkst */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkst extends bkss {

    /* renamed from: f */
    private final List f125243f = new ArrayList();

    public bkst(bksm bksm, bkqy bkqy, bkqw bkqw, boolean z) {
        super(bksm, bkqy, bkqw);
        ((bkss) this).f125241e = z;
    }

    /* renamed from: a */
    public final bkqi mo66314a() {
        throw new UnsupportedOperationException("Cannot use CompoundOperations while applying remote operations.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo66319b(blhg blhg) {
        this.f125243f.add(this.f125204b.mo66276a(blhg));
    }

    /* renamed from: b */
    public final boolean mo66320b() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo66322c(blhg blhg) {
    }

    /* renamed from: a */
    public final bkqi mo66315a(blhg blhg) {
        mo66321c();
        mo66324d(blhg);
        mo66323d();
        List a = this.f125206d.mo66308a();
        Collection b = this.f125206d.mo66311b();
        Set e = mo66342e();
        bkra bkra = bkra.f125144a;
        List list = this.f125243f;
        int size = list.size();
        bkra bkra2 = bkra;
        for (int i = 0; i < size; i++) {
            bkra2 = bkra2.mo66280a((bkra) list.get(i));
        }
        return new bkqi(a, b, e, null, bkra2, blhg, null);
    }

    /* renamed from: a */
    public final void mo66317a(String str, bksd bksd) {
        throw new UnsupportedOperationException("Cannot use CompoundOperations while applying remote operations.");
    }
}
