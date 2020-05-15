package p000;

/* renamed from: ayqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayqr implements AutoCloseable {

    /* renamed from: a */
    private final ayqt f98296a;

    public ayqr(ayqt ayqt, String str) {
        this.f98296a = ayqt;
        if (ayqt.f98301a.mo54113U()) {
            ayqt.f98302b.add(new ayqs(str));
        }
    }

    public final void close() {
        ayqt ayqt = this.f98296a;
        if (ayqt.f98301a.mo54113U()) {
            ayqt.f98302b.add(new ayqs("END_LABEL"));
        }
    }
}
