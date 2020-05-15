package p000;

/* renamed from: yuh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class yuh implements bqfp {

    /* renamed from: a */
    private static final srn f54640a = zvt.m46581a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo30783a();

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            mo30784b();
        } else {
            mo30783a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo30784b();

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        bnsl bnsl = (bnsl) f54640a.mo68387b();
        bnsl.mo68437a(th);
        bnsl.mo68405a("Future call failed");
        mo30783a();
    }
}
