package p000;

/* renamed from: btlj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btlj extends bxvd implements bxxd {
    public btlj() {
        super(btll.f149376k);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List, java.lang.Iterable], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final void mo70824a(Iterable r6) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        btll btll = (btll) this.f164949b;
        btll btll2 = btll.f149376k;
        if (!btll.f149386i.mo73666a()) {
            btll.f149386i = GeneratedMessageLite.m124019a(btll.f149386i);
        }
        int size = r6.size();
        for (int i = 0; i < size; i++) {
            btll.f149386i.mo74153d(((btob) r6.get(i)).mo3214a());
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List, java.lang.Iterable], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    public final void mo70825b(Iterable r6) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        btll btll = (btll) this.f164949b;
        btll btll2 = btll.f149376k;
        if (!btll.f149385h.mo73666a()) {
            btll.f149385h = GeneratedMessageLite.m124019a(btll.f149385h);
        }
        int size = r6.size();
        for (int i = 0; i < size; i++) {
            btll.f149385h.mo74153d(((btoa) r6.get(i)).mo3214a());
        }
    }
}
