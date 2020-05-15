package p000;

/* renamed from: amuq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amuq implements C0056bn {

    /* renamed from: a */
    private final amul f75966a;

    /* renamed from: b */
    private final bqgj f75967b;

    /* renamed from: c */
    private final amsh f75968c;

    /* renamed from: d */
    private final amtn f75969d;

    /* renamed from: e */
    private final amuk f75970e;

    public amuq(amsh amsh, amul amul, bqgj bqgj, amuk amuk, amtn amtn) {
        this.f75968c = amsh;
        this.f75966a = amul;
        this.f75967b = bqgj;
        this.f75970e = amuk;
        this.f75969d = amtn;
    }

    /* renamed from: a */
    public static amuq m63320a(adcc adcc) {
        allp allp = new allp();
        allp.f73626a = 80;
        allq a = allp.mo40491a();
        return new amuq(new amsh(adcc.getApplicationContext(), adcc.getPackageName()), amul.m63304a(adcc), snp.m35702a(9), new amuk(allr.m61237d(adcc, a)), new amtn(alsk.m61691a(adcc, a)));
    }

    /* renamed from: a */
    public final C0053bl mo3261a(Class cls) {
        if (cls.isAssignableFrom(amud.class)) {
            return (C0053bl) cls.cast(new amud(new amsg(this.f75966a, this.f75967b, this.f75968c), this.f75966a, this.f75970e, this.f75969d));
        }
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
        sb.append("ViewModelFactory cannot create an instance of ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }
}
