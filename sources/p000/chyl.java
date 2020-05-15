package p000;

/* renamed from: chyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chyl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ chym f189516a;

    /* renamed from: b */
    final /* synthetic */ chxv f189517b;

    public chyl(chym chym, chxv chxv) {
        this.f189516a = chym;
        this.f189517b = chxv;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        chym chym = this.f189516a;
        chxv chxv = this.f189517b;
        chrk b = chym.f189519b.mo85567b();
        try {
            chsp chsp = chym.f189518a;
            chxs a = chxv.mo85744a(((cidu) chsp).f189934c, ((cidu) chsp).f189933b, ((cidu) chsp).f189932a);
            chym.f189519b.mo85566a(b);
            chym.mo85839a(a);
        } catch (Throwable th) {
            chym.f189519b.mo85566a(b);
            throw th;
        }
    }
}
