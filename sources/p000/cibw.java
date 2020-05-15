package p000;

/* renamed from: cibw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cibw extends chst {

    /* renamed from: a */
    final /* synthetic */ Throwable f189752a;

    /* renamed from: b */
    private final chso f189753b = chso.m149491b(chuv.f189228o.mo85687a("Panic! This is a bug!").mo85692c(this.f189752a));

    public cibw(Throwable th) {
        this.f189752a = th;
    }

    /* renamed from: a */
    public final chso mo85609a() {
        return this.f189753b;
    }

    public final String toString() {
        bmxt a = bmxu.m108562a(cibw.class);
        a.mo66885a("panicPickResult", this.f189753b);
        return a.toString();
    }
}
