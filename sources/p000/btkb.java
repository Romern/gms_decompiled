package p000;

import java.util.Iterator;

/* renamed from: btkb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btkb extends bxvd implements bxxd {
    public btkb() {
        super(btkc.f149218n);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List, java.lang.Iterable], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final void mo70821a(Iterable r6) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        btkc btkc = (btkc) this.f164949b;
        btkc btkc2 = btkc.f149218n;
        if (!btkc.f149231l.mo73666a()) {
            btkc.f149231l = bxvk.m124019a(btkc.f149231l);
        }
        int size = r6.size();
        for (int i = 0; i < size; i++) {
            btkc.f149231l.mo74153d(((btob) r6.get(i)).mo3214a());
        }
    }

    /* renamed from: b */
    public final void mo70822b(Iterable iterable) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        btkc btkc = (btkc) this.f164949b;
        btkc btkc2 = btkc.f149218n;
        if (!btkc.f149226g.mo73666a()) {
            btkc.f149226g = bxvk.m124019a(btkc.f149226g);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            btkc.f149226g.mo74153d(((btoa) it.next()).mo3214a());
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List, java.lang.Iterable], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    public final void mo70823c(Iterable r6) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        btkc btkc = (btkc) this.f164949b;
        btkc btkc2 = btkc.f149218n;
        if (!btkc.f149225f.mo73666a()) {
            btkc.f149225f = bxvk.m124019a(btkc.f149225f);
        }
        int size = r6.size();
        for (int i = 0; i < size; i++) {
            btkc.f149225f.mo74153d(((btof) r6.get(i)).mo3214a());
        }
    }
}
