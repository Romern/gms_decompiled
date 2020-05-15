package p000;

/* renamed from: chqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class chqv extends chrt {

    /* renamed from: a */
    public chqs f189016a;

    protected chqv(chqs chqs) {
        this.f189016a = chqs;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final chqs mo85554a() {
        return this.f189016a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo85555b(chqr chqr, chtr chtr);

    /* renamed from: a */
    public final void mo56351a(chqr chqr, chtr chtr) {
        try {
            mo85555b(chqr, chtr);
        } catch (Exception e) {
            this.f189016a = chqx.f189019a;
            chqr.mo25570a(chuv.m149608a(e), new chtr());
        }
    }
}
