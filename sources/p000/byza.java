package p000;

/* renamed from: byza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byza extends bxvd implements bxxd {
    public byza() {
        super(byzb.f169045j);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List, java.lang.Iterable], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final void mo74512a(Iterable r6) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        byzb byzb = (byzb) this.f164949b;
        bxvu bxvu = byzb.f169044g;
        if (!byzb.f169052f.mo73666a()) {
            byzb.f169052f = GeneratedMessageLite.m124019a(byzb.f169052f);
        }
        int size = r6.size();
        for (int i = 0; i < size; i++) {
            byzb.f169052f.mo74153d(((bzay) r6.get(i)).f169240d);
        }
    }
}
