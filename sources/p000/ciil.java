package p000;

/* renamed from: ciil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ciil extends bqdt {

    /* renamed from: a */
    private final chqs f190408a;

    public ciil(chqs chqs) {
        this.f190408a = chqs;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bi */
    public final String mo60815bi() {
        bmxt a = bmxu.m108563a(this);
        a.mo66885a("clientCall", this.f190408a);
        return a.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo69139d() {
        this.f190408a.mo70031a("GrpcFuture was cancelled", (Throwable) null);
    }
}
