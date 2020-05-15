package p000;

/* renamed from: cifl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cifl extends cifn {

    /* renamed from: a */
    final /* synthetic */ cifo f190009a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cifl(cifo cifo) {
        super(cifo);
        this.f190009a = cifo;
        int i = ciix.f190424a;
    }

    /* renamed from: a */
    public final void mo86028a() {
        int i = ciix.f190424a;
        cipu cipu = new cipu();
        synchronized (this.f190009a.f190012a) {
            cipu cipu2 = this.f190009a.f190013b;
            cipu.mo74930a(cipu2, cipu2.f191213b);
            this.f190009a.f190016e = false;
        }
        this.f190009a.f190017f.mo74930a(cipu, cipu.f191213b);
        this.f190009a.f190017f.flush();
    }
}
