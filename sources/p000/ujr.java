package p000;

/* JADX WARN: Init of enum a can be incorrect */
/* JADX WARN: Init of enum b can be incorrect */
/* renamed from: ujr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum ujr implements vpj {
    RESOURCE_ID(r1),
    ACCOUNT_ID(r1);
    

    /* renamed from: c */
    public final unp f47814c;

    static {
        uoa b = uoa.m39042b();
        b.mo27747a(132, new unu("resourceId", 2));
        uoa b2 = uoa.m39042b();
        unu unu = new unu("accountId", 1);
        unu.mo27741b();
        unu.mo27739a(uim.f47706a.f48341a, unv.CASCADE);
        unu.mo27737a();
        unu.mo27740a(RESOURCE_ID.f47814c);
        b2.mo27747a(132, unu);
    }

    private ujr(uoa uoa) {
        this.f47814c = uoa.mo27745a(173, ujs.f47815a);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo27461b() {
        return this.f47814c;
    }
}
