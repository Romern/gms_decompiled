package p000;

/* renamed from: auif */
public final /* synthetic */ class auif implements Runnable {

    /* renamed from: a */
    private final auij f91874a;

    /* renamed from: b */
    private final int f91875b;

    public auif(auij auij, int i) {
        this.f91874a = auij;
        this.f91875b = i;
    }

    public final void run() {
        auij auij = this.f91874a;
        int i = this.f91875b;
        C1225nr nrVar = auij.f91882a;
        if (nrVar.f26758b == 1 && nrVar.contains(Integer.valueOf(i))) {
            auij.mo50571a(new auih(i));
        }
    }
}
