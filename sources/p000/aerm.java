package p000;

/* renamed from: aerm */
final /* synthetic */ class aerm implements aerh {

    /* renamed from: a */
    private final aero f63676a;

    public aerm(aero aero) {
        this.f63676a = aero;
    }

    /* renamed from: a */
    public final void mo34477a(Object obj) {
        aero aero = this.f63676a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        synchronized (aero.f63684c) {
            aero.f63689h = booleanValue;
            aero.mo34496c();
        }
    }
}
