package p000;

/* renamed from: ekk */
final /* synthetic */ class ekk implements emc {

    /* renamed from: a */
    private final ekn f15189a;

    /* renamed from: b */
    private final ejl f15190b;

    /* renamed from: c */
    private final Iterable f15191c;

    /* renamed from: d */
    private final ejb f15192d;

    /* renamed from: e */
    private final int f15193e;

    public ekk(ekn ekn, ejl ejl, Iterable iterable, ejb ejb, int i) {
        this.f15189a = ekn;
        this.f15190b = ejl;
        this.f15191c = iterable;
        this.f15192d = ejb;
        this.f15193e = i;
    }

    /* renamed from: a */
    public final Object mo10237a() {
        ekn ekn = this.f15189a;
        ejl ejl = this.f15190b;
        Iterable iterable = this.f15191c;
        ejb ejb = this.f15192d;
        int i = this.f15193e;
        if (ejl.mo10199b() == 2) {
            ekn.f15199b.mo10258a(iterable);
            ekn.f15200c.mo10228a(ejb, i + 1);
            return null;
        }
        ekn.f15199b.mo10260b(iterable);
        if (ejl.mo10199b() == 1) {
            ekn.f15199b.mo10257a(ejb, System.currentTimeMillis() + ejl.mo10198a());
        }
        if (!ekn.f15199b.mo10261b(ejb)) {
            return null;
        }
        ekn.f15200c.mo10228a(ejb, 1);
        return null;
    }
}
